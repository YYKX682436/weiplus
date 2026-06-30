package i55;

/* loaded from: classes8.dex */
public final class e extends g55.i {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370377e;

    /* renamed from: f, reason: collision with root package name */
    public int f370378f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370379g;

    public e(long j17) {
        super(j17);
        this.f370377e = "";
    }

    /* renamed from: equals */
    public boolean m134777xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof i55.e) {
            i55.e eVar = (i55.e) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f370377e, this.f370377e) && eVar.f370379g == this.f370379g && eVar.f370378f == this.f370378f) {
                return true;
            }
        }
        return false;
    }

    @Override // g55.i
    /* renamed from: toString */
    public java.lang.String mo130934x9616526c() {
        return super.mo130934x9616526c() + "curRedDotText [" + this.f370377e + "] curRedDotUnReadCnt [" + this.f370378f + "] curIsRedDot = [" + this.f370379g + ']';
    }
}
