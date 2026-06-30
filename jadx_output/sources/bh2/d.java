package bh2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f20852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, java.lang.String str, int i17) {
        super(0);
        this.f20852d = liveRoomControllerStore;
        this.f20853e = str;
        this.f20854f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers = this.f20852d.getControllers();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : controllers) {
            if (((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) obj) instanceof bh2.b) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object obj2 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
            bh2.b bVar = obj2 instanceof bh2.b ? (bh2.b) obj2 : null;
            if (bVar != null) {
                bVar.P1(this.f20853e, this.f20854f);
            }
        }
        return jz5.f0.f302826a;
    }
}
