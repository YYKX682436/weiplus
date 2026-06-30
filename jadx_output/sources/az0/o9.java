package az0;

/* loaded from: classes16.dex */
public final class o9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f15780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f15781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings) {
        super(2);
        this.f15779d = str;
        this.f15780e = mJRecordingSettings;
        this.f15781f = mJAuditCaptureSettings;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.x8 x8Var = new az0.x8(cb6);
        camSession.Z(this.f15779d, this.f15780e, this.f15781f, x8Var);
        return jz5.f0.f302826a;
    }
}
