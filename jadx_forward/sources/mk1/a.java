package mk1;

/* loaded from: classes7.dex */
public final class a implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk1.v f408623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f408624b;

    public a(mk1.v vVar, android.os.Handler handler) {
        this.f408623a = vVar;
        this.f408624b = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        ye1.r a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandExoThumbCompositeMediaPlayerProvider", "provide, LuggageExoMediaPlayer");
        mk1.v vVar = this.f408623a;
        return (vVar == null || (a17 = vVar.a(dataSource)) == null) ? new af1.i0(this.f408624b) : a17;
    }
}
