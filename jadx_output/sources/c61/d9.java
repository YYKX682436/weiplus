package c61;

/* loaded from: classes.dex */
public final class d9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f38941a;

    public d9(yz5.a aVar) {
        this.f38941a = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar).getCustom(2);
            com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "preload successfully. feedId=".concat(pm0.v.u(finderObject != null ? finderObject.getId() : 0L)));
            this.f38941a.invoke();
        }
        return jz5.f0.f302826a;
    }
}
