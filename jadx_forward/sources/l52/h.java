package l52;

/* loaded from: classes4.dex */
public final class h implements n52.e {

    /* renamed from: a, reason: collision with root package name */
    public final n52.d f398152a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f398153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398154c;

    /* renamed from: d, reason: collision with root package name */
    public int f398155d;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Class f398159h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.reflect.Field f398160i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.reflect.Field f398161j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.reflect.Method f398162k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.reflect.Field f398163l;

    /* renamed from: e, reason: collision with root package name */
    public int f398156e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f398157f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f398158g = "";

    /* renamed from: m, reason: collision with root package name */
    public int f398164m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f398165n = 0;

    public h(n52.d dVar, java.lang.String str) {
        this.f398152a = dVar;
        this.f398153b = str;
        try {
            this.f398154c = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSpeedChecker", e17, "init crash: %s", e17.getMessage());
        }
        java.lang.String str2 = this.f398153b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "SnsTimelineUI")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "ChattingUIFragment");
            return;
        }
        try {
            this.f398159h = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class;
            java.lang.reflect.Field declaredField = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder.class.getDeclaredField("timeLineObject");
            this.f398160i = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field declaredField2 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.class.getDeclaredField("Id");
            this.f398161j = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSpeedChecker", e18, "initSns crash-1: %s", e18.getMessage());
        }
        try {
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.f38316x86e37e9a;
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.class.getDeclaredMethod("getTimeLine", new java.lang.Class[0]);
            this.f398162k = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            java.lang.reflect.Field declaredField3 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720.class.getDeclaredField("Id");
            this.f398163l = declaredField3;
            if (declaredField3 == null) {
                return;
            }
            declaredField3.setAccessible(true);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSpeedChecker", e19, "initSns crash-2: %s", e19.getMessage());
        }
    }

    @Override // n52.e
    public void a(android.view.View view, int i17) {
        n52.d dVar;
        if (view == null) {
            return;
        }
        this.f398155d = i17;
        if (i17 == 0 && (dVar = this.f398152a) != null) {
            dVar.a(view, i17, this.f398164m, this.f398165n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r5 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        if (r12.f398155d != 0) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    @Override // n52.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.h.b(android.view.View, int, int):void");
    }
}
