package mk1;

/* loaded from: classes7.dex */
public final class b implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk1.v f408626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f408627b;

    public b(mk1.v vVar, android.os.Handler handler) {
        this.f408626a = vVar;
        this.f408627b = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        ye1.r lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        if (!(dataSource instanceof mk1.z)) {
            return null;
        }
        mk1.v vVar = this.f408626a;
        if (vVar != null) {
            lVar = vVar.a(dataSource);
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l(context, this.f408627b.getLooper(), false, false, false, 28, null);
        }
        if (lVar != null) {
            return lVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandExoThumbCompositeMediaPlayerProvider", "provide, SystemMediaPlayer");
        return new ye1.e0();
    }
}
