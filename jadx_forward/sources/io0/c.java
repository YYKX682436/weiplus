package io0;

/* loaded from: classes3.dex */
public final class c extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final io0.b f374979b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f374980c;

    public c(io0.b adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f374979b = adapter;
        this.f374980c = new java.util.ArrayList();
        new android.graphics.Rect();
    }

    @Override // hn5.c
    public int a() {
        return this.f374980c.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f374980c.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (jo0.a) obj;
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        jo0.a data = (jo0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String sdkUserId = ((jo0.a) this.f374980c.get(i17)).f382403a;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327) this.f374979b;
        c10844x4ce18327.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        io0.a aVar = c10844x4ce18327.f150110p;
        android.view.View a17 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar != null ? aVar.mo56927xa888f8a8() : null, sdkUserId) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sdkUserId, "DEFAULT_ANCHOR_USER_ID")) ? c10844x4ce18327.f150109o : c10844x4ce18327.a(sdkUserId, 0);
        if (data.f382405c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            android.view.View view = a17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = a17;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return a17;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((jo0.a) this.f374980c.get(i17)).f382404b;
    }
}
