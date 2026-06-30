package gm2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name */
    public static final int f355042i = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16.0f);

    /* renamed from: j, reason: collision with root package name */
    public static final int f355043j = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10.0f);

    /* renamed from: k, reason: collision with root package name */
    public static final float f355044k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);

    /* renamed from: l, reason: collision with root package name */
    public static final float f355045l = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f355046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f355047b;

    /* renamed from: c, reason: collision with root package name */
    public final float f355048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f355049d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355050e;

    /* renamed from: f, reason: collision with root package name */
    public final int f355051f;

    /* renamed from: g, reason: collision with root package name */
    public final int f355052g;

    /* renamed from: h, reason: collision with root package name */
    public final float f355053h;

    public w(java.lang.CharSequence text, float f17, float f18, int i17, int i18, int i19, int i27, float f19, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f19 = (i28 & 128) != 0 ? f355045l : f19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f355046a = text;
        this.f355047b = f17;
        this.f355048c = f18;
        this.f355049d = i17;
        this.f355050e = i18;
        this.f355051f = i19;
        this.f355052g = i27;
        this.f355053h = f19;
    }

    /* renamed from: toString */
    public java.lang.String m131864x9616526c() {
        return "text:" + ((java.lang.Object) this.f355046a) + ",leftPading:" + this.f355047b + ",rightPading:" + this.f355048c + ",bgColor:" + this.f355049d + ",bgHeight:" + this.f355050e + ",textColor:" + this.f355051f + ",textSize:" + this.f355052g + ",radius:" + this.f355053h;
    }
}
