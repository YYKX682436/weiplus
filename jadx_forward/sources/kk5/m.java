package kk5;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f390201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f390202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kk5.q qVar, boolean z17) {
        super(1);
        this.f390201d = qVar;
        this.f390202e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        kk5.q qVar = this.f390201d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = qVar.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new kk5.f(qVar, state, null), 1, null);
            }
            boolean z17 = this.f390202e;
            if (z17 && (O6 = qVar.O6()) != null) {
                v65.i.b(O6, null, new kk5.h(qVar, null), 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O63 = qVar.O6();
            if (O63 != null) {
                v65.i.b(O63, null, new kk5.j(qVar, z17, null), 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O64 = qVar.O6();
            if (O64 != null) {
                v65.i.b(O64, null, new kk5.l(qVar, null), 1, null);
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.h)) {
            wi5.h hVar = (wi5.h) dVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "CreateGroupSelectHeaderAction " + hVar.f527824b.f477644f);
            java.lang.String str = hVar.f527824b.f477644f;
            int hashCode = str.hashCode();
            java.util.LinkedList linkedList = state.f527852o;
            switch (hashCode) {
                case -1140598940:
                    if (str.equals("fake_user_create_chatroom_choose_open_im") && com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom.k(qVar.m158354x19263085(), null)) {
                        android.content.Intent intent = new android.content.Intent(qVar.m158354x19263085().getIntent());
                        intent.removeExtra("titile");
                        intent.putExtra("openim_appid", "3552365301");
                        intent.putExtra("open_half_screen", true);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            java.lang.String str2 = (java.lang.String) it.next();
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
                                arrayList.add(str2);
                            }
                        }
                        intent.putExtra("already_select_contact", kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                        bh5.c cVar = new bh5.c();
                        cVar.d(intent);
                        cVar.f102455a.f102457a = qVar.m158354x19263085();
                        cVar.a(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a.class.getName());
                        cVar.h(5);
                        break;
                    }
                    break;
                case -181849474:
                    if (str.equals("fake_user_create_chatroom_select_contact_in_chatroom")) {
                        qVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "onImportContactFromChatRoomClick() called");
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("titile", qVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571458fo));
                        intent2.putExtra("list_attr", 2097152);
                        java.util.HashSet hashSet = new java.util.HashSet();
                        hashSet.addAll(state.f527851n);
                        hashSet.addAll(linkedList);
                        java.lang.String g07 = kz5.n0.g0(hashSet, ",", null, null, 0, null, null, 62, null);
                        intent2.putExtra("always_select_contact", g07);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "ImportContactFromChatRoom ".concat(g07));
                        intent2.putExtra("key_canSelectOpenIM", true);
                        intent2.putExtra("Intent_key_show_iv_arrow", true);
                        pf5.j0.a(intent2, j93.j1.class);
                        pf5.j0.a(intent2, ij5.d0.class);
                        pf5.j0.a(intent2, g93.j.class);
                        pf5.j0.a(intent2, cj5.k4.class);
                        pf5.j0.a(intent2, ij5.c.class);
                        pf5.j0.a(intent2, cj5.n3.class);
                        pf5.j0.a(intent2, cj5.w2.class);
                        pf5.j0.a(intent2, cj5.l2.class);
                        bh5.c cVar2 = new bh5.c();
                        cVar2.d(intent2);
                        cVar2.f102455a.f102457a = qVar.m158354x19263085();
                        cVar2.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
                        cVar2.h(1);
                        break;
                    }
                    break;
                case 434583587:
                    if (str.equals("fake_user_create_chatroom_select_chatroom")) {
                        qVar.getClass();
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.setClassName(qVar.m158354x19263085(), "com.tencent.mm.ui.contact.GroupCardSelectUI");
                        intent3.putExtra("group_select_type", true);
                        intent3.putExtra("grou_order_by_conversation_time", true);
                        if (qVar.m158354x19263085().getIntent().getBooleanExtra("group_select_need_result", false)) {
                            intent3.putExtra("group_select_need_result", true);
                            qVar.m158354x19263085().startActivityForResult(intent3, 0);
                        } else {
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = qVar.m158354x19263085();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(intent3);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(m158354x19263085, arrayList2.toArray(), "com/tencent/mm/ui/uic/CreateChatRoomOtherHeaderStrictDupUIC", "onGroupCardClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            m158354x19263085.startActivity((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(m158354x19263085, "com/tencent/mm/ui/uic/CreateChatRoomOtherHeaderStrictDupUIC", "onGroupCardClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "onGroupCardClick");
                        break;
                    }
                    break;
                case 1914591481:
                    if (str.equals("fake_user_create_chatroom_face_2_face")) {
                        qVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11140, 0);
                        j45.l.h(qVar.m158354x19263085(), "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
                        break;
                    }
                    break;
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.t0)) {
            kk5.q.T6(qVar, state);
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.x0)) {
            kk5.q.T6(qVar, state);
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof wi5.j0)) {
            kk5.q.T6(qVar, state);
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof wi5.k0)) {
            kk5.q.T6(qVar, state);
        }
        return jz5.f0.f384359a;
    }
}
