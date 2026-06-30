package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a f154107d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a aVar) {
        super(2, (r35.m3) null);
        this.f154107d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a aVar = this.f154107d;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f0) aVar).mo48649xaf6b9ae9(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
