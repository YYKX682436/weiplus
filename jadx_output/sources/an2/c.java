package an2;

/* loaded from: classes14.dex */
public final class c extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final an2.e f8842a;

    public c(an2.e holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f8842a = holder;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            an2.b bVar = this.f8842a.f8846f;
            if ((bVar != null ? bVar.a() : null) == null) {
                return;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", view, null, 25561);
        }
    }
}
