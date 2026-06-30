package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183948i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183950n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f183951o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f183952p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, int i17, int i18, java.lang.String str, java.lang.String str2, android.content.Intent intent, java.lang.String str3, boolean z17, int i19) {
        super(0);
        this.f183943d = context;
        this.f183944e = i0Var;
        this.f183945f = i17;
        this.f183946g = i18;
        this.f183947h = str;
        this.f183948i = str2;
        this.f183949m = intent;
        this.f183950n = str3;
        this.f183951o = z17;
        this.f183952p = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String r17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.content.Context context = this.f183943d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        boolean wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wi(this.f183944e, context, this.f183945f, this.f183946g, this.f183947h);
        int i17 = this.f183952p;
        if (!wi6) {
            java.lang.String str = this.f183948i;
            if (str.length() > 0) {
                android.content.Intent intent = this.f183949m;
                if (intent == null) {
                    intent = new android.content.Intent();
                }
                int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
                if (m75939xb282bd08 == 1) {
                    r17 = c01.z1.r();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                } else if (m75939xb282bd08 == 2) {
                    r17 = c01.z1.k();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                } else if (m75939xb282bd08 != 3) {
                    r17 = c01.z1.r();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                } else {
                    r17 = xy2.c.e(context);
                }
                intent.putExtra("Chat_Self", r17);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_finder_need_choose_id", true);
                intent.putExtra("key_finder_talker_user_name", this.f183950n);
                intent.putExtra("key_finder_disable_sendmsg_need_follow", this.f183951o);
                iyVar.c(context, intent);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                if (i17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, V6, 3L, 1L, null, 8, null);
                }
                return jz5.f0.f384359a;
            }
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g, V6, 3L, 2L, null, 8, null);
        }
        return jz5.f0.f384359a;
    }
}
