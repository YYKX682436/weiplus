package lx;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f403373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f403374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.u f403375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f403376g;

    public l(int i17, int i18, lx.u uVar, boolean z17) {
        this.f403373d = i17;
        this.f403374e = i18;
        this.f403375f = uVar;
        this.f403376g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg0.e2 e2Var = (sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class));
        int i17 = this.f403373d;
        int i18 = this.f403374e;
        boolean z17 = !e2Var.wi(i17, i18);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("searchbar_tips", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573707fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", z17);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsType", i18);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, true, i18);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        a17.putExtra("key_preload_biz", 4);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.addFlags(67108864);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        lx.u uVar = this.f403375f;
        android.os.Bundle bundle = !C ? android.app.ActivityOptions.makeSceneTransitionAnimation(uVar.f403490e, new android.util.Pair[0]).toBundle() : null;
        java.lang.String str = this.f403376g ? "bizPicAccountTopSearch" : "bizAccountTopSearch";
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("entranceWording").optString(str);
        if (!android.text.TextUtils.isEmpty(optString)) {
            a17.putExtra("key_search_input_hint", optString);
        }
        j45.l.z(uVar.f403490e, a17, bundle);
    }
}
