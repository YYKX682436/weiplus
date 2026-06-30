package kk5;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f390234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f390235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kk5.c0 c0Var, java.util.List list) {
        super(1);
        this.f390234d = c0Var;
        this.f390235e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List commonChatroomList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonChatroomList, "commonChatroomList");
        kk5.c0 c0Var = this.f390234d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c0Var.f390157e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        c0Var.f390157e = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "commonChatroomList: " + commonChatroomList);
        boolean isEmpty = commonChatroomList.isEmpty() ^ true;
        java.util.List list = this.f390235e;
        if (isEmpty) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", c0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.me8));
            intent.putExtra("from_create_group_scene", c0Var.m158354x19263085().getIntent().getIntExtra("from_create_group_scene", 0));
            pf5.j0.a(intent, kk5.h0.class);
            pf5.j0.a(intent, cj5.l4.class);
            pf5.j0.a(intent, aj5.i1.class);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.addAll(commonChatroomList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "tipDuplicateChatroom, chatroomNames: " + arrayList2);
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
            arrayList3.addAll(arrayList);
            intent.putStringArrayListExtra("list_attr", arrayList2);
            intent.putStringArrayListExtra("chatroommemberlist", arrayList3);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            intent.putExtra("create_group_session_id", ((aj5.l1) pf5.z.f435481a.a(activity).a(aj5.l1.class)).T6());
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = c0Var.m158354x19263085();
            cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16869xff3e4b69.class);
            cVar.a(com.p314xaae8f345.mm.ui.ActivityC21444x679190f4.class.getName());
            if (c0Var.m158354x19263085().getIntent().getBooleanExtra("group_select_need_result", false)) {
                intent.putExtra("group_select_need_result", true);
                cVar.d(intent);
                cVar.h(0);
            } else {
                cVar.d(intent);
                cVar.g();
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            kk5.h0 h0Var = (kk5.h0) pf5.z.f435481a.a(activity2).a(kk5.h0.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList4.add((java.lang.String) it6.next());
            }
            h0Var.T6(arrayList4);
        }
        return jz5.f0.f384359a;
    }
}
