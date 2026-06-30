package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class a0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public c01.q9 f289025m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f289026n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f289027o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f289028p;

    public a0(android.content.Context context) {
        super(context);
        this.f289025m = null;
        c01.t9.e().f119000a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.r(this);
        c01.s9 s9Var = c01.t9.e().f119000a;
        if (s9Var != null) {
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.r) s9Var).a();
        }
    }

    public static void l(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0 a0Var, android.content.Context context, boolean z17) {
        a0Var.getClass();
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
        intent.putExtra("key_upload_scene", 8);
        if (z17) {
            intent.putExtra("bind_scene", 2);
        }
        intent.putExtra("KEnterFromBanner", true);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 3, 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 1, 1);
        }
    }

    @Override // s35.b
    public void a() {
        c01.t9.e().f119000a = null;
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvr;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f289027o = view.findViewById(com.p314xaae8f345.mm.R.id.aey);
        this.f289026n = view.findViewById(com.p314xaae8f345.mm.R.id.f564884af3);
        this.f289028p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j9d);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainFrameBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f289027o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
