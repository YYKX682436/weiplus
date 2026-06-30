package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282365d;

    public c5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282365d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sy3.c cVar = this.f282365d.f282172n3;
        if (cVar != null && !((kz3.l) cVar).c()) {
            this.f282365d.g7();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0 c5227x1de104c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0();
        am.r1 r1Var = c5227x1de104c0.f135560g;
        r1Var.f89290a = 1;
        r1Var.f89291b = this.f282365d.J2;
        am.r1 r1Var2 = c5227x1de104c0.f135560g;
        this.f282365d.x2();
        r1Var2.getClass();
        c5227x1de104c0.e();
        this.f282365d.y7(false);
        this.f282365d.J2 = 0;
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
