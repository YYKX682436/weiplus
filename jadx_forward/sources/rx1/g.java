package rx1;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f482490a;

    /* renamed from: b, reason: collision with root package name */
    public float f482491b;

    /* renamed from: c, reason: collision with root package name */
    public float f482492c;

    /* renamed from: d, reason: collision with root package name */
    public int f482493d;

    /* renamed from: e, reason: collision with root package name */
    public int f482494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 f482495f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7, rx1.e eVar) {
        this.f482495f = c13162x3ab5c6d7;
    }

    public void b(int i17) {
        this.f482490a = false;
        float Y = o72.x1.Y(i17);
        this.f482491b = Y;
        this.f482492c = Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = this.f482495f;
        this.f482494e = i65.a.b(c13162x3ab5c6d7.getContext(), 0);
        c13162x3ab5c6d7.f178185g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13162x3ab5c6d7.getContext(), (int) (this.f482491b - this.f482492c)));
        c13162x3ab5c6d7.f178186h.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13162x3ab5c6d7.getContext(), (int) this.f482491b));
        c13162x3ab5c6d7.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c13162x3ab5c6d7.f178184f.setContentDescription(c13162x3ab5c6d7.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        c13162x3ab5c6d7.f178183e.setWidth(this.f482494e);
    }

    public void c() {
        float f17 = 1.0f - (this.f482492c / this.f482491b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = this.f482495f;
        int width = c13162x3ab5c6d7.f178182d.getWidth();
        this.f482493d = ((int) (f17 * (width - r3))) + this.f482494e;
        c13162x3ab5c6d7.f178185g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13162x3ab5c6d7.getContext(), (int) (this.f482491b - this.f482492c)));
        c13162x3ab5c6d7.f178186h.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c13162x3ab5c6d7.getContext(), (int) this.f482491b));
        c13162x3ab5c6d7.f178183e.setWidth(this.f482493d);
    }

    public void d(double d17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = this.f482495f;
        this.f482494e = i65.a.b(c13162x3ab5c6d7.getContext(), 0);
        c13162x3ab5c6d7.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c13162x3ab5c6d7.f178184f.setContentDescription(c13162x3ab5c6d7.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
        c();
        if (z17) {
            c13162x3ab5c6d7.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
            c13162x3ab5c6d7.f178184f.setContentDescription(c13162x3ab5c6d7.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            mo50305x3d8a09a2(4096);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        this.f482492c = java.lang.Math.max(0.0f, this.f482492c - 0.256f);
        c();
        if (this.f482492c <= 0.1f) {
            return;
        }
        mo50307xb9e94560(4096, 256L);
    }
}
