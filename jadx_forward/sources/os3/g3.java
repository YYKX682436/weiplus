package os3;

/* loaded from: classes11.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf f429622d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf activityC16940x12c392bf) {
        this.f429622d = activityC16940x12c392bf;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf activityC16940x12c392bf = this.f429622d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16940x12c392bf.f236455n) || activityC16940x12c392bf.f236455n.equals(activityC16940x12c392bf.f236454m)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf.T6(activityC16940x12c392bf);
        } else {
            db5.e1.u(activityC16940x12c392bf, activityC16940x12c392bf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfx), "", new os3.f3(this), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
