package ok1;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f427495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk1.b0 f427496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.os.Handler handler, mk1.b0 b0Var) {
        super(0);
        this.f427495d = handler;
        this.f427496e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, AppBrandThumbMediaPlayer");
        pk1.f fVar = pk1.q.O;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pk1.q b17 = pk1.f.b(fVar, context, this.f427495d.getLooper(), false, this.f427496e, 4, null);
        if (b17 != null) {
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSysExoCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
        return new ye1.e0();
    }
}
