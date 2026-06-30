package dp1;

/* loaded from: classes14.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f323667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f323668e;

    public j(dp1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f323668e = lVar;
        this.f323667d = c12886x91aa2b6d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f323667d;
        c12886x91aa2b6d.M.f174623m = 1;
        this.f323668e.f323699h.a(c12886x91aa2b6d);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
