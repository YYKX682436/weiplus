package qv1;

/* loaded from: classes.dex */
public class a implements rv1.f, lm0.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.b3 f448460d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f448461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f448462f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f448463g = new java.util.HashMap();

    public com.p314xaae8f345.mm.p2621x8fb0427b.b3 a() {
        if (this.f448460d == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f448460d == null) {
                    this.f448460d = new com.p314xaae8f345.mm.p2621x8fb0427b.b3(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f448460d;
    }

    public boolean b(java.lang.String str) {
        if (this.f448461e) {
            return false;
        }
        java.util.HashMap hashMap = this.f448462f;
        try {
            if (hashMap.containsKey(str)) {
                return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a().z0(str);
            boolean z17 = true;
            boolean z18 = (((long) z07.f69084x8729abea) & 16384) != 0;
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ChatRoomAdminSwitch", -1);
            int b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ChatRoomAdminMinMemberCount", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomService", "[isEnableRoomManager] chatroomName:%s isStatusEnable:%s switchFlag:%s minCount:%d memberCount:%d", str, java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(z07.A0().size()));
            if (b17 <= 0 || (!z18 && b18 > z07.A0().size())) {
                z17 = false;
            }
            hashMap.put(str, java.lang.Boolean.valueOf(z17));
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatroomService", e17, "[isEnableRoomManager]", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean c(java.lang.String str) {
        java.util.HashMap hashMap = this.f448463g;
        try {
            if (hashMap.containsKey(str)) {
                return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
            }
            boolean z17 = (((long) a().z0(str).f69084x8729abea) & 2) == 2;
            if (z17) {
                hashMap.put(str, java.lang.Boolean.valueOf(z17));
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatroomService", e17, "[isEnableRoomManager]", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean d(java.lang.String str) {
        p75.n0 n0Var = dm.x1.N;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.x1.V);
        p75.m0 j17 = dm.x1.Q.j(str);
        p75.i0 g17 = dm.x1.N.g(linkedList);
        g17.f434190d = j17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        dm.x1 x1Var = (dm.x1) g17.a().o(dm.x1.Y1.Q4(), dm.x1.class);
        return ((x1Var != null ? x1Var.f69110xcaa18d00 : 0) & 1) == 1;
    }

    public void e(boolean z17) {
        this.f448461e = z17;
    }
}
