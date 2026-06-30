package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes.dex */
public final class o3 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f207697d;

    public o3(yz5.l lVar) {
        this.f207697d = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        yz5.l lVar = this.f207697d;
        if (i17 != 1100 || i18 != -1) {
            lVar.mo146xb9724478(null);
            return;
        }
        android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("key_pick_addr") : null;
        com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = parcelableExtra instanceof com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 ? (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) parcelableExtra : null;
        if (c11121x1f1011 != null) {
            r45.ze2 ze2Var = new r45.ze2();
            java.lang.String c17 = c11121x1f1011.c();
            if (c17 == null) {
                c17 = "";
            }
            ze2Var.set(3, c17);
            java.lang.String str = c11121x1f1011.f152747g;
            if (str == null) {
                str = "";
            }
            ze2Var.set(2, str);
            ze2Var.set(1, java.lang.Float.valueOf(c11121x1f1011.f152757t));
            ze2Var.set(0, java.lang.Float.valueOf(c11121x1f1011.f152758u));
            java.lang.String str2 = c11121x1f1011.f152744d;
            ze2Var.set(4, str2 != null ? str2 : "");
            lVar.mo146xb9724478(ze2Var);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.mo146xb9724478(null);
        }
    }
}
