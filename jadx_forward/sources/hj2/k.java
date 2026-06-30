package hj2;

/* loaded from: classes10.dex */
public final class k extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f363121b = jz5.h.b(hj2.j.f363120d);

    @Override // gi2.c
    public java.lang.String d() {
        return "SingleVoiceRoomLayout";
    }

    @Override // hj2.a
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, android.view.View anchorView, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        android.view.View space = new android.widget.Space(parent.getContext());
        space.setId(android.view.View.generateViewId());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, 0);
        layoutParams.f92424g = 0;
        layoutParams.setMargins(0, 0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17 > 5 ? 128 : 0), 0);
        parent.addView(space, layoutParams);
        int b17 = i65.a.b(parent.getContext(), i17 == 1 ? 136 : 112);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(b17, b17);
        layoutParams2.f92426h = 0;
        layoutParams2.f92418d = 0;
        layoutParams2.f92424g = space.getId();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 == 1) {
            qg2.d dVar = qg2.d.f444326a;
            i18 = qg2.d.f444331f;
        } else {
            qg2.d dVar2 = qg2.d.f444326a;
            i18 = qg2.d.f444331f + 12;
        }
        layoutParams2.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(context, i18), 0, 0);
        parent.addView(anchorView, layoutParams2);
        g(parent, anchorView.getId(), i65.a.b(parent.getContext(), 32));
    }

    @Override // hj2.a
    public void i(android.view.View anchorView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, java.util.ArrayList viewList, gi2.d adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        j(0, viewList, adapter, parent, 0, -1, i65.a.b(parent.getContext(), 8));
        android.view.View view = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, -1, view != null ? view.getId() : 0, 0);
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, int i18, int i19, int i27) {
        int b17 = i65.a.b(c14245x86828950.getContext(), 64);
        int b18 = i65.a.b(c14245x86828950.getContext(), 183);
        int b19 = i65.a.b(c14245x86828950.getContext(), 20);
        int i28 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view != null) {
            f(view, dVar, i28);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(b17, -2);
            layoutParams.f92426h = 0;
            if (i18 != -1) {
                layoutParams.f92424g = i18;
            }
            if (i19 != -1) {
                layoutParams.f92422f = i19;
            }
            layoutParams.setMargins(0, b18, i27, 0);
            c14245x86828950.addView(view, layoutParams);
        }
        int i29 = i17 + 2;
        android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i29);
        if (view2 != null) {
            f(view2, dVar, i29);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(b17, -2);
            android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i28);
            if (view3 != null) {
                layoutParams2.f92428i = view3.getId();
            }
            if (i18 != -1) {
                layoutParams2.f92424g = i18;
            }
            if (i19 != -1) {
                layoutParams2.f92422f = i19;
            }
            layoutParams2.setMargins(0, b19, i27, 0);
            c14245x86828950.addView(view2, layoutParams2);
        }
        int i37 = i17 + 3;
        android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i37);
        if (view4 != null) {
            f(view4, dVar, i37);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(b17, -2);
            android.view.View view5 = (android.view.View) kz5.n0.a0(arrayList, i29);
            if (view5 != null) {
                layoutParams3.f92428i = view5.getId();
            }
            if (i18 != -1) {
                layoutParams3.f92424g = i18;
            }
            if (i19 != -1) {
                layoutParams3.f92422f = i19;
            }
            layoutParams3.setMargins(0, b19, i27, 0);
            c14245x86828950.addView(view4, layoutParams3);
        }
        int i38 = i17 + 4;
        android.view.View view6 = (android.view.View) kz5.n0.a0(arrayList, i38);
        if (view6 != null) {
            f(view6, dVar, i38);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(b17, -2);
            android.view.View view7 = (android.view.View) kz5.n0.a0(arrayList, i37);
            if (view7 != null) {
                layoutParams4.f92428i = view7.getId();
            }
            if (i18 != -1) {
                layoutParams4.f92424g = i18;
            }
            if (i19 != -1) {
                layoutParams4.f92422f = i19;
            }
            layoutParams4.setMargins(0, b19, i27, 0);
            c14245x86828950.addView(view6, layoutParams4);
        }
    }
}
