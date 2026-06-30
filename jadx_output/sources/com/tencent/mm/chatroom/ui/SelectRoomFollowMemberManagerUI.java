package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectRoomFollowMemberManagerUI extends com.tencent.mm.chatroom.ui.SelectMemberUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f63986w = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f63987v = new java.util.HashSet();

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void W6() {
        java.util.LinkedList linkedList;
        super.W6();
        r45.ya4 ya4Var = this.f63978n.field_localChatRoomWatchMembers;
        if (ya4Var == null || (linkedList = ya4Var.f390927e) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.HashSet hashSet = this.f63987v;
            if (!hasNext) {
                this.f63981q.addAll(hashSet);
                return;
            }
            r45.az azVar = (r45.az) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(azVar.f370372d) && !hashSet.contains(azVar.f370372d) && this.f63978n.A0().contains(azVar.f370372d)) {
                hashSet.add(azVar.f370372d);
            }
        }
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public java.util.List Z6() {
        return this.f63978n.A0();
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void a7(android.view.View view, int i17, long j17) {
        java.lang.String str;
        if (this.f63971d.getAdapter() == this.f63976i) {
            com.tencent.mm.ui.contact.item.i iVar = (com.tencent.mm.ui.contact.item.i) view.getTag();
            android.widget.ImageView imageView = iVar.f206878b;
            str = (imageView == null || !(imageView.getTag() instanceof java.lang.String)) ? "" : (java.lang.String) iVar.f206878b.getTag();
        } else {
            com.tencent.mm.chatroom.ui.ld ldVar = (com.tencent.mm.chatroom.ui.ld) view.getTag();
            java.lang.String d17 = ldVar.f64313a.f64059a.d1();
            ldVar.f64313a.f64059a.g2();
            ldVar.f64313a.f64059a.f2();
            str = d17;
        }
        if (!this.f63981q.contains(str) && this.f63981q.size() >= com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4)) {
            db5.e1.E(getContext(), getString(com.tencent.mm.R.string.i6k, com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4) + ""), "", getString(com.tencent.mm.R.string.f490454vi), false, null);
            return;
        }
        if (this.f63971d.getAdapter() == this.f63976i) {
            android.widget.ImageView imageView2 = ((com.tencent.mm.ui.contact.item.i) view.getTag()).f206878b;
            if (imageView2 != null && (imageView2.getTag() instanceof java.lang.String)) {
                if (this.f63981q.contains(str)) {
                    this.f63981q.remove(str);
                } else {
                    this.f63981q.add(str);
                }
                this.f63976i.notifyDataSetChanged();
            }
        } else {
            com.tencent.mm.chatroom.ui.ld ldVar2 = (com.tencent.mm.chatroom.ui.ld) view.getTag();
            if (this.f63981q.contains(str)) {
                this.f63981q.remove(str);
                ldVar2.f64317e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
            } else {
                this.f63981q.add(str);
                ldVar2.f64317e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
            }
        }
        d7(true);
    }

    @Override // com.tencent.mm.chatroom.ui.SelectMemberUI
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        a7(view, i17, 0L);
    }

    public final void d7(boolean z17) {
        boolean z18;
        if (this.f63981q.size() > 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + "(" + this.f63981q.size() + ")");
        } else {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
        }
        int size = this.f63981q.size();
        java.util.HashSet hashSet = this.f63987v;
        if (size == hashSet.size()) {
            java.util.Iterator it = this.f63981q.iterator();
            z18 = true;
            while (it.hasNext()) {
                if (!hashSet.contains((java.lang.String) it.next())) {
                    z18 = false;
                }
            }
            if (!z18) {
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    if (!this.f63981q.contains((java.lang.String) it6.next())) {
                        z18 = false;
                    }
                }
            }
        } else {
            z18 = false;
        }
        if (z18) {
            enableOptionMenu(1, false);
        } else {
            enableOptionMenu(1, z17);
        }
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
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.chatroom.ui.md(this), null, com.tencent.mm.ui.fb.GREEN);
        d7(false);
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
