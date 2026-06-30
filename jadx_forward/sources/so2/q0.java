package so2;

/* loaded from: classes2.dex */
public final class q0 implements so2.s0 {
    @Override // so2.s0
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        android.view.View mo7935xa188593e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null || (mo7935xa188593e = c1162x665295de.mo7935xa188593e(i17)) == null) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = recyclerView.w0(mo7935xa188593e);
        in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var = s0Var != null ? (so2.j5) s0Var.f374658i : null;
        if (!(r0Var instanceof so2.j5)) {
            r0Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r0Var : null;
        return abstractC14490x69736cb5 != null && abstractC14490x69736cb5.h() == 4;
    }
}
