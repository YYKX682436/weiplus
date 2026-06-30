package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183830h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183831i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f183832m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183833n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f183834o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f183835p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, yz5.a aVar, java.lang.String str3, int i19, boolean z17) {
        super(0);
        this.f183826d = i0Var;
        this.f183827e = context;
        this.f183828f = i17;
        this.f183829g = i18;
        this.f183830h = str;
        this.f183831i = str2;
        this.f183832m = aVar;
        this.f183833n = str3;
        this.f183834o = i19;
        this.f183835p = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f183828f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = this.f183826d;
        android.content.Context context = this.f183827e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wi(i0Var, context, i17, this.f183829g, this.f183830h)) {
            java.lang.String str = this.f183831i;
            if (str.length() > 0) {
                yz5.a aVar = this.f183832m;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", this.f183833n);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_enter_scene", this.f183834o);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f183835p);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
