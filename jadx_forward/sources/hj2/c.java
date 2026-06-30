package hj2;

/* loaded from: classes10.dex */
public class c extends hj2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f363115b = jz5.h.b(hj2.b.f363114d);

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
        int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 172);
        gi2.d f193233w = parent.getF193233w();
        layoutParams.setMargins(0, a17 + (f193233w != null ? f193233w.f353801b : 0), 0, 0);
        parent.addView(firstItemView, layoutParams);
    }

    @Override // hj2.a
    public void i(android.view.View firstItemView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, java.util.ArrayList viewList, gi2.d adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstItemView, "firstItemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        j(0, viewList, adapter, parent, firstItemView.getId());
        android.view.View view = (android.view.View) kz5.n0.a0(viewList, 1);
        j(4, viewList, adapter, parent, view != null ? view.getId() : firstItemView.getId());
        android.view.View view2 = (android.view.View) kz5.n0.a0(viewList, 6);
        g(parent, view2 != null ? view2.getId() : firstItemView.getId(), 0);
    }

    public final void j(int i17, java.util.ArrayList arrayList, gi2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, int i18) {
        int b17 = i65.a.b(c14245x86828950.getContext(), 16);
        int i19 = i17 + 1;
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i19);
        if (view != null) {
            f(view, dVar, i19);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams.f92428i = i18;
            layoutParams.f92418d = 0;
            android.view.View view2 = (android.view.View) kz5.n0.a0(arrayList, i17 + 2);
            if (view2 != null) {
                layoutParams.f92422f = view2.getId();
            }
            layoutParams.F = 2;
            layoutParams.setMargins(0, b17, 0, 0);
            c14245x86828950.addView(view, layoutParams);
        }
        int i27 = i17 + 2;
        android.view.View view3 = (android.view.View) kz5.n0.a0(arrayList, i27);
        if (view3 != null) {
            f(view3, dVar, i27);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams2.f92428i = i18;
            android.view.View view4 = (android.view.View) kz5.n0.a0(arrayList, i19);
            if (view4 != null) {
                layoutParams2.f92420e = view4.getId();
            }
            android.view.View view5 = (android.view.View) kz5.n0.a0(arrayList, i17 + 3);
            if (view5 != null) {
                layoutParams2.f92422f = view5.getId();
            }
            layoutParams2.setMargins(0, b17, 0, 0);
            c14245x86828950.addView(view3, layoutParams2);
        }
        int i28 = i17 + 3;
        android.view.View view6 = (android.view.View) kz5.n0.a0(arrayList, i28);
        if (view6 != null) {
            f(view6, dVar, i28);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams3.f92428i = i18;
            android.view.View view7 = (android.view.View) kz5.n0.a0(arrayList, i27);
            if (view7 != null) {
                layoutParams3.f92420e = view7.getId();
            }
            android.view.View view8 = (android.view.View) kz5.n0.a0(arrayList, i17 + 4);
            if (view8 != null) {
                layoutParams3.f92422f = view8.getId();
            }
            layoutParams3.setMargins(0, b17, 0, 0);
            c14245x86828950.addView(view6, layoutParams3);
        }
        int i29 = i17 + 4;
        android.view.View view9 = (android.view.View) kz5.n0.a0(arrayList, i29);
        if (view9 != null) {
            f(view9, dVar, i29);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams4.f92428i = i18;
            android.view.View view10 = (android.view.View) kz5.n0.a0(arrayList, i28);
            if (view10 != null) {
                layoutParams4.f92420e = view10.getId();
            }
            layoutParams4.f92424g = 0;
            layoutParams4.setMargins(0, b17, 0, 0);
            c14245x86828950.addView(view9, layoutParams4);
        }
    }
}
