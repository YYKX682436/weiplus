package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102297h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102298i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f102301o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f102302p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, yz5.a aVar, java.lang.String str3, int i19, boolean z17) {
        super(0);
        this.f102293d = i0Var;
        this.f102294e = context;
        this.f102295f = i17;
        this.f102296g = i18;
        this.f102297h = str;
        this.f102298i = str2;
        this.f102299m = aVar;
        this.f102300n = str3;
        this.f102301o = i19;
        this.f102302p = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f102295f;
        com.tencent.mm.plugin.finder.assist.i0 i0Var = this.f102293d;
        android.content.Context context = this.f102294e;
        if (!com.tencent.mm.plugin.finder.assist.i0.wi(i0Var, context, i17, this.f102296g, this.f102297h)) {
            java.lang.String str = this.f102298i;
            if (str.length() > 0) {
                yz5.a aVar = this.f102299m;
                if (aVar != null) {
                    aVar.invoke();
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", this.f102300n);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_enter_scene", this.f102301o);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f102302p);
                com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
