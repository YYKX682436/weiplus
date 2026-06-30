package sm3;

/* loaded from: classes10.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public int f491355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f491356e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f491357f;

    /* renamed from: g, reason: collision with root package name */
    public final int f491358g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f491359h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.BitmapDrawable f491360i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f491361m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PorterDuffColorFilter f491362n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.PorterDuffColorFilter f491363o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f491364p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f491365q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f491366r;

    public a0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int b17 = i65.a.b(context, 22);
        this.f491356e = b17;
        this.f491357f = new java.util.ArrayList();
        this.f491358g = i65.a.b(context, 16);
        int b18 = i65.a.b(context, 3);
        this.f491359h = new android.graphics.Rect();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d0(com.p314xaae8f345.mm.R.raw.f79938xd354a754, context.getResources().getDisplayMetrics().density));
        this.f491360i = bitmapDrawable;
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.asg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m9707x4a96be14);
        this.f491361m = m9707x4a96be14;
        this.f491362n = new android.graphics.PorterDuffColorFilter(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f491363o = new android.graphics.PorterDuffColorFilter(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f491364p = new java.util.LinkedList();
        this.f491365q = true;
        this.f491366r = true;
        m9707x4a96be14.setBounds(0, 0, b17, b17);
        int i17 = b17 - b18;
        bitmapDrawable.setBounds(b18, b18, i17, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7903x73cebf37(canvas, parent, state);
        if (this.f491365q && (!fm3.b.f345560f.isEmpty())) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.widget.MvTracksAdapter");
            int size = ((sm3.o) mo7946xf939df19).f491430e.mo67409x317d5b7e().size();
            this.f491355d = 0;
            int childCount = parent.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = parent.getChildAt(i17);
                int u07 = parent.u0(childAt) - 1;
                android.graphics.Rect rect = this.f491359h;
                parent.y0(childAt, rect);
                if (!this.f491366r && u07 == size - 1) {
                    return;
                }
                if (u07 >= 0 && u07 < size) {
                    int top = childAt.getTop() + childAt.getBottom();
                    int i18 = this.f491356e;
                    float right = (rect.right + childAt.getRight()) / 2;
                    float f17 = i18;
                    float f18 = right - (f17 / 2.0f);
                    float f19 = f17 + f18;
                    canvas.save();
                    canvas.translate(f18, (top - i18) / 2.0f);
                    this.f491361m.draw(canvas);
                    boolean contains = this.f491364p.contains(java.lang.Integer.valueOf(u07));
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f491360i;
                    bitmapDrawable.setColorFilter(contains ? this.f491362n : this.f491363o);
                    bitmapDrawable.draw(canvas);
                    canvas.restore();
                    int i19 = this.f491355d;
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f491357f;
                    int size2 = arrayList.size();
                    int i27 = this.f491358g;
                    if (i19 < size2) {
                        sm3.z zVar = (sm3.z) arrayList.get(this.f491355d);
                        float f27 = i27;
                        zVar.f491452a = u07;
                        zVar.f491453b = f18 - f27;
                        zVar.f491454c = f19 + f27;
                    } else {
                        float f28 = i27;
                        arrayList.add(new sm3.z(this, u07, f18 - f28, f19 + f28));
                    }
                    this.f491355d++;
                }
            }
        }
    }
}
