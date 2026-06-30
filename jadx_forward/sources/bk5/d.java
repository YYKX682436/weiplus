package bk5;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, java.lang.String str) {
        super(0);
        this.f103189d = context;
        this.f103190e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "forward_succ_toast");
        java.lang.String str = this.f103190e;
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("chat_username", str);
        lVarArr[2] = new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
        lVarArr[3] = new jz5.l("forward_toast_clk_type", 1);
        ((cy1.a) rVar).Cj("view_clk", this.f103189d, kz5.c1.k(lVarArr), 32337);
        return jz5.f0.f384359a;
    }
}
