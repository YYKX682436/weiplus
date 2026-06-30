package c01;

/* loaded from: classes11.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f37056d = 100;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f37057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f37058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f37059g;

    public aa(java.util.List list, long j17, java.lang.Runnable runnable) {
        this.f37057e = list;
        this.f37058f = j17;
        this.f37059g = runnable;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        l75.k0 k0Var = gm0.j1.u().f273153f;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f37057e) {
            com.tencent.mm.autogen.events.DeleteMsgEvent deleteMsgEvent = new com.tencent.mm.autogen.events.DeleteMsgEvent();
            am.y3 y3Var = deleteMsgEvent.f54086g;
            y3Var.f8425a = Long.MIN_VALUE;
            y3Var.f8427c = str;
            y3Var.f8428d = 0;
            deleteMsgEvent.e();
        }
        try {
            k0Var.b();
            for (java.lang.String str2 : this.f37057e) {
                com.tencent.mm.storage.f9 D5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(str2, this.f37058f);
                long createTime = D5 == null ? 0L : D5.getCreateTime();
                hashMap.put(str2, java.lang.Long.valueOf(createTime));
                ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0(str2, createTime);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), D5, java.lang.Long.valueOf(createTime));
            }
            k0Var.r();
            k0Var.t();
            if (k0Var.G()) {
                k0Var.t();
            }
            com.tencent.mm.sdk.platformtools.u3.h(this.f37059g);
            ((ku5.t0) ku5.t0.f312615d).h(new c01.z9(this, hashMap), "AsyncDeleteMessageStage2");
        } catch (java.lang.Throwable th6) {
            if (k0Var.G()) {
                k0Var.t();
            }
            com.tencent.mm.sdk.platformtools.u3.h(this.f37059g);
            throw th6;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (c01.c e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
