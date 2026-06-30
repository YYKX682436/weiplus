package bk5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, java.lang.String str) {
        super(0);
        this.f21656d = context;
        this.f21657e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "forward_succ_toast");
        java.lang.String str = this.f21657e;
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("chat_username", str);
        lVarArr[2] = new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
        lVarArr[3] = new jz5.l("forward_toast_clk_type", 1);
        ((cy1.a) rVar).Cj("view_clk", this.f21656d, kz5.c1.k(lVarArr), 32337);
        return jz5.f0.f302826a;
    }
}
