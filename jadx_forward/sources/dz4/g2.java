package dz4;

/* loaded from: classes12.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f326787a;

    /* renamed from: b, reason: collision with root package name */
    public final ih0.p f326788b;

    /* renamed from: c, reason: collision with root package name */
    public final dz4.i f326789c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f326790d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326791e;

    public g2(android.app.Activity activity, ih0.p holder, dz4.i reqData, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqData, "reqData");
        this.f326787a = activity;
        this.f326788b = holder;
        this.f326789c = reqData;
        this.f326790d = str;
        this.f326791e = str2;
    }

    /* renamed from: equals */
    public boolean m126498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.g2)) {
            return false;
        }
        dz4.g2 g2Var = (dz4.g2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326787a, g2Var.f326787a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326788b, g2Var.f326788b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326789c, g2Var.f326789c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326790d, g2Var.f326790d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326791e, g2Var.f326791e);
    }

    /* renamed from: hashCode */
    public int m126499x8cdac1b() {
        int hashCode = ((((this.f326787a.hashCode() * 31) + this.f326788b.hashCode()) * 31) + this.f326789c.hashCode()) * 31;
        java.lang.String str = this.f326790d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f326791e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126500x9616526c() {
        return "WeNoteForwardContext(activity=" + this.f326787a + ", holder=" + this.f326788b + ", reqData=" + this.f326789c + ", targetUserName=" + this.f326790d + ", customText=" + this.f326791e + ')';
    }
}
