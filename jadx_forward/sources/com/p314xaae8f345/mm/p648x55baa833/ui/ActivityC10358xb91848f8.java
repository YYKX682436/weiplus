package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "Lcom/tencent/mm/chatroom/ui/r8;", "<init>", "()V", "com/tencent/mm/chatroom/ui/b9", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI */
/* loaded from: classes11.dex */
public class ActivityC10358xb91848f8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.q0, com.p314xaae8f345.mm.p648x55baa833.ui.r8 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p648x55baa833.ui.b9 f145388u = new com.p314xaae8f345.mm.p648x55baa833.ui.b9(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145389d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145390e;

    /* renamed from: f, reason: collision with root package name */
    public long f145391f;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145397o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.q8 f145398p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f145392g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f145393h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f145394i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f145395m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f145396n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f145399q = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.g9(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f145400r = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.h9(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f145401s = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.f9(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f145402t = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.c9(this));

    public static final void T6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8, java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] roomName:%s size:%s", activityC10358xb91848f8.f145390e, java.lang.Integer.valueOf(linkedList.size()));
        java.util.ArrayList arrayList = activityC10358xb91848f8.f145394i;
        arrayList.clear();
        java.util.LinkedList linkedList2 = activityC10358xb91848f8.f145395m;
        linkedList2.clear();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = activityC10358xb91848f8.U6().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            linkedList2.add(str);
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            r45.az azVar = new r45.az();
            azVar.f451905d = str2;
            linkedList3.add(azVar);
        }
        r45.ya4 ya4Var = new r45.ya4();
        ya4Var.f472459d = linkedList3.size();
        ya4Var.f472460e = linkedList3;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10358xb91848f8.f145389d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a3Var);
        a3Var.f69097x5eaef643 = ya4Var;
        boolean mo11260x413cb2b4 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(activityC10358xb91848f8.f145389d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = activityC10358xb91848f8.U6().mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        activityC10358xb91848f8.V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] ret:%s", java.lang.Boolean.valueOf(mo11260x413cb2b4));
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.r8
    public void B3(java.lang.String userName, java.lang.String remarkName, java.lang.String nickName, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remarkName, "remarkName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(remarkName) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            remarkName = z07.f66692x4854b29d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(userName)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        intent.putExtra("Contact_RemarkName", remarkName);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145389d;
        if (a3Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a3Var);
            intent.putExtra("Contact_RoomNickname", a3Var.z0(userName));
        }
        intent.putExtra("Contact_Nick", nickName);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", this.f145390e);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = userName;
            c6005x8a110b2f.e();
        }
        if (n17 != null && n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", this.f145390e);
        j45.l.j(mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.r8
    public void M0(java.lang.String userName, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnu, nickName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, true);
        k0Var.q(string, 17);
        k0Var.f293405n = new com.p314xaae8f345.mm.p648x55baa833.ui.j9(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p648x55baa833.ui.k9(this, userName);
        k0Var.v();
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 U6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f145400r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public final void V6() {
        java.util.ArrayList arrayList;
        if (this.f145389d == null || (arrayList = this.f145394i) == null) {
            return;
        }
        int size = arrayList.size();
        int a17 = f145388u.a();
        jz5.g gVar = this.f145401s;
        jz5.g gVar2 = this.f145402t;
        if (size >= a17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.LinearLayout) mo141623x754a37bb).setVisibility(8);
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.widget.LinearLayout) mo141623x754a37bb3).setVisibility(0);
        if (arrayList.size() > 0) {
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        android.view.View view3 = (android.view.View) mo141623x754a37bb5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        r45.ya4 ya4Var;
        java.util.LinkedList linkedList;
        r45.ya4 ya4Var2;
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.d9(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145389d;
        java.util.LinkedList linkedList2 = null;
        r45.ya4 ya4Var3 = a3Var != null ? a3Var.f69097x5eaef643 : null;
        java.util.ArrayList arrayList = this.f145394i;
        if (ya4Var3 != null) {
            if (a3Var != null && (ya4Var2 = a3Var.f69097x5eaef643) != null) {
                linkedList2 = ya4Var2.f472460e;
            }
            if (linkedList2 != null && a3Var != null && (ya4Var = a3Var.f69097x5eaef643) != null && (linkedList = ya4Var.f472460e) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.az azVar = (r45.az) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(azVar.f451905d)) {
                        java.util.ArrayList arrayList2 = this.f145392g;
                        if (!kz5.n0.O(arrayList2, azVar.f451905d) && a3Var.A0().contains(azVar.f451905d)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[resetData] Room Manager:%s", azVar.f451905d);
                            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(azVar.f451905d, true));
                            java.util.LinkedList linkedList3 = this.f145395m;
                            java.lang.String str = azVar.f451905d;
                            if (str == null) {
                                str = "";
                            }
                            linkedList3.add(str);
                            java.lang.String str2 = azVar.f451905d;
                            if (str2 == null) {
                                str2 = "";
                            }
                            arrayList2.add(str2);
                        }
                    }
                }
            }
        }
        V6();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f145401s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.LinearLayout) mo141623x754a37bb).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.e9(this));
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f145399q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnw, java.lang.Integer.valueOf(f145388u.a())));
        this.f145398p = new com.p314xaae8f345.mm.p648x55baa833.ui.q8(arrayList, this.f145389d, this);
        U6().mo7960x6cab2c8d(this.f145398p);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo55332x76847179());
        c22847x422a813d.Q(1);
        U6().mo7967x900dcbe1(c22847x422a813d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 U6 = U6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        in5.t0 t0Var = new in5.t0(mo55332x76847179);
        t0Var.f374662c = in5.q.f374646d;
        t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        t0Var.f374664e = t0Var.f374661b.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        U6.N(t0Var.a());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f145390e, java.lang.Integer.valueOf(i17), stringExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : strArr) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                linkedList.add(str);
            }
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = this.f145395m.iterator();
        while (it.hasNext()) {
            linkedList2.add((java.lang.String) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            linkedList2.add((java.lang.String) it6.next());
        }
        this.f145397o = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, false, null);
        pq5.g l17 = new kn.c(this.f145390e, linkedList2).l();
        l17.f(this);
        l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.i9(this, linkedList2));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145391f = c01.id.a();
        getWindow().setSoftInputMode(32);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f145390e = stringExtra;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        objArr[0] = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "roomName:%s", objArr);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f145390e);
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145390e;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str != null ? str : "");
        this.f145389d = z07;
        if (z07 != null) {
            mo43517x10010bd5();
        } else {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoomSpecialFollowMemberManagerUI", "member is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ad  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.onDestroy():void");
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f398506a, java.lang.Integer.valueOf(w0Var.f398507b));
        }
    }
}
