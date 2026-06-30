package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class i extends o.e0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f9605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.widget.q qVar, android.content.Context context, o.o0 o0Var, android.view.View view) {
        super(context, o0Var, view, false, com.tencent.mm.R.attr.a_);
        this.f9605m = qVar;
        if (!((o0Var.G.D & 32) == 32)) {
            android.view.View view2 = qVar.f9671p;
            this.f341707f = view2 == null ? (android.view.View) qVar.f341697n : view2;
        }
        androidx.appcompat.widget.o oVar = qVar.E;
        this.f341710i = oVar;
        o.c0 c0Var = this.f341711j;
        if (c0Var != null) {
            c0Var.g(oVar);
        }
    }

    @Override // o.e0
    public void c() {
        androidx.appcompat.widget.q qVar = this.f9605m;
        qVar.B = null;
        qVar.F = 0;
        super.c();
    }
}
