package gd1;

/* loaded from: classes7.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f352018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.d0 f352020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hd1.w f352021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, gd1.d0 d0Var, hd1.w wVar) {
        super(1);
        this.f352018d = lVar;
        this.f352019e = i17;
        this.f352020f = d0Var;
        this.f352021g = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hd1.z result = (hd1.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        int i17 = this.f352019e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f352018d;
        if (z17) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this.f352020f, 0, "ok", null));
            ((hd1.b) this.f352021g.f361972b).f361919b = null;
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str = "fail:" + xVar.f361974b;
            int i18 = xVar.f361973a;
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this.f352020f, i18, str, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f384359a;
    }
}
