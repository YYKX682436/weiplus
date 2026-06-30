package wc1;

/* loaded from: classes7.dex */
public class n implements ph1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f526024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f526026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526027e;

    public n(wc1.q qVar, java.lang.String str, java.util.Set set, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, java.lang.String str3) {
        this.f526023a = str;
        this.f526024b = set;
        this.f526025c = str2;
        this.f526026d = d0Var;
        this.f526027e = str3;
    }

    @Override // ph1.c
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        java.lang.String m49226x9616526c = c11666xa31a0b7f.m49226x9616526c();
        java.lang.String str = this.f526023a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: module name: %s progress: %s", str, m49226x9616526c);
        java.util.Set set = this.f526024b;
        if (!set.contains(str)) {
            set.add(str);
            k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
            if (a3Var != null) {
                ((k91.u0) a3Var).Ui(this.f526025c, str, c11666xa31a0b7f.f156927d);
            }
        }
        wc1.p.y(this.f526026d, this.f526027e, "progressUpdate", this.f526023a, c11666xa31a0b7f.f156927d, c11666xa31a0b7f.f156928e, c11666xa31a0b7f.f156929f, null);
    }
}
