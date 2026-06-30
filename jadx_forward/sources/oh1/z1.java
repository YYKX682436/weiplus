package oh1;

/* loaded from: classes9.dex */
public class z1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f426865i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f426866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f426867n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426868o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f426869p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f426870q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f426871r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f426872s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(oh1.a2 a2Var, int i17, r35.m3 m3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.ref.WeakReference weakReference, int i18, long j17, java.lang.String str5, int i19, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f426861e = str;
        this.f426862f = str2;
        this.f426863g = str3;
        this.f426864h = str4;
        this.f426865i = weakReference;
        this.f426866m = i18;
        this.f426867n = j17;
        this.f426868o = str5;
        this.f426869p = i19;
        this.f426870q = map;
        this.f426871r = bundle;
        this.f426872s = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        byte[] decode;
        java.lang.String str = this.f426861e;
        java.lang.String str2 = this.f426862f;
        java.lang.String str3 = this.f426863g;
        java.lang.String str4 = this.f426864h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSysTemplateMsgHandler", "On Span clicked(title : %s, username : %s, path : %s, talker : %s)", str, str2, str3, str4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", this.f426866m);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(this.f426867n));
        bundle.putString("stat_chat_talker_username", str4);
        bundle.putString("stat_send_msg_user", this.f426868o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1088;
        c12559xbdae8559.f169324g = "";
        c12559xbdae8559.f169321d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.a(1088, bundle);
        c12559xbdae8559.f169322e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.b(c12559xbdae8559.f169323f, bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(view.getContext(), this.f426862f, null, this.f426869p, 0, (str3 == null || str3.length() <= 0 || (decode = android.util.Base64.decode(str3, 2)) == null) ? "" : new java.lang.String(decode), c12559xbdae8559);
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_view_wxapp", this.f426870q, this.f426871r, this.f426865i, this.f426872s);
    }
}
