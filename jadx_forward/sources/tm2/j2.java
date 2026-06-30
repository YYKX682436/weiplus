package tm2;

/* loaded from: classes3.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f502066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(tm2.s2 s2Var, int i17) {
        super(0);
        this.f502065d = s2Var;
        this.f502066e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tm2.s2 s2Var = this.f502065d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(s2Var.f101133b);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s2Var.f101133b;
        u1Var.g(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4i));
        u1Var.n(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572980d41));
        int i17 = this.f502066e;
        u1Var.l(new tm2.h2(s2Var, i17));
        u1Var.j(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572979d40));
        u1Var.i(new tm2.i2(s2Var, i17));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
