package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.aa.ui.a f72574d;

    public b(com.tencent.mm.plugin.aa.ui.a aVar) {
        super(2, (r35.m3) null);
        this.f72574d = aVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.aa.ui.a aVar = this.f72574d;
        if (aVar != null) {
            ((com.tencent.mm.plugin.aa.ui.f0) aVar).onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
