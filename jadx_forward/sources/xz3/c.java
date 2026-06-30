package xz3;

/* loaded from: classes15.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz3.f f539743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f539744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xz3.f fVar, sz3.x0 x0Var) {
        super(1);
        this.f539743d = fVar;
        this.f539744e = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductTask", "addScanProductResultForFullImage success: %s", java.lang.Boolean.valueOf(booleanValue));
        xz3.f fVar = this.f539743d;
        if (!booleanValue) {
            fVar.f539749e.j(fVar);
        } else if (fVar.f539748d.f495622k) {
            xz3.f.a(fVar, this.f539744e);
        } else {
            fVar.f539749e.j(fVar);
        }
        return jz5.f0.f384359a;
    }
}
