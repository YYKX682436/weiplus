package aj4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj4.i f5313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(aj4.i iVar, zi4.r1 r1Var) {
        super(0);
        this.f5313d = iVar;
        this.f5314e = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f5313d.f5328h, "camera permission denied");
        this.f5314e.a(new bw5.hb(), -1L, "camera permission denied");
        return jz5.f0.f302826a;
    }
}
