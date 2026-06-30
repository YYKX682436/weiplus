package ds1;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds1.j f324376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ds1.j jVar, yz5.l lVar) {
        super(2);
        this.f324376d = jVar;
        this.f324377e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f324377e;
        if (booleanValue) {
            ds1.h hVar = new ds1.h(lVar, booleanValue);
            this.f324376d.f324380d = true;
            hVar.mo152xb9724478();
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
