package rv;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f481344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f481345b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481346c;

    /* renamed from: d, reason: collision with root package name */
    public final int f481347d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f481348e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f481349f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f481350g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f481351h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f481352i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f481353j;

    public a(java.lang.String actionID, int i17, java.lang.String actionName, int i18, android.graphics.drawable.Drawable drawable, java.lang.Integer num, boolean z17, boolean z18, boolean z19, boolean z27, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        drawable = (i19 & 16) != 0 ? null : drawable;
        num = (i19 & 32) != 0 ? null : num;
        z17 = (i19 & 64) != 0 ? false : z17;
        z18 = (i19 & 128) != 0 ? false : z18;
        z19 = (i19 & 256) != 0 ? false : z19;
        z27 = (i19 & 512) != 0 ? false : z27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionID, "actionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionName, "actionName");
        this.f481344a = actionID;
        this.f481345b = i17;
        this.f481346c = actionName;
        this.f481347d = i18;
        this.f481348e = drawable;
        this.f481349f = num;
        this.f481350g = z17;
        this.f481351h = z18;
        this.f481352i = z19;
        this.f481353j = z27;
    }

    /* renamed from: equals */
    public boolean m163061xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.a)) {
            return false;
        }
        rv.a aVar = (rv.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481344a, aVar.f481344a) && this.f481345b == aVar.f481345b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481346c, aVar.f481346c) && this.f481347d == aVar.f481347d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481348e, aVar.f481348e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481349f, aVar.f481349f) && this.f481350g == aVar.f481350g && this.f481351h == aVar.f481351h && this.f481352i == aVar.f481352i && this.f481353j == aVar.f481353j;
    }

    /* renamed from: hashCode */
    public int m163062x8cdac1b() {
        int hashCode = ((((((this.f481344a.hashCode() * 31) + java.lang.Integer.hashCode(this.f481345b)) * 31) + this.f481346c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f481347d)) * 31;
        android.graphics.drawable.Drawable drawable = this.f481348e;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        java.lang.Integer num = this.f481349f;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f481350g)) * 31) + java.lang.Boolean.hashCode(this.f481351h)) * 31) + java.lang.Boolean.hashCode(this.f481352i)) * 31) + java.lang.Boolean.hashCode(this.f481353j);
    }

    /* renamed from: toString */
    public java.lang.String m163063x9616526c() {
        return "BrandCustomSharePanelAction(actionID=" + this.f481344a + ", menuId=" + this.f481345b + ", actionName=" + this.f481346c + ", iconKey=" + this.f481347d + ", iconImage=" + this.f481348e + ", iconTintColor=" + this.f481349f + ", isDisabled=" + this.f481350g + ", isClient=" + this.f481351h + ", refreshBeforeShow=" + this.f481352i + ", canShowNewFlag=" + this.f481353j + ')';
    }
}
