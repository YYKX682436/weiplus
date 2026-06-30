package sr3;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f493381a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f493382b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f493383c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f493384d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f493385e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f493386f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f493387g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f493388h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f493389i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f493390j;

    public f(java.lang.String titleTag, java.lang.String unFocusButtonTvText, java.lang.String focusButtonTvText, java.lang.String cacheNickName, java.lang.String cacheDesc, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleTag, "titleTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unFocusButtonTvText, "unFocusButtonTvText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusButtonTvText, "focusButtonTvText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheNickName, "cacheNickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheDesc, "cacheDesc");
        this.f493381a = titleTag;
        this.f493382b = unFocusButtonTvText;
        this.f493383c = focusButtonTvText;
        this.f493384d = cacheNickName;
        this.f493385e = cacheDesc;
        this.f493386f = z17;
        this.f493387g = z18;
        this.f493388h = z19;
        this.f493389i = z27;
        this.f493390j = z28;
    }

    /* renamed from: equals */
    public boolean m165132xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.f)) {
            return false;
        }
        sr3.f fVar = (sr3.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493381a, fVar.f493381a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493382b, fVar.f493382b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493383c, fVar.f493383c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493384d, fVar.f493384d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493385e, fVar.f493385e) && this.f493386f == fVar.f493386f && this.f493387g == fVar.f493387g && this.f493388h == fVar.f493388h && this.f493389i == fVar.f493389i && this.f493390j == fVar.f493390j;
    }

    /* renamed from: hashCode */
    public int m165133x8cdac1b() {
        return (((((((((((((((((this.f493381a.hashCode() * 31) + this.f493382b.hashCode()) * 31) + this.f493383c.hashCode()) * 31) + this.f493384d.hashCode()) * 31) + this.f493385e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f493386f)) * 31) + java.lang.Boolean.hashCode(this.f493387g)) * 31) + java.lang.Boolean.hashCode(this.f493388h)) * 31) + java.lang.Boolean.hashCode(this.f493389i)) * 31) + java.lang.Boolean.hashCode(this.f493390j);
    }

    /* renamed from: toString */
    public java.lang.String m165134x9616526c() {
        return "HeaderConfig(titleTag=" + this.f493381a + ", unFocusButtonTvText=" + this.f493382b + ", focusButtonTvText=" + this.f493383c + ", cacheNickName=" + this.f493384d + ", cacheDesc=" + this.f493385e + ", showFinderTv=" + this.f493386f + ", showAIMessage=" + this.f493387g + ", showLiveReserve=" + this.f493388h + ", showShopWindow=" + this.f493389i + ", shouldShowEnterButtonWhenUnFocus=" + this.f493390j + ')';
    }

    public /* synthetic */ f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) != 0 ? "" : str4, (i17 & 16) == 0 ? str5 : "", (i17 & 32) != 0 ? true : z17, (i17 & 64) != 0 ? true : z18, (i17 & 128) != 0 ? true : z19, (i17 & 256) == 0 ? z27 : true, (i17 & 512) != 0 ? false : z28);
    }
}
