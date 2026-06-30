package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f152168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f152171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152172h;

    public g2(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18, int i19) {
        this.f152172h = r1Var;
        this.f152168d = m1Var;
        this.f152169e = i17;
        this.f152170f = i18;
        this.f152171g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        q01.l lVar;
        this.f152168d.m48022x4479fa06().g(220);
        q01.q qVar = q01.q.f440855a;
        com.p314xaae8f345.mm.p944x882e457a.m1 scene = this.f152168d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int hashCode = scene.hashCode();
        java.lang.Long l17 = (java.lang.Long) q01.q.f440857c.remove(java.lang.Integer.valueOf(hashCode));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = q01.q.f440856b;
        q01.l lVar2 = (q01.l) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        if (lVar2 != null && l17 != null) {
            lVar2.f440838h = android.os.SystemClock.elapsedRealtime();
            long j17 = 0;
            if (lVar2.f440838h > 0 && lVar2.f440837g > 0) {
                j17 = lVar2.f440838h - lVar2.f440837g;
            }
            qVar.b(scene);
            if (j17 > 1000) {
                qVar.e(lVar2, j17, false);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 scene2 = this.f152168d;
        int i17 = this.f152169e;
        int i18 = this.f152170f;
        int i19 = this.f152171g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene2, "scene");
        int hashCode2 = scene2.hashCode();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            this.f152172h.j(scene2, i17, i18, i19);
        } finally {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 > 3000 && (lVar = (q01.l) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode2))) != null) {
                qVar.e(lVar, elapsedRealtime2, true);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m47961x9616526c() {
        return super.toString() + "|doSceneImp_" + this.f152168d + "_type=" + this.f152169e;
    }
}
