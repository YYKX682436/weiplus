package xu3;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.C17056x180924d5 f538795d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.C17056x180924d5 c17056x180924d5) {
        this.f538795d = c17056x180924d5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.C17056x180924d5 c17056x180924d5 = this.f538795d;
        xu3.q callback = c17056x180924d5.getCallback();
        if (callback != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = c17056x180924d5.f237652o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.e) callback;
            if (c16997xb0aa383a != null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.f237503x1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                c16997xb0aa383a.f237251o = 1;
                arrayList2.add(c16997xb0aa383a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = eVar.f237657a;
                su3.m mVar = c17040x9d8b708e.K;
                mVar.getClass();
                mVar.f494326d.addAll(0, arrayList2);
                mVar.m8146xced61ae5();
                if (c17040x9d8b708e.W) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c17040x9d8b708e.f237507p;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c1163xf1deaba4.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c17040x9d8b708e.g(0, false);
                } else {
                    c17040x9d8b708e.K.z(0);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c17040x9d8b708e.f237507p;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(c1163xf1deaba42, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c1163xf1deaba42.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                c17040x9d8b708e.m68174x710f87ad(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.f(c17040x9d8b708e, false);
                c17040x9d8b708e.l(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a callback2 = c17040x9d8b708e.getCallback();
                if (callback2 != null) {
                    callback2.b(c16997xb0aa383a);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
