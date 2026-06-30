package te2;

/* loaded from: classes10.dex */
public final class d9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f499490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f499492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt1 f499493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(int i17, int i18, te2.m9 m9Var, r45.tt1 tt1Var, yz5.l lVar) {
        super(0);
        this.f499490d = i17;
        this.f499491e = i18;
        this.f499492f = m9Var;
        this.f499493g = tt1Var;
        this.f499494h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f499494h;
        int i17 = this.f499491e;
        te2.m9 m9Var = this.f499492f;
        int i18 = this.f499490d;
        if (i18 == 0 && i17 == 0) {
            ((mm2.m6) m9Var.f499683e.a(mm2.m6.class)).f410782q.a(this.f499493g);
            int size = ((mm2.m6) m9Var.f499683e.a(mm2.m6.class)).f410782q.f315618a.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m9Var.f499767m, "loadSongListData - success, size: " + size);
            lVar.mo146xb9724478(java.lang.Integer.valueOf(size));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m9Var.f499767m, "loadSongListData - failed, errType: " + i18 + ", errCode: " + i17);
            lVar.mo146xb9724478(0);
        }
        return jz5.f0.f384359a;
    }
}
