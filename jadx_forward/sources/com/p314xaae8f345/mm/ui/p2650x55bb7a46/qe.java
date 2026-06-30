package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class qe implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.u9 {

    /* renamed from: d, reason: collision with root package name */
    public static final l75.v0 f284161d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.oe();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f284162a;

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f284163b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f284164c = new java.util.HashSet();

    public qe(yb5.d dVar) {
        this.f284162a = dVar.f542250l;
        this.f284163b = dVar;
    }

    public static void d(android.content.Context context, java.util.Set set) {
        java.lang.String str;
        if (set == null || set.size() <= 0) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(";");
            }
            str = sb6.toString();
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_tmp_preferences", 0).edit();
        edit.putString("transactions_array_key", str);
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        if (r1 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0188, code lost:
    
        if (r35.j1.k(r7.m78647x143f1b92(), r1.f33130x6942258, r1.f33128x4f3b3aa0, r1.f33121x993583fc, b(r3), false, "", new com.p314xaae8f345.mm.ui.p2650x55bb7a46.pe(r31, r1, r3)) != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x029e, code lost:
    
        if (r35.j1.l(r7.m78647x143f1b92(), r1.f33121x993583fc, b(r3), false, "", new com.p314xaae8f345.mm.ui.p2650x55bb7a46.pe(r31, r1, r3)) != null) goto L76;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.u9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe.a(android.os.Bundle):void");
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f284162a;
        return abstractViewOnAttachStateChangeListenerC21400xb429b010.m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572475bb4, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), mVar));
    }

    public boolean c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11266x18086b5c.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11266x18086b5c.Req();
        req.f33017xf02988d6 = this.f284163b.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        req.f32866x7fa0d2de = kk.k.g(sb6.toString().getBytes());
        req.f32865xc3c3c505 = str2;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f284162a;
        req.f33016x3291ee = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(abstractViewOnAttachStateChangeListenerC21400xb429b010.m78391xc8c7209d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179());
        req.f33015x39175796 = (java.lang.String) c01.d9.b().p().l(274436, null);
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        boolean m48400x35cf88 = com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), args);
        java.util.Set set = this.f284164c;
        ((java.util.HashSet) set).add(req.f32866x7fa0d2de);
        d(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), set);
        return m48400x35cf88;
    }
}
