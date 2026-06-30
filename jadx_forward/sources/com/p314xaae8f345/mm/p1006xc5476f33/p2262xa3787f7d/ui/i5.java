package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes3.dex */
public class i5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f f254566d;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f activityC18586x3f849c5f) {
        this.f254566d = activityC18586x3f849c5f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f254566d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        final com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(w2Var.m158354x19263085(), 1, 2, true);
        z2Var.m(w2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), w2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        z2Var.v(w2Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        z2Var.q(w2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsa));
        android.widget.TextView textView = z2Var.C;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        int i17 = w2Var.f254706g;
        if (i17 < 0) {
            i17 = 10;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = w2Var.f254707h.m75941xfb821914(2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.lz2 lz2Var = (r45.lz2) it.next();
            if (i17 >= lz2Var.m75939xb282bd08(0) && i17 <= lz2Var.m75939xb282bd08(1)) {
                arrayList2.addAll(lz2Var.m75941xfb821914(2));
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            java.util.LinkedList m75941xfb821914 = w2Var.f254707h.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getVisible_info(...)");
            r45.lz2 lz2Var2 = (r45.lz2) kz5.n0.Z(m75941xfb821914);
            if (lz2Var2 != null) {
                arrayList2.addAll(lz2Var2.m75941xfb821914(2));
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2(w2Var, (r45.mz2) it6.next()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) it7.next();
            if ((w2Var.f254705f & p2Var.f254635d.m75942xfb822ef2(0)) > 0) {
                p2Var.f254636e = true;
            }
        }
        r45.mz2 mz2Var = new r45.mz2();
        mz2Var.set(0, 0L);
        mz2Var.set(1, w2Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js6));
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2 p2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2(w2Var, mz2Var);
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p2) it8.next()).f254636e) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            p2Var2.f254636e = true;
        }
        arrayList4.add(0, p2Var2);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25(w2Var.m158354x19263085());
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = w2Var.m158354x19263085();
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(m158354x19263085) { // from class: com.tencent.mm.plugin.teenmode.ui.FinderTeenModeContentManageUIC$createContentRv$4
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF204840r() {
                return false;
            }
        });
        c22849x81a93d25.setNestedScrollingEnabled(false);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.teenmode.ui.FinderTeenModeContentManageUIC$createContentRv$adapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r2(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.this);
            }
        }, arrayList4, false);
        c22848x6ddd90cf.mo8164xbbdced85(true);
        c22849x81a93d25.N(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.q2(w2Var, w2Var.m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), arrayList4.size(), 0, 4, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = w2Var.f254705f;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.s2(arrayList4, g0Var);
        c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.t2 t2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.t2(z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u2(w2Var, g0Var, z2Var);
        z2Var.D = t2Var;
        z2Var.E = u2Var;
        z2Var.j(c22849x81a93d25);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
