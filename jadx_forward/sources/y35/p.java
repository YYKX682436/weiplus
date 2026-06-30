package y35;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f540763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 f540764e;

    public p(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 c19704xf24fb064, y35.r rVar) {
        this.f540764e = c19704xf24fb064;
        this.f540763d = rVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 c19704xf24fb064 = this.f540764e;
        db5.e1.f(c19704xf24fb064.getContext(), null, new java.lang.String[]{c19704xf24fb064.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1i)}, null, null, new y35.o(this));
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
