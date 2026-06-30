package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f237655d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        this.f237655d = c17040x9d8b708e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.ImageView m68167x11171de8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f237655d;
        c17040x9d8b708e.f237509p1 = c17040x9d8b708e.mo68188x7857c7a5();
        dw3.e eVar = c17040x9d8b708e.I;
        if (eVar.f325734b) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eVar.f325733a).mo141623x754a37bb()).G("enter_select_finder_video_panel", true);
        }
        m68167x11171de8 = c17040x9d8b708e.m68167x11171de8();
        m68167x11171de8.setVisibility(8);
        c17040x9d8b708e.K.z(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.f(c17040x9d8b708e, true);
        c17040x9d8b708e.m68174x710f87ad(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a callback = c17040x9d8b708e.getCallback();
        if (callback != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            c16997xb0aa383a.f237251o = 2;
            callback.m(c16997xb0aa383a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
