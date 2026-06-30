package bd4;

/* loaded from: classes4.dex */
public final class s1 implements wl5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19391a;

    public s1(bd4.f2 f2Var) {
        this.f19391a = f2Var;
    }

    @Override // wl5.t
    public final void a(java.lang.CharSequence charSequence) {
        java.lang.ref.WeakReference weakReference;
        bd4.f2 f2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$5");
        kotlin.jvm.internal.o.d(charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var2 = this.f19391a;
        f2Var2.f19329j = charSequence;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (charSequence.length() == 0) {
            java.lang.ref.WeakReference weakReference2 = bd4.f2.G;
            if ((weakReference2 != null ? (bd4.f2) weakReference2.get() : null) == f2Var2) {
                bd4.f2.G = null;
            }
        } else {
            java.lang.ref.WeakReference weakReference3 = bd4.f2.G;
            if (!kotlin.jvm.internal.o.b(weakReference3 != null ? (bd4.f2) weakReference3.get() : null, f2Var2) && (weakReference = bd4.f2.G) != null && (f2Var = (bd4.f2) weakReference.get()) != null) {
                f2Var.k();
            }
            bd4.f2.G = new java.lang.ref.WeakReference(f2Var2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateCurrentSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isClampingSelection$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var2.f19332m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isClampingSelection$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!z17) {
            wl5.x m17 = f2Var2.m();
            android.util.Pair e17 = m17 != null ? m17.e() : null;
            if (e17 != null) {
                java.lang.Object second = e17.second;
                kotlin.jvm.internal.o.f(second, "second");
                int intValue = ((java.lang.Number) second).intValue();
                java.lang.Object first = e17.first;
                kotlin.jvm.internal.o.f(first, "first");
                int intValue2 = ((java.lang.Number) first).intValue();
                if (intValue2 >= 0 && intValue2 < intValue) {
                    java.lang.Object first2 = e17.first;
                    kotlin.jvm.internal.o.f(first2, "first");
                    int intValue3 = ((java.lang.Number) first2).intValue();
                    java.lang.Object second2 = e17.second;
                    kotlin.jvm.internal.o.f(second2, "second");
                    e06.k m18 = e06.p.m(intValue3, ((java.lang.Number) second2).intValue());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLogicalSelectionRange$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    f2Var2.f19333n = m18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLogicalSelectionRange$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (!f2Var2.f19330k) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else if (f2Var2.f19331l <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else {
                wl5.x xVar = f2Var2.f19328i;
                if (xVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                } else {
                    android.util.Pair e18 = xVar.e();
                    java.lang.Integer num = (java.lang.Integer) e18.first;
                    java.lang.Integer num2 = (java.lang.Integer) e18.second;
                    kotlin.jvm.internal.o.d(num);
                    if (num.intValue() >= 0) {
                        kotlin.jvm.internal.o.d(num2);
                        if (num2.intValue() > num.intValue()) {
                            if (num.intValue() >= f2Var2.f19331l) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.Improve.SnsSelectableTextHelper", "clampSelectionToCollapsedRangeIfNeeded full-out: start=" + num + " end=" + num2 + " collapsedOffset=" + f2Var2.f19331l);
                                f2Var2.f19332m = true;
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
                                if (num2.intValue() > f2Var2.f19331l) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.Improve.SnsSelectableTextHelper", "clampSelectionToCollapsedRangeIfNeeded clamp-end: start=" + num + " end=" + num2 + " -> " + f2Var2.f19331l);
                                    f2Var2.f19332m = true;
                                    try {
                                        xVar.s(num.intValue(), f2Var2.f19331l);
                                        f2Var2.f19332m = false;
                                    } finally {
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$clampSelectionToCollapsedRangeIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$5");
    }
}
