package tu1;

/* loaded from: classes13.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pu1.b f503629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f503630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tu1.o oVar, pu1.b bVar, android.content.Context context) {
        super(0);
        this.f503628d = oVar;
        this.f503629e = bVar;
        this.f503630f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.media.projection.MediaProjection mediaProjection;
        tu1.o oVar = this.f503628d;
        android.content.Context context = this.f503630f;
        tu1.d dVar = new tu1.d(oVar, context);
        oVar.getClass();
        pu1.b bVar = this.f503629e;
        bVar.f337853j = false;
        int i17 = bVar.f337848e;
        if (i17 == 0) {
            i17 = 30;
        }
        bVar.f337848e = i17;
        int i18 = bVar.f337847d;
        if (i18 == 0) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_finder_screec_cast_pc_video_bitrate;
            bVar.f337847d = ((h62.d) e0Var).Ni(d0Var, 4000) * 1000;
            i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, 4000) * 1000;
        }
        bVar.f337847d = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "config is " + bVar);
        oVar.f503648f = new ru1.t(bVar, dVar);
        tu1.e eVar = new tu1.e(context, oVar);
        pu1.a aVar = bVar.f439952p;
        pu1.a aVar2 = aVar.f439948a ? aVar : null;
        if (aVar2 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29 && b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") == 0 && (mediaProjection = oVar.f503644b) != null) {
                try {
                    oVar.f503649g = new ru1.g(mediaProjection, context, aVar, eVar);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastManager", "createMediaProjection failed cause " + e17);
                }
            }
            if (oVar.f503649g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "mScreenCastAudioEncoder still null");
                oVar.f503649g = new ru1.e(aVar2, eVar);
            }
        }
        ru1.u uVar = oVar.f503649g;
        if (uVar != null) {
            uVar.a();
        }
        oVar.f503653k = true;
        return jz5.f0.f384359a;
    }
}
