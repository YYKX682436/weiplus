package p72;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f434022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f434024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.k f434026h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.List list, int i17, int i18, java.lang.String str, p72.k kVar) {
        super(0);
        this.f434022d = list;
        this.f434023e = i17;
        this.f434024f = i18;
        this.f434025g = str;
        this.f434026h = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: items = ");
        java.util.List list = this.f434022d;
        sb6.append(list.size());
        sb6.append(", delType = ");
        int i17 = this.f434023e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f434024f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f434025g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        p72.k kVar = this.f434026h;
        kVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kVar.d((o72.r2) it.next(), str, i17, i18);
        }
        return jz5.f0.f384359a;
    }
}
