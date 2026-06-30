package wu3;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f531341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e) {
        super(2);
        this.f531341d = c17040x9d8b708e;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f531341d;
        if (intValue != c17040x9d8b708e.K.mo1894x7e414b06() && intValue != c17040x9d8b708e.L) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c17040x9d8b708e.f237507p.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int t17 = c1162x665295de.t();
            int x17 = c1162x665295de.x();
            if (info.f237251o == 2) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c17040x9d8b708e.f237507p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.h(c17040x9d8b708e, intValue, false, 2, null);
            } else {
                if (t17 <= intValue && intValue <= x17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.h(c17040x9d8b708e, intValue, false, 2, null);
                } else {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c17040x9d8b708e.f237507p;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1163xf1deaba42, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c1163xf1deaba42.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        if (intValue == c17040x9d8b708e.L) {
            c17040x9d8b708e.k();
        }
        return jz5.f0.f384359a;
    }
}
