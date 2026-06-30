package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes2.dex */
public final class v extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f272826d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u f272827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u obj) {
        super(obj.f272823d, obj.f272824e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        this.f272826d = i17;
        this.f272827e = obj;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u uVar = this.f272827e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.t tVar = uVar.f272825f;
        if (tVar != null) {
            tVar.a(widget, this.f272826d, uVar);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
