package ax;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f14956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.p pVar) {
        super(1);
        this.f14956d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long errCode = it.getErrCode();
        yz5.p pVar = this.f14956d;
        if (errCode != 0) {
            pVar.invoke(it.getErrMsg(), null);
        } else {
            pVar.invoke(null, com.tencent.mm.flutter.plugin.proto.s.parseFrom(it.getData()));
        }
        return jz5.f0.f302826a;
    }
}
