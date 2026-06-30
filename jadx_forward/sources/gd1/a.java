package gd1;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f352011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.b f352013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, gd1.b bVar) {
        super(1);
        this.f352011d = lVar;
        this.f352012e = i17;
        this.f352013f = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hd1.z result = (hd1.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        gd1.b bVar = this.f352013f;
        int i17 = this.f352012e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f352011d;
        if (z17) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(bVar, 0, "ok", null));
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str = "fail:" + xVar.f361974b;
            int i18 = xVar.f361973a;
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(bVar, i18, str, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f384359a;
    }
}
