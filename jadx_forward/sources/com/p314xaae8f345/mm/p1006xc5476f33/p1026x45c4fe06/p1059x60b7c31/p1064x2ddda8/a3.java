package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class a3 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f160938a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f3Var) {
        this.f160938a = f3Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f3Var = this.f160938a;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = f3Var.f161071e;
            c12004xb7c17ce.f160910g.a(c12004xb7c17ce.f160912i, c12004xb7c17ce.f160909f.o("fail auth cancel"));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) f3Var.f161071e.f160911h).a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce2 = f3Var.f161071e;
        c12004xb7c17ce2.f160914m = "operateWXDataConfirm";
        c12004xb7c17ce2.F = arrayList.size() > 0 ? (java.lang.String) arrayList.get(0) : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce3 = f3Var.f161071e;
        c12004xb7c17ce3.f160921r = i17;
        c12004xb7c17ce3.f160922s = i18;
        c12004xb7c17ce3.f160923t = z17;
        c12004xb7c17ce3.d();
        if (i17 == 2) {
            c12004xb7c17ce3.f160910g.a(c12004xb7c17ce3.f160912i, c12004xb7c17ce3.f160909f.o("fail auth deny"));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) c12004xb7c17ce3.f160911h).a();
        }
    }
}
