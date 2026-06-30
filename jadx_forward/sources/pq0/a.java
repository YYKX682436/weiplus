package pq0;

/* loaded from: classes7.dex */
public final class a extends lc3.p {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f439099i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f439100m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String bizName, java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f439099i = bizName;
        this.f439100m = "mbpkgs/" + bizName + ".wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f439099i;
    }

    @Override // lc3.o
    public lc3.a k() {
        java.util.Map map = ge3.s.f352507a;
        java.lang.Object obj = ge3.s.f352507a.get(this.f439099i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        ge3.a aVar = (ge3.a) obj;
        return new lc3.a(this.f439100m, aVar.c(), aVar.mo131355xb5885648(), 0L, 8, null);
    }

    @Override // lc3.o
    public lc3.c n() {
        return new lc3.c(this.f439100m, lc3.b.f399415d);
    }

    @Override // lc3.o
    public java.lang.String s() {
        return "/index.js";
    }

    @Override // lc3.o
    public java.lang.String u() {
        return jc3.w0.f380543a.b(this.f439099i);
    }

    @Override // lc3.o
    public java.lang.String v() {
        return this.f439099i;
    }
}
