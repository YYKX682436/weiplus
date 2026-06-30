package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomDatePickerNew */
/* loaded from: classes15.dex */
public class C22705x7e16f613 extends android.widget.FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f293724y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f293725d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f293726e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f293727f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f293728g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f293729h;

    /* renamed from: i, reason: collision with root package name */
    public int f293730i;

    /* renamed from: m, reason: collision with root package name */
    public int f293731m;

    /* renamed from: n, reason: collision with root package name */
    public int f293732n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f293733o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f293734p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f293735q;

    /* renamed from: r, reason: collision with root package name */
    public int f293736r;

    /* renamed from: s, reason: collision with root package name */
    public int f293737s;

    /* renamed from: t, reason: collision with root package name */
    public int f293738t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f293739u;

    /* renamed from: v, reason: collision with root package name */
    public int f293740v;

    /* renamed from: w, reason: collision with root package name */
    public v51.e f293741w;

    /* renamed from: x, reason: collision with root package name */
    public v51.f f293742x;

    public C22705x7e16f613(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve));
        this.f293725d = null;
        this.f293733o = true;
        this.f293734p = true;
        this.f293735q = true;
        this.f293739u = false;
        this.f293740v = -1;
        this.f293727f = context;
        this.f293726e = new w51.g(context);
    }

    public void a() {
        if (this.f293739u) {
            this.f293736r++;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(this.f293736r, this.f293737s - 1, this.f293738t);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        if (this.f293728g == null) {
            this.f293728g = new java.util.Date(calendar.getTimeInMillis());
        }
        calendar2.setTime(this.f293728g);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        if (this.f293729h == null) {
            java.util.Calendar calendar4 = java.util.Calendar.getInstance();
            calendar4.set(this.f293736r + 100, this.f293737s - 1, this.f293738t);
            this.f293729h = new java.util.Date(calendar4.getTimeInMillis());
        }
        calendar3.setTime(this.f293729h);
        boolean z17 = this.f293739u;
        w51.g gVar = this.f293726e;
        gVar.f524511s = z17;
        w51.n nVar = gVar.f524508p;
        if (nVar != null) {
            nVar.f524544w = z17;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c cVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c(this);
        android.content.Context context = this.f293727f;
        t51.b bVar = new t51.b(context, cVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.b bVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.b(this);
        u51.a aVar = bVar.f497241a;
        aVar.f506315c = bVar2;
        aVar.f506318f = false;
        aVar.f506319g = new boolean[]{this.f293735q, this.f293734p, this.f293733o, false, false, false};
        aVar.f506320h = calendar;
        bVar.b(calendar2, calendar3);
        aVar.f506327o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        bVar.a(gVar);
        gVar.g(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc));
        context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        w51.n nVar2 = gVar.f524508p;
        nVar2.getClass();
        boolean z18 = this.f293739u;
        int i17 = this.f293740v;
        if (nVar2 != null) {
            nVar2.g(z18, i17);
        }
        nVar2.f(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        gVar.h(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        java.util.Iterator it = ((java.util.ArrayList) gVar.e()).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) it.next();
            if (this.f293739u && this.f293736r == 2 && i18 > 0) {
                c11323x28056480.e(0);
                c11323x28056480.f153912d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                c11323x28056480.invalidate();
                c11323x28056480.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            } else {
                c11323x28056480.e(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
                c11323x28056480.f153912d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                c11323x28056480.invalidate();
                c11323x28056480.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            }
            i18++;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.e();
        if (arrayList.size() == 1) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            return;
        }
        if (arrayList.size() == 2) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else if (arrayList.size() == 3) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) arrayList.get(2)).setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
    }

    /* renamed from: getDayOfMonth */
    public int m82055xa7d8f7a3() {
        w51.g gVar = this.f293726e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f293732n;
    }

    /* renamed from: getMonth */
    public int m82056x74d1c8ca() {
        w51.g gVar = this.f293726e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f293731m;
    }

    /* renamed from: getView */
    public android.view.View m82057xfb86a31b() {
        if (this.f293725d == null) {
            this.f293725d = this.f293726e.d();
        }
        return this.f293725d;
    }

    /* renamed from: getYear */
    public int m82058xfb87f0b3() {
        w51.g gVar = this.f293726e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f293730i;
    }

    /* renamed from: setLongTermYear */
    public void m82059xc1d8a6e7(boolean z17) {
        this.f293739u = z17;
    }

    /* renamed from: setMaxDate */
    public void m82060xe3874070(java.lang.Long l17) {
        this.f293729h = new java.util.Date(l17.longValue());
    }

    /* renamed from: setMinDate */
    public void m82061xf0a11a5e(java.lang.Long l17) {
        this.f293728g = new java.util.Date(l17.longValue());
    }

    /* renamed from: setOnTimeSelectListener */
    public void m82062x57fdf1be(v51.f fVar) {
        this.f293742x = fVar;
    }

    /* renamed from: setTimeSelectChangeListener */
    public void m82063xb2c39d8f(v51.e eVar) {
        this.f293741w = eVar;
    }

    public C22705x7e16f613(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576289ve), attributeSet);
        this.f293725d = null;
        this.f293733o = true;
        this.f293734p = true;
        this.f293735q = true;
        this.f293739u = false;
        this.f293740v = -1;
        this.f293727f = context;
        this.f293726e = new w51.g(context);
    }

    public C22705x7e16f613(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293725d = null;
        this.f293733o = true;
        this.f293734p = true;
        this.f293735q = true;
        this.f293739u = false;
        this.f293740v = -1;
        this.f293727f = context;
        this.f293726e = new w51.g(context);
    }
}
