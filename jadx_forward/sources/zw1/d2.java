package zw1;

/* loaded from: classes15.dex */
public class d2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558137d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558137d = activityC13144xce1cfbb7;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558137d;
        activityC13144xce1cfbb7.r7(activityC13144xce1cfbb7.H1);
        if (activityC13144xce1cfbb7.H1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20032, "wxface2face", "LongClick", "", "", "", "", 3, java.lang.Integer.valueOf(activityC13144xce1cfbb7.H1.f469720d), 0, activityC13144xce1cfbb7.g7(), java.lang.Integer.valueOf(activityC13144xce1cfbb7.i7()), activityC13144xce1cfbb7.h7());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
