package ax2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ax2.n f15076d = new ax2.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().z0()).iterator();
        while (it.hasNext()) {
            ce2.i iVar = (ce2.i) it.next();
            kotlin.jvm.internal.o.d(synchronizedMap);
            synchronizedMap.put(iVar.field_rewardProductId, iVar);
        }
        return synchronizedMap;
    }
}
