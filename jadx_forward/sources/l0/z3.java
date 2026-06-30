package l0;

/* loaded from: classes14.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f396248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(boolean z17, java.lang.String str) {
        super(1);
        this.f396248d = z17;
        this.f396249e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        if (this.f396248d) {
            f06.v[] vVarArr = y1.m0.f540303a;
            java.lang.String description = this.f396249e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
            ((y1.l) semantics).g(y1.i0.f540276y, description);
        }
        return jz5.f0.f384359a;
    }
}
