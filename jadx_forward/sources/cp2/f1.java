package cp2;

/* loaded from: classes2.dex */
public final class f1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f302335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f302336e;

    public f1(java.util.ArrayList arrayList, cp2.q1 q1Var) {
        this.f302335d = arrayList;
        this.f302336e = q1Var;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        java.util.ArrayList arrayList = this.f302335d;
        java.lang.Object obj = arrayList.get(i17 - a07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        if (!z17 || !zl2.q4.f555466a.C((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "onItemLongClick return for not live feed.");
        }
        if (!z17) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        if (!zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
            return true;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a17 = r4Var.a1(context, abstractC14490x69736cb5, 1001, this.f302336e.a(), new cp2.e1(arrayList, j5Var, adapter, i17));
        if (a17 == null) {
            return true;
        }
        a17.v();
        return true;
    }
}
