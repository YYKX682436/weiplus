package hr3;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f365217a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f365218b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f365219c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f365220d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f365221e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f365222f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f365223g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f365224h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f365225i;

    /* renamed from: j, reason: collision with root package name */
    public int f365226j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.a f365227k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f365228l;

    public j9(int i17, android.view.View section, android.widget.TextView title, android.widget.TextView summary, android.widget.TextView summaryMore, android.widget.ImageView image, android.graphics.drawable.Drawable drawable, yz5.l imageOnClick, java.lang.CharSequence charSequence, int i18, yz5.a aVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(section, "section");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(summary, "summary");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(summaryMore, "summaryMore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageOnClick, "imageOnClick");
        this.f365217a = i17;
        this.f365218b = section;
        this.f365219c = title;
        this.f365220d = summary;
        this.f365221e = summaryMore;
        this.f365222f = image;
        this.f365223g = drawable;
        this.f365224h = imageOnClick;
        this.f365225i = charSequence;
        this.f365226j = i18;
        this.f365227k = aVar;
        this.f365228l = z17;
    }

    /* renamed from: equals */
    public boolean m133960xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr3.j9)) {
            return false;
        }
        hr3.j9 j9Var = (hr3.j9) obj;
        return this.f365217a == j9Var.f365217a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365218b, j9Var.f365218b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365219c, j9Var.f365219c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365220d, j9Var.f365220d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365221e, j9Var.f365221e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365222f, j9Var.f365222f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365223g, j9Var.f365223g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365224h, j9Var.f365224h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365225i, j9Var.f365225i) && this.f365226j == j9Var.f365226j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365227k, j9Var.f365227k) && this.f365228l == j9Var.f365228l;
    }

    /* renamed from: hashCode */
    public int m133961x8cdac1b() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f365217a) * 31) + this.f365218b.hashCode()) * 31) + this.f365219c.hashCode()) * 31) + this.f365220d.hashCode()) * 31) + this.f365221e.hashCode()) * 31) + this.f365222f.hashCode()) * 31;
        android.graphics.drawable.Drawable drawable = this.f365223g;
        int hashCode2 = (((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f365224h.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.f365225i;
        int hashCode3 = (((hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + java.lang.Integer.hashCode(this.f365226j)) * 31;
        yz5.a aVar = this.f365227k;
        return ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f365228l);
    }

    /* renamed from: toString */
    public java.lang.String m133962x9616526c() {
        return "ItemView(titleStringResId=" + this.f365217a + ", section=" + this.f365218b + ", title=" + this.f365219c + ", summary=" + this.f365220d + ", summaryMore=" + this.f365221e + ", image=" + this.f365222f + ", imagePrepend=" + this.f365223g + ", imageOnClick=" + this.f365224h + ", text=" + ((java.lang.Object) this.f365225i) + ", maxLines=" + this.f365226j + ", onClickMore=" + this.f365227k + ", forceShowMoreBtn=" + this.f365228l + ')';
    }
}
