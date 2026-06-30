package sz4;

/* loaded from: classes12.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.t f495742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f495743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iz4.c f495745g;

    public n(sz4.t tVar, int i17, int i18, iz4.c cVar) {
        this.f495742d = tVar;
        this.f495743e = i17;
        this.f495744f = i18;
        this.f495745g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sz4.t tVar = this.f495742d;
        mz4.j0 j0Var = tVar.f495715d;
        if (j0Var.f414842q == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h;
            activityC19519x7af4daf3.getClass();
            activityC19519x7af4daf3.C7(false);
            tVar.f495715d.a();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f495743e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f495744f);
        iz4.c cVar = this.f495745g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((iz4.o) cVar).f377666q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.wenote.model.datamodel.WNNoteFavItemBase");
        iz4.o oVar = (iz4.o) cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteMediaGroupItemHolder", "click item, pos:%s offset:%s type:%d id:%s", valueOf, valueOf2, valueOf3, oVar.f377664o);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f90112b = oVar.f377664o;
        zlVar.f90114d = view.getContext();
        c5773x64e6b625.f136087g.f90111a = 1;
        ((hz4.f) hz4.f.wi()).f367940d.p(c5773x64e6b625);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
