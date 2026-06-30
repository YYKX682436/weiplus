package aj5;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r f5464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aj5.r rVar, boolean z17) {
        super(1);
        this.f5464d = rVar;
        this.f5465e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        aj5.r rVar = this.f5464d;
        boolean z17 = this.f5465e;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            aj5.r.U6(rVar, state);
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.t0)) {
            if (((wi5.t0) dVar2).f446341b.f396110e == ri5.j.W) {
                aj5.r.U6(rVar, state);
            }
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.x0)) {
            ((java.util.ArrayList) rVar.f5499f).clear();
            aj5.r.U6(rVar, state);
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.j0)) {
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.k0)) {
            if (z17) {
                aj5.r.T6(rVar, state);
            }
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof wi5.g)) {
            int visibility = rVar.V6().k().getVisibility();
            java.util.List list = rVar.f5499f;
            if (visibility == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select More Button by recommend, relatedChatroomList: ");
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                sb6.append(arrayList.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", sb6.toString());
                if (!arrayList.isEmpty()) {
                    java.util.List b17 = wi5.p0.f446333a.b(state.f446319o, state.f446318n, false);
                    android.content.Intent intent = new android.content.Intent(rVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
                    intent.putExtra("titile", rVar.getActivity().getString(com.tencent.mm.R.string.f490326ml2));
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
                    if (rVar.getActivity().getIntent().getBooleanExtra("group_select_need_result", false)) {
                        intent.putExtra("group_select_need_result", true);
                        rVar.getActivity().startActivityForResult(intent, 0);
                    } else {
                        androidx.appcompat.app.AppCompatActivity activity = rVar.getActivity();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(activity, arrayList4.toArray(), "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookRecommendStrictDupUIC", "showMoreRelatedChatroom", "(Ljava/util/List;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(activity, "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookRecommendStrictDupUIC", "showMoreRelatedChatroom", "(Ljava/util/List;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            } else {
                ((java.util.ArrayList) list).clear();
            }
        }
        return jz5.f0.f302826a;
    }
}
