package en5;

/* loaded from: classes12.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f337066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(fn5.n0 n0Var, yz5.l lVar) {
        super(1);
        this.f337065d = n0Var;
        this.f337066e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (((com.p314xaae8f345.mm.p2614xca6eae71.x1) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r.class))).Bi(it) || ((com.p314xaae8f345.mm.p2614xca6eae71.x1) ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r) i95.n0.c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.r.class))).Ai(it)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySearchBar", "input is emoji, return");
        } else if (!android.text.TextUtils.equals(it, " ")) {
            this.f337065d.c7(it);
            this.f337066e.mo146xb9724478(it);
        }
        return jz5.f0.f384359a;
    }
}
