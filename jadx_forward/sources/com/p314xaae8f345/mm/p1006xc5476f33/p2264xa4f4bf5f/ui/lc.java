package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class lc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 f255589d;

    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 c18649xdc4d549) {
        this.f255589d = c18649xdc4d549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent2 = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549 c18649xdc4d549 = this.f255589d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c18649xdc4d549.mo7430x19263085();
        if (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null || (bundle = intent.getExtras()) == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent putExtras = intent2.putExtras(bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtras, "putExtras(...)");
        putExtras.putExtra("story_only", true);
        j45.l.j(c18649xdc4d549.mo7438x76847179(), "", "com.tencent.mm.ui.AlbumUI", putExtras, null);
        qj4.s.l(qj4.s.f445491a, 15L, null, null, 0L, null, 0L, 62, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
