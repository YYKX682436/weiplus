package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/chatroom/ui/m7", "com/tencent/mm/chatroom/ui/z7", "com/tencent/mm/chatroom/ui/a8", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoomAccessVerifyApplicationUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.chatroom.ui.a8 f63834h = new com.tencent.mm.chatroom.ui.a8(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63835d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f63836e = jz5.h.b(new com.tencent.mm.chatroom.ui.b8(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f63837f = jz5.h.b(new com.tencent.mm.chatroom.ui.d8(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f63838g = jz5.h.b(new com.tencent.mm.chatroom.ui.c8(this));

    public final void T6() {
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.cge);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        java.lang.String stringExtra = getIntent().getStringExtra("intent_chatroom_username");
        com.tencent.mm.chatroom.ui.m7 m7Var = null;
        if (stringExtra != null) {
            this.f63835d = stringExtra;
            p75.n0 n0Var = dm.w9.f240866o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.m0 j17 = dm.w9.f240868q.j(stringExtra);
            linkedList2.add(dm.w9.f240872u.u());
            p75.i0 g17 = dm.w9.f240866o.g(linkedList);
            g17.f352657d = j17;
            g17.d(linkedList2);
            g17.b(linkedList3);
            java.util.List k17 = g17.a().k(gm0.j1.u().f273153f, dm.w9.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("application count:");
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            sb6.append(arrayList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomAccessVerifyApplicationUI", sb6.toString());
            if (arrayList.size() > 0) {
                m7Var = new com.tencent.mm.chatroom.ui.m7(recyclerView, k17);
            }
        }
        recyclerView.setAdapter(m7Var);
        if (recyclerView.getAdapter() == null) {
            recyclerView.setVisibility(8);
            ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dez)).setVisibility(0);
            return;
        }
        recyclerView.setVisibility(0);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dez)).setVisibility(8);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488397s7;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.i3l);
        setBackBtn(new com.tencent.mm.chatroom.ui.e8(this));
        dm.w9.G.observe(this, new com.tencent.mm.chatroom.ui.g8(this));
        T6();
        gm0.j1.n().f273288b.q(453, this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SeeAccessVerifyInfoUI);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("base_chatroom_invite_manage_source", java.lang.Integer.valueOf(getIntent().getBooleanExtra("intent_from_chattingui", false) ? 2 : 1));
        lVarArr[1] = new jz5.l("base_chatroom_user_role", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f63837f).getValue()).booleanValue() ? 1 : ((java.lang.Boolean) ((jz5.n) this.f63838g).getValue()).booleanValue() ? 2 : 3));
        lVarArr[2] = new jz5.l("room_username", this.f63835d);
        lVarArr[3] = new jz5.l("room_unread_count", java.lang.Integer.valueOf(((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(this.f63835d, 0L)));
        ((cy1.a) rVar).gk(this, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25772);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        f63834h.a(this.f63835d);
        gm0.j1.n().f273288b.q(453, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            pm0.v.X(new com.tencent.mm.chatroom.ui.h8(this));
        }
    }
}
