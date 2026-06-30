package aj4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f5317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kb f5318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj4.i f5320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.activity.ComponentActivity componentActivity, bw5.kb kbVar, long j17, aj4.i iVar, zi4.r1 r1Var) {
        super(0);
        this.f5317d = componentActivity;
        this.f5318e = kbVar;
        this.f5319f = j17;
        this.f5320g = iVar;
        this.f5321h = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        aj4.f fVar = new aj4.f(this.f5320g, this.f5321h);
        androidx.activity.ComponentActivity componentActivity = this.f5317d;
        kotlin.jvm.internal.o.g(componentActivity, "componentActivity");
        bw5.kb mediaType = this.f5318e;
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        int ordinal = mediaType.ordinal();
        new com.tencent.mm.plugin.mmsight.SightParams(1, ordinal != 0 ? ordinal != 1 ? 0 : 1 : 2);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = ((bf4.c) bf4.d.f19713b.a()).f19712p;
        long j17 = this.f5319f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g("", "", videoTransPara, j17 > 0 ? (int) j17 : videoTransPara.f71195h * 1000, 15);
        g17.f155684v = java.lang.Boolean.FALSE;
        g17.K = false;
        g17.L = false;
        g17.N = true;
        g17.f155680r = java.lang.Boolean.TRUE;
        g17.f155679q = 4;
        g17.a(2, "com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout");
        g17.a(1, "com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout");
        g17.a(0, "com.tencent.mm.plugin.textstatus.ui.TextStatusRecordPluginLayout");
        kotlinx.coroutines.l.d(b17, null, null, new aj4.s(componentActivity, g17, fVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
