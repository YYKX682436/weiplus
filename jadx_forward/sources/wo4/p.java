package wo4;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gs0.b f529818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wo4.y yVar, gs0.b bVar) {
        super(2);
        this.f529817d = yVar;
        this.f529818e = bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "on frame decode, pts:" + longValue + ", frameCount:" + intValue + ", remuxForThumb:" + this.f529817d.f529846t);
        if (intValue != 0) {
            this.f529818e.a(longValue);
        }
        return jz5.f0.f384359a;
    }
}
