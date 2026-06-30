package yx2;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f549365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f549366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx2.f f549367f;

    public c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, ya2.b2 b2Var, yx2.f fVar) {
        this.f549365d = c19792x256d2725;
        this.f549366e = b2Var;
        this.f549367f = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String w07;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f549365d;
        r45.f1 b17 = hc2.g0.b(c19792x256d2725);
        if (b17 == null || (w07 = b17.m75945x2fec8307(0)) == null) {
            ya2.b2 b2Var = this.f549366e;
            w07 = b2Var != null ? b2Var.w0() : c19792x256d2725.m76801x8010e5e4();
        }
        yx2.f fVar = this.f549367f;
        android.widget.TextView textView = fVar.f549376b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = fVar.f549376b.getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
    }
}
