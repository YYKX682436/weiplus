package xu3;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.C17056x180924d5 f538794d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.C17056x180924d5 c17056x180924d5) {
        this.f538794d = c17056x180924d5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu3.q callback = this.f538794d.getCallback();
        if (callback != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.e) callback).a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
