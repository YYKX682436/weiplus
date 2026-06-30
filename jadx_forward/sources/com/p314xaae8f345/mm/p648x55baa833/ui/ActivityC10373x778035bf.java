package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectRoomFollowMemberManagerUI */
/* loaded from: classes12.dex */
public class ActivityC10373x778035bf extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f145519w = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f145520v = new java.util.HashSet();

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void W6() {
        java.util.LinkedList linkedList;
        super.W6();
        r45.ya4 ya4Var = this.f145511n.f69097x5eaef643;
        if (ya4Var == null || (linkedList = ya4Var.f472460e) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.HashSet hashSet = this.f145520v;
            if (!hasNext) {
                this.f145514q.addAll(hashSet);
                return;
            }
            r45.az azVar = (r45.az) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(azVar.f451905d) && !hashSet.contains(azVar.f451905d) && this.f145511n.A0().contains(azVar.f451905d)) {
                hashSet.add(azVar.f451905d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public java.util.List Z6() {
        return this.f145511n.A0();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        java.lang.String str;
        if (this.f145504d.getAdapter() == this.f145509i) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i iVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) view.getTag();
            android.widget.ImageView imageView = iVar.f288411b;
            str = (imageView == null || !(imageView.getTag() instanceof java.lang.String)) ? "" : (java.lang.String) iVar.f288411b.getTag();
        } else {
            com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag();
            java.lang.String d17 = ldVar.f145846a.f145592a.d1();
            ldVar.f145846a.f145592a.g2();
            ldVar.f145846a.f145592a.f2();
            str = d17;
        }
        if (!this.f145514q.contains(str) && this.f145514q.size() >= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4)) {
            db5.e1.E(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6k, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("RoomLimitWatchMemberMax"), 4) + ""), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, null);
            return;
        }
        if (this.f145504d.getAdapter() == this.f145509i) {
            android.widget.ImageView imageView2 = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i) view.getTag()).f288411b;
            if (imageView2 != null && (imageView2.getTag() instanceof java.lang.String)) {
                if (this.f145514q.contains(str)) {
                    this.f145514q.remove(str);
                } else {
                    this.f145514q.add(str);
                }
                this.f145509i.notifyDataSetChanged();
            }
        } else {
            com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar2 = (com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag();
            if (this.f145514q.contains(str)) {
                this.f145514q.remove(str);
                ldVar2.f145850e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
            } else {
                this.f145514q.add(str);
                ldVar2.f145850e.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
            }
        }
        d7(true);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        a7(view, i17, 0L);
    }

    public final void d7(boolean z17) {
        boolean z18;
        if (this.f145514q.size() > 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + "(" + this.f145514q.size() + ")");
        } else {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        }
        int size = this.f145514q.size();
        java.util.HashSet hashSet = this.f145520v;
        if (size == hashSet.size()) {
            java.util.Iterator it = this.f145514q.iterator();
            z18 = true;
            while (it.hasNext()) {
                if (!hashSet.contains((java.lang.String) it.next())) {
                    z18 = false;
                }
            }
            if (!z18) {
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    if (!this.f145514q.contains((java.lang.String) it6.next())) {
                        z18 = false;
                    }
                }
            }
        } else {
            z18 = false;
        }
        if (z18) {
            m78500x43e00957(1, false);
        } else {
            m78500x43e00957(1, z17);
        }
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
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6i));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p648x55baa833.ui.md(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        d7(false);
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
