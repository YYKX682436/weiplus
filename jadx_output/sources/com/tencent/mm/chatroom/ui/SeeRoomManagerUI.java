package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class SeeRoomManagerUI extends com.tencent.mm.ui.MMActivity implements l75.q0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f63928i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f63929d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f63930e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63931f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.lb f63932g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f63933h;

    public static void T6(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI, java.util.List list) {
        mo.b v07;
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s", seeRoomManagerUI.f63931f, java.lang.Integer.valueOf(list.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList(seeRoomManagerUI.f63932g.f64309d);
        ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.chatroom.ui.ib ibVar = (com.tencent.mm.chatroom.ui.ib) it.next();
            int i17 = ibVar.f64234a;
            com.tencent.mm.storage.z3 z3Var = ibVar.f64235b;
            if (i17 == 1 && !list.contains(z3Var.d1())) {
                ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(ibVar);
            } else if (ibVar.f64234a == 1 && list.contains(z3Var.d1()) && (v07 = seeRoomManagerUI.f63930e.v0(z3Var.d1())) != null) {
                v07.f330249f &= -2049;
            }
        }
        ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 2, null));
        if (((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).size() > 1) {
            ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 3, null));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", seeRoomManagerUI.f63931f, java.lang.Integer.valueOf(list.size()), seeRoomManagerUI.f63932g.f64309d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(seeRoomManagerUI.f63930e)));
    }

    public static void U6(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s", seeRoomManagerUI.f63931f, java.lang.Integer.valueOf(list.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList(seeRoomManagerUI.f63932g.f64309d);
        ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.chatroom.ui.ib ibVar = (com.tencent.mm.chatroom.ui.ib) it.next();
            if (ibVar.f64234a == 1) {
                ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(ibVar);
            }
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it6.next(), true);
            ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 1, n17));
            mo.b v07 = seeRoomManagerUI.f63930e.v0(n17.d1());
            if (v07 != null) {
                v07.f330249f |= 2048;
            }
        }
        ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 2, null));
        if (((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).size() > 1) {
            ((java.util.ArrayList) seeRoomManagerUI.f63932g.f64309d).add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 3, null));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", seeRoomManagerUI.f63931f, java.lang.Integer.valueOf(list.size()), seeRoomManagerUI.f63932g.f64309d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(seeRoomManagerUI.f63930e)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cj_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(com.tencent.mm.R.string.i58);
        this.f63929d = (android.widget.GridView) findViewById(com.tencent.mm.R.id.jbi);
        com.tencent.mm.chatroom.ui.lb lbVar = new com.tencent.mm.chatroom.ui.lb(this, this);
        this.f63932g = lbVar;
        this.f63929d.setAdapter((android.widget.ListAdapter) lbVar);
        this.f63929d.setOnTouchListener(new com.tencent.mm.chatroom.ui.bb(this));
        this.f63929d.post(new com.tencent.mm.chatroom.ui.cb(this));
        setBackBtn(new com.tencent.mm.chatroom.ui.db(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.tencent.mars.xlog.Log.w("MicroMsg.SeeRoomManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f63931f, java.lang.Integer.valueOf(i17), stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SeeRoomManagerUI", "[onActivityResult] userListString is null!");
            return;
        }
        java.lang.String[] split = stringExtra.split(",");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : split) {
            linkedList.add(str);
        }
        if (i17 == 0) {
            this.f63933h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i3n), true, false, null);
            if (com.tencent.mm.storage.z3.N4(this.f63931f)) {
                pq5.g l17 = new kn.b(this.f63931f, linkedList).l();
                l17.f(this);
                l17.h(new com.tencent.mm.chatroom.ui.eb(this, linkedList));
                return;
            } else {
                pq5.g l18 = new kn.f(this.f63931f, linkedList).l();
                l18.f(this);
                l18.h(new com.tencent.mm.chatroom.ui.fb(this, linkedList));
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        this.f63933h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i49), true, false, null);
        if (com.tencent.mm.storage.z3.N4(this.f63931f)) {
            pq5.g l19 = new kn.e(this.f63931f, linkedList).l();
            l19.f(this);
            l19.h(new com.tencent.mm.chatroom.ui.gb(this, linkedList));
        } else {
            pq5.g l27 = new kn.g(this.f63931f, linkedList).l();
            l27.f(this);
            l27.h(new com.tencent.mm.chatroom.ui.hb(this, linkedList));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        this.f63931f = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f316973a, java.lang.Integer.valueOf(w0Var.f316974b));
        }
    }
}
