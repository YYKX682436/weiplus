package df2;

/* loaded from: classes3.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f312154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(df2.p1 p1Var) {
        super(0);
        this.f312154d = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.p1 p1Var = this.f312154d;
        r45.v94 v94Var = ((mm2.c1) p1Var.m56788xbba4bfc0(mm2.c1.class)).Y5;
        if (v94Var != null) {
            df2.p1.Z6(p1Var, v94Var);
        }
        java.lang.String string = p1Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.no8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Context O6 = p1Var.O6();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
        e4Var.f293309c = string;
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
