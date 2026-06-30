package v02;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v02.f0 f0Var, java.lang.String str) {
        super(0);
        this.f513816d = f0Var;
        this.f513817e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v02.f0 f0Var = this.f513816d;
        java.util.Map t17 = kz5.c1.t(f0Var.f513781m);
        t17.remove("chat_name");
        ((cy1.a) f0Var.rj()).Hj("doc_chat_clk", "view_clk", kz5.c1.m(t17, kz5.b1.e(new jz5.l("chat_name", this.f513817e))), 36223);
        return jz5.f0.f384359a;
    }
}
