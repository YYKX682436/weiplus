package os3;

/* loaded from: classes8.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429753d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86) {
        this.f429753d = activityC16931x24037f86;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429753d;
        db5.e1.e(activityC16931x24037f86, null, new java.lang.String[]{activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjx), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hju), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjv)}, null, new os3.u(this));
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
