package nz0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f423030a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f423031b;

    public e(long j17, java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f423030a = j17;
        this.f423031b = dataList;
    }

    /* renamed from: equals */
    public boolean m150313xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz0.e)) {
            return false;
        }
        nz0.e eVar = (nz0.e) obj;
        return this.f423030a == eVar.f423030a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423031b, eVar.f423031b);
    }

    /* renamed from: hashCode */
    public int m150314x8cdac1b() {
        return (java.lang.Long.hashCode(this.f423030a) * 31) + this.f423031b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150315x9616526c() {
        return "CachedTemplateListInfo(expireTime=" + this.f423030a + ", dataList=" + this.f423031b + ')';
    }
}
