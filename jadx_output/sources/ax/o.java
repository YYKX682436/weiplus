package ax;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f14955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.p pVar) {
        super(1);
        this.f14955d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long errCode = it.getErrCode();
        yz5.p pVar = this.f14955d;
        if (errCode != 0) {
            pVar.invoke(it.getErrMsg(), null);
        } else {
            pVar.invoke(null, ((com.tencent.mm.flutter.plugin.proto.e0) com.tencent.mm.flutter.plugin.proto.e0.f67961h.parseFrom(it.getData())).g());
        }
        return jz5.f0.f302826a;
    }
}
