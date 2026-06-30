package aq;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final aq.p f12929a = new aq.p();

    /* renamed from: b, reason: collision with root package name */
    public static qk.q7 f12930b;

    public final void a(long j17, java.lang.String str, android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f12930b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "dealImageSearch: " + j17 + ", fromSource: " + i17);
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
            su4.i1 i1Var = new su4.i1();
            i1Var.f412922a = java.lang.System.currentTimeMillis();
            i1Var.f412923b = context;
            i1Var.f412924c = n17;
            i1Var.f412925d = i17 == 0 ? 3 : 2;
            ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
        }
    }
}
