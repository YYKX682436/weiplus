package g93;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f351311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g93.j jVar) {
        super(1);
        this.f351311d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.e0)) {
            g93.j jVar = this.f351311d;
            jVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToRoomMember() called with: roomId = ");
            java.lang.String userName = ((wi5.e0) dVar).f527820b;
            sb6.append(userName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.util.List m17 = c01.v1.m(userName);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(m17)) {
                java.lang.String r17 = c01.z1.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m17) {
                    if (c01.e2.J((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!((java.lang.String) next).equals(r17)) {
                        arrayList2.add(next);
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                android.app.Activity context = jVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String obj3 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(userName), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)).toString();
                if (obj3 == null) {
                    obj3 = "";
                }
                intent.putExtra("titile", obj3 + ' ' + jVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n76, java.lang.Integer.valueOf(arrayList2.size())));
                intent.putExtra("list_attr", 64);
                intent.putExtra("always_select_contact", (java.lang.String) ((jz5.n) jVar.f351316f).mo141623x754a37bb());
                intent.putExtra("need_show_all_selected", true);
                intent.putExtra("all_selected_checked", false);
                intent.putExtra("key_confirm_menu_name", jVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk));
                pf5.j0.a(intent, cj5.b.class);
                pf5.j0.a(intent, cj5.x4.class);
                pf5.j0.a(intent, cj5.d1.class);
                pf5.j0.a(intent, j93.l1.class);
                pf5.j0.a(intent, cj5.w2.class);
                pf5.j0.a(intent, cj5.l2.class);
                intent.putExtra("KEY_NEED_SEAR_HEADER", false);
                intent.putExtra("custom_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
                bh5.c cVar = new bh5.c();
                cVar.d(intent);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = jVar.m158354x19263085();
                bh5.d dVar2 = cVar.f102455a;
                dVar2.f102457a = m158354x19263085;
                dVar2.f102460d.A(true);
                cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
                cVar.h(1);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = jVar.m158354x19263085();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
