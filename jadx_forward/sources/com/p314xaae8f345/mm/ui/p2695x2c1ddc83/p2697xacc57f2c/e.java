package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes12.dex */
public class e extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.f f289031m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h f289032n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f289033o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.d f289034p;

    public e(android.content.Context context) {
        super(context);
        this.f289033o = null;
    }

    @Override // s35.b
    public void a() {
        if (gm0.j1.b().m()) {
            c01.d9.b().p().e(this.f289031m);
        }
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569524dh;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f564298nf);
        this.f289033o = findViewById;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h hVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h();
        this.f289032n = hVar;
        hVar.f289042a = findViewById;
        hVar.f289043b = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564159jo);
        this.f289032n.f289043b.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.a(this));
        this.f289033o.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.b(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d0, code lost:
    
        if (r2 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f7  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e.i():boolean");
    }

    @Override // s35.b
    public void j() {
        this.f289031m = null;
    }

    @Override // s35.b
    public void k(int i17) {
        android.view.View view = this.f289033o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/ADBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/ADBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
