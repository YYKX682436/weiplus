package hn4;

/* loaded from: classes3.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 f364105d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 activityC18759x34abfcf1) {
        this.f364105d = activityC18759x34abfcf1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.p2309x32b09e.ActivityC18759x34abfcf1 activityC18759x34abfcf1 = this.f364105d;
        if (activityC18759x34abfcf1.C1.getVisibility() == 0) {
            android.view.View view = activityC18759x34abfcf1.C1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
