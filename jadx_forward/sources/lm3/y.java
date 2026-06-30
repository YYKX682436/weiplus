package lm3;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 f401055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401056e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 e1Var, lm3.e eVar) {
        this.f401055d = e1Var;
        this.f401056e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fm3.u musicMv = this.f401056e.f401015d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 e1Var = this.f401055d;
        e1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = e1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class)).f232519s.f295138w = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = e1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = e1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a18;
        java.util.ArrayList arrayList2 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) a17).f232510g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((lm3.e) it.next()).f401015d);
        }
        int i17 = n0Var.C;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h2 h2Var = e1Var.f232641f;
        h2Var.getClass();
        java.util.ArrayList arrayList4 = h2Var.f233375e;
        arrayList4.clear();
        h2Var.f233379i = musicMv;
        java.util.Iterator it6 = arrayList3.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            fm3.u uVar = (fm3.u) next;
            if (fm3.u.A.e(uVar)) {
                arrayList4.add(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.d2(i18, uVar, i17));
            }
            i18 = i19;
        }
        boolean isEmpty = arrayList4.isEmpty();
        jz5.g gVar = h2Var.f233378h;
        if (isEmpty) {
            h2Var.f233381n = in5.n0.P((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) gVar).mo141623x754a37bb(), h2Var.f233380m, -2, false, 4, null);
        } else {
            in5.w wVar = h2Var.f233381n;
            if (wVar != null) {
                ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) gVar).mo141623x754a37bb()).g0(((in5.a0) wVar).mo2128x1ed62e84(), false);
            }
        }
        android.widget.TextView textView = h2Var.f233377g;
        if (textView != null) {
            textView.setText(h2Var.f233374d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5g, java.lang.Integer.valueOf(arrayList4.size())));
        }
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) gVar).mo141623x754a37bb()).m8146xced61ae5();
        wl3.e eVar = h2Var.f233376f;
        if (!eVar.b()) {
            eVar.f528592g = eVar.a();
            android.content.Context context = eVar.f528589d;
            eVar.f528593h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
            if (eVar.f528590e != null) {
                android.view.View view2 = eVar.f528591f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
                android.view.ViewParent parent = view2.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).setVisibility(0);
                android.view.View view3 = eVar.f528591f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
                android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                boolean z17 = eVar.f528592g;
                android.view.View view4 = eVar.f528594i;
                if (z17 && view4 != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    view4.getWindowVisibleDisplayFrame(rect);
                    layoutParams2.width = rect.right;
                }
                android.view.View view5 = eVar.f528591f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view5);
                view5.setLayoutParams(layoutParams2);
                android.app.Dialog dialog = eVar.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
                android.view.Window window = dialog.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
                window.addFlags(Integer.MIN_VALUE);
                android.app.Dialog dialog2 = eVar.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                android.view.Window window2 = dialog2.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window2);
                window2.clearFlags(8);
                android.app.Dialog dialog3 = eVar.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog3);
                android.view.Window window3 = dialog3.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window3);
                window3.clearFlags(131072);
                android.app.Dialog dialog4 = eVar.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog4);
                android.view.Window window4 = dialog4.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window4);
                window4.clearFlags(128);
                android.app.Dialog dialog5 = eVar.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog5);
                android.view.Window window5 = dialog5.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window5);
                window5.getDecorView().setSystemUiVisibility(0);
                if (view4 != null) {
                    boolean z18 = eVar.f528595m == null;
                    android.view.ViewTreeObserver viewTreeObserver = view4.getViewTreeObserver();
                    eVar.f528595m = viewTreeObserver;
                    if (z18) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
                        viewTreeObserver.addOnGlobalLayoutListener(eVar);
                    }
                }
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog6 = eVar.f528590e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog6);
                    dialog6.show();
                }
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = eVar.f528596n;
                if (c2690x46972046 != null) {
                    c2690x46972046.f125976p = false;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
