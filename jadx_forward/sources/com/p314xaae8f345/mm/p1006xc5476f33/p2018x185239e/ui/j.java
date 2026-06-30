package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public r45.uq0 f239305a = null;

    /* renamed from: b, reason: collision with root package name */
    public r45.wo f239306b;

    public void a(java.lang.String str) {
        this.f239305a = null;
        if (str == null) {
            this.f239305a = null;
            return;
        }
        r45.wo woVar = this.f239306b;
        if (woVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavorInfoPicked", "error setSelectFavorComposeId currentFavorResp is null");
            this.f239305a = null;
            return;
        }
        java.util.Iterator it = woVar.f470860e.iterator();
        while (it.hasNext()) {
            r45.uq0 uq0Var = (r45.uq0) it.next();
            if (str.equals(uq0Var.f469097d)) {
                this.f239305a = uq0Var;
                return;
            }
        }
    }
}
