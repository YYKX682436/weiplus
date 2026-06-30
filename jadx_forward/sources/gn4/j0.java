package gn4;

/* loaded from: classes.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355166e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02, java.lang.String str) {
        this.f355166e = activityC18757xb5c40a02;
        this.f355165d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355166e;
        android.view.View view = activityC18757xb5c40a02.f256693s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC18757xb5c40a02.f256692r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.app.ProgressDialog progressDialog = activityC18757xb5c40a02.f256691q;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC18757xb5c40a02.f256691q = null;
        }
        activityC18757xb5c40a02.getClass();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(activityC18757xb5c40a02)) {
            dp.a.m125854x26a183b(activityC18757xb5c40a02, activityC18757xb5c40a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsi), 1).show();
            return;
        }
        java.lang.String str = this.f355165d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            dp.a.m125854x26a183b(activityC18757xb5c40a02, activityC18757xb5c40a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsj), 1).show();
        } else {
            dp.a.m125854x26a183b(activityC18757xb5c40a02, str, 1).show();
        }
    }
}
