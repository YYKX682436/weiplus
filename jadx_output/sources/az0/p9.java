package az0;

/* loaded from: classes5.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(boolean z17) {
        super(2);
        this.f15813d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        final yz5.p cb6 = (yz5.p) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.a0(this.f15813d, new com.tencent.maas.camstudio.j0(cb6) { // from class: az0.y8

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.p f16081a;

            {
                kotlin.jvm.internal.o.g(cb6, "function");
                this.f16081a = cb6;
            }

            @Override // com.tencent.maas.camstudio.j0
            public final /* synthetic */ void a(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
                this.f16081a.invoke(mJRecordingFinishInfo, mJError);
            }
        });
        return jz5.f0.f302826a;
    }
}
