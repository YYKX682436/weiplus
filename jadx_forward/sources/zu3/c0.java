package zu3;

/* loaded from: classes10.dex */
public final class c0 extends zu3.c {
    public final java.lang.String C;
    public final int D;
    public final android.graphics.Matrix E;
    public zu3.a0 F;

    public c0(android.content.Context context) {
        super(context);
        this.C = "MicroMsg.TipItemView";
        this.D = com.p314xaae8f345.mm.ui.zk.a(context, 32);
        this.E = new android.graphics.Matrix();
        m179521x3abfd950(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561878v6));
    }

    public final android.graphics.Bitmap c(zu3.a0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        m179517xcfebc441(zu3.e.f557332h);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17049x96919289 c17049x96919289 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17049x96919289(context);
        c17049x96919289.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingLeft(), getPaddingTop());
        c17049x96919289.setTextColor(item.f557298h);
        c17049x96919289.m68263x630fd73d(item.f557299i);
        c17049x96919289.setTextSize(0, m179504x40077844());
        c17049x96919289.setText(item.f557297g);
        c17049x96919289.setSingleLine(false);
        c17049x96919289.setTypeface(c17049x96919289.getTypeface(), 1);
        if (item.f557299i == 0 && item.f557298h != -16777216) {
            pm0.v.c(c17049x96919289);
        }
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402795c;
        int i17 = rect.left;
        int i18 = this.D;
        c17049x96919289.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
        c17049x96919289.measure(0, 0);
        int width = (c17049x96919289.getMeasuredWidth() <= 0 || c17049x96919289.getMeasuredWidth() > rect.width()) ? rect.width() : c17049x96919289.getMeasuredWidth();
        int height = (c17049x96919289.getMeasuredHeight() <= 0 || c17049x96919289.getMeasuredHeight() > rect.height()) ? rect.height() : c17049x96919289.getMeasuredHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, "measuredWidth:" + c17049x96919289.getMeasuredWidth() + " , measuredHeight:" + c17049x96919289.getMeasuredHeight());
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TipItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TipItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        c17049x96919289.draw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        c17049x96919289.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    @Override // zu3.c, zu3.n
    public zu3.a g() {
        zu3.a g17 = super.g();
        if (g17 != null) {
            g17.f557291a = zu3.e.f557332h;
        }
        return g17;
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        android.graphics.Matrix matrix;
        zu3.a0 a0Var = this.F;
        if (a0Var != null && (matrix = a0Var.f557296f) != null) {
            matrix.set(m179509xbfb64d6f().f106450g);
        }
        zu3.a0 a0Var2 = this.F;
        if (a0Var2 != null) {
            a0Var2.f557291a = zu3.e.f557332h;
        }
        return this.F;
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305699e;
    }

    @Override // zu3.c, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.graphics.Matrix matrix = this.E;
        matrix.set(m179509xbfb64d6f().f106450g);
        boolean onTouchEvent = super.onTouchEvent(event);
        m179509xbfb64d6f().f106450g.set(matrix);
        return onTouchEvent;
    }

    /* renamed from: setText */
    public final void m179526x765074af(zu3.a0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.F = item;
        m179519x765074af(item.f557297g);
        android.graphics.Bitmap c17 = c(item);
        m179517xcfebc441(zu3.e.f557332h);
        m179513x52d2f021(item.f557298h);
        m179520x24060d54(item.f557299i);
        int i17 = item.f557300j;
        if (i17 != 0) {
            i17 += com.p314xaae8f345.mm.ui.zk.a(getContext(), 24);
        }
        m179516x85ff1efb(i17);
        m179512x5854831(c17);
        if (m179493x12501425() != null) {
            float height = (((m179510xbd40714a().height() - com.p314xaae8f345.mm.ui.zk.a(getContext(), 128)) - com.p314xaae8f345.mm.ui.bl.c(getContext())) - m179498x4fb623ef()) - r4.getHeight();
            lt3.n nVar = lt3.n.f402793a;
            int i18 = lt3.n.f402795c.left;
            int i19 = this.D;
            m179509xbfb64d6f().f106450g.setTranslate(i19 >= i18 ? i19 : i18, height);
        }
        postInvalidate();
    }
}
