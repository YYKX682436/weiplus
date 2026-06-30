package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class LargeTouchableAreasItemView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f63787o = android.graphics.Color.argb(0, 0, 0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f63788d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f63789e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.xj f63790f;

    /* renamed from: g, reason: collision with root package name */
    public int f63791g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63792h;

    /* renamed from: i, reason: collision with root package name */
    public int f63793i;

    /* renamed from: m, reason: collision with root package name */
    public int f63794m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageButton f63795n;

    public LargeTouchableAreasItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63788d = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f63789e = paint;
        this.f63793i = -1;
        this.f63794m = -1;
        setOrientation(0);
        setDescendantFocusability(393216);
        this.f63790f = new com.tencent.mm.ui.xj(this);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f63791g = (int) ((context.getResources().getDisplayMetrics().density * 66.0f) + 0.5f);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488602yc, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f63788d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.chatroom.ui.j4 j4Var = (com.tencent.mm.chatroom.ui.j4) it.next();
            android.graphics.Paint paint = this.f63789e;
            paint.setColor(j4Var.f64247b);
            canvas.drawRect(j4Var.f64246a, paint);
        }
        super.dispatchDraw(canvas);
    }

    public boolean getSelected() {
        return this.f63792h;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.f483504b16);
        this.f63795n = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.chatroom.ui.h4(this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        if (i28 == this.f63793i && i29 == this.f63794m) {
            return;
        }
        this.f63793i = i28;
        this.f63794m = i29;
        com.tencent.mm.ui.xj xjVar = this.f63790f;
        java.util.ArrayList arrayList = xjVar.f212566a;
        if (arrayList != null) {
            arrayList.clear();
        }
        xjVar.f212567b = null;
        android.graphics.Rect rect = new android.graphics.Rect((i28 - this.f63795n.getWidth()) - this.f63791g, 0, i28, i29);
        this.f63790f.a(new com.tencent.mm.ui.yj(rect, this.f63795n));
        this.f63788d.add(new com.tencent.mm.chatroom.ui.j4(rect, f63787o));
        setTouchDelegate(this.f63790f);
    }

    public void setItemViewSelected(boolean z17) {
        if (this.f63792h != z17) {
            this.f63792h = z17;
            this.f63795n.setImageResource(z17 ? com.tencent.mm.R.raw.checkbox_selected : com.tencent.mm.R.drawable.f481256oo);
        }
    }

    public void setOnLargeTouchableAreasListener(com.tencent.mm.chatroom.ui.i4 i4Var) {
    }
}
