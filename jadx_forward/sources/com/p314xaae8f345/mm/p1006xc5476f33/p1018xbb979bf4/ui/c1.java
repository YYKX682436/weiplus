package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 f156061e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8) {
        this.f156060d = l1Var;
        this.f156061e = c11485x80cda4c8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f156060d.f156110r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 item = this.f156061e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        lVar.mo146xb9724478(item);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$5$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
