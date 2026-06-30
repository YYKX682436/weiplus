package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class n5 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 f228753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f228754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f228755c;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t5 t5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 i5Var, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, in5.s0 s0Var) {
        this.f228753a = i5Var;
        this.f228754b = c10389xffc30b0;
        this.f228755c = s0Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 i5Var = this.f228753a;
        if (i5Var.f228549e || !this.f228754b.f()) {
            return;
        }
        in5.s0 s0Var = this.f228755c;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ikj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.ik_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.ikh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s0Var.p(com.p314xaae8f345.mm.R.id.ikg).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        i5Var.f228549e = true;
    }
}
