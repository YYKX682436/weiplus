package gn4;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f355164d;

    public j(gn4.z zVar) {
        this.f355164d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f355164d;
        android.view.View view2 = zVar.P;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pm4.y.i(zVar.A.r0(), zVar.E, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
