package ir;

/* loaded from: classes12.dex */
public final class v extends ir.r {

    /* renamed from: b, reason: collision with root package name */
    public final ir.t f375441b;

    /* renamed from: c, reason: collision with root package name */
    public final ir.u f375442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ir.t groupInfo, ir.u setInfo) {
        super(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setInfo, "setInfo");
        this.f375441b = groupInfo;
        this.f375442c = setInfo;
    }

    @Override // ir.r
    public boolean b(java.lang.Object obj) {
        if (super.b(obj) && (obj instanceof ir.v)) {
            ir.v vVar = (ir.v) obj;
            if (this.f375441b.b(vVar.f375441b) && this.f375442c.b(vVar.f375442c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ir.r
    public java.lang.String c() {
        return this.f375441b.c();
    }

    @Override // ir.r
    public java.lang.String d() {
        return this.f375441b.d();
    }

    @Override // ir.r
    public java.lang.String e() {
        return this.f375441b.e();
    }
}
