package bp2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f104607c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f104608d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd f104610f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f104611g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f104614j;

    /* renamed from: a, reason: collision with root package name */
    public final int f104605a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.B).mo141623x754a37bb()).r()).intValue();

    /* renamed from: b, reason: collision with root package name */
    public final int f104606b = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.C).mo141623x754a37bb()).r()).intValue();

    /* renamed from: e, reason: collision with root package name */
    public final int[] f104609e = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f104612h = new android.view.GestureDetector(new bp2.k(this));

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f104613i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public static final boolean a(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        android.view.View view = mVar.f104608d;
        int width = view != null ? view.getWidth() : 0;
        android.view.View view2 = mVar.f104608d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        return rawX < ((float) width) - view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn) && rawX > 0.0f;
    }

    public static final boolean b(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        android.view.View view = mVar.f104608d;
        int width = view != null ? view.getWidth() : 0;
        android.view.View view2 = mVar.f104608d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        float f17 = width;
        return rawX > f17 - view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn) && rawX < f17;
    }

    public static final boolean c(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        if (motionEvent != null) {
            motionEvent.getRawX();
        }
        return (motionEvent != null ? motionEvent.getRawY() : 0.0f) < ((float) mVar.f104609e[1]);
    }

    public static final void d(bp2.m mVar) {
        r45.dd2 dd2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = mVar.f104610f;
        if (c14521x246f2bd == null) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = c14521x246f2bd.m7453x12a9d210();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7453x12a9d210);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) pf5.z.f435481a.b(m7453x12a9d210).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd P6 = c14513x218d4a07.P6();
        java.util.Iterator it = c14513x218d4a07.f203034o.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if ((P6 == null || (dd2Var = P6.f203052s) == null || dd2Var.m75939xb282bd08(0) != ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) it.next()).f203052s.m75939xb282bd08(0)) ? false : true) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.T6(c14513x218d4a07, i17 + 1, false, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp2.m.e():void");
    }

    public final void f(int i17, int i18, int i19) {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method declaredMethod = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredMethod("smoothScrollTo", cls, cls, cls);
            declaredMethod.setAccessible(true);
            android.view.View view = this.f104608d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
            declaredMethod.invoke((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) view, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePageScrollGuideHelper", "smoothScrollTo " + e17.getMessage());
        }
    }
}
