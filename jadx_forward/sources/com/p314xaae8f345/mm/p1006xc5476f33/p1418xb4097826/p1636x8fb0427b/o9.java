package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes.dex */
public final class o9 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o9 f208830a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o9();

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            if (str == null) {
                str = "";
            }
            try {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((c61.l7) b6Var).qj(context, null, str, false, null);
            } catch (java.lang.Exception e17) {
                db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "报错了：" + e17.getMessage(), 0).show();
            }
        }
    }
}
