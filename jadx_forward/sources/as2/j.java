package as2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ as2.k f95006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f95007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f95011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ as2.h f95012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f95013h;

    public j(as2.k kVar, long j17, java.lang.String str, int i17, boolean z17, r45.qt2 qt2Var, as2.h hVar, int i18) {
        this.f95006a = kVar;
        this.f95007b = j17;
        this.f95008c = str;
        this.f95009d = i17;
        this.f95010e = z17;
        this.f95011f = qt2Var;
        this.f95012g = hVar;
        this.f95013h = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        r45.wj4 wj4Var3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.oj4 oj4Var = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
            long j17 = 0;
            if (((oj4Var == null || (wj4Var3 = (r45.wj4) oj4Var.m75936x14adae67(18)) == null) ? 0L : wj4Var3.m75942xfb822ef2(0)) != 0) {
                r45.oj4 oj4Var2 = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
                if (oj4Var2 != null && (wj4Var2 = (r45.wj4) oj4Var2.m75936x14adae67(18)) != null) {
                    j17 = wj4Var2.m75942xfb822ef2(0);
                }
                long j18 = j17;
                r45.oj4 oj4Var3 = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
                if (oj4Var3 == null || (wj4Var = (r45.wj4) oj4Var3.m75936x14adae67(18)) == null || (str = wj4Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                this.f95006a.R6(j18, str, this.f95007b, this.f95008c, this.f95009d, this.f95010e, this.f95011f, this.f95012g, this.f95013h);
                return f0Var;
            }
        }
        int i18 = this.f95009d;
        int i19 = this.f95013h;
        as2.k kVar = this.f95006a;
        java.lang.String O6 = kVar.O6(this.f95007b, i18, i19);
        java.util.HashMap hashMap = kVar.f95014e;
        if (hashMap.containsKey(O6)) {
            hashMap.remove(O6);
        }
        if (this.f95012g != null) {
            return f0Var;
        }
        return null;
    }
}
