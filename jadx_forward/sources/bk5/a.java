package bk5;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, android.content.Context context) {
        super(0);
        this.f103181d = str;
        this.f103182e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "forward_succ_toast");
        lVarArr[1] = new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
        lVarArr[2] = new jz5.l("has_enter_chat", 0);
        java.lang.String str = this.f103181d;
        if (str == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("chat_username", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", this.f103182e, kz5.c1.l(lVarArr), 32337);
        return jz5.f0.f384359a;
    }
}
