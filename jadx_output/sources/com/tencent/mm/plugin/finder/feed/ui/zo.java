package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f110811d;

    public zo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        this.f110811d = occupyFinderUI34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34.f109614t;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f110811d;
        java.lang.String stringExtra = occupyFinderUI34.getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("FinderGameBind", "no appinfo appid: ".concat(stringExtra));
        }
        java.lang.String str = h17.field_openId;
        az2.c cVar = az2.f.f16125d;
        androidx.appcompat.app.AppCompatActivity context = occupyFinderUI34.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 14, null);
        a17.a();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pm0.v.T(new bq.a0(str, 1, 1, new com.tencent.mm.plugin.finder.feed.ui.wo(a17)).l(), new cq.x0(new com.tencent.mm.plugin.finder.feed.ui.uo(stringExtra, str, a17, occupyFinderUI34), new com.tencent.mm.plugin.finder.feed.ui.vo(stringExtra, str, a17, occupyFinderUI34)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
