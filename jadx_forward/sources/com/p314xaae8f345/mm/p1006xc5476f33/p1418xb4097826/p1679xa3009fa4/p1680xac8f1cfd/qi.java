package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        super(0);
        this.f217248d = blVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217248d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(blVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ak9, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.eh9);
        if (textView != null) {
            int P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(zy2.b6.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class)).P6();
            java.lang.String string = blVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0q);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (P6 > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                sb6.append(" · ");
                sb6.append(P6 >= 18 ? blVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js9) : blVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js8, java.lang.Integer.valueOf(P6)));
                textView.setText(sb6.toString());
            } else if (P6 == 0) {
                textView.setText(string + " · " + blVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js_));
            } else {
                textView.setText(string);
            }
            d92.f fVar = d92.f.f309003a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            textView.setTextSize(1, fVar.d(context, 14.0f, false));
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            textView.setMaxWidth((int) fVar.d(context2, blVar.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561219cl), false));
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e5c);
        if (frameLayout != null) {
            android.view.View mo144222x4ff8c0f0 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e5b);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, (mo144222x4ff8c0f0 == null || (layoutParams = mo144222x4ff8c0f0.getLayoutParams()) == null) ? -1 : layoutParams.height - com.p314xaae8f345.mm.ui.bl.h(blVar.m158354x19263085()));
            layoutParams2.gravity = 8388693;
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            float dimension = blVar.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            java.lang.Object systemService = context3.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            layoutParams2.setMarginEnd((int) ((dimension * displayMetrics.density) / context3.getResources().getDisplayMetrics().density));
            frameLayout.addView(inflate, layoutParams2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            float f17 = 0.0f;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.x0.c(inflate) || inflate.isLayoutRequested()) {
                inflate.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yk(blVar, inflate, frameLayout));
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzl);
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.m82040x7541828(-1);
                }
                android.view.View mo144222x4ff8c0f02 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzm);
                if (mo144222x4ff8c0f02 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo144222x4ff8c0f02.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo144222x4ff8c0f02.animate().translationX(-(inflate.getWidth() + blVar.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl))).alpha(0.8f).setDuration(250L).start();
                }
                android.view.View mo144222x4ff8c0f03 = blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nfb);
                if (mo144222x4ff8c0f03 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo144222x4ff8c0f03.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
                if (c15275x4b820d74 != null) {
                    c15275x4b820d74.m62009xae17c85(true);
                    f17 = c15275x4b820d74.getWidth() - ((c15275x4b820d74.getX() - inflate.getX()) - blVar.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
                }
                inflate.animate().alpha(1.0f).setDuration(250L).setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vk(blVar, f17)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xk(inflate, blVar, frameLayout)).start();
            }
        }
        return jz5.f0.f384359a;
    }
}
