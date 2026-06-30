package eg2;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qc0.a f334184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qc0.a aVar) {
        super(2);
        this.f334184d = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String localPath = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        qc0.a aVar = this.f334184d;
        aVar.f442882d.mo146xb9724478(localPath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveCoverEditDelegateImpl", "onHDToggleListener: isHD=" + booleanValue + ", context.isCurrentImageHD=" + aVar.f442888j);
        return jz5.f0.f384359a;
    }
}
