package xs2;

/* loaded from: classes3.dex */
public final class m0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f537885d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f537886e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f537887f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f537888g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 f537889h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f537890i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f537891j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f537892k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f537885d = itemView;
        this.f537886e = jz5.h.b(xs2.k0.f537878d);
        this.f537887f = jz5.h.b(new xs2.l0(this));
        this.f537888g = jz5.h.b(new xs2.j0(this));
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.i8m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f537889h = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699) findViewById;
        this.f537890i = itemView.findViewById(com.p314xaae8f345.mm.R.id.ltj);
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.qcw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f537891j = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.c7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f537892k = findViewById3;
    }

    private final android.view.View c(android.view.View view, float f17, float f18) {
        boolean z17;
        android.graphics.RectF rectF = new android.graphics.RectF();
        java.util.ArrayList<android.view.View> touchables = view.getTouchables();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(touchables, "getTouchables(...)");
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = touchables.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((android.view.View) next).getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        android.view.View view2 = null;
        for (android.view.View view3 : arrayList) {
            float x17 = view3.getX();
            float y17 = view3.getY();
            rectF.set(x17, y17, view3.getMeasuredWidth() + x17, view3.getMeasuredWidth() + y17);
            if (rectF.contains(f17, f18)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view3, view)) {
                    z17 = true;
                } else {
                    if (!(view3 instanceof android.view.ViewGroup)) {
                        return view3;
                    }
                    view2 = c(view, f17 - x17, f18 - f17);
                }
            }
        }
        return (z17 && view2 == null) ? view : view2;
    }

    public static final void h(xs2.m0 m0Var, boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa699 = m0Var.f537889h;
            c15217xc42aa699.setTextColor(c15217xc42aa699.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            m0Var.f537891j.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a1x);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa6992 = m0Var.f537889h;
            c15217xc42aa6992.setTextColor(c15217xc42aa6992.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            m0Var.f537891j.setBackground(null);
        }
    }

    @Override // yp.o
    public android.view.View d(zp.m touchPoint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchPoint, "touchPoint");
        android.view.View mItemView = this.f545927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mItemView, "mItemView");
        android.graphics.Point point = touchPoint.f556456b;
        return c(mItemView, point.x - touchPoint.f556458d, point.y - touchPoint.f556459e);
    }

    @Override // yp.o
    public void e(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        jz5.g gVar = this.f537888g;
        if (mode != Integer.MIN_VALUE) {
            super.e(i17, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
            return;
        }
        int intValue = ((java.lang.Number) ((jz5.n) this.f537887f).mo141623x754a37bb()).intValue();
        if (i17 < intValue) {
            i17 = intValue;
        }
        super.e(i17, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
    }

    public void g(xs2.q config) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewDanmakuRender", "debug setBackground config:" + config);
        }
        boolean z17 = config.f537898a;
        if (!config.f537899b) {
            h(this, z17);
            return;
        }
        java.lang.Object obj = config.f537900c;
        dk2.zf zfVar = obj instanceof dk2.zf ? (dk2.zf) obj : null;
        if (zfVar == null) {
            if ((obj instanceof lm2.c ? (lm2.c) obj : null) != null) {
                h(this, z17);
                return;
            }
            return;
        }
        r45.yl1 b17 = mm2.j2.F.b(zfVar);
        boolean z18 = false;
        java.lang.Integer valueOf = b17 != null ? java.lang.Integer.valueOf(b17.m75939xb282bd08(0)) : null;
        if (valueOf == null || valueOf.intValue() != 2) {
            if (valueOf != null && valueOf.intValue() == 4) {
                h(this, z17);
                return;
            }
            return;
        }
        int m75939xb282bd08 = b17.m75939xb282bd08(2);
        android.view.View view = this.f537891j;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa699 = this.f537889h;
        if (!z17) {
            c15217xc42aa699.setTextColor(c15217xc42aa699.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            view.setBackground(hk2.b.f363412a.a(m75939xb282bd08));
            return;
        }
        c15217xc42aa699.setTextColor(c15217xc42aa699.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        hk2.b bVar = hk2.b.f363412a;
        if (40 <= m75939xb282bd08 && m75939xb282bd08 < 50) {
            i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563244a21;
        } else {
            if (50 <= m75939xb282bd08 && m75939xb282bd08 < 60) {
                i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563246a23;
            } else {
                if (60 <= m75939xb282bd08 && m75939xb282bd08 < 70) {
                    i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563248a25;
                } else {
                    if (70 <= m75939xb282bd08 && m75939xb282bd08 < 80) {
                        i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a27;
                    } else {
                        if (80 <= m75939xb282bd08 && m75939xb282bd08 < 90) {
                            i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a29;
                        } else {
                            if (90 <= m75939xb282bd08 && m75939xb282bd08 < 100) {
                                z18 = true;
                            }
                            i17 = z18 ? com.p314xaae8f345.mm.R.C30861xcebc809e.a2a : com.p314xaae8f345.mm.R.C30861xcebc809e.a1z;
                        }
                    }
                }
            }
        }
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(i17, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        view.setBackground(drawable);
    }
}
