package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f183906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f183907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, int i19, boolean z17) {
        super(0);
        this.f183899d = i0Var;
        this.f183900e = context;
        this.f183901f = i17;
        this.f183902g = i18;
        this.f183903h = str;
        this.f183904i = str2;
        this.f183905m = qt2Var;
        this.f183906n = i19;
        this.f183907o = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f183901f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = this.f183899d;
        android.content.Context context = this.f183900e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wi(i0Var, context, i17, this.f183902g, this.f183903h)) {
            java.lang.String str = this.f183904i;
            if (str.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, this.f183905m, 4L, 1L, null, 8, null);
                android.content.Intent intent = new android.content.Intent();
                int i18 = this.f183906n;
                intent.putExtra("Chat_Self", i18 == 2 ? c01.z1.r() : i18 == 1 ? xy2.c.e(context) : c01.z1.k());
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f183907o);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, this.f183905m, 4L, 2L, null, 8, null);
        return jz5.f0.f384359a;
    }
}
