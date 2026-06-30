package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102180h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102181i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102182m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f102183n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, boolean z17) {
        super(0);
        this.f102176d = i0Var;
        this.f102177e = context;
        this.f102178f = i17;
        this.f102179g = i18;
        this.f102180h = str;
        this.f102181i = str2;
        this.f102182m = qt2Var;
        this.f102183n = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f102178f;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = this.f102176d;
        android.content.Context context = this.f102177e;
        if (!com.tencent.mm.plugin.finder.assist.i0.wi(i0Var, context, i17, this.f102179g, this.f102180h)) {
            java.lang.String str = this.f102181i;
            if (str.length() > 0) {
                com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, this.f102182m, 1L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", xy2.c.e(context));
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f102183n);
                com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
