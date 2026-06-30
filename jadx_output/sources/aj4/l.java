package aj4;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kb f5333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj4.m f5335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.app.Activity activity, bw5.kb kbVar, long j17, boolean z17, aj4.m mVar, zi4.r1 r1Var) {
        super(0);
        this.f5332d = activity;
        this.f5333e = kbVar;
        this.f5334f = j17;
        this.C = z17;
        this.f5335g = mVar;
        this.f5336h = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        android.app.Activity activity = this.f5332d;
        bw5.kb mediaType = this.f5333e;
        long j17 = this.f5334f;
        boolean z17 = this.C;
        aj4.m mVar = this.f5335g;
        kotlinx.coroutines.y0 scope = mVar.f5338i;
        aj4.k kVar = new aj4.k(mVar, this.f5336h);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(scope, "scope");
        aj4.w wVar = aj4.w.f5378a;
        int incrementAndGet = (aj4.w.f5379b.incrementAndGet() & 4095) | 520960;
        aj4.t tVar = new aj4.t(activity, scope, kVar);
        synchronized (wVar) {
            aj4.w.f5380c.put(java.lang.Integer.valueOf(incrementAndGet), tVar);
        }
        android.content.Intent intent = new android.content.Intent();
        if (j17 > 0) {
            i17 = (int) j17;
        } else {
            ((qc0.k1) i95.n0.c(qc0.k1.class)).getClass();
            i17 = ((tt3.a) tt3.b.f422037b.a()).f422036i;
        }
        intent.putExtra("key_edit_video_max_time_length", i17);
        intent.putExtra("key_edit_text_color", "#0E9CE6");
        intent.putExtra("album_is_from_text_status", true);
        intent.putExtra("edt_video_layout_from_text_status", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
        intent.putExtra("is_hide_album_footer", true);
        if (z17) {
            intent.putExtra("Gallery_LivePhoto_Need_Query", true);
            intent.putExtra("Gallery_LivePhoto_Auto_Enable", true);
        }
        int ordinal = mediaType.ordinal();
        if (ordinal != 0) {
            i18 = ordinal != 1 ? 3 : 2;
        } else {
            i18 = 1;
        }
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.c(activity, incrementAndGet, 1, 22, i18, false, intent);
        return jz5.f0.f302826a;
    }
}
