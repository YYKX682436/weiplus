package dv2;

/* loaded from: classes8.dex */
public final class k1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f325416a;

    public k1(dv2.o1 o1Var) {
        this.f325416a = o1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 result) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkFinderUtils] end result:");
        boolean z17 = result.f183766a;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", sb6.toString());
        dv2.o1 o1Var = this.f325416a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o1Var.f325457n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f325457n = null;
        if (!z17 || (m8Var = o1Var.f325454h) == null) {
            return;
        }
        o1Var.f325455i = result;
        m8Var.c(result);
    }
}
