package hk5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363532a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f363533b;

    public c(java.lang.String appId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f363532a = appId;
        this.f363533b = str;
    }

    /* renamed from: equals */
    public boolean m133698xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk5.c)) {
            return false;
        }
        hk5.c cVar = (hk5.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363532a, cVar.f363532a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363533b, cVar.f363533b);
    }

    /* renamed from: hashCode */
    public int m133699x8cdac1b() {
        int hashCode = this.f363532a.hashCode() * 31;
        java.lang.String str = this.f363533b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m133700x9616526c() {
        return "YuanbaoShareInfo(appId=" + this.f363532a + ", pagePath=" + this.f363533b + ')';
    }
}
