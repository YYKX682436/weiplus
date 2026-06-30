package ae2;

/* loaded from: classes.dex */
public final class qj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.qj f4129d = new ae2.qj();

    public qj() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI27.f109598v;
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI27.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/api/config/FinderLiveConfig$FINDER_LIVE_TEST_CRIT_ANIM_PAGE$2$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/api/config/FinderLiveConfig$FINDER_LIVE_TEST_CRIT_ANIM_PAGE$2$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
