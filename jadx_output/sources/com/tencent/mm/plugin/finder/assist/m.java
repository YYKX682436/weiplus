package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102371i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f102373n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f102374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, int i19, boolean z17) {
        super(0);
        this.f102366d = i0Var;
        this.f102367e = context;
        this.f102368f = i17;
        this.f102369g = i18;
        this.f102370h = str;
        this.f102371i = str2;
        this.f102372m = qt2Var;
        this.f102373n = i19;
        this.f102374o = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f102368f;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = this.f102366d;
        android.content.Context context = this.f102367e;
        if (!com.tencent.mm.plugin.finder.assist.i0.wi(i0Var, context, i17, this.f102369g, this.f102370h)) {
            java.lang.String str = this.f102371i;
            if (str.length() > 0) {
                com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, this.f102372m, 4L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                int i18 = this.f102373n;
                intent.putExtra("Chat_Self", i18 == 2 ? c01.z1.r() : i18 == 1 ? xy2.c.e(context) : c01.z1.k());
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f102374o);
                com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, this.f102372m, 4L, 2L, null, 8, null);
        return jz5.f0.f302826a;
    }
}
