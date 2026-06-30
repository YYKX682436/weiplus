package ci2;

/* loaded from: classes10.dex */
public final class j extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f123217b = jz5.h.b(ci2.i.f123216d);

    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950) c14233xcca2a527;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        int b17 = i65.a.b(parent.getContext(), 191);
        gi2.d f193233w = parent.getF193233w();
        int i17 = b17 + (f193233w != null ? f193233w.f353801b : 0);
        int b18 = i65.a.b(parent.getContext(), 24);
        int i18 = 0;
        for (java.lang.Object obj : viewList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            f(view, adapter, i18);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams.f92426h = 0;
            if (i18 == 0) {
                layoutParams.f92418d = 0;
                android.view.View view2 = (android.view.View) kz5.n0.a0(viewList, 1);
                if (view2 != null) {
                    layoutParams.f92422f = view2.getId();
                }
                layoutParams.F = 2;
                layoutParams.setMargins(0, i17, 0, 0);
            } else if (i18 == kz5.c0.h(viewList)) {
                android.view.View view3 = (android.view.View) kz5.n0.a0(viewList, i18 - 1);
                if (view3 != null) {
                    layoutParams.f92420e = view3.getId();
                }
                layoutParams.f92424g = 0;
                layoutParams.setMargins(b18, i17, 0, 0);
            } else {
                android.view.View view4 = (android.view.View) kz5.n0.a0(viewList, i18 - 1);
                if (view4 != null) {
                    layoutParams.f92420e = view4.getId();
                }
                android.view.View view5 = (android.view.View) kz5.n0.a0(viewList, i19);
                if (view5 != null) {
                    layoutParams.f92422f = view5.getId();
                }
                layoutParams.setMargins(b18, i17, 0, 0);
            }
            parent.addView(view, layoutParams);
            i18 = i19;
        }
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "ChatVoiceRoomPrepareLayout";
    }
}
