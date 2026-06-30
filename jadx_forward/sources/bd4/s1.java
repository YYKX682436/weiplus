package bd4;

/* loaded from: classes4.dex */
public final class s1 implements wl5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100924a;

    public s1(bd4.f2 f2Var) {
        this.f100924a = f2Var;
    }

    @Override // wl5.t
    public final void a(java.lang.CharSequence charSequence) {
        java.lang.ref.WeakReference weakReference;
        bd4.f2 f2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var2 = this.f100924a;
        f2Var2.f100862j = charSequence;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (charSequence.length() == 0) {
            java.lang.ref.WeakReference weakReference2 = bd4.f2.G;
            if ((weakReference2 != null ? (bd4.f2) weakReference2.get() : null) == f2Var2) {
                bd4.f2.G = null;
            }
        } else {
            java.lang.ref.WeakReference weakReference3 = bd4.f2.G;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(weakReference3 != null ? (bd4.f2) weakReference3.get() : null, f2Var2) && (weakReference = bd4.f2.G) != null && (f2Var = (bd4.f2) weakReference.get()) != null) {
                f2Var.k();
            }
            bd4.f2.G = new java.lang.ref.WeakReference(f2Var2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isClampingSelection$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var2.f100865m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isClampingSelection$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!z17) {
            wl5.x m17 = f2Var2.m();
            android.util.Pair e17 = m17 != null ? m17.e() : null;
            if (e17 != null) {
                java.lang.Object second = e17.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                int intValue = ((java.lang.Number) second).intValue();
                java.lang.Object first = e17.first;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                int intValue2 = ((java.lang.Number) first).intValue();
                if (intValue2 >= 0 && intValue2 < intValue) {
                    java.lang.Object first2 = e17.first;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first2, "first");
                    int intValue3 = ((java.lang.Number) first2).intValue();
                    java.lang.Object second2 = e17.second;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second2, "second");
                    e06.k m18 = e06.p.m(intValue3, ((java.lang.Number) second2).intValue());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLogicalSelectionRange$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    f2Var2.f100866n = m18;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLogicalSelectionRange$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (!f2Var2.f100863k) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else if (f2Var2.f100864l <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else {
                wl5.x xVar = f2Var2.f100861i;
                if (xVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                } else {
                    android.util.Pair e18 = xVar.e();
                    java.lang.Integer num = (java.lang.Integer) e18.first;
                    java.lang.Integer num2 = (java.lang.Integer) e18.second;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    if (num.intValue() >= 0) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                        if (num2.intValue() > num.intValue()) {
                            if (num.intValue() >= f2Var2.f100864l) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Improve.SnsSelectableTextHelper", "clampSelectionToCollapsedRangeIfNeeded full-out: start=" + num + " end=" + num2 + " collapsedOffset=" + f2Var2.f100864l);
                                f2Var2.f100865m = true;
                                try {
                                    xVar.d();
                                    xVar.N = true;
                                    xVar.f();
                                    xVar.M = true;
                                    xVar.g();
                                    xVar.h();
                                } finally {
                                }
                            } else {
                                if (num2.intValue() > f2Var2.f100864l) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Improve.SnsSelectableTextHelper", "clampSelectionToCollapsedRangeIfNeeded clamp-end: start=" + num + " end=" + num2 + " -> " + f2Var2.f100864l);
                                    f2Var2.f100865m = true;
                                    try {
                                        xVar.s(num.intValue(), f2Var2.f100864l);
                                        f2Var2.f100865m = false;
                                    } finally {
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$5");
    }
}
