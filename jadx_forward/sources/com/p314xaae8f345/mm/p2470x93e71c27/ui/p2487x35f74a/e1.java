package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public final class e1 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar) {
        super(1, (r35.m3) null);
        this.f272740d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SpanExKt$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f272740d.mo146xb9724478(widget);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/SpanExKt$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
