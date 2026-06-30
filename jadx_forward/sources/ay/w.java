package ay;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f96725a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f96726b;

    public w(java.lang.String answeringTraceId, java.util.List queryList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(answeringTraceId, "answeringTraceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryList, "queryList");
        this.f96725a = answeringTraceId;
        this.f96726b = queryList;
    }

    /* renamed from: equals */
    public boolean m9291xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay.w)) {
            return false;
        }
        ay.w wVar = (ay.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96725a, wVar.f96725a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96726b, wVar.f96726b);
    }

    /* renamed from: hashCode */
    public int m9292x8cdac1b() {
        return (this.f96725a.hashCode() * 31) + this.f96726b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9293x9616526c() {
        return "QueryListUIState(answeringTraceId=" + this.f96725a + ", queryList=" + this.f96726b + ')';
    }
}
