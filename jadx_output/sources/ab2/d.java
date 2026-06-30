package ab2;

/* loaded from: classes2.dex */
public final class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab2.g f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f2759b;

    public d(ab2.g gVar, so2.j5 j5Var) {
        this.f2758a = gVar;
        this.f2759b = j5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        ab2.g gVar = this.f2758a;
        com.tencent.mm.ui.MMActivity context = gVar.f106174d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        com.tencent.mm.ui.MMActivity activity = gVar.f106174d;
        kotlin.jvm.internal.o.g(activity, "activity");
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p));
        com.tencent.mm.ui.MMActivity activity2 = gVar.f106174d;
        kotlin.jvm.internal.o.g(activity2, "activity");
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s);
        r45.nw1 liveInfo = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f2759b).getFeedObject().getLiveInfo();
        lVarArr[3] = new jz5.l("live_enter_status", liveInfo != null ? java.lang.Integer.valueOf(liveInfo.getInteger(2)) : null);
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
