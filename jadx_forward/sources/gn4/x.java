package gn4;

/* loaded from: classes15.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gn4.z f355194d;

    public x(gn4.z zVar) {
        this.f355194d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gn4.z zVar = this.f355194d;
        zVar.getClass();
        zVar.D = java.util.UUID.randomUUID().toString();
        zVar.G.y();
        zVar.m131898x15cb7231().o4().f346010d = 2;
        zVar.m131898x15cb7231().I2().i(zVar.m131898x15cb7231(), zVar.E, zVar.D, zVar.f346061z.u());
        zVar.i();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
