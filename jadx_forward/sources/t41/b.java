package t41;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f497018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t41.h f497019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.e8 f497020f;

    public b(java.util.LinkedList linkedList, t41.h hVar, com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var) {
        this.f497018d = linkedList;
        this.f497019e = hVar;
        this.f497020f = e8Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.util.LinkedList linkedList = this.f497018d;
        int size = linkedList.size() < 25 ? linkedList.size() : 25;
        linkedList.size();
        t41.h hVar = this.f497019e;
        if (size == 0) {
            if (hVar != null) {
                hVar.a(2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done loopCount is 0");
            return false;
        }
        java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = 0; i17 < size; i17++) {
            android.util.Pair pair = (android.util.Pair) linkedList.poll();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) this.f497020f).p0((java.lang.String) pair.first, (com.p314xaae8f345.mm.p2621x8fb0427b.z3) pair.second);
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        java.lang.System.currentTimeMillis();
        if (!linkedList.isEmpty()) {
            return true;
        }
        if (hVar != null) {
            hVar.a(2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done updateList is empty");
        return false;
    }
}
