package aj5;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r f86997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f86998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aj5.r rVar, boolean z17) {
        super(1);
        this.f86997d = rVar;
        this.f86998e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        aj5.r rVar = this.f86997d;
        boolean z17 = this.f86998e;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            aj5.r.U6(rVar, state);
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.t0)) {
            if (((wi5.t0) dVar2).f527874b.f477643e == ri5.j.W) {
                aj5.r.U6(rVar, state);
            }
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
            ((java.util.ArrayList) rVar.f87032f).clear();
            aj5.r.U6(rVar, state);
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.j0)) {
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof wi5.k0)) {
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof wi5.g)) {
            int visibility = rVar.V6().k().getVisibility();
            java.util.List list = rVar.f87032f;
            if (visibility == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select More Button by recommend, relatedChatroomList: ");
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                sb6.append(arrayList.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", sb6.toString());
                if (!arrayList.isEmpty()) {
                    java.util.List b17 = wi5.p0.f527866a.b(state.f527852o, state.f527851n, false);
                    android.content.Intent intent = new android.content.Intent(rVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
                    intent.putExtra("titile", rVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571859ml2));
                    pf5.j0.a(intent, cj5.b.class);
                    java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                    arrayList2.addAll(arrayList);
                    intent.putStringArrayListExtra("chatroomlist", arrayList2);
                    java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                    arrayList3.addAll(b17);
                    intent.putStringArrayListExtra("chatroommemberlist", arrayList3);
                    pf5.j0.a(intent, cj5.x4.class);
                    pf5.j0.a(intent, cj5.w2.class);
                    pf5.j0.a(intent, cj5.l2.class);
                    pf5.j0.a(intent, aj5.i1.class);
                    pf5.j0.a(intent, aj5.e.class);
                    if (rVar.m158354x19263085().getIntent().getBooleanExtra("group_select_need_result", false)) {
                        intent.putExtra("group_select_need_result", true);
                        rVar.m158354x19263085().startActivityForResult(intent, 0);
                    } else {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = rVar.m158354x19263085();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(m158354x19263085, arrayList4.toArray(), "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookRecommendStrictDupUIC", "showMoreRelatedChatroom", "(Ljava/util/List;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        m158354x19263085.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(m158354x19263085, "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookRecommendStrictDupUIC", "showMoreRelatedChatroom", "(Ljava/util/List;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            } else {
                ((java.util.ArrayList) list).clear();
            }
        }
        return jz5.f0.f384359a;
    }
}
