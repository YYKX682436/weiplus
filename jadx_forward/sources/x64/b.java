package x64;

/* loaded from: classes3.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x64.f f533803d;

    public b(x64.f fVar) {
        this.f533803d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        x64.f fVar = this.f533803d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (x64.f.a(fVar) != null && x64.f.a(fVar).i()) {
                x64.f.a(fVar).u();
            }
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1");
    }
}
