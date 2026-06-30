package az0;

/* loaded from: classes16.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f15377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f15378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(az0.f2 f2Var, java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings) {
        super(1);
        this.f15375d = f2Var;
        this.f15376e = str;
        this.f15377f = mJRecordingSettings;
        this.f15378g = mJAuditCaptureSettings;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15375d.f15460d;
        az0.i1 i1Var = new az0.i1(it);
        mJCamSession.Z(this.f15376e, this.f15377f, this.f15378g, i1Var);
        return jz5.f0.f302826a;
    }
}
