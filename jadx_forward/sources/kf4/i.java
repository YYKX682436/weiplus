package kf4;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f389010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.w0 w0Var) {
        super(0);
        this.f389010d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        l75.w0 w0Var = this.f389010d;
        java.lang.Object obj = w0Var.f398509d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
        java.lang.String str = ((nf4.j) obj).f69412xdde069b;
        java.lang.Object obj2 = w0Var.f398509d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
        long j17 = ((nf4.j) obj2).f69410x443468b;
        kf4.o oVar = kf4.o.f389017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncFetcher", "[StoryInfo] onNotifyChange: " + str + ' ' + j17);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(kf4.o.f389019f.get(str));
        kf4.o.b(kf4.o.f389017d);
        pm0.v.X(kf4.h.f389009d);
        return jz5.f0.f384359a;
    }
}
