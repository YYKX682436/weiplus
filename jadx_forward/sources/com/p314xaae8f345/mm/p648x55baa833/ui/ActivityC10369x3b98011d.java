package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDelMemberUI */
/* loaded from: classes12.dex */
public class ActivityC10369x3b98011d extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f145500v = 0;

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public java.util.HashSet U6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (this.f145511n.L0(c01.z1.r())) {
            return hashSet;
        }
        for (java.lang.String str : this.f145511n.A0()) {
            if (this.f145511n.G0(str) || this.f145511n.L0(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void W6() {
        super.W6();
        getIntent().getIntExtra("room_member_count", 0);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        if (this.f145504d.getAdapter() != this.f145509i) {
            ((com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag()).f145851f.performClick();
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i iVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) view.getTag();
        android.widget.ImageView imageView = iVar.f288411b;
        if (imageView == null || !(imageView.getTag() instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) iVar.f288411b.getTag();
        if (this.f145514q.contains(str)) {
            this.f145514q.remove(str);
        } else {
            this.f145514q.add(str);
        }
        e7();
        this.f145509i.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        e7();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean c7() {
        return false;
    }

    public final java.util.List d7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) ((java.util.HashMap) this.f145515r).get((java.lang.String) it.next()));
        }
        return linkedList;
    }

    public final void e7() {
        if (this.f145514q.size() <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.boq));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.boq) + "(" + this.f145514q.size() + ")");
        m78500x43e00957(1, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        mo48674x36654fab();
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4q));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.boq), new com.p314xaae8f345.mm.p648x55baa833.ui.rc(this), null, com.p314xaae8f345.mm.ui.fb.RED);
        e7();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.f145514q.contains(str);
    }
}
