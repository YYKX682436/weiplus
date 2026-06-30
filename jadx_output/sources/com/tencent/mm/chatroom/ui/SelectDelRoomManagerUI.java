package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectDelRoomManagerUI extends com.tencent.mm.chatroom.ui.SelectMemberUI {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f63968x = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f63969v = false;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f63970w = new java.util.ArrayList();

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public android.widget.BaseAdapter T6() {
        return this.f63977m;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void W6() {
        super.W6();
        java.lang.String stringExtra = getIntent().getStringExtra("RoomManagers");
        if (stringExtra != null) {
            for (java.lang.String str : stringExtra.split(",")) {
                ((java.util.ArrayList) this.f63970w).add(str);
            }
        }
        this.f63969v = true;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean Y6() {
        return false;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public java.util.List Z6() {
        return this.f63970w;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        ((com.tencent.mm.chatroom.ui.ld) view.getTag()).f64318f.performClick();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        if (this.f63981q.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean c7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        hideVKB();
        super.finish();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(getString(this.f63969v ? com.tencent.mm.R.string.i6b : com.tencent.mm.R.string.i6a));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.chatroom.ui.uc(this), null, this.f63969v ? com.tencent.mm.ui.fb.RED : com.tencent.mm.ui.fb.GREEN);
        if (this.f63981q.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }
}
