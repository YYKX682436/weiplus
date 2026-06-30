package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI */
/* loaded from: classes12.dex */
public class ActivityC10367x479b7a81 extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f145489w = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f145490v = new java.util.HashSet();

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public java.util.HashSet V6() {
        return this.f145490v;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void W6() {
        super.W6();
        for (java.lang.String str : this.f145511n.A0()) {
            if (this.f145511n.G0(str)) {
                this.f145490v.add(str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ld ldVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag();
        ldVar.f145846a.f145592a.g2();
        java.lang.String d17 = ldVar.f145846a.f145592a.d1();
        ldVar.f145846a.f145592a.f2();
        this.f145514q.size();
        java.util.HashSet hashSet = this.f145490v;
        hashSet.size();
        if (this.f145514q.contains(d17) || this.f145514q.size() + hashSet.size() < 3) {
            ldVar.f145851f.performClick();
            d7();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        u1Var.u(getString(com.p314xaae8f345.mm.R.C30867xcad56011.lno));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        u1Var.l(new com.p314xaae8f345.mm.p648x55baa833.ui.ic(this));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        d7();
    }

    public final void d7() {
        if (this.f145514q.size() <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + "(" + this.f145514q.size() + ")");
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
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6i));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p648x55baa833.ui.hc(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        d7();
    }
}
