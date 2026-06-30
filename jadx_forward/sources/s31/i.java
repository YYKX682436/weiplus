package s31;

/* loaded from: classes12.dex */
public final class i implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f483987a;

    /* renamed from: b, reason: collision with root package name */
    public s31.j f483988b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f483987a == null) {
            this.f483987a = new android.widget.LinearLayout(context);
            c(null, this.f483988b);
        }
        android.widget.LinearLayout linearLayout = this.f483987a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linearLayout);
        return linearLayout;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        s31.j jVar = (s31.j) pVar;
        s31.j jVar2 = this.f483988b;
        this.f483988b = jVar;
        c(jVar2, jVar);
    }

    public final void c(s31.j jVar, s31.j jVar2) {
        an5.d dVar;
        an5.c cVar;
        an5.d dVar2;
        an5.c cVar2;
        an5.d dVar3;
        an5.c cVar3;
        an5.d dVar4;
        an5.c cVar4;
        android.widget.LinearLayout linearLayout = this.f483987a;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOrientation(jVar2 != null ? jVar2.f483989d : 0);
        linearLayout.setGravity(17);
        float f17 = 0.0f;
        int a17 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar4 = jVar2.f483990e) == null || (cVar4 = dVar4.f90412a) == null) ? 0.0f : cVar4.f90411a);
        int a18 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar3 = jVar2.f483990e) == null || (cVar3 = dVar3.f90413b) == null) ? 0.0f : cVar3.f90411a);
        int a19 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar2 = jVar2.f483990e) == null || (cVar2 = dVar2.f90414c) == null) ? 0.0f : cVar2.f90411a);
        android.content.Context context = linearLayout.getContext();
        if (jVar2 != null && (dVar = jVar2.f483990e) != null && (cVar = dVar.f90415d) != null) {
            f17 = cVar.f90411a;
        }
        linearLayout.setPadding(a17, a18, a19, ym5.x.a(context, f17));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f483988b;
    }
}
