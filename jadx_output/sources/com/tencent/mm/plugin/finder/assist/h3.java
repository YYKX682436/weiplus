package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f102218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f102219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx2.q f102220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment, android.view.ViewGroup viewGroup, gx2.q qVar) {
        super(2);
        this.f102218d = vASCommonFragment;
        this.f102219e = viewGroup;
        this.f102220f = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        gx2.q layout = (gx2.q) obj;
        gx2.r action = (gx2.r) obj2;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(action, "action");
        gx2.r rVar = gx2.r.f277376e;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f102218d;
        if (action == rVar && vASCommonFragment != null && (vASActivity = vASCommonFragment.f211121p) != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q == 0) {
                ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(vASActivity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q = 3;
            }
        }
        this.f102219e.removeView(this.f102220f);
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = vASCommonFragment.f211121p;
        if (vASActivity2 != null) {
            vASActivity2.finish();
        }
        return jz5.f0.f302826a;
    }
}
