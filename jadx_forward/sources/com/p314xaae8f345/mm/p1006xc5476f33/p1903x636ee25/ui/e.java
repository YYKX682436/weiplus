package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 f232268d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.C16629x1032f0d1 c16629x1032f0d1) {
        this.f232268d = c16629x1032f0d1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f232268d.f232211g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
