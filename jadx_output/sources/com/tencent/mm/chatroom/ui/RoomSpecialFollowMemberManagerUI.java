package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "Lcom/tencent/mm/chatroom/ui/r8;", "<init>", "()V", "com/tencent/mm/chatroom/ui/b9", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class RoomSpecialFollowMemberManagerUI extends com.tencent.mm.ui.MMActivity implements l75.q0, com.tencent.mm.chatroom.ui.r8 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.chatroom.ui.b9 f63855u = new com.tencent.mm.chatroom.ui.b9(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63857e;

    /* renamed from: f, reason: collision with root package name */
    public long f63858f;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63864o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.q8 f63865p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f63859g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f63860h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f63861i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f63862m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f63863n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f63866q = jz5.h.b(new com.tencent.mm.chatroom.ui.g9(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f63867r = jz5.h.b(new com.tencent.mm.chatroom.ui.h9(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f63868s = jz5.h.b(new com.tencent.mm.chatroom.ui.f9(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f63869t = jz5.h.b(new com.tencent.mm.chatroom.ui.c9(this));

    public static final void T6(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI, java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] roomName:%s size:%s", roomSpecialFollowMemberManagerUI.f63857e, java.lang.Integer.valueOf(linkedList.size()));
        java.util.ArrayList arrayList = roomSpecialFollowMemberManagerUI.f63861i;
        arrayList.clear();
        java.util.LinkedList linkedList2 = roomSpecialFollowMemberManagerUI.f63862m;
        linkedList2.clear();
        androidx.recyclerview.widget.f2 adapter = roomSpecialFollowMemberManagerUI.U6().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            arrayList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true));
            kotlin.jvm.internal.o.d(str);
            linkedList2.add(str);
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            r45.az azVar = new r45.az();
            azVar.f370372d = str2;
            linkedList3.add(azVar);
        }
        r45.ya4 ya4Var = new r45.ya4();
        ya4Var.f390926d = linkedList3.size();
        ya4Var.f390927e = linkedList3;
        com.tencent.mm.storage.a3 a3Var = roomSpecialFollowMemberManagerUI.f63856d;
        kotlin.jvm.internal.o.d(a3Var);
        a3Var.field_localChatRoomWatchMembers = ya4Var;
        boolean replace = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(roomSpecialFollowMemberManagerUI.f63856d);
        androidx.recyclerview.widget.f2 adapter2 = roomSpecialFollowMemberManagerUI.U6().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        roomSpecialFollowMemberManagerUI.V6();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[updateRoomFollowMember] ret:%s", java.lang.Boolean.valueOf(replace));
    }

    @Override // com.tencent.mm.chatroom.ui.r8
    public void B3(java.lang.String userName, java.lang.String remarkName, java.lang.String nickName, boolean z17) {
        com.tencent.mm.storage.ya z07;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(remarkName, "remarkName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(remarkName) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            remarkName = z07.field_conRemark;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(userName)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        intent.putExtra("Contact_RemarkName", remarkName);
        com.tencent.mm.storage.a3 a3Var = this.f63856d;
        if (a3Var != null) {
            kotlin.jvm.internal.o.d(a3Var);
            intent.putExtra("Contact_RoomNickname", a3Var.z0(userName));
        }
        intent.putExtra("Contact_Nick", nickName);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", this.f63857e);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = userName;
            setLocalQQMobileEvent.e();
        }
        if (n17 != null && n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", this.f63857e);
        j45.l.j(getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.mm.chatroom.ui.r8
    public void M0(java.lang.String userName, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.lnu, nickName);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, true);
        k0Var.q(string, 17);
        k0Var.f211872n = new com.tencent.mm.chatroom.ui.j9(this);
        k0Var.f211881s = new com.tencent.mm.chatroom.ui.k9(this, userName);
        k0Var.v();
    }

    public final androidx.recyclerview.widget.RecyclerView U6() {
        java.lang.Object value = ((jz5.n) this.f63867r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final void V6() {
        java.util.ArrayList arrayList;
        if (this.f63856d == null || (arrayList = this.f63861i) == null) {
            return;
        }
        int size = arrayList.size();
        int a17 = f63855u.a();
        jz5.g gVar = this.f63868s;
        jz5.g gVar2 = this.f63869t;
        if (size >= a17) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.LinearLayout) value).setVisibility(8);
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.View view = (android.view.View) value2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.LinearLayout) value3).setVisibility(0);
        if (arrayList.size() > 0) {
            java.lang.Object value4 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            android.view.View view2 = (android.view.View) value4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value5 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        android.view.View view3 = (android.view.View) value5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        r45.ya4 ya4Var;
        java.util.LinkedList linkedList;
        r45.ya4 ya4Var2;
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        setBackBtn(new com.tencent.mm.chatroom.ui.d9(this));
        com.tencent.mm.storage.a3 a3Var = this.f63856d;
        java.util.LinkedList linkedList2 = null;
        r45.ya4 ya4Var3 = a3Var != null ? a3Var.field_localChatRoomWatchMembers : null;
        java.util.ArrayList arrayList = this.f63861i;
        if (ya4Var3 != null) {
            if (a3Var != null && (ya4Var2 = a3Var.field_localChatRoomWatchMembers) != null) {
                linkedList2 = ya4Var2.f390927e;
            }
            if (linkedList2 != null && a3Var != null && (ya4Var = a3Var.field_localChatRoomWatchMembers) != null && (linkedList = ya4Var.f390927e) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.az azVar = (r45.az) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(azVar.f370372d)) {
                        java.util.ArrayList arrayList2 = this.f63859g;
                        if (!kz5.n0.O(arrayList2, azVar.f370372d) && a3Var.A0().contains(azVar.f370372d)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[resetData] Room Manager:%s", azVar.f370372d);
                            arrayList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(azVar.f370372d, true));
                            java.util.LinkedList linkedList3 = this.f63862m;
                            java.lang.String str = azVar.f370372d;
                            if (str == null) {
                                str = "";
                            }
                            linkedList3.add(str);
                            java.lang.String str2 = azVar.f370372d;
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
        java.lang.Object value = ((jz5.n) this.f63868s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.LinearLayout) value).setOnClickListener(new com.tencent.mm.chatroom.ui.e9(this));
        java.lang.Object value2 = ((jz5.n) this.f63866q).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setText(getString(com.tencent.mm.R.string.lnw, java.lang.Integer.valueOf(f63855u.a())));
        this.f63865p = new com.tencent.mm.chatroom.ui.q8(arrayList, this.f63856d, this);
        U6().setAdapter(this.f63865p);
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        U6().setLayoutManager(wxLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView U6 = U6();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        in5.t0 t0Var = new in5.t0(context);
        t0Var.f293129c = in5.q.f293113d;
        t0Var.c(com.tencent.mm.R.color.FG_3);
        t0Var.b(com.tencent.mm.R.color.a9e);
        t0Var.d(com.tencent.mm.R.dimen.f480137pc);
        t0Var.f293131e = t0Var.f293128b.getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo);
        U6.N(t0Var.a());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.tencent.mars.xlog.Log.w("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f63857e, java.lang.Integer.valueOf(i17), stringExtra);
        kotlin.jvm.internal.o.d(stringExtra);
        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                linkedList.add(str);
            }
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = this.f63862m.iterator();
        while (it.hasNext()) {
            linkedList2.add((java.lang.String) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            linkedList2.add((java.lang.String) it6.next());
        }
        this.f63864o = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gga), true, false, null);
        pq5.g l17 = new kn.c(this.f63857e, linkedList2).l();
        l17.f(this);
        l17.h(new com.tencent.mm.chatroom.ui.i9(this, linkedList2));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f63858f = c01.id.a();
        getWindow().setSoftInputMode(32);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f63857e = stringExtra;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        objArr[0] = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "roomName:%s", objArr);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f63857e);
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63857e;
        com.tencent.mm.storage.a3 z07 = a17.z0(str != null ? str : "");
        this.f63856d = z07;
        if (z07 != null) {
            initView();
        } else {
            finish();
            com.tencent.mars.xlog.Log.e("MicroMsg.RoomSpecialFollowMemberManagerUI", "member is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ad  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.onDestroy():void");
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f316973a, java.lang.Integer.valueOf(w0Var.f316974b));
        }
    }
}
