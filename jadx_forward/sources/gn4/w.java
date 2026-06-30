package gn4;

/* loaded from: classes15.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f355193d;

    public w(gn4.z zVar) {
        this.f355193d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f355193d;
        zVar.m131898x15cb7231().o4().f346010d = 2;
        if (zVar.m131897x2e7566b3() == null || ((gn4.d0) zVar.m131897x2e7566b3()).m8183xf806b362() != zVar.m131898x15cb7231().Y2()) {
            zVar.m131898x15cb7231().t1(zVar.f346061z.u());
            zVar.m131898x15cb7231().o4().d(zVar.E);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(zVar.m131898x15cb7231().r0(), zVar.E, zVar.f346061z.u(), 2, "");
        } else {
            zVar.n(!zVar.m131898x15cb7231().s1().f346100a, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
