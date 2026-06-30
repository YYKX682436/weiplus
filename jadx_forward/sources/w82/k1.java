package w82;

/* loaded from: classes.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f525438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525439e;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505, java.lang.String str) {
        this.f525439e = viewOnClickListenerC13625xe5fb4505;
        this.f525438d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525439e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(viewOnClickListenerC13625xe5fb4505.getContext(), intent, new com.p314xaae8f345.mm.vfs.r6(this.f525438d), "video/*", false);
        try {
            android.content.Context context = viewOnClickListenerC13625xe5fb4505.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(viewOnClickListenerC13625xe5fb4505.f183099d, "startActivity fail, activity not found");
            db5.e1.i(viewOnClickListenerC13625xe5fb4505.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cbm, com.p314xaae8f345.mm.R.C30867xcad56011.cbn);
        }
    }
}
