package ji4;

/* loaded from: classes11.dex */
public class t implements com.p314xaae8f345.mm.p2470x93e71c27.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f381483d;

    /* renamed from: e, reason: collision with root package name */
    public ji4.s f381484e;

    public t() {
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        this.f381483d = new java.lang.String[]{"@status"};
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.m1
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 get(java.lang.String str) {
        for (java.lang.String str2 : this.f381483d) {
            if (str.endsWith(str2)) {
                if (this.f381484e == null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
                    if (c17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.w) {
                        this.f381484e = new ji4.s(c17);
                    }
                }
                return this.f381484e;
            }
        }
        return null;
    }
}
