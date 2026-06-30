package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class n extends o.e0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f9655m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.widget.q qVar, android.content.Context context, o.r rVar, android.view.View view, boolean z17) {
        super(context, rVar, view, z17, com.tencent.mm.R.attr.a_);
        this.f9655m = qVar;
        this.f341708g = 8388613;
        androidx.appcompat.widget.o oVar = qVar.E;
        this.f341710i = oVar;
        o.c0 c0Var = this.f341711j;
        if (c0Var != null) {
            c0Var.g(oVar);
        }
    }

    @Override // o.e0
    public void c() {
        androidx.appcompat.widget.q qVar = this.f9655m;
        o.r rVar = qVar.f341692f;
        if (rVar != null) {
            rVar.c(true);
        }
        qVar.A = null;
        super.c();
    }
}
