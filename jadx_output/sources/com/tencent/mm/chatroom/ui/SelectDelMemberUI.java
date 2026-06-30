package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectDelMemberUI extends com.tencent.mm.chatroom.ui.SelectMemberUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f63967v = 0;

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public java.util.HashSet U6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (this.f63978n.L0(c01.z1.r())) {
            return hashSet;
        }
        for (java.lang.String str : this.f63978n.A0()) {
            if (this.f63978n.G0(str) || this.f63978n.L0(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void W6() {
        super.W6();
        getIntent().getIntExtra("room_member_count", 0);
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        if (this.f63971d.getAdapter() != this.f63976i) {
            ((com.tencent.mm.chatroom.ui.ld) view.getTag()).f64318f.performClick();
            return;
        }
        com.tencent.mm.ui.contact.item.i iVar = (com.tencent.mm.ui.contact.item.i) view.getTag();
        android.widget.ImageView imageView = iVar.f206878b;
        if (imageView == null || !(imageView.getTag() instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) iVar.f206878b.getTag();
        if (this.f63981q.contains(str)) {
            this.f63981q.remove(str);
        } else {
            this.f63981q.add(str);
        }
        e7();
        this.f63976i.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        e7();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean c7() {
        return false;
    }

    public final java.util.List d7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) ((java.util.HashMap) this.f63982r).get((java.lang.String) it.next()));
        }
        return linkedList;
    }

    public final void e7() {
        if (this.f63981q.size() <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.boq));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.boq) + "(" + this.f63981q.size() + ")");
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
        setMMTitle(getString(com.tencent.mm.R.string.i4q));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.boq), new com.tencent.mm.chatroom.ui.rc(this), null, com.tencent.mm.ui.fb.RED);
        e7();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.f63981q.contains(str);
    }
}
