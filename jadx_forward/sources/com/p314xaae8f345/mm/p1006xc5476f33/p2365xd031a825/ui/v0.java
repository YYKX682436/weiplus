package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final java.text.Collator f262195d = java.text.Collator.getInstance(java.util.Locale.getDefault());

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r0 r0Var) {
    }

    public final int a(gt4.n nVar, gt4.n nVar2) {
        java.lang.String m73900x19c8e7ce;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f357007d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WalletBankCardSelectUI", "should not go here");
            m73900x19c8e7ce = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255.m73900x19c8e7ce(nVar.f357006c, "#", "_", true);
        } else {
            m73900x19c8e7ce = nVar.f357007d.toUpperCase();
        }
        java.lang.String upperCase = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar2.f357007d) ? nVar2.f357007d.toUpperCase() : com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255.m73900x19c8e7ce(nVar2.f357006c, "#", "_", true);
        if (m73900x19c8e7ce.equals("#")) {
            return 1;
        }
        if (upperCase.equals("#")) {
            return -1;
        }
        int min = java.lang.Math.min(m73900x19c8e7ce.length(), upperCase.length());
        for (int i17 = 0; i17 < min; i17++) {
            char charAt = m73900x19c8e7ce.charAt(i17);
            char charAt2 = upperCase.charAt(i17);
            if (charAt == '_' && charAt2 == '_') {
                return this.f262195d.compare(nVar.f357006c, nVar2.f357006c);
            }
            if (charAt != charAt2) {
                if (charAt == '_') {
                    return -1;
                }
                return (charAt2 != '_' && charAt < charAt2) ? -1 : 1;
            }
        }
        if (m73900x19c8e7ce.length() > min) {
            return 1;
        }
        return upperCase.length() > min ? -1 : 0;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        fb5.n nVar = (fb5.n) obj;
        fb5.n nVar2 = (fb5.n) obj2;
        if (nVar == null && nVar2 == null) {
            return 0;
        }
        if (nVar != null) {
            if (nVar2 != null) {
                if (nVar.f342430a.equals("☆") && nVar2.f342430a.equals("☆")) {
                    return a((gt4.n) nVar.f342431b, (gt4.n) nVar2.f342431b);
                }
                if (!nVar2.f342430a.equals("☆")) {
                    if (!nVar.f342430a.equals("☆")) {
                        if (!nVar2.f342430a.equals("☆")) {
                            return a((gt4.n) nVar.f342431b, (gt4.n) nVar2.f342431b);
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
