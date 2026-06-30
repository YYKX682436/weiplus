package az0;

/* loaded from: classes5.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(boolean z17) {
        super(2);
        this.f15950d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        final yz5.p cb6 = (yz5.p) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.u0(this.f15950d, new com.tencent.maas.camstudio.j0(cb6) { // from class: az0.ab

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f15332a;

            {
                kotlin.jvm.internal.o.g(cb6, "function");
                this.f15332a = cb6;
            }

            @Override // com.tencent.maas.camstudio.j0
            public final /* synthetic */ void a(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
                this.f15332a.invoke(mJRecordingFinishInfo, mJError);
            }
        });
        return jz5.f0.f302826a;
    }
}
