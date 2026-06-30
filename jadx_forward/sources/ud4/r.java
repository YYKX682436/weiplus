package ud4;

/* loaded from: classes.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud4.t f508263d;

    public r(ud4.t tVar) {
        this.f508263d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$7");
        ud4.t tVar = this.f508263d;
        android.view.View view = tVar.f508274j;
        if (view != null && view.getVisibility() == 0) {
            android.view.View view2 = tVar.f508274j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$7");
    }
}
