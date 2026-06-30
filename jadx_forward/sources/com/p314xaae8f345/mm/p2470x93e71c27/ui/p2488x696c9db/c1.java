package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 f273069d;

    public c1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 c19728x5f1b2bb4) {
        this.f273069d = c19728x5f1b2bb4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 c19728x5f1b2bb4 = this.f273069d;
        boolean z18 = c19728x5f1b2bb4.f272892g;
        if (!z18 || (z17 = c19728x5f1b2bb4.f272893h)) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (z18 != (!z18) && !z17) {
            if (z18) {
                c19728x5f1b2bb4.f272893h = true;
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c19728x5f1b2bb4.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559391dg);
                loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e1(c19728x5f1b2bb4));
                android.widget.ListView listView = c19728x5f1b2bb4.f272890e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView);
                listView.startAnimation(loadAnimation);
            } else {
                c19728x5f1b2bb4.f272893h = true;
                android.widget.FrameLayout frameLayout = c19728x5f1b2bb4.f272889d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                frameLayout.setVisibility(0);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(c19728x5f1b2bb4.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559387dc);
                loadAnimation2.setAnimationListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d1(c19728x5f1b2bb4));
                android.widget.ListView listView2 = c19728x5f1b2bb4.f272890e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView2);
                listView2.startAnimation(loadAnimation2);
            }
        }
        c19728x5f1b2bb4.m75775x656c7917();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
        throw null;
    }
}
