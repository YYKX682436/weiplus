package b63;

/* loaded from: classes11.dex */
public class l implements com.p314xaae8f345.mm.p2470x93e71c27.ui.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f99689d = {"@gamelife", "@gamelifesess"};

    /* renamed from: e, reason: collision with root package name */
    public b63.k f99690e;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.m1
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 get(java.lang.String str) {
        for (java.lang.String str2 : this.f99689d) {
            if (str.endsWith(str2)) {
                if (this.f99690e == null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
                    if (c17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.w) {
                        this.f99690e = new b63.k(c17);
                    }
                }
                return this.f99690e;
            }
        }
        return null;
    }
}
