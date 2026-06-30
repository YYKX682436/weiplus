package wo4;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f529802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wo4.l lVar) {
        super(1);
        this.f529802d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wo4.l lVar;
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", "get bitmap " + longValue);
        while (true) {
            lVar = this.f529802d;
            if (longValue <= lVar.f529811g) {
                break;
            }
            zv3.g gVar = lVar.f529812h;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameRetriever");
                throw null;
            }
            zv3.a a17 = gVar.a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get frame ");
            sb6.append(a17 != null ? java.lang.Long.valueOf(a17.f557961b) : null);
            sb6.append(" blendBitmapProvider: ");
            sb6.append(longValue);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", sb6.toString());
            if (a17 == null) {
                break;
            }
            long j17 = a17.f557961b;
            if (j17 <= 0) {
                break;
            }
            lVar.f529811g += j17;
            lVar.f529810f = a17;
        }
        zv3.a aVar = lVar.f529810f;
        if (aVar != null) {
            return aVar.f557960a;
        }
        return null;
    }
}
