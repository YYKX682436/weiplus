package wh0;

/* loaded from: classes11.dex */
public class b extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.f06 f527444a;

    public b(java.lang.String str, int i17, int i18) {
        r45.f06 f06Var = new r45.f06();
        this.f527444a = f06Var;
        f06Var.mo11509x3ab820bc(o45.bh.a(this));
        f06Var.f455447d = i17;
        f06Var.f455448e = i18;
        f06Var.f455449f = str;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f06Var.f455452i = java.lang.String.format("cmd_%d_%s_%d_%d", valueOf, str, valueOf2, java.lang.Integer.valueOf(new java.util.Random().nextInt()));
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 17907;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        return this.f527444a.mo14344x5f01b1f6();
    }
}
