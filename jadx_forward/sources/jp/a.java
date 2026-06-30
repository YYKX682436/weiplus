package jp;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f382503a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f382504b;

    public a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f382503a = "";
        this.f382504b = arrayList;
    }

    /* renamed from: equals */
    public boolean m141192xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp.a)) {
            return false;
        }
        jp.a aVar = (jp.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382503a, aVar.f382503a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382504b, aVar.f382504b);
    }

    /* renamed from: hashCode */
    public int m141193x8cdac1b() {
        return (this.f382503a.hashCode() * 31) + this.f382504b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141194x9616526c() {
        return "FullScreenMpLinkInfo(urlPrefix=" + this.f382503a + ", showTypeList=" + this.f382504b + ')';
    }
}
