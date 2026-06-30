package bu2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f24576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f24575d = i17;
        this.f24576e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.en2 place_holder_info;
        r45.p21 item = (r45.p21) obj;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = false;
        if (item.getInteger(5) == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) item.getCustom(2);
            if ((finderObject == null || (place_holder_info = finderObject.getPlace_holder_info()) == null || place_holder_info.getInteger(2) != this.f24575d) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            this.f24576e.f310112d = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
