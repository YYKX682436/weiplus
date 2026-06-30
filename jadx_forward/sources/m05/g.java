package m05;

/* loaded from: classes2.dex */
public final class g implements com.p314xaae8f345.mm.ui.wc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f404095a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f404096b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f404097c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f404098d;

    public g(java.lang.String viewId, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        this.f404095a = viewId;
        this.f404096b = targetView;
        this.f404097c = new java.util.ArrayList(4);
        this.f404098d = new android.graphics.Rect();
    }

    @Override // com.p314xaae8f345.mm.ui.wc
    public void a(android.view.MotionEvent motionEvent) {
        java.lang.String str;
        java.lang.String str2;
        if (motionEvent == null) {
            return;
        }
        if (motionEvent.getAction() == 1) {
            android.view.View view = this.f404096b;
            android.graphics.Rect rect = this.f404098d;
            view.getGlobalVisibleRect(rect);
            if (view.isShown() && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                java.util.ArrayList arrayList = this.f404097c;
                arrayList.add(java.lang.Long.valueOf(motionEvent.getEventTime()));
                while (arrayList.size() > 3) {
                    arrayList.remove(0);
                }
                if (arrayList.size() == 3) {
                    long longValue = ((java.lang.Number) arrayList.get(2)).longValue();
                    java.lang.Object obj = arrayList.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    long longValue2 = longValue - ((java.lang.Number) obj).longValue();
                    if (longValue2 <= 1000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "hit max threshold: " + longValue2 + ", " + arrayList);
                        if (!view.isEnabled()) {
                            str = "1";
                            str2 = "view is not enabled";
                        } else if (!view.isClickable()) {
                            str = "2";
                            str2 = "view is not clickable";
                        } else if (view.hasOnClickListeners()) {
                            str = "9999";
                            str2 = "common reason";
                        } else {
                            str = "3";
                            str2 = "view has not click listener";
                        }
                        java.lang.String str3 = str;
                        java.lang.String str4 = str2;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("btn no response: ");
                        java.lang.String viewId = this.f404095a;
                        sb6.append(viewId);
                        sb6.append(", ");
                        sb6.append(str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayReport|WcPayBtnDisabledReport", sb6.toString());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "3", viewId, str3, str4, "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) <= 1.0f ? 0 : 1));
                        arrayList.clear();
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.wc
    public java.lang.String key() {
        return this.f404095a;
    }
}
