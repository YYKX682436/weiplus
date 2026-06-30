package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class m1 implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n1 f162630a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n1 n1Var) {
        this.f162630a = n1Var;
    }

    @Override // kk3.b
    public void a(java.util.List list) {
        rh1.a aVar;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next();
            if (c16601x7ed0e40c != null && c16601x7ed0e40c.f66793x2262335f == 4 && c16601x7ed0e40c.f66790x225a93cf != null) {
                r45.qs0 qs0Var = new r45.qs0();
                try {
                    qs0Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOpenDocument", "handleMultiTaskInfoClicked", th6);
                }
                java.lang.String m75945x2fec8307 = qs0Var.m75945x2fec8307(4);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                if (m75945x2fec8307.equals(bm5.f1.a()) && (aVar = this.f162630a.f162635h) != null) {
                    aVar.c0("");
                }
            }
        }
    }
}
