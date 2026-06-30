package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl */
/* loaded from: classes15.dex */
public class C19758xc331845e extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f273578w = 0;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f273579r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 f273580s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f273581t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f273582u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnTouchListener f273583v;

    public C19758xc331845e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f273581t = false;
        this.f273582u = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.a(this);
        this.f273583v = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.b(this);
        j(context);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void d(boolean z17) {
        k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.e(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void e(int i17) {
        k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.g(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void f() {
        k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.f(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void g(boolean z17) {
        k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.d(this, z17));
    }

    public void i(boolean z17, boolean z18) {
        int i17 = this.f271389g;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                this.f273580s.b();
                return;
            }
            int n17 = c01.d9.e().n();
            if (n17 == 4 || n17 == 6) {
                b(true);
                return;
            }
            k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.c(this));
            this.f271389g = 1;
            f();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
            if (u3Var != null) {
                u3Var.g(12, -1, -1);
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (!z17 && !z18) {
                a();
                return;
            } else {
                if (!z17 || z18) {
                    return;
                }
                this.f273580s.b();
                return;
            }
        }
        if (!z18) {
            c();
            return;
        }
        this.f273580s.b();
        a();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.t3 t3Var = this.f271393n;
        if (t3Var != null) {
            t3Var.a(true);
        }
    }

    public void j(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4b, this).findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        this.f273579r = findViewById;
        findViewById.setLayerType(1, null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.g3(context);
        this.f273580s = g3Var;
        this.f273579r.setBackground(g3Var);
        this.f273579r.setEnabled(true);
        this.f273579r.setOnTouchListener(this.f273583v);
        this.f273579r.setOnLongClickListener(this.f273582u);
        h(true);
        if (isInEditMode()) {
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 == 4 || n17 == 6) {
            return;
        }
        k(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.c(this));
        this.f271389g = 1;
        f();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
        if (u3Var != null) {
            u3Var.g(12, -1, -1);
        }
    }

    public final void k(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public C19758xc331845e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f273581t = false;
        this.f273582u = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.a(this);
        this.f273583v = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.b(this);
        j(context);
    }
}
