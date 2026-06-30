package uo5;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: l, reason: collision with root package name */
    public static final uo5.t f511273l = new uo5.t(null);

    /* renamed from: m, reason: collision with root package name */
    public static final short[] f511274m = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480, 1280, 720, 1920, 1080};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f511275n = {new int[]{32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240, 256, 272, 288, 304, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e}, new int[]{48, 64, 96, 112, 144, 176, 192, 224, 240, 272, 288, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 336, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, 384, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, 480}, new int[]{64, 96, 128, 160, 192, 224, 256, 288, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, 384, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, 480, 512, 544, 576, com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9505x29ffff96, 640}, new int[]{128, 192, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 384, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, 512, 576, 640, 704, 768, 832, ce1.h.f4368x366c91de, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, 1024, 1088, dc1.e.f65819x366c91de, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p0.f34638x366c91de, 1280}, new int[]{192, 288, 384, 480, 576, 672, 768, td1.i.f76806x366c91de, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, yc1.s.f77529x366c91de, dc1.e.f65819x366c91de, 1248, 1344, 1440, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, 1632, 1728, 1824, 1920}};

    /* renamed from: o, reason: collision with root package name */
    public static final short[] f511276o = {75, 56, 100, 50};

    /* renamed from: a, reason: collision with root package name */
    public final int f511277a;

    /* renamed from: b, reason: collision with root package name */
    public final int f511278b;

    /* renamed from: c, reason: collision with root package name */
    public final short f511279c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f511280d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f511281e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f511282f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f511283g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f511284h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f511285i;

    /* renamed from: j, reason: collision with root package name */
    public final byte f511286j;

    /* renamed from: k, reason: collision with root package name */
    public final short f511287k;

    public u(int i17, int i18, short s17, byte b17, byte b18, byte b19, boolean z17, boolean z18, boolean z19, byte b27, short s18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f511277a = i17;
        this.f511278b = i18;
        this.f511279c = s17;
        this.f511280d = b17;
        this.f511281e = b18;
        this.f511282f = b19;
        this.f511283g = z17;
        this.f511284h = z18;
        this.f511285i = z19;
        this.f511286j = b27;
        this.f511287k = s18;
    }

    /* renamed from: equals */
    public boolean m168349xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof uo5.u)) {
            return false;
        }
        uo5.u uVar = (uo5.u) obj;
        return uVar.f511277a == this.f511277a && uVar.f511278b == this.f511278b && uVar.f511279c == this.f511279c;
    }

    /* renamed from: hashCode */
    public int m168350x8cdac1b() {
        return (((((((((((((((((this.f511277a * 31) + this.f511278b) * 31) + this.f511279c) * 31) + this.f511280d) * 31) + (this.f511281e & 255)) * 31) + this.f511282f) * 31) + java.lang.Boolean.hashCode(this.f511283g)) * 31) + java.lang.Boolean.hashCode(this.f511284h)) * 31) + java.lang.Boolean.hashCode(this.f511285i)) * 31) + this.f511286j;
    }

    /* renamed from: toString */
    public java.lang.String m168351x9616526c() {
        return "QoSParams(width=" + this.f511277a + ", height=" + this.f511278b + ", kbps=" + ((int) this.f511279c) + ", fps=" + ((int) this.f511280d) + ", iPeriod=" + ((java.lang.Object) java.lang.String.valueOf(this.f511281e & 255)) + ", codecType=" + ((int) this.f511282f) + ", hwEnable=" + this.f511283g + ", skipFrame=" + this.f511284h + ", requestI=" + this.f511285i + ", resvd=" + ((int) this.f511286j) + ", windowMode=" + ((int) this.f511287k) + ')';
    }
}
