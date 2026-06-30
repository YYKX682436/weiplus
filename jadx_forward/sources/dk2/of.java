package dk2;

/* loaded from: classes2.dex */
public final class of {

    /* renamed from: j, reason: collision with root package name */
    public static final dk2.nf f315392j = new dk2.nf(null);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f315393k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f315394a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315395b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.vz2 f315396c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f315397d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f315398e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f315399f;

    /* renamed from: g, reason: collision with root package name */
    public final int f315400g;

    /* renamed from: h, reason: collision with root package name */
    public final int f315401h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f315402i;

    public of(java.lang.String themeId, java.lang.String themeTag, java.lang.String cardId, r45.vz2 vz2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, boolean z17, int i17, int i18, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        this.f315394a = themeId;
        this.f315395b = cardId;
        this.f315396c = vz2Var;
        this.f315397d = gVar;
        this.f315398e = gVar2;
        this.f315399f = z17;
        this.f315400g = i17;
        this.f315401h = i18;
        this.f315402i = z18;
    }

    /* renamed from: toString */
    public java.lang.String m124626x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveThemeSpecialBundle[themeId=");
        sb6.append(this.f315394a);
        sb6.append(", cardId=");
        sb6.append(this.f315395b);
        sb6.append(", themeAppearance=");
        r45.vz2 vz2Var = this.f315396c;
        if (vz2Var != null) {
            str = "title:" + vz2Var.f470223e + " subTitle: " + vz2Var.f470225g + " containerType: " + vz2Var.f470231p;
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", cardBuffer=");
        sb6.append(this.f315397d);
        sb6.append(", cardType=");
        sb6.append(this.f315400g);
        sb6.append(", playTogetherLiveType=");
        sb6.append(this.f315401h);
        sb6.append(", enterCheckCache=");
        sb6.append(this.f315402i);
        sb6.append(']');
        return sb6.toString();
    }
}
