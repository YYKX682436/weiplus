package a24;

/* loaded from: classes.dex */
public final class j implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a24.l f888a;

    public j(a24.l lVar) {
        this.f888a = lVar;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        android.view.View view;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        for (in5.x0 x0Var : data.f293157j) {
            in5.c cVar = x0Var.f293158a;
            c24.f fVar = cVar instanceof c24.f ? (c24.f) cVar : null;
            a24.i iVar = fVar != null ? fVar.f38077e : null;
            androidx.recyclerview.widget.k3 p07 = recyclerView.p0(x0Var.f293160c);
            if (p07 != null && (view = p07.itemView) != null) {
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view, kotlin.jvm.internal.o.b(iVar != null ? iVar.a7() : null, "SettingGroup_Main_HeaderSearch") ? "setting_search_bar" : iVar != null ? iVar.a7() : null);
                java.lang.Integer REPORT_RULE = b24.a.f17394a;
                kotlin.jvm.internal.o.f(REPORT_RULE, "REPORT_RULE");
                ((cy1.a) aVar.ik(view, 32, REPORT_RULE.intValue())).gk(view, iVar != null ? iVar.g7(this.f888a.getIntent()) : null);
            }
        }
    }
}
