package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/chatroom/ui/GroupAdminManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "Lcom/tencent/mm/chatroom/ui/j3;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class GroupAdminManagerUI extends com.tencent.mm.ui.MMActivity implements l75.q0, com.tencent.mm.chatroom.ui.j3 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f63759q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63761e;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63765i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.i3 f63766m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f63762f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f63763g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f63764h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f63767n = jz5.h.b(new com.tencent.mm.chatroom.ui.b3(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f63768o = jz5.h.b(new com.tencent.mm.chatroom.ui.a3(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f63769p = jz5.h.b(new com.tencent.mm.chatroom.ui.x2(this));

    public static final void T6(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI, java.util.List list) {
        java.util.ArrayList arrayList;
        mo.b v07;
        com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "[updateManagerMember] roomName:%s size:%s", groupAdminManagerUI.f63761e, java.lang.Integer.valueOf(list.size()));
        com.tencent.mm.chatroom.ui.i3 i3Var = groupAdminManagerUI.f63766m;
        if (i3Var != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = i3Var.f64219d;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (arrayList != null) {
                    arrayList.add(n17);
                }
                java.util.LinkedList linkedList = groupAdminManagerUI.f63763g;
                kotlin.jvm.internal.o.d(str);
                linkedList.add(str);
                com.tencent.mm.storage.a3 a3Var = groupAdminManagerUI.f63760d;
                if (a3Var != null && (v07 = a3Var.v0(n17.d1())) != null) {
                    v07.f330249f |= 2048;
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "memberList size:%s", objArr);
            i3Var.notifyDataSetChanged();
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "[addRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(groupAdminManagerUI.f63760d)));
            groupAdminManagerUI.W6();
        }
    }

    public static final void U6(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI, java.lang.String str) {
        mo.b v07;
        com.tencent.mm.chatroom.ui.i3 i3Var = groupAdminManagerUI.f63766m;
        if (i3Var != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.util.ArrayList arrayList = i3Var.f64219d;
            if (arrayList != null) {
                arrayList.remove(n17);
            }
            java.util.LinkedList linkedList = groupAdminManagerUI.f63763g;
            linkedList.remove(str);
            if (!(arrayList != null && arrayList.size() == linkedList.size())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "removeRoomManager update list");
                if (arrayList != null) {
                    arrayList.clear();
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (arrayList != null) {
                        arrayList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true));
                    }
                }
            }
            com.tencent.mm.storage.a3 a3Var = groupAdminManagerUI.f63760d;
            if (a3Var != null && (v07 = a3Var.v0(str)) != null) {
                v07.f330249f &= -2049;
            }
            i3Var.notifyDataSetChanged();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(groupAdminManagerUI.f63760d));
            objArr[1] = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            objArr[2] = java.lang.Integer.valueOf(linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "[removeRoomManagerSuccessful] ret:%s,adaptersize:%s, managerUserList:%s", objArr);
            groupAdminManagerUI.W6();
        }
    }

    public final java.util.LinkedList V6(java.lang.String str, java.lang.String str2) {
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{str2}, false, 0, 6, null);
        java.lang.String[] strArr = (java.lang.String[]) f07.toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str3 : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                linkedList.add(str3);
            }
        }
        return linkedList;
    }

    public final void W6() {
        java.util.ArrayList arrayList;
        com.tencent.mm.storage.a3 a3Var = this.f63760d;
        if (a3Var == null || !c01.z1.r().equals(a3Var.field_roomowner) || (arrayList = this.f63762f) == null) {
            return;
        }
        int size = arrayList.size();
        jz5.g gVar = this.f63768o;
        jz5.g gVar2 = this.f63769p;
        if (size >= 3) {
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
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.Object value5 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        android.view.View view3 = (android.view.View) value5;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI", "updateAddView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dfe;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.List<java.lang.String> A0;
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        setBackBtn(new com.tencent.mm.chatroom.ui.y2(this));
        com.tencent.mm.storage.a3 a3Var = this.f63760d;
        java.util.ArrayList arrayList = this.f63762f;
        if (a3Var != null && (A0 = a3Var.A0()) != null) {
            for (java.lang.String str : A0) {
                if (a3Var.G0(str)) {
                    arrayList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true));
                    this.f63763g.add(str);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "memberList size:%s", java.lang.Integer.valueOf(arrayList.size()));
        }
        W6();
        java.lang.Object value = ((jz5.n) this.f63768o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.LinearLayout) value).setOnClickListener(new com.tencent.mm.chatroom.ui.z2(this));
        this.f63766m = new com.tencent.mm.chatroom.ui.i3(arrayList, this.f63760d, this);
        jz5.g gVar = this.f63767n;
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(this.f63766m);
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value3).setLayoutManager(wxLinearLayoutManager);
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        in5.t0 t0Var = new in5.t0(context);
        t0Var.f293129c = in5.q.f293113d;
        t0Var.c(com.tencent.mm.R.color.FG_3);
        t0Var.b(com.tencent.mm.R.color.a9e);
        t0Var.d(com.tencent.mm.R.dimen.f480137pc);
        t0Var.f293131e = t0Var.f293128b.getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo);
        ((androidx.recyclerview.widget.RecyclerView) value4).N(t0Var.a());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.tencent.mars.xlog.Log.w("MicroMsg.GroupAdminManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f63761e, java.lang.Integer.valueOf(i17), stringExtra);
        kotlin.jvm.internal.o.d(stringExtra);
        java.util.LinkedList V6 = V6(stringExtra, ",");
        this.f63765i = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i3n), true, false, null);
        if (com.tencent.mm.storage.z3.N4(this.f63761e)) {
            pq5.g l17 = new kn.b(this.f63761e, V6).l();
            l17.f(this);
            l17.h(new com.tencent.mm.chatroom.ui.c3(this, V6));
        } else {
            pq5.g l18 = new kn.f(this.f63761e, V6).l();
            l18.f(this);
            l18.h(new com.tencent.mm.chatroom.ui.d3(this, V6));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        this.f63761e = getIntent().getStringExtra("RoomInfo_Id");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(this.f63761e);
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f63761e;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.storage.a3 z07 = a17.z0(str);
        this.f63760d = z07;
        if (z07 != null) {
            initView();
        } else {
            finish();
            com.tencent.mars.xlog.Log.e("MicroMsg.RoomSpecialFollowMemberManagerUI", "member is null");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f63762f.clear();
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GroupAdminManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f316973a, java.lang.Integer.valueOf(w0Var.f316974b));
        }
    }
}
