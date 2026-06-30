package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s1 f276743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f276744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f276745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f276746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, java.util.Map map, int i17, android.content.Context context) {
        super(0);
        this.f276743d = s1Var;
        this.f276744e = map;
        this.f276745f = i17;
        this.f276746g = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f276743d.f67306x114ef53e;
        java.lang.String str2 = (java.lang.String) this.f276744e.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(this.f276745f) + ".publisher_username");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = str2;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 268);
        j45.l.j(this.f276746g, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "jump to profile");
        return jz5.f0.f384359a;
    }
}
