package gk4;

/* loaded from: classes10.dex */
public interface b {
    static void a(gk4.b bVar, float f17, int i17, java.lang.Object obj) {
        uq5.j jVar;
        uq5.j jVar2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGradientBlurEffect");
        }
        if ((i17 & 1) != 0) {
            f17 = -1.0f;
        }
        gk4.h0 h0Var = (gk4.h0) bVar;
        if (h0Var.f354101m == null) {
            h0Var.f354101m = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
        }
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = h0Var.f354101m;
        if (c22979xbb268bc != null) {
            c22979xbb268bc.f();
        }
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = h0Var.f354101m;
        java.lang.Long l17 = null;
        uq5.y g17 = c22979xbb268bc2 != null ? c22979xbb268bc2.g(uq5.k.GradientBlurEffect) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
        uq5.m mVar = (uq5.m) g17;
        h0Var.f354111w = mVar;
        mVar.d(20.0f);
        uq5.m mVar2 = h0Var.f354111w;
        if (mVar2 != null) {
            mVar2.b(0L, h0Var.A);
        }
        uq5.m mVar3 = h0Var.f354111w;
        if (mVar3 != null) {
            long j17 = mVar3.f511802c;
            if (j17 != 0) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83849xb7bd4608(j17, false);
            }
        }
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc3 = h0Var.f354101m;
        if (c22979xbb268bc3 != null) {
            c22979xbb268bc3.c(h0Var.f354111w);
        }
        h0Var.C = f17;
        h0Var.B = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGradientBlurEffect, timeRange:[");
        uq5.m mVar4 = h0Var.f354111w;
        sb6.append((mVar4 == null || (jVar2 = mVar4.f511801b) == null) ? null : java.lang.Long.valueOf(jVar2.f511772a));
        sb6.append(", ");
        uq5.m mVar5 = h0Var.f354111w;
        if (mVar5 != null && (jVar = mVar5.f511801b) != null) {
            l17 = java.lang.Long.valueOf(jVar.f511773b);
        }
        sb6.append(l17);
        sb6.append(", contentOffsetPercent:");
        sb6.append(f17);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f354089a, sb6.toString());
    }
}
