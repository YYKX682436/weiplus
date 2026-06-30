package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectAddRoomManagerUI extends com.tencent.mm.chatroom.ui.SelectMemberUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f63956w = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f63957v = new java.util.HashSet();

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public java.util.HashSet V6() {
        return this.f63957v;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void W6() {
        super.W6();
        for (java.lang.String str : this.f63978n.A0()) {
            if (this.f63978n.G0(str)) {
                this.f63957v.add(str);
            }
        }
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        com.tencent.mm.chatroom.ui.ld ldVar = (com.tencent.mm.chatroom.ui.ld) view.getTag();
        ldVar.f64313a.f64059a.g2();
        java.lang.String d17 = ldVar.f64313a.f64059a.d1();
        ldVar.f64313a.f64059a.f2();
        this.f63981q.size();
        java.util.HashSet hashSet = this.f63957v;
        hashSet.size();
        if (this.f63981q.contains(d17) || this.f63981q.size() + hashSet.size() < 3) {
            ldVar.f64318f.performClick();
            d7();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.u(getString(com.tencent.mm.R.string.lno));
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.l(new com.tencent.mm.chatroom.ui.ic(this));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        d7();
    }

    public final void d7() {
        if (this.f63981q.size() <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + "(" + this.f63981q.size() + ")");
        enableOptionMenu(1, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        hideVKB();
        super.finish();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(getString(com.tencent.mm.R.string.i6i));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.chatroom.ui.hc(this), null, com.tencent.mm.ui.fb.GREEN);
        d7();
    }
}
