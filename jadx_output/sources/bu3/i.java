package bu3;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin f24606d;

    public i(com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin) {
        this.f24606d = photoDoodlePlugin;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0 mStatus = this.f24606d.getMStatus();
        if (mStatus != null) {
            ju3.d0.k(mStatus, ju3.c0.Q1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
