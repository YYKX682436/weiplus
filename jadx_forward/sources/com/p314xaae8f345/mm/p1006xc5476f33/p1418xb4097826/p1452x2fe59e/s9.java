package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 f190512d;

    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var) {
        this.f190512d = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var = this.f190512d;
        int i17 = 0;
        if (v9Var.f190340e - 1 >= 0 && (c1163xf1deaba42 = v9Var.f190343h) != null && (mo7946xf939df193 = c1163xf1deaba42.mo7946xf939df19()) != null) {
            mo7946xf939df193.m8152xc67946d3(0, v9Var.f190340e, new jz5.l(25, 1));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = v9Var.f190343h;
        if (c1163xf1deaba43 != null && (mo7946xf939df192 = c1163xf1deaba43.mo7946xf939df19()) != null) {
            i17 = mo7946xf939df192.mo1894x7e414b06();
        }
        int i18 = i17 - (v9Var.f190340e + 1);
        if (i18 <= 0 || (c1163xf1deaba4 = v9Var.f190343h) == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8152xc67946d3(v9Var.f190340e + 1, i18, new jz5.l(25, 1));
    }
}
