package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class n3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f264115d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var) {
        this.f264115d = w3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var = this.f264115d;
        w3Var.getClass();
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = w3Var.f264202j;
        boolean z17 = (e0Var.f263711J.e(e0Var.u()).f273710d & 16384) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var2 = w3Var.f264202j;
        boolean z18 = (e0Var2.f263711J.e(e0Var2.u()).f273710d & 32768) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (b17 && z17) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3(1, w3Var.f264202j.f488143d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr_)));
        }
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3(2, w3Var.f264202j.f488143d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8c)));
        if (b17 && z18) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3(3, w3Var.f264202j.f488143d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg)));
        }
        java.lang.String str = w3Var.f264193a;
        kd0.p2 p2Var = w3Var.f264201i;
        if (str != null) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).l(w3Var.f264195c, str)));
        }
        w3Var.f264200h.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3 r3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r3) arrayList.get(i17);
            int i18 = r3Var.f264147a;
            if (i18 == 4) {
                w3Var.f264200h.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.b3(w3Var), w3Var.f264195c, w3Var.f264193a, 7));
            } else {
                g4Var.f(i18, r3Var.f264148b);
            }
        }
    }
}
