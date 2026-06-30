package db5;

/* loaded from: classes8.dex */
public class k0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309951g;

    public k0(java.lang.String str, java.util.List list, java.util.List list2, java.lang.String str2) {
        this.f309948d = str;
        this.f309949e = list;
        this.f309950f = list2;
        this.f309951g = str2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str = this.f309948d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            g4Var.setHeaderTitle(str);
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f309949e;
            if (i17 >= list.size()) {
                break;
            }
            g4Var.f(((java.lang.Integer) this.f309950f.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
            i17++;
        }
        java.lang.String str2 = this.f309951g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        g4Var.f(-1, str2);
    }
}
