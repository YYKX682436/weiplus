package qk2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk2.f f445959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qk2.f fVar) {
        super(1);
        this.f445959d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        java.util.List g17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        qk2.f fVar = this.f445959d;
        yz5.p pVar = fVar.f445964e;
        if (pVar != null) {
            qk2.f fVar2 = fVar.f445963d;
            if (fVar2 == null || (g17 = fVar2.g()) == null || g17.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it6 = g17.iterator();
                i17 = 0;
                while (it6.hasNext()) {
                    if (((qk2.f) it6.next()).c() && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            pVar.mo149xb9724478(it, java.lang.Boolean.valueOf(i17 > 1));
        } else if (it.f186860a) {
            android.view.View view = fVar.f445965f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = fVar.f445965f;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
