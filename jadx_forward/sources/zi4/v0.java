package zi4;

/* loaded from: classes9.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.w0 f554801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pb f554802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(zi4.w0 w0Var, bw5.pb pbVar) {
        super(0);
        this.f554801d = w0Var;
        this.f554802e = pbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.pb pbVar = this.f554802e;
        boolean[] zArr = pbVar.f113088g;
        boolean z17 = true;
        java.lang.String str = zArr[1] ? pbVar.f113085d : "";
        java.lang.String str2 = zArr[2] ? pbVar.f113086e : "";
        boolean z18 = pbVar.f113087f;
        zi4.w0 w0Var = this.f554801d;
        w0Var.getClass();
        if (!(str == null || r26.n0.N(str))) {
            if (str2 != null && !r26.n0.N(str2)) {
                z17 = false;
            }
            if (!z17) {
                java.lang.ref.WeakReference weakReference = w0Var.f554714e;
                if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                    java.lang.Object obj = weakReference.get();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    android.content.Context context = (android.content.Context) obj;
                    pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1.f255034d, context, 1, str, str2, java.lang.Boolean.valueOf(z18), null, p0Var != null ? p0Var.f436775m : 0, 0, 160, null);
                    return jz5.f0.f384359a;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f554804g, "openStatusCommentDialog: failed");
        return jz5.f0.f384359a;
    }
}
