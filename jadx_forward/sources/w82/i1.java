package w82;

/* loaded from: classes3.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f525421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525422e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505, boolean z17) {
        this.f525422e = viewOnClickListenerC13625xe5fb4505;
        this.f525421d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525422e;
        java.lang.String str = viewOnClickListenerC13625xe5fb4505.f183099d;
        boolean z17 = this.f525421d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: switch video model isVideoPlay %b ", java.lang.Boolean.valueOf(z17));
        android.view.View view = (android.view.View) viewOnClickListenerC13625xe5fb4505.f183102g;
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewOnClickListenerC13625xe5fb4505.f183101f.setVisibility(0);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewOnClickListenerC13625xe5fb4505.f183101f.setVisibility(8);
        viewOnClickListenerC13625xe5fb4505.f183107o.mo61298xa7077af8(viewOnClickListenerC13625xe5fb4505.f183102g.mo69286x51e8b0a() / 1000);
    }
}
