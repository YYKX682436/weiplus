package aj5;

/* loaded from: classes.dex */
public final class i0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5446g;

    public i0(java.util.HashMap hashMap, aj5.r0 r0Var, java.util.List list, kotlinx.coroutines.flow.i2 i2Var) {
        this.f5443d = hashMap;
        this.f5444e = r0Var;
        this.f5445f = list;
        this.f5446g = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list;
        java.lang.String str;
        wi5.n0 n0Var;
        java.util.Map map;
        p13.v vVar = (p13.v) obj;
        this.f5443d.put(new java.lang.Integer(0), vVar);
        aj5.r0 r0Var = this.f5444e;
        ((java.util.ArrayList) r0Var.f5508i).clear();
        java.util.List resultList = vVar.f351160e;
        kotlin.jvm.internal.o.f(resultList, "resultList");
        java.util.Iterator it = resultList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.List list2 = r0Var.f5508i;
            if (!hasNext) {
                int size = ((java.util.ArrayList) list2).size();
                ti5.c cVar = ti5.d.f419663i;
                java.util.List list3 = this.f5445f;
                if (size > 0) {
                    p13.y yVar = (p13.y) ((java.util.ArrayList) list2).get(0);
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "chatroomSearchTask onFTSSearchEnd, " + yVar.f351187e + ", " + yVar.f351186d + ", contact = " + n17);
                    ti5.d dVar = new ti5.d(yVar, vVar.f351159d, 0, 0, 0, 0, null, false, 252, null);
                    ri5.h hVar = ri5.j.I;
                    int i18 = ri5.j.L;
                    java.lang.String d17 = n17.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    java.lang.String a17 = hVar.a(d17, i18, 0);
                    list = list3;
                    str = "getUsername(...)";
                    ri5.j b17 = cVar.b(r0Var.getActivity(), a17, n17, i18, dVar);
                    b17.f396127x = false;
                    b17.f396118o = true;
                    b17.A = true;
                    java.lang.String string = r0Var.getActivity().getString(com.tencent.mm.R.string.me7);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    b17.f396119p = string;
                    b17.f396123t = ((java.util.ArrayList) list2).size() == 1;
                    b17.F = (int) yVar.f351186d;
                    list.add(b17);
                } else {
                    list = list3;
                    str = "getUsername(...)";
                }
                if (((java.util.ArrayList) list2).size() > 1) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3("fake_user_create_chatroom_more");
                    androidx.appcompat.app.AppCompatActivity activity = r0Var.getActivity();
                    ri5.h hVar2 = ri5.j.I;
                    java.lang.String d18 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d18, str);
                    int i19 = ri5.j.M;
                    ri5.j b18 = cVar.b(activity, hVar2.a(d18, i19, 2), z3Var, i19, new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null));
                    b18.f396129z = true;
                    b18.f396125v = false;
                    list.add(b18);
                }
                jz5.l lVar = new jz5.l("view_id", "group_list_recommend");
                jz5.l lVar2 = new jz5.l("appear_type", "3");
                jz5.l lVar3 = new jz5.l("exist_group_list_num", java.lang.String.valueOf(((java.util.ArrayList) list2).size()));
                jz5.l lVar4 = new jz5.l("select_num", "0");
                androidx.appcompat.app.AppCompatActivity activity2 = r0Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l("create_group_sessionid", ((aj5.l1) pf5.z.f353948a.a(activity2).a(aj5.l1.class)).T6()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, k17, 35568);
                j75.f Q6 = r0Var.Q6();
                if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null && (map = n0Var.F) != null) {
                    ((java.util.LinkedHashMap) map).clear();
                    map.putAll(k17);
                }
                java.lang.Object emit = this.f5446g.emit(new java.util.ArrayList(list), continuation);
                return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar2 = (p13.y) next;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "SearchChatroomBySegmentedWord index:" + i17 + ", entityId:" + yVar2.f351186d + ", auxIndex:" + yVar2.f351187e);
            if (yVar2.f351186d > 0) {
                ((java.util.ArrayList) list2).add(yVar2);
            }
            i17 = i27;
        }
    }
}
