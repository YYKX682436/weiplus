package wu3;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 f531309d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396) {
        this.f531309d = c17039xf3cc6396;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396 = this.f531309d;
        su3.m mVar = c17039xf3cc6396.f237497u;
        if (mVar != null) {
            int i17 = c17039xf3cc6396.f237500x;
            if (i17 == -1 || i17 >= mVar.mo1894x7e414b06()) {
                c17039xf3cc6396.getCallback();
                c17039xf3cc6396.f();
                wt3.u uVar = wt3.v.f531037h;
                wt3.v.f531039j.f143085e = 1L;
                uVar.a();
            } else {
                wu3.i callback = c17039xf3cc6396.getCallback();
                if (callback != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x17 = mVar.x(c17039xf3cc6396.f237500x);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.d) callback;
                    if (x17 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        x17.f237251o = 1;
                        x17.f237252p = 4;
                        arrayList2.add(x17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = dVar.f237656a;
                        su3.m mVar2 = c17040x9d8b708e.K;
                        mVar2.getClass();
                        mVar2.f494326d.addAll(0, arrayList2);
                        mVar2.m8146xced61ae5();
                        if (c17040x9d8b708e.W) {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c17040x9d8b708e.f237507p;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c1163xf1deaba4.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c17040x9d8b708e.g(0, false);
                        } else {
                            c17040x9d8b708e.K.z(0);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c17040x9d8b708e.f237507p;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(c1163xf1deaba42, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c1163xf1deaba42.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                        c17040x9d8b708e.j(false);
                        c17040x9d8b708e.m68174x710f87ad(true);
                        c17040x9d8b708e.l(true);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a callback2 = c17040x9d8b708e.getCallback();
                        if (callback2 != null) {
                            callback2.b(x17);
                        }
                    }
                }
                c17039xf3cc6396.f();
                wt3.u uVar2 = wt3.v.f531037h;
                wt3.v.f531039j.f143085e = 0L;
                uVar2.a();
            }
            c17039xf3cc6396.g();
        }
        android.widget.EditText editText = c17039xf3cc6396.f237490n;
        if (editText != null) {
            editText.clearFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
