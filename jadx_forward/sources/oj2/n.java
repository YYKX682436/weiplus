package oj2;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.o f427311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(oj2.o oVar) {
        super(0);
        this.f427311d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView m151576xc1e76b5b;
        oj2.o oVar = this.f427311d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.m145853xb5886c64(), "showContent bindMicUser:" + oVar.m145849x949ba2a5() + " isAnchor:" + zl2.r4.f555483a.w1() + " bindMicUserIsSelf:" + oVar.G());
        km2.q m145849x949ba2a5 = oVar.m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            oVar.u(oVar.m151585xffe777c6());
            android.view.View m151578x15c24b39 = oVar.m151578x15c24b39();
            km2.q qVar = oVar.f400408f;
            if (qVar != null && m151578x15c24b39 != null) {
                ya2.g gVar = ya2.h.f542017a;
                java.lang.String str = qVar.f390705c;
                if (!(str != null ? r26.i0.n(str, "@finder", false) : false) || qVar.f390710h) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m151578x15c24b39, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m151578x15c24b39.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m151578x15c24b39, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m151578x15c24b39, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m151578x15c24b39.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(m151578x15c24b39, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicBaseWidget", "showFinderLogoIfNeeded", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            oVar.f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
            m151576xc1e76b5b = oVar.m151576xc1e76b5b();
            oVar.s(m151576xc1e76b5b);
            android.widget.TextView m151580xeb5fda54 = oVar.m151580xeb5fda54();
            if (m151580xeb5fda54 != null) {
                oVar.S(m151580xeb5fda54);
                if (oVar.A()) {
                    oVar.m174012xaf0594a2(m151580xeb5fda54);
                    m151580xeb5fda54.setOnClickListener(oVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
