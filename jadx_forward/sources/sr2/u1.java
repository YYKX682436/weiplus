package sr2;

/* loaded from: classes8.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f493264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sr2.y2 y2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f493263d = y2Var;
        this.f493264e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = false;
        if (((java.lang.Boolean) ((jz5.n) this.f493263d.f493339m).mo141623x754a37bb()).booleanValue()) {
            m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(this.f493264e), false, 2, null);
            if (((j37 != null ? j37.u0().m75939xb282bd08(41) : 0) & 1) != 0) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
