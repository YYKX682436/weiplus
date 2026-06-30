package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes.dex */
public final class me extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.me f208724d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.me();

    public me() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int size;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("当前funcMsg的callback数量:");
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        synchronized (d17.f152302i) {
            size = ((java.util.Set) ((java.util.HashMap) d17.f152302i).get(825)).size();
        }
        sb6.append(size);
        db5.t7.m123883x26a183b(context, sb6.toString(), 1).show();
        return jz5.f0.f384359a;
    }
}
