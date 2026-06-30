package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/chatroom/ui/GroupAdminManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "Lcom/tencent/mm/chatroom/ui/j3;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.GroupAdminManagerUI */
/* loaded from: classes11.dex */
public class ActivityC10343x243c08b1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.q0, com.p314xaae8f345.mm.p648x55baa833.ui.j3 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f145292q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145293d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145294e;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145298i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.i3 f145299m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f145295f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f145296g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f145297h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f145300n = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.b3(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f145301o = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.a3(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f145302p = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.x2(this));

    public static final void T6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1, java.util.List list) {
        java.util.ArrayList arrayList;
        mo.b v07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "[updateManagerMember] roomName:%s size:%s", activityC10343x243c08b1.f145294e, java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.mm.p648x55baa833.ui.i3 i3Var = activityC10343x243c08b1.f145299m;
        if (i3Var != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = i3Var.f145752d;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (arrayList != null) {
                    arrayList.add(n17);
                }
                java.util.LinkedList linkedList = activityC10343x243c08b1.f145296g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                linkedList.add(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10343x243c08b1.f145293d;
                if (a3Var != null && (v07 = a3Var.v0(n17.d1())) != null) {
                    v07.f411782f |= 2048;
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "memberList size:%s", objArr);
            i3Var.m8146xced61ae5();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "[addRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(activityC10343x243c08b1.f145293d)));
            activityC10343x243c08b1.W6();
        }
    }

    public static final void U6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1, java.lang.String str) {
        mo.b v07;
        com.p314xaae8f345.mm.p648x55baa833.ui.i3 i3Var = activityC10343x243c08b1.f145299m;
        if (i3Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.util.ArrayList arrayList = i3Var.f145752d;
            if (arrayList != null) {
                arrayList.remove(n17);
            }
            java.util.LinkedList linkedList = activityC10343x243c08b1.f145296g;
            linkedList.remove(str);
            if (!(arrayList != null && arrayList.size() == linkedList.size())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "removeRoomManager update list");
                if (arrayList != null) {
                    arrayList.clear();
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (arrayList != null) {
                        arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true));
                    }
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10343x243c08b1.f145293d;
            if (a3Var != null && (v07 = a3Var.v0(str)) != null) {
                v07.f411782f &= -2049;
            }
            i3Var.m8146xced61ae5();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(activityC10343x243c08b1.f145293d));
            objArr[1] = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            objArr[2] = java.lang.Integer.valueOf(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "[removeRoomManagerSuccessful] ret:%s,adaptersize:%s, managerUserList:%s", objArr);
            activityC10343x243c08b1.W6();
        }
    }

    public final java.util.LinkedList V6(java.lang.String str, java.lang.String str2) {
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{str2}, false, 0, 6, null);
        java.lang.String[] strArr = (java.lang.String[]) f07.toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str3 : strArr) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                linkedList.add(str3);
            }
        }
        return linkedList;
    }

    public final void W6() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145293d;
        if (a3Var == null || !c01.z1.r().equals(a3Var.f69107x5be1edb3) || (arrayList = this.f145295f) == null) {
            return;
        }
        int size = arrayList.size();
        jz5.g gVar = this.f145301o;
        jz5.g gVar2 = this.f145302p;
        if (size >= 3) {
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
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        android.view.View view3 = (android.view.View) mo141623x754a37bb5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dfe;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.List<java.lang.String> A0;
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.y2(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145293d;
        java.util.ArrayList arrayList = this.f145295f;
        if (a3Var != null && (A0 = a3Var.A0()) != null) {
            for (java.lang.String str : A0) {
                if (a3Var.G0(str)) {
                    arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true));
                    this.f145296g.add(str);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "memberList size:%s", java.lang.Integer.valueOf(arrayList.size()));
        }
        W6();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f145301o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.LinearLayout) mo141623x754a37bb).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.z2(this));
        this.f145299m = new com.p314xaae8f345.mm.p648x55baa833.ui.i3(arrayList, this.f145293d, this);
        jz5.g gVar = this.f145300n;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7960x6cab2c8d(this.f145299m);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo55332x76847179());
        c22847x422a813d.Q(1);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb3).mo7967x900dcbe1(c22847x422a813d);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        in5.t0 t0Var = new in5.t0(mo55332x76847179);
        t0Var.f374662c = in5.q.f374646d;
        t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        t0Var.f374664e = t0Var.f374661b.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb4).N(t0Var.a());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GroupAdminManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f145294e, java.lang.Integer.valueOf(i17), stringExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        java.util.LinkedList V6 = V6(stringExtra, ",");
        this.f145298i = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3n), true, false, null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f145294e)) {
            pq5.g l17 = new kn.b(this.f145294e, V6).l();
            l17.f(this);
            l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.c3(this, V6));
        } else {
            pq5.g l18 = new kn.f(this.f145294e, V6).l();
            l18.f(this);
            l18.h(new com.p314xaae8f345.mm.p648x55baa833.ui.d3(this, V6));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        this.f145294e = getIntent().getStringExtra("RoomInfo_Id");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f145294e);
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145294e;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        this.f145293d = z07;
        if (z07 != null) {
            mo43517x10010bd5();
        } else {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoomSpecialFollowMemberManagerUI", "member is null");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f145295f.clear();
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f398506a, java.lang.Integer.valueOf(w0Var.f398507b));
        }
    }
}
