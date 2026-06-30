package n20;

/* loaded from: classes9.dex */
public final class f implements r00.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em.e0 f415753a;

    public f(em.e0 e0Var) {
        this.f415753a = e0Var;
    }

    @Override // r00.h
    public void a(r00.a aVar) {
        if (aVar != null) {
            int i17 = aVar.f449529a | (-16777216);
            em.e0 e0Var = this.f415753a;
            e0Var.b().setBackgroundColor(i17);
            e0Var.c().setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i17, 16777215 & i17}));
        }
    }
}
