package cw2;

/* loaded from: classes8.dex */
public final class cb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f305156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.db f305157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(yz5.p pVar, cw2.db dbVar) {
        super(2);
        this.f305156d = pVar;
        this.f305157e = dbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long valueOf = java.lang.Long.valueOf(((java.lang.Number) obj).longValue() - this.f305157e.f305188a);
        this.f305156d.mo149xb9724478(valueOf, (android.graphics.Bitmap) obj2);
        return jz5.f0.f384359a;
    }
}
