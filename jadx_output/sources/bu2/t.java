package bu2;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f24568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f24567d = j17;
        this.f24568e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.p21 item = (r45.p21) obj;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = false;
        if (item.getInteger(5) == 0 && item.getInteger(0) != 2) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) item.getCustom(2);
            if (finderObject != null && finderObject.getId() == this.f24567d) {
                z17 = true;
            }
        }
        if (z17) {
            this.f24568e.f310112d = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
