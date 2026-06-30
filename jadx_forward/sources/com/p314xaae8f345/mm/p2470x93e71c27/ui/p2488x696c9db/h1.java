package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19729x50b2202e f273209d;

    public h1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19729x50b2202e c19729x50b2202e) {
        this.f273209d = c19729x50b2202e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19729x50b2202e c19729x50b2202e = this.f273209d;
        boolean z17 = c19729x50b2202e.f272897g;
        if (z17 && !c19729x50b2202e.f272898h) {
            if (z17) {
                c19729x50b2202e.f272898h = true;
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c19729x50b2202e.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
                loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f1(c19729x50b2202e));
                c19729x50b2202e.f272896f.startAnimation(loadAnimation);
                c19729x50b2202e.f272895e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(c19729x50b2202e.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd));
            } else {
                c19729x50b2202e.f272898h = true;
                c19729x50b2202e.f272894d.setVisibility(0);
                c19729x50b2202e.f272895e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(c19729x50b2202e.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(c19729x50b2202e.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
                loadAnimation2.setAnimationListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g1(c19729x50b2202e));
                c19729x50b2202e.f272896f.startAnimation(loadAnimation2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
