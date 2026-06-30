package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI */
/* loaded from: classes12.dex */
public class ActivityC10370x551acb57 extends com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f145501x = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f145502v = false;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f145503w = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public android.widget.BaseAdapter T6() {
        return this.f145510m;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void W6() {
        super.W6();
        java.lang.String stringExtra = getIntent().getStringExtra("RoomManagers");
        if (stringExtra != null) {
            for (java.lang.String str : stringExtra.split(",")) {
                ((java.util.ArrayList) this.f145503w).add(str);
            }
        }
        this.f145502v = true;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean Y6() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public java.util.List Z6() {
        return this.f145503w;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void a7(android.view.View view, int i17, long j17) {
        ((com.p314xaae8f345.mm.p648x55baa833.ui.ld) view.getTag()).f145851f.performClick();
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public void b7(android.view.View view, android.widget.LinearLayout linearLayout, android.widget.ImageButton imageButton, int i17, java.lang.String str) {
        super.b7(view, linearLayout, imageButton, i17, str);
        if (this.f145514q.size() > 0) {
            m78500x43e00957(1, true);
        } else {
            m78500x43e00957(1, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea
    public boolean c7() {
        return false;
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
        mo54450xbf7c1df6(getString(this.f145502v ? com.p314xaae8f345.mm.R.C30867xcad56011.i6b : com.p314xaae8f345.mm.R.C30867xcad56011.i6a));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p648x55baa833.ui.uc(this), null, this.f145502v ? com.p314xaae8f345.mm.ui.fb.RED : com.p314xaae8f345.mm.ui.fb.GREEN);
        if (this.f145514q.size() > 0) {
            m78500x43e00957(1, true);
        } else {
            m78500x43e00957(1, false);
        }
    }
}
