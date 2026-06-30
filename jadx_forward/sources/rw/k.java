package rw;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui.ActivityC10478x942179b3 f482112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui.ActivityC10478x942179b3 activityC10478x942179b3) {
        super(0);
        this.f482112d = activityC10478x942179b3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p703x8438d441.ui.ActivityC10478x942179b3 activityC10478x942179b3 = this.f482112d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC10478x942179b3);
        j0Var.setTitle("Pkg Info");
        ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).getClass();
        java.lang.String str = "";
        for (java.lang.String str2 : he3.e.f362435d) {
            str = str + str2 + " is: " + ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(str2) + "  \t\n";
        }
        j0Var.t(str);
        j0Var.p(3);
        j0Var.C(3);
        j0Var.A(activityC10478x942179b3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), true, null);
        j0Var.show();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(activityC10478x942179b3.mo55332x76847179(), null, str, null);
        return jz5.f0.f384359a;
    }
}
