package as2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ as2.k f13473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f13478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ as2.h f13479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13480h;

    public j(as2.k kVar, long j17, java.lang.String str, int i17, boolean z17, r45.qt2 qt2Var, as2.h hVar, int i18) {
        this.f13473a = kVar;
        this.f13474b = j17;
        this.f13475c = str;
        this.f13476d = i17;
        this.f13477e = z17;
        this.f13478f = qt2Var;
        this.f13479g = hVar;
        this.f13480h = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        r45.wj4 wj4Var3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.oj4 oj4Var = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
            long j17 = 0;
            if (((oj4Var == null || (wj4Var3 = (r45.wj4) oj4Var.getCustom(18)) == null) ? 0L : wj4Var3.getLong(0)) != 0) {
                r45.oj4 oj4Var2 = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
                if (oj4Var2 != null && (wj4Var2 = (r45.wj4) oj4Var2.getCustom(18)) != null) {
                    j17 = wj4Var2.getLong(0);
                }
                long j18 = j17;
                r45.oj4 oj4Var3 = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
                if (oj4Var3 == null || (wj4Var = (r45.wj4) oj4Var3.getCustom(18)) == null || (str = wj4Var.getString(1)) == null) {
                    str = "";
                }
                this.f13473a.R6(j18, str, this.f13474b, this.f13475c, this.f13476d, this.f13477e, this.f13478f, this.f13479g, this.f13480h);
                return f0Var;
            }
        }
        int i18 = this.f13476d;
        int i19 = this.f13480h;
        as2.k kVar = this.f13473a;
        java.lang.String O6 = kVar.O6(this.f13474b, i18, i19);
        java.util.HashMap hashMap = kVar.f13481e;
        if (hashMap.containsKey(O6)) {
            hashMap.remove(O6);
        }
        if (this.f13479g != null) {
            return f0Var;
        }
        return null;
    }
}
