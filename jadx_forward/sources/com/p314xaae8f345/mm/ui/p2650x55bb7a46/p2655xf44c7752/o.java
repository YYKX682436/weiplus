package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.o f282763d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.o();

    public o() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String filename = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filename, "filename");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", "downloader[" + longValue + "] download end, filename=" + filename + ",result=" + booleanValue);
        if (booleanValue && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a.a(longValue)) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.m mVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.m(filename);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n nVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n.f282740a;
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, mVar, nVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p pVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282790d.remove(java.lang.Long.valueOf(longValue));
        pVar.c(longValue);
        return jz5.f0.f384359a;
    }
}
