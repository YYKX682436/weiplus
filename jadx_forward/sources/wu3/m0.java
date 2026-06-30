package wu3;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f531310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f531311e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e, java.util.LinkedList linkedList) {
        this.f531310d = c17040x9d8b708e;
        this.f531311e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f531310d;
        c17040x9d8b708e.getClass();
        java.util.LinkedList audioList = this.f531311e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        java.util.ArrayList arrayList = new java.util.ArrayList(c17040x9d8b708e.Q);
        int i17 = 0;
        for (java.lang.Object obj : audioList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.c((r45.mh4) obj, 1);
            c17.f237252p = 3;
            c17.f237259w = i17;
            c17.f237260x = c17040x9d8b708e.m68181xbbb8ac5b();
            arrayList.add(c17);
            i17 = i18;
        }
        c17040x9d8b708e.K.B(arrayList);
        if (!c17040x9d8b708e.f237508p0 || arrayList.size() <= 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c17040x9d8b708e.f237507p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        c17040x9d8b708e.g(0, false);
    }
}
