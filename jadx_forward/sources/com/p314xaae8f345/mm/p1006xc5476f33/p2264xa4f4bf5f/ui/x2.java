package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 f255951d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1) {
        this.f255951d = c18619x86b32cd1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent2 = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1 = this.f255951d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c18619x86b32cd1.mo7430x19263085();
        if (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null || (bundle = intent.getExtras()) == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent putExtras = intent2.putExtras(bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtras, "putExtras(...)");
        putExtras.putExtra("story_only", true);
        j45.l.j(c18619x86b32cd1.mo7438x76847179(), "", "com.tencent.mm.ui.AlbumUI", putExtras, null);
        qj4.s.l(qj4.s.f445491a, 15L, null, null, 0L, null, 0L, 62, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
