package wm5;

/* loaded from: classes10.dex */
public final class h extends wm5.a {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba f528888e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f528889f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wm5.f f528890g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f528891h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f528892i;

    /* renamed from: k, reason: collision with root package name */
    public int f528894k;

    /* renamed from: l, reason: collision with root package name */
    public int f528895l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f528896m;

    /* renamed from: q, reason: collision with root package name */
    public wm5.c f528900q;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f528887d = "VLogDirectorMultiVideoCompositionEffect";

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f528893j = new android.graphics.Rect();

    /* renamed from: n, reason: collision with root package name */
    public final wm5.e f528897n = new wm5.e("renderTracks");

    /* renamed from: o, reason: collision with root package name */
    public boolean f528898o = true;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f528899p = true;

    @Override // wm5.a
    public void b(int i17, int i18) {
        xm5.b.c("BaseMultiVideoCompositionEffect", "updateRenderSize width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f528875b = new android.util.Size(i17, i18);
        if (this.f528894k == i17 && this.f528895l == i18) {
            return;
        }
        this.f528894k = i17;
        this.f528895l = i18;
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba = this.f528888e;
        if (c22965x6f780cba != null) {
            c22965x6f780cba.g(0, 0, i17, i18);
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba2 = this.f528888e;
        if (c22965x6f780cba2 != null) {
            int i19 = this.f528894k;
            int i27 = this.f528895l;
            c22965x6f780cba2.f296332c = i19;
            c22965x6f780cba2.f296333d = i27;
        }
        this.f528892i = true;
    }

    @Override // wm5.a, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25919xc89aa8bb.Filter
    /* renamed from: release */
    public void mo98538x41012807() {
        java.lang.String str;
        super.mo98538x41012807();
        if (this.f528899p) {
            com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba = this.f528888e;
            if (c22965x6f780cba != null) {
                c22965x6f780cba.b();
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f528896m;
            if (c25745xc3945049 != null) {
                c25745xc3945049.m97285x41012807();
            }
            this.f528896m = null;
            wm5.f fVar = this.f528890g;
            if (fVar != null) {
                fVar.b();
            }
            if (this.f528898o) {
                java.lang.String str2 = this.f528887d;
                wm5.e eVar = this.f528897n;
                if (eVar.f528883c <= 0 || eVar.f528882b <= 0) {
                    str = "";
                } else {
                    str = eVar.f528881a + " totalFrame:" + eVar.f528883c + ", totalTime:" + eVar.f528882b + ", average cost:" + (eVar.f528882b / eVar.f528883c);
                }
                xm5.b.c(str2, str, new java.lang.Object[0]);
            }
        }
    }
}
