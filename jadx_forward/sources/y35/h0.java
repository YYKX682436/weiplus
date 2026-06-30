package y35;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd f540747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540748e;

    public h0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd, java.lang.String str) {
        this.f540747d = c19715xef2590cd;
        this.f540748e = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView$bindCloudProviders$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd = this.f540747d;
        db5.e1.f(c19715xef2590cd.getContext(), null, new java.lang.String[]{c19715xef2590cd.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1i)}, null, null, new y35.g0(this.f540748e));
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView$bindCloudProviders$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
