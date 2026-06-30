package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102100i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f102102n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, boolean z17) {
        super(0);
        this.f102095d = i0Var;
        this.f102096e = context;
        this.f102097f = i17;
        this.f102098g = i18;
        this.f102099h = str;
        this.f102100i = str2;
        this.f102101m = qt2Var;
        this.f102102n = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f102097f;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = this.f102095d;
        android.content.Context context = this.f102096e;
        if (!com.tencent.mm.plugin.finder.assist.i0.wi(i0Var, context, i17, this.f102098g, this.f102099h)) {
            java.lang.String str = this.f102100i;
            if (str.length() > 0) {
                com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, this.f102101m, 1L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", xy2.c.e(context));
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f102102n);
                com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
