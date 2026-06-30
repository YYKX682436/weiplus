package oh1;

/* loaded from: classes9.dex */
public class m1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt0.d f426786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f426788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f426789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f426790i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(oh1.o1 o1Var, int i17, r35.m3 m3Var, tt0.d dVar, java.lang.String str, long j17, int i18, long j18, java.lang.String str2) {
        super(i17, m3Var);
        this.f426786e = dVar;
        this.f426787f = str;
        this.f426788g = j17;
        this.f426789h = i18;
        this.f426790i = j18;
        this.f426791m = str2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str;
        byte[] decode;
        tt0.d dVar = this.f426786e;
        java.lang.String str2 = dVar.f503329a;
        java.lang.String str3 = dVar.f503333e;
        java.lang.String str4 = dVar.f503334f;
        long j17 = this.f426788g;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str5 = this.f426787f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeMsgService", "On Span clicked(title : %s, username : %s, path : %s, talker : %s, updatableMsgType: %d)", str2, str3, str4, str5, valueOf);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", this.f426789h);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(this.f426790i));
        bundle.putString("stat_chat_talker_username", str5);
        bundle.putString("stat_send_msg_user", this.f426791m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1231;
        c12559xbdae8559.f169324g = "0";
        c12559xbdae8559.f169321d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.a(1231, bundle);
        c12559xbdae8559.f169322e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.b(c12559xbdae8559.f169323f, bundle);
        java.lang.String str6 = dVar.f503334f;
        java.lang.String str7 = (str6 == null || str6.length() <= 0 || (decode = android.util.Base64.decode(dVar.f503334f, 2)) == null) ? "" : new java.lang.String(decode);
        if (!(j17 == 1)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(view.getContext(), dVar.f503333e, null, dVar.f503335g, 0, str7, c12559xbdae8559);
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(dVar.f503333e, new oh1.l1(this));
            return;
        }
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(dVar.f503336h);
        if (Ai == null || Ai.f66303xc4aab016 != 1) {
            str = str5 + "," + c01.z1.r();
        } else {
            str = Ai.f66306xf47bcabf;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = 1231;
        b1Var.f398545a = dVar.f503333e;
        b1Var.f398549c = dVar.f503335g;
        b1Var.f398555f = str7;
        b1Var.f398576u = str5;
        b1Var.f398548b0 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            b1Var.f398550c0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42("");
        } else {
            b1Var.f398550c0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42("subpackage");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(view.getContext(), b1Var);
    }
}
