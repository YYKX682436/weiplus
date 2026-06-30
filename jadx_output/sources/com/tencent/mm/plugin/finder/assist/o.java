package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102415i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f102418o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f102419p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, com.tencent.mm.plugin.finder.assist.i0 i0Var, int i17, int i18, java.lang.String str, java.lang.String str2, android.content.Intent intent, java.lang.String str3, boolean z17, int i19) {
        super(0);
        this.f102410d = context;
        this.f102411e = i0Var;
        this.f102412f = i17;
        this.f102413g = i18;
        this.f102414h = str;
        this.f102415i = str2;
        this.f102416m = intent;
        this.f102417n = str3;
        this.f102418o = z17;
        this.f102419p = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String r17;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = this.f102410d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        boolean wi6 = com.tencent.mm.plugin.finder.assist.i0.wi(this.f102411e, context, this.f102412f, this.f102413g, this.f102414h);
        int i17 = this.f102419p;
        if (!wi6) {
            java.lang.String str = this.f102415i;
            if (str.length() > 0) {
                android.content.Intent intent = this.f102416m;
                if (intent == null) {
                    intent = new android.content.Intent();
                }
                int integer = g92.b.f269769e.k2().getInteger(4);
                if (integer == 1) {
                    r17 = c01.z1.r();
                    kotlin.jvm.internal.o.d(r17);
                } else if (integer == 2) {
                    r17 = c01.z1.k();
                    kotlin.jvm.internal.o.d(r17);
                } else if (integer != 3) {
                    r17 = c01.z1.r();
                    kotlin.jvm.internal.o.d(r17);
                } else {
                    r17 = xy2.c.e(context);
                }
                intent.putExtra("Chat_Self", r17);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_need_choose_id", true);
                intent.putExtra("key_finder_talker_user_name", this.f102417n);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f102418o);
                iyVar.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                if (i17 == 2) {
                    com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, V6, 3L, 1L, null, 8, null);
                }
                return jz5.f0.f302826a;
            }
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.finder.report.k.a(com.tencent.mm.plugin.finder.report.p.f125228g, V6, 3L, 2L, null, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
