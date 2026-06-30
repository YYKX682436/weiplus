package at2;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.k f13692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f13693e;

    public j(at2.k kVar, android.view.ViewGroup viewGroup) {
        this.f13692d = kVar;
        this.f13693e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dt2.d0 uiClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        at2.k kVar = this.f13692d;
        ((ct2.j) kVar.P0(ct2.j.class)).X6(true);
        ((mm2.c1) kVar.P0(mm2.c1.class)).O1 = false;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) kVar.X0(com.tencent.mm.plugin.finder.live.plugin.ad.class);
        if (adVar != null) {
            adVar.K0(8);
        }
        android.content.Context context = this.f13693e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((im2.t4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.t4.class)).f292551i = true;
        kVar.R0().finish();
        com.tencent.mm.plugin.finder.live.view.k0 R0 = kVar.R0();
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) R0 : null;
        if (finderLiveReplayPluginLayout != null && (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) != null) {
            uiClickListener.c(qs5.o.f366455h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
