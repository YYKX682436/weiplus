package sl4;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.g f490788d;

    public c(sl4.g gVar) {
        this.f490788d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/playapp/base/floatball/TingBaseFloatBallHelper$onCoverClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sl4.g gVar = this.f490788d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "TingBaseFloatBallHelper onFloatBallCoverClick %s", gVar.f490793o);
        gVar.x0(qk.y9.f445915e);
        if (gVar.f490801w == null) {
            gVar.f490801w = gVar.f0();
        }
        bl4.a aVar = gVar.f490801w;
        if (aVar != null) {
            aVar.mo10729xe6095fa6(null);
        }
        gVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/playapp/base/floatball/TingBaseFloatBallHelper$onCoverClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
