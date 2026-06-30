package cw1;

/* loaded from: classes12.dex */
public final class a6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f304314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f304316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long[] f304317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f304318h;

    public a6(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, boolean z17, long[] jArr, int i17) {
        this.f304314d = y1Var;
        this.f304315e = c13121x39a05fa9;
        this.f304316f = z17;
        this.f304317g = jArr;
        this.f304318h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f304314d.q();
        boolean z17 = this.f304316f;
        long[] jArr = this.f304317g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f304315e;
        c13121x39a05fa9.f177300n = (z17 && java.util.Arrays.equals(jArr, c13121x39a05fa9.f177302p)) ? false : true;
        c13121x39a05fa9.f177301o[c13121x39a05fa9.f177303q] = c13121x39a05fa9.f177304r;
        long[] copyOf = java.util.Arrays.copyOf(jArr, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        c13121x39a05fa9.f177302p = copyOf;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13121x39a05fa9.f177298i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("filterList");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        cw1.n5 n5Var = mo7946xf939df19 instanceof cw1.n5 ? (cw1.n5) mo7946xf939df19 : null;
        if (n5Var != null) {
            n5Var.x(this.f304318h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
