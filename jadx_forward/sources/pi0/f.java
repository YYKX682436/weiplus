package pi0;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f436093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.l lVar) {
        super(1);
        this.f436093d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "freeMemory finished");
        yz5.l lVar = this.f436093d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f384359a;
    }
}
