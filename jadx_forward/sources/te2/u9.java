package te2;

/* loaded from: classes10.dex */
public final class u9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f500010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f500011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.y9 f500012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f81 f500013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f500014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(int i17, int i18, te2.y9 y9Var, r45.f81 f81Var, yz5.l lVar) {
        super(0);
        this.f500010d = i17;
        this.f500011e = i18;
        this.f500012f = y9Var;
        this.f500013g = f81Var;
        this.f500014h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f500014h;
        int i17 = this.f500011e;
        te2.y9 y9Var = this.f500012f;
        int i18 = this.f500010d;
        if (i18 == 0 && i17 == 0) {
            dk2.s sVar = ((mm2.m6) y9Var.f499683e.a(mm2.m6.class)).f410774f;
            r45.f81 f81Var = this.f500013g;
            sVar.f(f81Var, y9Var.f499682d);
            java.util.LinkedList m75941xfb821914 = f81Var.m75941xfb821914(1);
            int size = m75941xfb821914 != null ? m75941xfb821914.size() : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y9Var.f500082m, "loadSongListData - success, size: " + size);
            lVar.mo146xb9724478(java.lang.Integer.valueOf(size));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y9Var.f500082m, "loadSongListData - failed, errType: " + i18 + ", errCode: " + i17);
            lVar.mo146xb9724478(0);
        }
        return jz5.f0.f384359a;
    }
}
