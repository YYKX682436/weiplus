package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183774i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f183776n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, boolean z17) {
        super(0);
        this.f183769d = i0Var;
        this.f183770e = context;
        this.f183771f = i17;
        this.f183772g = i18;
        this.f183773h = str;
        this.f183774i = str2;
        this.f183775m = qt2Var;
        this.f183776n = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f183771f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = this.f183769d;
        android.content.Context context = this.f183770e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wi(i0Var, context, i17, this.f183772g, this.f183773h)) {
            java.lang.String str = this.f183774i;
            if (str.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, this.f183775m, 2L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", xy2.c.e(context));
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f183776n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
