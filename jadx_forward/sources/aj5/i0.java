package aj5;

/* loaded from: classes.dex */
public final class i0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f86977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86979g;

    public i0(java.util.HashMap hashMap, aj5.r0 r0Var, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f86976d = hashMap;
        this.f86977e = r0Var;
        this.f86978f = list;
        this.f86979g = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list;
        java.lang.String str;
        wi5.n0 n0Var;
        java.util.Map map;
        p13.v vVar = (p13.v) obj;
        this.f86976d.put(new java.lang.Integer(0), vVar);
        aj5.r0 r0Var = this.f86977e;
        ((java.util.ArrayList) r0Var.f87041i).clear();
        java.util.List resultList = vVar.f432693e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
        java.util.Iterator it = resultList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.List list2 = r0Var.f87041i;
            if (!hasNext) {
                int size = ((java.util.ArrayList) list2).size();
                ti5.c cVar = ti5.d.f501196i;
                java.util.List list3 = this.f86978f;
                if (size > 0) {
                    p13.y yVar = (p13.y) ((java.util.ArrayList) list2).get(0);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "chatroomSearchTask onFTSSearchEnd, " + yVar.f432720e + ", " + yVar.f432719d + ", contact = " + n17);
                    ti5.d dVar = new ti5.d(yVar, vVar.f432692d, 0, 0, 0, 0, null, false, 252, null);
                    ri5.h hVar = ri5.j.I;
                    int i18 = ri5.j.L;
                    java.lang.String d17 = n17.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    java.lang.String a17 = hVar.a(d17, i18, 0);
                    list = list3;
                    str = "getUsername(...)";
                    ri5.j b17 = cVar.b(r0Var.m158354x19263085(), a17, n17, i18, dVar);
                    b17.f477660x = false;
                    b17.f477651o = true;
                    b17.A = true;
                    java.lang.String string = r0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.me7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    b17.f477652p = string;
                    b17.f477656t = ((java.util.ArrayList) list2).size() == 1;
                    b17.F = (int) yVar.f432719d;
                    list.add(b17);
                } else {
                    list = list3;
                    str = "getUsername(...)";
                }
                if (((java.util.ArrayList) list2).size() > 1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3("fake_user_create_chatroom_more");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = r0Var.m158354x19263085();
                    ri5.h hVar2 = ri5.j.I;
                    java.lang.String d18 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, str);
                    int i19 = ri5.j.M;
                    ri5.j b18 = cVar.b(m158354x19263085, hVar2.a(d18, i19, 2), z3Var, i19, new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null));
                    b18.f477662z = true;
                    b18.f477658v = false;
                    list.add(b18);
                }
                jz5.l lVar = new jz5.l("view_id", "group_list_recommend");
                jz5.l lVar2 = new jz5.l("appear_type", "3");
                jz5.l lVar3 = new jz5.l("exist_group_list_num", java.lang.String.valueOf(((java.util.ArrayList) list2).size()));
                jz5.l lVar4 = new jz5.l("select_num", "0");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = r0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l("create_group_sessionid", ((aj5.l1) pf5.z.f435481a.a(activity).a(aj5.l1.class)).T6()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, k17, 35568);
                j75.f Q6 = r0Var.Q6();
                if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null && (map = n0Var.F) != null) {
                    ((java.util.LinkedHashMap) map).clear();
                    map.putAll(k17);
                }
                java.lang.Object mo771x2f8fd3 = this.f86979g.mo771x2f8fd3(new java.util.ArrayList(list), interfaceC29045xdcb5ca57);
                return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar2 = (p13.y) next;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "SearchChatroomBySegmentedWord index:" + i17 + ", entityId:" + yVar2.f432719d + ", auxIndex:" + yVar2.f432720e);
            if (yVar2.f432719d > 0) {
                ((java.util.ArrayList) list2).add(yVar2);
            }
            i17 = i27;
        }
    }
}
