package vi2;

/* loaded from: classes8.dex */
public final class b extends vi2.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f519068e;

    /* renamed from: f, reason: collision with root package name */
    public final km2.q f519069f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f519070g;

    /* renamed from: h, reason: collision with root package name */
    public final int f519071h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.bh1 f519072i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f519073m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f519074n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f519075o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r3, km2.q r4, boolean r5, int r6, r45.bh1 r7, boolean r8, boolean r9, boolean r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r2 = this;
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L6
            r4 = r0
        L6:
            r12 = r11 & 4
            r1 = 0
            if (r12 == 0) goto Lc
            r5 = r1
        Lc:
            r12 = r11 & 8
            if (r12 == 0) goto L11
            r6 = r1
        L11:
            r12 = r11 & 16
            if (r12 == 0) goto L16
            r7 = r0
        L16:
            r12 = r11 & 32
            if (r12 == 0) goto L1b
            r8 = r1
        L1b:
            r12 = r11 & 64
            if (r12 == 0) goto L20
            r9 = r1
        L20:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L25
            r10 = r1
        L25:
            if (r4 == 0) goto L29
            r45.xn1 r0 = r4.f390720r
        L29:
            r2.<init>(r0)
            r2.f519068e = r3
            r2.f519069f = r4
            r2.f519070g = r5
            r2.f519071h = r6
            r2.f519072i = r7
            r2.f519073m = r8
            r2.f519074n = r9
            r2.f519075o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi2.b.<init>(int, km2.q, boolean, int, r45.bh1, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    /* renamed from: equals */
    public boolean m172223xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vi2.b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.pk.data.FinderLiveMicAnchorWidgetConvertData");
        vi2.b bVar = (vi2.b) obj;
        return this.f519068e == bVar.f519068e && this.f519070g == bVar.f519070g && this.f519071h == bVar.f519071h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519072i, bVar.f519072i) && this.f519073m == bVar.f519073m && this.f519074n == bVar.f519074n && this.f519075o == bVar.f519075o;
    }

    @Override // vi2.e, in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f519077d != null ? r0.hashCode() : m172224x8cdac1b();
    }

    @Override // vi2.e, in5.c
    public int h() {
        return this.f519068e;
    }

    /* renamed from: hashCode */
    public int m172224x8cdac1b() {
        return vi2.b.class.hashCode();
    }
}
