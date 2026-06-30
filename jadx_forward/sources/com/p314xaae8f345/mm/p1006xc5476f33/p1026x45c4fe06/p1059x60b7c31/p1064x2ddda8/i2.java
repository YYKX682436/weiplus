package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class i2 implements fl1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j2 f161120a;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j2 j2Var) {
        this.f161120a = j2Var;
    }

    @Override // fl1.f
    public void a(int i17, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j2 j2Var = this.f161120a;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2 = j2Var.f161132e;
            c12003x30f468c2.f160889f.D(c12003x30f468c2.f160890g, c12003x30f468c2.f160892i, "fail auth cancel", jc1.f.f380455k);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) j2Var.f161132e.f160891h).a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c22 = j2Var.f161132e;
        c12003x30f468c22.f160895o = "loginConfirm";
        c12003x30f468c22.f160894n = arrayList;
        c12003x30f468c22.f160901u = i17;
        c12003x30f468c22.d();
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c23 = j2Var.f161132e;
            c12003x30f468c23.f160889f.D(c12003x30f468c23.f160890g, c12003x30f468c23.f160892i, "fail auth deny", jc1.f.f380454j);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2) j2Var.f161132e.f160891h).a();
        }
    }
}
