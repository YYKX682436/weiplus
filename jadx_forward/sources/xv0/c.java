package xv0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.a f538910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.g f538911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xv0.a aVar, xv0.g gVar) {
        super(1);
        this.f538910d = aVar;
        this.f538911e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        xv0.a aVar = this.f538910d;
        aVar.a(floatValue);
        float f17 = aVar.f538906d;
        xv0.g gVar = this.f538911e;
        gVar.L(f17);
        gVar.K();
        yz5.p m176032xd0fbfcdd = gVar.m176032xd0fbfcdd();
        if (m176032xd0fbfcdd != null) {
            m176032xd0fbfcdd.mo149xb9724478(aVar.f538903a, java.lang.Float.valueOf(aVar.f538906d));
        }
        return jz5.f0.f384359a;
    }
}
