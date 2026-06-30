package p61;

/* loaded from: classes3.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 f433769d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 activityC11357xf5846456) {
        this.f433769d = activityC11357xf5846456;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 activityC11357xf5846456 = this.f433769d;
        db5.e1.K(activityC11357xf5846456.mo55332x76847179(), true, activityC11357xf5846456.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2d), "", activityC11357xf5846456.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2c), activityC11357xf5846456.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new p61.c(this), new p61.d(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
