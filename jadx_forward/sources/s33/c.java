package s33;

/* loaded from: classes15.dex */
public class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f484011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f484012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u33.f f484013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.d f484014d;

    public c(s33.d dVar, java.util.Map map, java.util.List list, u33.f fVar) {
        this.f484014d = dVar;
        this.f484011a = map;
        this.f484012b = list;
        this.f484013c = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> linkedList;
        u33.h y07;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatRoomContactService", "get contact from server errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        int i17 = fVar.f152148a;
        java.util.Map map = this.f484011a;
        if (i17 == 0 && fVar.f152149b == 0 && (linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15762x8aca7032) fVar.f152151d).f36693x47bb989f) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatRoomContactService", "get contact from server success, count %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> it = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15762x8aca7032) fVar.f152151d).f36693x47bb989f.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 next = it.next();
                ((s33.j0) i95.n0.c(s33.j0.class)).wi().z0(s33.w.a(next));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f36637xf02988d6) && (y07 = ((s33.j0) i95.n0.c(s33.j0.class)).wi().y0(next.f36637xf02988d6)) != null) {
                    map.put(next.f36637xf02988d6, y07);
                    ((java.util.concurrent.ConcurrentHashMap) this.f484014d.f484016d).put(next.f36637xf02988d6, y07);
                }
            }
        }
        for (java.lang.String str : this.f484012b) {
            if (!map.containsKey(str)) {
                y33.e eVar = new y33.e();
                eVar.f66967xdde069b = str;
                map.put(str, eVar);
            }
        }
        u33.f fVar2 = this.f484013c;
        if (fVar2 == null) {
            return null;
        }
        fVar2.a(map);
        return null;
    }
}
