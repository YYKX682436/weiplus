package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class yc implements kn.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zc f281843a;

    public yc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zc zcVar) {
        this.f281843a = zcVar;
    }

    @Override // kn.i0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp addtodo");
    }

    @Override // kn.i0
    public void b() {
        android.util.Pair pair;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zc zcVar = this.f281843a;
        rn.c cVar = zcVar.f281900d;
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(cVar.f66259x137a1f8b, cVar.f66264x1210aac6);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu stoTodo no exist");
            pair = new android.util.Pair(java.lang.Boolean.FALSE, cVar.f66264x1210aac6);
        } else {
            java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(cVar.f66259x137a1f8b, ((java.lang.Long) it.next()).longValue());
                o27.s3("");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
            }
            ((nn.j) i95.n0.c(nn.j.class)).Ri().a(cVar.f66259x137a1f8b, 1, kn.j0.b(z07));
            boolean i17 = kn.j0.i(z07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu todoId:%s result:%s", cVar.f66264x1210aac6, java.lang.Boolean.valueOf(i17));
            pair = new android.util.Pair(java.lang.Boolean.valueOf(i17), cVar.f66264x1210aac6);
        }
        if (((java.lang.Boolean) pair.first).booleanValue()) {
            zcVar.f281902f.f280265a.n0(zcVar.f281900d);
            zcVar.f281902f.f280265a.f281301m.m8155x27702c4(zcVar.f281901e);
            zcVar.f281902f.f280265a.p0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp recall result:%s", pair);
    }
}
