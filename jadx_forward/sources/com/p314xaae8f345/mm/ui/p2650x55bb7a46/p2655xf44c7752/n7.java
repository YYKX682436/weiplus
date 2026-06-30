package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class n7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f282751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282752e;

    public n7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, ot0.m1 m1Var) {
        this.f282752e = viewOnClickListenerC21748xb3d38e6b;
        this.f282751d = m1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot0.m1 m1Var = this.f282751d;
        if (m1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m1Var.f454881p)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryUI", "srcUserName is null");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", m1Var.f454881p);
        intent.putExtra("Contact_Scene", 163);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282752e;
        j45.l.j(viewOnClickListenerC21748xb3d38e6b.f282144g.f282625g, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18589, 1, java.lang.Integer.valueOf(viewOnClickListenerC21748xb3d38e6b.Y7()));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$67", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
