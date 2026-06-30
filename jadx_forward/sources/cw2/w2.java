package cw2;

/* loaded from: classes2.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f305609a;

    /* renamed from: b, reason: collision with root package name */
    public az2.f f305610b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f305611c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.j0 f305612d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f305613e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f305614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305615g;

    public w2(android.content.Context context) {
        this.f305609a = context;
    }

    public final void a() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        az2.f fVar = this.f305610b;
        if (fVar != null) {
            fVar.b();
        }
        this.f305610b = null;
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f305611c;
        if (k0Var != null && (j0Var = this.f305612d) != null) {
            j0Var.mo522xb5bdeb7a(k0Var);
        }
        this.f305612d = null;
        this.f305611c = null;
        wu5.c cVar = this.f305613e;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f305613e = null;
        this.f305614f = false;
    }

    public final void b(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        if (view == null) {
            return;
        }
        java.lang.Long valueOf = (c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null) ? null : java.lang.Long.valueOf(m76806xdef68064.m75942xfb822ef2(30));
        if ((valueOf == null || (valueOf.longValue() & 65536) == 0) ? false : true) {
            if (c14994x9b99c079 != null && c14994x9b99c079.m59314x4d5c4d55()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo", "updateButtonVisibility", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
