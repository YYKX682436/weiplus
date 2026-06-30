package t41;

/* loaded from: classes8.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f497015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t41.h f497016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.s0 f497017f;

    public a(java.util.LinkedList linkedList, t41.h hVar, com.p314xaae8f345.mm.p943x351df9c2.s0 s0Var) {
        this.f497015d = linkedList;
        this.f497016e = hVar;
        this.f497017f = s0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.util.LinkedList linkedList = this.f497015d;
        int size = linkedList.size() < 25 ? linkedList.size() : 25;
        linkedList.size();
        t41.h hVar = this.f497016e;
        if (size == 0) {
            if (hVar != null) {
                hVar.a(1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done loopCount is 0");
            return false;
        }
        if (linkedList.isEmpty()) {
            if (hVar != null) {
                hVar.a(1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
            return false;
        }
        java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = (com.p314xaae8f345.mm.p943x351df9c2.r0) linkedList.poll();
            if (r0Var == null) {
                break;
            }
            this.f497017f.y0(r0Var);
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        java.lang.System.currentTimeMillis();
        if (!linkedList.isEmpty()) {
            return true;
        }
        if (hVar != null) {
            hVar.a(1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
        return false;
    }
}
