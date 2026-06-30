package jq4;

@yn.c(m177365x976763e5 = zn.a.class)
/* loaded from: classes3.dex */
public final class a0 extends yn.n implements zn.a {

    /* renamed from: e, reason: collision with root package name */
    public final xg3.h0 f382653e = new jq4.z(this);

    @Override // yn.l
    public void K() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f382653e);
    }

    @Override // yn.d
    public void O() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "msg_push_close");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.d
    public void P() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "set_msg_push_unread");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.d
    public void Q() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "msg_blank_half_screen");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.n, yn.l
    public void z() {
        android.content.Intent n17 = ((yb5.d) this.f545128d).n();
        n17.getLongExtra("roomKey", 0L);
        n17.getIntExtra("roomId", 0);
        if (((yb5.d) this.f545128d).k() == 9) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f382653e, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_id", 30063);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        }
    }
}
