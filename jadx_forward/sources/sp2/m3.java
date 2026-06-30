package sp2;

/* loaded from: classes2.dex */
public final class m3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f492626d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f492627e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f492628f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f492629g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f492630h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f492631i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f492632m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f492633n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f492634o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f492626d = new java.util.HashSet();
        this.f492627e = jz5.h.b(sp2.j3.f492593d);
        this.f492628f = jz5.h.b(sp2.k3.f492599d);
        this.f492629g = jz5.h.b(sp2.l3.f492614d);
        this.f492630h = jz5.h.b(sp2.g3.f492574d);
        this.f492631i = jz5.h.b(new sp2.f3(this));
        this.f492634o = new java.util.ArrayList();
    }

    public final void O6() {
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        ws5.j[] jVarArr = ws5.j.f530751d;
        int intExtra = m158359x1e885992.getIntExtra("nearby_live_enter_source_params_key", 4);
        if (intExtra != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: only enter from find more page can show anim, enterSource=" + intExtra);
            return;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f492627e).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: switch is off");
            return;
        }
        if (m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: activity is finish");
            return;
        }
        if (P6().getParent() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: anim view has added");
            return;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T5).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: start, delayMs=" + intValue);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f492632m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f492632m = p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new sp2.i3(intValue, this, null), 3, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4) ((jz5.n) this.f492631i).mo141623x754a37bb();
    }

    public final android.graphics.Bitmap Q6(int i17, int i18) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f492634o;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap.getWidth() == i17 && bitmap.getHeight() == i18) {
                break;
            }
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
        if (bitmap2 != null) {
            return bitmap2;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveSquareFrameworkLoadingUIC", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveSquareFrameworkLoadingUIC", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        arrayList.add(createBitmap);
        return createBitmap;
    }

    public final int[] R6() {
        return (int[]) ((jz5.n) this.f492628f).mo141623x754a37bb();
    }

    public final void S6() {
        if (!this.f492633n || P6().getParent() == null) {
            return;
        }
        P6().invalidate();
    }

    public final void T6(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", "stopFrameworkAnim: source=" + source + ", isStartAnim=" + this.f492633n);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f492632m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f492632m = null;
        android.view.ViewParent parent = P6().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(P6());
        }
        P6().f203660r = false;
        this.f492633n = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy: bitmapPoolSize=");
        java.util.ArrayList arrayList = this.f492634o;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareFrameworkLoadingUIC", sb6.toString());
        arrayList.clear();
        T6("onDestroy");
    }
}
