package hn4;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 f364130e;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 activityC18759x34abfcf1, java.lang.String str) {
        this.f364130e = activityC18759x34abfcf1;
        this.f364129d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 activityC18759x34abfcf1 = this.f364130e;
        if (activityC18759x34abfcf1.U) {
            android.view.View view = activityC18759x34abfcf1.f256707y1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC18759x34abfcf1.f256705x1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = activityC18759x34abfcf1.f256703p1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = activityC18759x34abfcf1.f256701l1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.ProgressDialog progressDialog = activityC18759x34abfcf1.f256702p0;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC18759x34abfcf1.f256702p0 = null;
        }
        activityC18759x34abfcf1.getClass();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(activityC18759x34abfcf1)) {
            android.widget.Toast.makeText(activityC18759x34abfcf1, activityC18759x34abfcf1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsi), 1).show();
            return;
        }
        java.lang.String str = this.f364129d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.widget.Toast.makeText(activityC18759x34abfcf1, activityC18759x34abfcf1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsj), 1).show();
        } else {
            android.widget.Toast.makeText(activityC18759x34abfcf1, str, 1).show();
        }
    }
}
