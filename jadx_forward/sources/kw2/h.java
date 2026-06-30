package kw2;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f394550a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f394551b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f394552c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394553d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394554e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f394555f;

    public h(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.util.ArrayList playItemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playItemList, "playItemList");
        this.f394550a = z17;
        this.f394551b = z18;
        this.f394552c = z19;
        this.f394553d = z27;
        this.f394554e = z28;
        this.f394555f = playItemList;
    }

    /* renamed from: equals */
    public boolean m144501xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.h)) {
            return false;
        }
        kw2.h hVar = (kw2.h) obj;
        return this.f394550a == hVar.f394550a && this.f394551b == hVar.f394551b && this.f394552c == hVar.f394552c && this.f394553d == hVar.f394553d && this.f394554e == hVar.f394554e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394555f, hVar.f394555f);
    }

    /* renamed from: hashCode */
    public int m144502x8cdac1b() {
        return (((((((((java.lang.Boolean.hashCode(this.f394550a) * 31) + java.lang.Boolean.hashCode(this.f394551b)) * 31) + java.lang.Boolean.hashCode(this.f394552c)) * 31) + java.lang.Boolean.hashCode(this.f394553d)) * 31) + java.lang.Boolean.hashCode(this.f394554e)) * 31) + this.f394555f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144503x9616526c() {
        return "PlaySession(hitPrepare=" + this.f394550a + ", hitStart=" + this.f394551b + ", hitStop=" + this.f394552c + ", allFileDownloadComplete=" + this.f394553d + ", onlyPreRender=" + this.f394554e + ", playItemList=" + this.f394555f + ')';
    }
}
