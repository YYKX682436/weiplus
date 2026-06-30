package sj4;

/* loaded from: classes10.dex */
public final class w0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj4.x0 f490434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, sj4.x0 x0Var) {
        super(str);
        this.f490434c = x0Var;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f102607b;
        boolean z17 = false;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "11")) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0("WeRun-WeChat");
        if (g07 != null && g07.r2()) {
            z17 = true;
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(dm.i4.f66875xa013b0d5, c01.z1.r());
            intent.putExtra("key_is_latest", true);
            intent.putExtra("rank_id", "#");
            intent.putExtra("key_only_show_latest_rank", true);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            intent.putExtra("app_username", c01.a2.e("gh_43f2581f6fd6"));
            intent.putExtra("device_type", 1);
            j45.l.j(context, "exdevice", ".ui.ExdeviceRankInfoUI", intent, null);
        } else if (context != null) {
            this.f490434c.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", "gh_43f2581f6fd6");
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
        }
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
