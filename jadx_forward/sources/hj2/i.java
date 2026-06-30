package hj2;

/* loaded from: classes10.dex */
public final class i extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f363119b;

    static {
        new hj2.h(null);
        f363119b = jz5.h.b(hj2.g.f363118d);
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "MultiVoiceRoomLayout";
    }

    @Override // hj2.a
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, android.view.View firstItemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstItemView, "firstItemView");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        layoutParams.f92426h = 0;
        layoutParams.f92418d = 0;
        layoutParams.f92424g = 0;
        layoutParams.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 172), 0, 0);
        parent.addView(firstItemView, layoutParams);
        android.view.View teamBattleBarViewLayout = parent.getTeamBattleBarViewLayout();
        if (teamBattleBarViewLayout != null) {
            android.view.ViewParent parent2 = teamBattleBarViewLayout.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(teamBattleBarViewLayout);
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2);
            layoutParams2.f92428i = firstItemView.getId();
            layoutParams2.f92418d = 0;
            layoutParams2.f92424g = 0;
            layoutParams2.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), 0, 0);
            parent.addView(teamBattleBarViewLayout, layoutParams2);
        }
    }

    @Override // hj2.a
    public void i(android.view.View firstItemView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, java.util.ArrayList viewList, gi2.d adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstItemView, "firstItemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        android.widget.Space space = new android.widget.Space(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        space.setId(android.view.View.generateViewId());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        layoutParams.f92418d = 0;
        layoutParams.f92424g = 0;
        parent.addView(space, layoutParams);
        int id6 = firstItemView.getId();
        android.view.View view = new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        view.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cq_));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 258));
        layoutParams2.f92418d = 0;
        layoutParams2.f92424g = space.getId();
        layoutParams2.f92428i = id6;
        layoutParams2.N = 0.5f;
        layoutParams2.setMargins(0, i65.a.b(parent.getContext(), 12), 0, 0);
        parent.addView(view, layoutParams2);
        int id7 = firstItemView.getId();
        android.view.View view2 = new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        view2.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cob));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 258));
        layoutParams3.f92418d = space.getId();
        layoutParams3.f92424g = 0;
        layoutParams3.f92428i = id7;
        layoutParams3.N = 0.5f;
        layoutParams3.setMargins(0, i65.a.b(parent.getContext(), 12), 0, 0);
        parent.addView(view2, layoutParams3);
        j(0, viewList, adapter, parent, firstItemView.getId(), i65.a.b(parent.getContext(), 48), space);
        k(0, viewList, adapter, parent, firstItemView.getId(), i65.a.b(parent.getContext(), 48), space);
        android.view.View view3 = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, view3 != null ? view3.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 16), space);
        android.view.View view4 = (android.view.View) kz5.n0.a0(viewList, 1);
        k(4, viewList, adapter, parent, view4 != null ? view4.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 16), space);
        android.view.View view5 = (android.view.View) kz5.n0.a0(viewList, 6);
        g(parent, view5 != null ? view5.getId() : firstItemView.getId(), i65.a.b(parent.getContext(), 32));
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, int i18, int i19, android.widget.Space space) {
        int i27 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view != null) {
            f(view, dVar, i27);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams.f92428i = i18;
            layoutParams.f92418d = 0;
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 2);
            if (view2 != null) {
                layoutParams.f92422f = view2.getId();
            }
            layoutParams.F = 2;
            layoutParams.setMargins(0, i19, 0, 0);
            c14245x86828950.addView(view, layoutParams);
        }
        int i28 = i17 + 2;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view3 != null) {
            f(view3, dVar, i28);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams2.f92428i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view4 != null) {
                layoutParams2.f92420e = view4.getId();
            }
            layoutParams2.f92424g = space.getId();
            layoutParams2.setMargins(0, i19, 0, 0);
            c14245x86828950.addView(view3, layoutParams2);
        }
    }

    public final void k(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, int i18, int i19, android.widget.Space space) {
        int i27 = i17 + 3;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view != null) {
            f(view, dVar, i27);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams.f92428i = i18;
            layoutParams.F = 2;
            layoutParams.f92418d = space.getId();
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 4);
            if (view2 != null) {
                layoutParams.f92422f = view2.getId();
            }
            layoutParams.setMargins(0, i19, 0, 0);
            c14245x86828950.addView(view, layoutParams);
        }
        int i28 = i17 + 4;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view3 != null) {
            f(view3, dVar, i28);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams2.f92428i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view4 != null) {
                layoutParams2.f92420e = view4.getId();
            }
            layoutParams2.f92424g = 0;
            layoutParams2.setMargins(0, i19, 0, 0);
            c14245x86828950.addView(view3, layoutParams2);
        }
    }
}
