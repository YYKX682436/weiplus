package ia2;

/* loaded from: classes2.dex */
public final class b extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f371433b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f371434c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f371435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371436e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f371436e = activityC13656x51707ca3;
        this.f371433b = context;
        this.f371435d = new java.lang.ref.WeakReference(activityC13656x51707ca3);
    }

    @Override // hx2.i
    public android.view.View a() {
        if (this.f371434c == null) {
            android.view.View view = new android.view.View(this.f371433b);
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f371436e.D) {
                view.setOnClickListener(new ia2.a(this));
            }
            this.f371434c = view;
        }
        return this.f371434c;
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        yz5.p pVar;
        gx2.q qVar;
        android.view.View m132454xe6eebdcb;
        gx2.q qVar2;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        java.lang.ref.WeakReference weakReference = this.f371435d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference.get();
        int i17 = 0;
        float f18 = 0.0f;
        if (!(activityC13656x51707ca3 != null && activityC13656x51707ca3.L)) {
            android.view.View view2 = this.f371434c;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float m62616x9c78005c = layout.m62616x9c78005c();
            float m62620x5b051b9d = layout.m62623x5e903915() ? layout.m62620x5b051b9d() : layout.m62615x4ea7bf6();
            float f19 = (m62620x5b051b9d - f17) / (m62620x5b051b9d - m62616x9c78005c);
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (0.0f >= f19) {
                f19 = 0.0f;
            }
            if ((f19 == 0.0f) && (view = this.f371434c) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference.get();
        if (activityC13656x51707ca32 == null || (pVar = activityC13656x51707ca32.P) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference.get();
        if (activityC13656x51707ca33 != null && (qVar2 = activityC13656x51707ca33.f183309J) != null) {
            f18 = qVar2.getF213467f();
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference.get();
        if (activityC13656x51707ca34 != null && (qVar = activityC13656x51707ca34.f183309J) != null && (m132454xe6eebdcb = qVar.m132454xe6eebdcb()) != null) {
            i17 = m132454xe6eebdcb.getHeight();
        }
        pVar.mo149xb9724478(valueOf, java.lang.Float.valueOf(i17 - f17));
    }
}
