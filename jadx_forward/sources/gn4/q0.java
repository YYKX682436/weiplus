package gn4;

/* loaded from: classes15.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355182d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02) {
        this.f355182d = activityC18757xb5c40a02;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355182d;
        activityC18757xb5c40a02.G.a();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_video_play_info", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18757xb5c40a02.G.f346013g, ";"));
        intent.putExtra("key_search_id", activityC18757xb5c40a02.f256686i.f469040m);
        activityC18757xb5c40a02.setResult(-1, intent);
        if (!activityC18757xb5c40a02.f256700z.U(2, false)) {
            activityC18757xb5c40a02.finish();
        }
        if (!activityC18757xb5c40a02.f256699y.m0(2)) {
            activityC18757xb5c40a02.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
