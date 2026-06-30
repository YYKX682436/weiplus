package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView */
/* loaded from: classes5.dex */
public class C10346x38eccc60 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f145320o = android.graphics.Color.argb(0, 0, 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f145321d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f145322e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.xj f145323f;

    /* renamed from: g, reason: collision with root package name */
    public int f145324g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f145325h;

    /* renamed from: i, reason: collision with root package name */
    public int f145326i;

    /* renamed from: m, reason: collision with root package name */
    public int f145327m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageButton f145328n;

    public C10346x38eccc60(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f145321d = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f145322e = paint;
        this.f145326i = -1;
        this.f145327m = -1;
        setOrientation(0);
        setDescendantFocusability(393216);
        this.f145323f = new com.p314xaae8f345.mm.ui.xj(this);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f145324g = (int) ((context.getResources().getDisplayMetrics().density * 66.0f) + 0.5f);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570135yc, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f145321d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p648x55baa833.ui.j4 j4Var = (com.p314xaae8f345.mm.p648x55baa833.ui.j4) it.next();
            android.graphics.Paint paint = this.f145322e;
            paint.setColor(j4Var.f145780b);
            canvas.drawRect(j4Var.f145779a, paint);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: getSelected */
    public boolean m43530xc2e03011() {
        return this.f145325h;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.f565037b16);
        this.f145328n = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.h4(this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        if (i28 == this.f145326i && i29 == this.f145327m) {
            return;
        }
        this.f145326i = i28;
        this.f145327m = i29;
        com.p314xaae8f345.mm.ui.xj xjVar = this.f145323f;
        java.util.ArrayList arrayList = xjVar.f294099a;
        if (arrayList != null) {
            arrayList.clear();
        }
        xjVar.f294100b = null;
        android.graphics.Rect rect = new android.graphics.Rect((i28 - this.f145328n.getWidth()) - this.f145324g, 0, i28, i29);
        this.f145323f.a(new com.p314xaae8f345.mm.ui.yj(rect, this.f145328n));
        this.f145321d.add(new com.p314xaae8f345.mm.p648x55baa833.ui.j4(rect, f145320o));
        setTouchDelegate(this.f145323f);
    }

    /* renamed from: setItemViewSelected */
    public void m43531x7183e395(boolean z17) {
        if (this.f145325h != z17) {
            this.f145325h = z17;
            this.f145328n.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f78834xa20f9397 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo);
        }
    }

    /* renamed from: setOnLargeTouchableAreasListener */
    public void m43532x38334e3b(com.p314xaae8f345.mm.p648x55baa833.ui.i4 i4Var) {
    }
}
