package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f210582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2) {
        super(1);
        this.f210580d = str;
        this.f210581e = str2;
        this.f210582f = activityC15025x361cfff2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "click ".concat(it));
        java.lang.String str2 = this.f210580d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f210582f;
        if (str2 != null && (str = this.f210581e) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f89004f = activityC15025x361cfff2;
            nxVar.f88999a = str2;
            nxVar.f89000b = str;
            c6113xa3727625.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1;
        activityC15025x361cfff2.getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.O1;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.N1;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.M1;
        int i27 = activityC15025x361cfff2.V;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.S1;
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.T1;
        android.widget.EditText editText = activityC15025x361cfff2.f210079w;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickEdt");
            throw null;
        }
        boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, editText.getText().toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC15025x361cfff2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        o3Var.mj(0, 2, i17, false, i18, i19, i27, z17, z18, nyVar != null ? nyVar.V6() : null);
        return jz5.f0.f384359a;
    }
}
