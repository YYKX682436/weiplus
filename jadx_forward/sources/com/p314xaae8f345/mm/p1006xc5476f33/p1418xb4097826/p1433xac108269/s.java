package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f184046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184051i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f184052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f184053n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, boolean z17) {
        super(0);
        this.f184046d = i0Var;
        this.f184047e = context;
        this.f184048f = i17;
        this.f184049g = i18;
        this.f184050h = str;
        this.f184051i = str2;
        this.f184052m = qt2Var;
        this.f184053n = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f184048f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = this.f184046d;
        android.content.Context context = this.f184047e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wi(i0Var, context, i17, this.f184049g, this.f184050h)) {
            java.lang.String str = this.f184051i;
            if (str.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, this.f184052m, 1L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", xy2.c.e(context));
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f184053n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
