package t00;

/* loaded from: classes9.dex */
public final /* synthetic */ class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.u {
    public x1(java.lang.Object obj) {
        super(7, obj, t00.e2.class, "processOnActivityResult", "processOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;ILjava/lang/String;Lcom/tencent/mm/feature/ecs/api/IEcsHandleEcsActionService$ActionCallback;)Z", 0);
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean z17;
        android.content.Context p07 = (android.content.Context) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        android.content.Intent intent = (android.content.Intent) obj4;
        int intValue3 = ((java.lang.Number) obj5).intValue();
        java.lang.String str = (java.lang.String) obj6;
        c00.n3 p66 = (c00.n3) obj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p66, "p6");
        ((t00.e2) this.f72685xcfcbe9ef).getClass();
        if (intValue != intValue3) {
            p66.a();
            z17 = false;
        } else {
            if (intValue2 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactEcsActionHandler", "select username nil");
                    p66.a();
                } else {
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str2, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712(stringExtra, str), t00.q1.class, new t00.b2(p07, p66));
                }
            } else {
                p66.mo13720x3d6f0539();
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
