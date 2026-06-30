package lt3;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f402816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lt3.f0 f0Var) {
        super(1);
        this.f402816d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lt3.f0 f0Var;
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "get bitmap " + longValue);
        while (true) {
            long j17 = longValue / 1000;
            f0Var = this.f402816d;
            if (j17 <= f0Var.f402747c) {
                break;
            }
            zv3.g gVar = f0Var.f402749e;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameRetriever");
                throw null;
            }
            zv3.a a17 = gVar.a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get frame ");
            sb6.append(a17 != null ? java.lang.Long.valueOf(a17.f557961b) : null);
            sb6.append(" blendBitmapProvider: ");
            sb6.append(longValue);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
            if (a17 == null) {
                break;
            }
            long j18 = a17.f557961b;
            if (j18 <= 0) {
                break;
            }
            f0Var.f402747c += j18;
            f0Var.f402748d = a17;
        }
        zv3.a aVar = f0Var.f402748d;
        if (aVar != null) {
            return aVar.f557960a;
        }
        return null;
    }
}
