package p61;

/* loaded from: classes5.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f433821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433823f;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970, int i17, java.lang.String str) {
        this.f433823f = activityC11360x90d2d970;
        this.f433821d = i17;
        this.f433822e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433823f;
        activityC11360x90d2d970.f154507t = !activityC11360x90d2d970.f154507t;
        android.widget.TextView textView = activityC11360x90d2d970.f154495e;
        java.lang.String string = activityC11360x90d2d970.getString(this.f433821d);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = activityC11360x90d2d970.f154507t ? activityC11360x90d2d970.f154502o : this.f433822e;
        textView.setText(java.lang.String.format(string, objArr));
        activityC11360x90d2d970.f154498h.setText(activityC11360x90d2d970.getString(activityC11360x90d2d970.f154507t ? com.p314xaae8f345.mm.R.C30867xcad56011.agi : com.p314xaae8f345.mm.R.C30867xcad56011.agy));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
