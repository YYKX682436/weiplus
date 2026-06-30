package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* renamed from: com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView */
/* loaded from: classes9.dex */
public class C21902xee4207b0 extends android.widget.LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f284390m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f284391d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f284392e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f284393f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f284394g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.s2 f284395h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f284396i;

    public C21902xee4207b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f284396i = false;
        c();
    }

    public void a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        if (f9Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = f9Var.f275460g2;
            if (a9Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.oa) {
                b(dVar, (com.p314xaae8f345.mm.p2621x8fb0427b.oa) a9Var, f9Var, map);
                return;
            }
        }
        b(dVar, null, f9Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final yb5.d r12, com.p314xaae8f345.mm.p2621x8fb0427b.oa r13, final com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14, final java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21902xee4207b0.b(yb5.d, com.tencent.mm.storage.oa, com.tencent.mm.storage.f9, java.util.Map):void");
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.eqg, this);
        this.f284391d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rte);
        this.f284392e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.uhf);
        this.f284393f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567535ui4);
        this.f284394g = findViewById(com.p314xaae8f345.mm.R.id.vlu);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czi);
    }

    @Override // android.view.ViewGroup
    public android.view.View getChildAt(int i17) {
        if (getChildCount() > 3 && this.f284396i) {
            if (i17 == 2) {
                i17 = 3;
            } else if (i17 == 3) {
                i17 = 2;
            }
        }
        return super.getChildAt(i17);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f284396i = true;
        super.onMeasure(i17, i18);
        this.f284396i = false;
    }

    /* renamed from: setHeaderClickListener */
    public void m79881xf9091d0d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.s2 s2Var) {
        this.f284395h = s2Var;
    }

    public C21902xee4207b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f284396i = false;
        c();
    }
}
