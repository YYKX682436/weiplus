package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class pa extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f182874a;

    /* renamed from: b, reason: collision with root package name */
    public float f182875b;

    /* renamed from: c, reason: collision with root package name */
    public float f182876c;

    /* renamed from: d, reason: collision with root package name */
    public int f182877d;

    /* renamed from: e, reason: collision with root package name */
    public int f182878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d f182879f;

    public pa(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.na naVar) {
        this.f182879f = c13577xf2bee52d;
    }

    public void b() {
        d();
        this.f182874a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d = this.f182879f;
        c13577xf2bee52d.f181963f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
        c13577xf2bee52d.f181963f.setContentDescription(c13577xf2bee52d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        mo50305x3d8a09a2(4096);
    }

    public void c() {
        float f17 = 1.0f - (this.f182876c / this.f182875b);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d = this.f182879f;
        int width = c13577xf2bee52d.f181961d.getWidth();
        this.f182877d = ((int) (f17 * (width - r3))) + this.f182878e;
        c13577xf2bee52d.f181964g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13577xf2bee52d.getContext(), java.lang.Math.min((int) java.lang.Math.ceil(this.f182876c), (int) this.f182875b)));
        c13577xf2bee52d.f181962e.setWidth(this.f182877d);
    }

    public void d() {
        this.f182874a = false;
        mo50303x856b99f0(4096);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d.f181960n;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13577xf2bee52d c13577xf2bee52d = this.f182879f;
        c13577xf2bee52d.getClass();
        this.f182874a = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
        float f17 = 0 / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        if (f17 > 60.0f) {
            f17 = 60.0f;
        }
        float round = java.lang.Math.round(f17);
        this.f182875b = round;
        this.f182876c = round;
        this.f182878e = i65.a.b(c13577xf2bee52d.getContext(), 3);
        c13577xf2bee52d.f181964g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13577xf2bee52d.getContext(), (int) this.f182875b));
        c13577xf2bee52d.f181963f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c13577xf2bee52d.f181963f.setContentDescription(c13577xf2bee52d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        c13577xf2bee52d.f181962e.setWidth(this.f182878e);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        this.f182876c = java.lang.Math.max(0.0f, this.f182876c - 0.256f);
        c();
        if (this.f182876c <= 0.1f) {
            return;
        }
        mo50307xb9e94560(4096, 256L);
    }
}
