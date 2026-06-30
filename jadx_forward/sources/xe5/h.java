package xe5;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f535566a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535567b;

    /* renamed from: c, reason: collision with root package name */
    public final int f535568c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535569d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535570e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f535571f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f535572g;

    public h(java.lang.String item_topic, java.lang.String item_content, int i17, java.lang.String ext_item_content, java.lang.String ext_item_reason, java.lang.String dynamic_recommend_reason, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item_topic, "item_topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item_content, "item_content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext_item_content, "ext_item_content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext_item_reason, "ext_item_reason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamic_recommend_reason, "dynamic_recommend_reason");
        this.f535566a = item_topic;
        this.f535567b = item_content;
        this.f535568c = i17;
        this.f535569d = ext_item_content;
        this.f535570e = ext_item_reason;
        this.f535571f = dynamic_recommend_reason;
        this.f535572g = str;
    }

    /* renamed from: equals */
    public boolean m175435xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe5.h)) {
            return false;
        }
        xe5.h hVar = (xe5.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535566a, hVar.f535566a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535567b, hVar.f535567b) && this.f535568c == hVar.f535568c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535569d, hVar.f535569d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535570e, hVar.f535570e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535571f, hVar.f535571f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535572g, hVar.f535572g);
    }

    /* renamed from: hashCode */
    public int m175436x8cdac1b() {
        int hashCode = ((((((((((this.f535566a.hashCode() * 31) + this.f535567b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f535568c)) * 31) + this.f535569d.hashCode()) * 31) + this.f535570e.hashCode()) * 31) + this.f535571f.hashCode()) * 31;
        java.lang.String str = this.f535572g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m175437x9616526c() {
        return "InfoItem(item_topic=" + this.f535566a + ", item_content=" + this.f535567b + ", item_maxline=" + this.f535568c + ", ext_item_content=" + this.f535569d + ", ext_item_reason=" + this.f535570e + ", dynamic_recommend_reason=" + this.f535571f + ", reason_type=" + this.f535572g + ')';
    }

    public /* synthetic */ h(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, i17, str3, str4, str5, (i18 & 64) != 0 ? null : str6);
    }
}
