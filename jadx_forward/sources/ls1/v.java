package ls1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ls1.e0 e0Var) {
        super(3);
        this.f402546d = e0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.ref.WeakReference contextRef = (java.lang.ref.WeakReference) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0 result = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0) obj2;
        r45.i9 appMsgContext = (r45.i9) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextRef, "contextRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsgContext, "appMsgContext");
        ls1.e0 e0Var = this.f402546d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "processGetAppContext isCached " + result.f176015e + " isSuccess= " + result.f176011a);
        r45.wm6 wm6Var = e0Var.N1;
        int i17 = wm6Var.f470833o;
        e0Var.U1 = result.f176015e;
        boolean z17 = false;
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).x(e0Var.C1().f473419h, 0, e0Var.U1 ? 30 : 31);
        ax4.a.b(wm6Var.f470833o, result.f176015e ? 121 : 122, 1, true);
        long j17 = result.f176012b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = e0Var.P1;
        i0Var.f175834r = j17;
        i0Var.f175835s = result.f176013c;
        i0Var.f175807d = appMsgContext.f458357f;
        boolean z18 = result.f176015e;
        hy4.k0 k0Var = e0Var.V;
        if (z18) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            e0Var.S1 = currentTimeMillis;
            i0Var.f175833q = currentTimeMillis;
            k0Var.f367661j = java.lang.System.currentTimeMillis();
            e0Var.I1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.e(appMsgContext), e0Var.Q1, e0Var.S1);
        } else {
            if (result.f176011a) {
                java.lang.String str = appMsgContext.f458358g;
                ax4.a.b(i17, 123, 1, true);
                java.lang.String B1 = e0Var.B1();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetAppContext forceUrl NotBlank = ");
                sb6.append(str != null && (r26.n0.N(str) ^ true));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1, sb6.toString());
                if (str != null && (!r26.n0.N(str))) {
                    z17 = true;
                }
                if (z17) {
                    ax4.a.b(i17, 120, 1, true);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    e0Var.D1(hy4.i.a(str, e0Var.C1()));
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u1.a(appMsgContext)) {
                    ax4.a.b(i17, 124, 1, true);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    e0Var.S1 = currentTimeMillis2;
                    i0Var.f175833q = currentTimeMillis2;
                    k0Var.f367661j = java.lang.System.currentTimeMillis();
                    e0Var.I1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.e(appMsgContext), e0Var.Q1, e0Var.S1);
                    i0Var.P = result.f176014d;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "processGetAppContext loadForceUrl with rawUrl");
            e0Var.D1(e0Var.i());
            ax4.a.b(i17, 125, 1, true);
            e0Var.J1();
        }
        return jz5.f0.f384359a;
    }
}
