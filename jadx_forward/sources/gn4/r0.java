package gn4;

/* loaded from: classes15.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355184d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02) {
        this.f355184d = activityC18757xb5c40a02;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02 = this.f355184d;
        r45.un6 un6Var = activityC18757xb5c40a02.f256686i;
        if (un6Var.f469051x) {
            un6Var.f469051x = false;
            if (activityC18757xb5c40a02.V6() == 0) {
                to.a.c((android.media.AudioManager) activityC18757xb5c40a02.mo55332x76847179().getSystemService("audio"), 3, 1, 0);
            }
        } else {
            un6Var.f469051x = true;
        }
        activityC18757xb5c40a02.Y6();
        activityC18757xb5c40a02.t();
        activityC18757xb5c40a02.m();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
