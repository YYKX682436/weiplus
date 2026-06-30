package ls0;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.w0 f402461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ls0.w0 w0Var) {
        super(1);
        this.f402461d = w0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ls0.w0 w0Var = this.f402461d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f402474a, "onEncodeEnd");
        w0Var.f402484k = (yz5.l) obj;
        int i17 = w0Var.f402480g;
        boolean z17 = i17 == 0;
        java.lang.String str = w0Var.f402479f;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            boolean z18 = i17 == 1;
            int i18 = w0Var.f402475b;
            int i19 = w0Var.f402483j;
            int i27 = w0Var.f402482i;
            ls0.b1 b1Var = w0Var.f402476c;
            if (i18 > 0) {
                if (b1Var != null) {
                    r2 = b1Var.a(w0Var.f402477d, w0Var.f402479f, z18 ? 0 : i27, z18 ? 0 : i19, z17);
                } else {
                    r2 = -1;
                }
                int i28 = w0Var.f402475b;
                java.lang.String str2 = w0Var.f402481h;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(str, str2, i28);
                com.p314xaae8f345.mm.vfs.w6.w(str2, str);
            } else if (b1Var != null) {
                r2 = b1Var.a(w0Var.f402477d, w0Var.f402479f, z18 ? 0 : i27, z18 ? 0 : i19, z17);
            } else {
                r2 = -1;
            }
        }
        java.lang.String str3 = "output mediaInfo :" + com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        java.lang.String str4 = w0Var.f402474a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "finish process, ret:" + r2);
        if (r2 >= 0) {
            yz5.l lVar = w0Var.f402484k;
            if (lVar != null) {
                lVar.mo146xb9724478(str);
            }
        } else {
            yz5.l lVar2 = w0Var.f402484k;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
