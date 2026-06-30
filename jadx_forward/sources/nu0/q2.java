package nu0;

/* loaded from: classes5.dex */
public final class q2 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421615c;

    public q2(int i17, nu0.b4 b4Var, int i18) {
        this.f421613a = i17;
        this.f421614b = b4Var;
        this.f421615c = i18;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        nu0.b4 b4Var = this.f421614b;
        ju0.b bVar = b4Var.K;
        if (this.f421613a == bVar.f383213g) {
            int i17 = this.f421615c;
            bVar.f383213g = i17;
            nu0.b4.d7(b4Var, i17);
        }
        nu0.i q76 = b4Var.q7();
        q76.V6("edit_material", "adjust_images_order", q76.U6());
    }
}
