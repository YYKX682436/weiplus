package az0;

/* loaded from: classes16.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f16035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamMusicVolumeDesc f16036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(az0.f2 f2Var, com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc) {
        super(1);
        this.f16035d = f2Var;
        this.f16036e = mJCamMusicVolumeDesc;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f16035d.f15460d.S(this.f16036e, new az0.i1(it));
        return jz5.f0.f302826a;
    }
}
