package mn2;

/* loaded from: classes11.dex */
public final class s implements com.p314xaae8f345.mm.p2470x93e71c27.ui.m1 {

    /* renamed from: e, reason: collision with root package name */
    public static final mn2.r f411639e = new mn2.r(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f411640f = {"@findermsg", "@finder", "@findermsgstranger", "@findermsgalias"};

    /* renamed from: d, reason: collision with root package name */
    public mn2.q f411641d;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.m1
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 get(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (!f411639e.a(tag)) {
            return null;
        }
        if (this.f411641d == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
            if (c17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.w) {
                this.f411641d = new mn2.q(c17);
            }
        }
        return this.f411641d;
    }
}
