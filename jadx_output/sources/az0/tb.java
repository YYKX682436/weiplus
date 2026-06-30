package az0;

/* loaded from: classes16.dex */
public final class tb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f15924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f15925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings) {
        super(2);
        this.f15923d = str;
        this.f15924e = mJRecordingSettings;
        this.f15925f = mJAuditCaptureSettings;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.za zaVar = new az0.za(cb6);
        camoSession.s0(this.f15923d, this.f15924e, this.f15925f, zaVar);
        return jz5.f0.f302826a;
    }
}
