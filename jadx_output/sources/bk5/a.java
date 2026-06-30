package bk5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, android.content.Context context) {
        super(0);
        this.f21648d = str;
        this.f21649e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "forward_succ_toast");
        lVarArr[1] = new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
        lVarArr[2] = new jz5.l("has_enter_chat", 0);
        java.lang.String str = this.f21648d;
        if (str == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("chat_username", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", this.f21649e, kz5.c1.l(lVarArr), 32337);
        return jz5.f0.f302826a;
    }
}
