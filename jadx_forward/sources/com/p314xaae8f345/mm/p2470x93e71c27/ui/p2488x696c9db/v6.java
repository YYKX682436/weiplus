package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c f273489d;

    public v6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c c19738x1379dd9c) {
        this.f273489d = c19738x1379dd9c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ImageView m75824x20617a52 = this.f273489d.m75824x20617a52();
        if (m75824x20617a52 != null) {
            m75824x20617a52.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
