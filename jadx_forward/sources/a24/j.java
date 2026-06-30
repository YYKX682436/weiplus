package a24;

/* loaded from: classes.dex */
public final class j implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a24.l f82421a;

    public j(a24.l lVar) {
        this.f82421a = lVar;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        for (in5.x0 x0Var : data.f374690j) {
            in5.c cVar = x0Var.f374691a;
            c24.f fVar = cVar instanceof c24.f ? (c24.f) cVar : null;
            a24.i iVar = fVar != null ? fVar.f119610e : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(x0Var.f374693c);
            if (p07 != null && (view = p07.f3639x46306858) != null) {
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar != null ? iVar.a7() : null, "SettingGroup_Main_HeaderSearch") ? "setting_search_bar" : iVar != null ? iVar.a7() : null);
                java.lang.Integer REPORT_RULE = b24.a.f98927a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
                ((cy1.a) aVar.ik(view, 32, REPORT_RULE.intValue())).gk(view, iVar != null ? iVar.g7(this.f82421a.m158359x1e885992()) : null);
            }
        }
    }
}
