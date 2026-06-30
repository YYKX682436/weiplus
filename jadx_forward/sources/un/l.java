package un;

/* loaded from: classes3.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f510837d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f510838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510837d = jz5.h.b(new un.j(this));
        this.f510838e = jz5.h.b(new un.k(this));
    }

    public final java.lang.String O6() {
        return (java.lang.String) ((jz5.n) this.f510837d).mo141623x754a37bb();
    }

    public final java.lang.String P6() {
        return (java.lang.String) ((jz5.n) this.f510838e).mo141623x754a37bb();
    }

    public final void Q6() {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", m158354x19263085(), kz5.c1.k(new jz5.l("view_id", "still_notify_setting_cell"), new jz5.l("chat_name", O6()), new jz5.l("chatroom_info_sid", P6())), 34574);
    }

    public final void R6(boolean z17, un.i type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("chat_name", O6());
        lVarArr[1] = new jz5.l("switch_status_after", z17 ? "1" : "0");
        lVarArr[2] = new jz5.l("group_setting_swtich_type", type.f510821d);
        lVarArr[3] = new jz5.l("chatroom_info_sid", P6());
        ((cy1.a) rVar).Ej("group_setting_switch_update", kz5.c1.k(lVarArr), 34574);
    }
}
