package vi5;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi5.h f519161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f519162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ri5.j f519163f;

    public g(vi5.h hVar, in5.s0 s0Var, ri5.j jVar) {
        this.f519161d = hVar;
        this.f519162e = s0Var;
        this.f519163f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/item/extension/conversation/SelectChatroomConversationListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f519162e.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String userName = this.f519163f.f477644f;
        this.f519161d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectChatroomConversationListItemExtension", "goToRoomMember() called with: roomId = " + userName);
        ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
        java.util.List m17 = c01.v1.m(userName);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(m17)) {
            android.content.Intent intent = new android.content.Intent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String obj = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(userName), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)).toString();
            if (obj == null) {
                obj = "";
            }
            intent.putExtra("titile", obj);
            pf5.j0.a(intent, cj5.b.class);
            pf5.j0.a(intent, yi5.c.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            intent.putExtra("KEY_NEED_SEAR_HEADER", false);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = (java.lang.String) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && n17.r2()) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (!((java.lang.String) next2).equals(r17)) {
                    arrayList3.add(next2);
                }
            }
            intent.putExtra("custom_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, ","));
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = context;
            cVar.d(intent);
            cVar.e(true);
            cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            cVar.b(com.p314xaae8f345.mm.p2776x373aa5.C22780x9663434.class);
            cVar.g();
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/item/extension/conversation/SelectChatroomConversationListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
