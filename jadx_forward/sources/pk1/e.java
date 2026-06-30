package pk1;

/* loaded from: classes7.dex */
public final class e implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f436972a;

    public e(android.os.Handler handler) {
        this.f436972a = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        pk1.d dVar = new pk1.d(this.f436972a, dataSource);
        if (dataSource instanceof mk1.z) {
            return (ye1.r) dVar.mo152xb9724478();
        }
        if (!(dataSource instanceof mk1.a0)) {
            throw new jz5.j();
        }
        if (((mk1.a0) dataSource).f408625e) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            boolean z17 = false;
            if (e0Var != null) {
                if (((h62.d) e0Var).Ni(e42.d0.clicfg_appbrand_wxeb_video_support_switch_thumbplayer_for_hls, 0) == 1) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "useThumbPlayerInXWebPlayHls, " + z17);
            if (z17) {
                return (ye1.a) dVar.mo152xb9724478();
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("chunked", dataSource.f408630b)) {
            return (ye1.a) dVar.mo152xb9724478();
        }
        return null;
    }
}
