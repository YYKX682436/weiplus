package bs2;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(long j17) {
        super(1);
        this.f23840d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject it = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getId() == this.f23840d);
    }
}
