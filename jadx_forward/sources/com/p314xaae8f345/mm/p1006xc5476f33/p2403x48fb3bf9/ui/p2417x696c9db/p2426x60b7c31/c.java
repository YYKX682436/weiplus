package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri[] f266499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f266500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f266502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266503h;

    public c(android.net.Uri[] uriArr, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, boolean z18) {
        this.f266499d = uriArr;
        this.f266500e = z17;
        this.f266501f = c1Var;
        this.f266502g = i17;
        this.f266503h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (android.net.Uri uri : this.f266499d) {
            if (uri != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(uri)) {
                boolean z17 = this.f266500e;
                java.lang.String str = z17 ? "choose_video" : "choose_image";
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                int i18 = i17 + 1;
                sb6.append(i17);
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
                r6Var.J();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(sb7);
                sb8.append('_');
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb8.append(java.lang.System.currentTimeMillis());
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, sb8.toString());
                r6Var2.k();
                java.lang.String o17 = r6Var2.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                com.p314xaae8f345.mm.vfs.w6.c(uri.toString(), o17);
                if (com.p314xaae8f345.mm.vfs.w6.j(o17) && com.p314xaae8f345.mm.vfs.w6.k(o17) > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(o17) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(o17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4.f264535b.a(b17);
                    arrayList.add(b17.f264269e);
                }
                i17 = i18;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b(this.f266501f, this.f266502g, this.f266503h, arrayList));
    }
}
