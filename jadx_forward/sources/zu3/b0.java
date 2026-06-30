package zu3;

/* loaded from: classes10.dex */
public final class b0 extends zu3.c {
    public final java.lang.String C;
    public zu3.a0 D;
    public java.lang.String E;

    public b0(android.content.Context context) {
        super(context);
        this.C = "MicroMsg.TextItemView";
        m179521x3abfd950(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561874v2));
        this.E = "";
    }

    public final android.graphics.Bitmap c(zu3.a0 item) {
        android.graphics.Bitmap createBitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        m179517xcfebc441(zu3.e.f557329e);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17049x96919289 c17049x96919289 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17049x96919289(context);
        int b17 = i65.a.b(getContext(), 16);
        int b18 = i65.a.b(getContext(), 8);
        c17049x96919289.setPadding(b17, b18, b17, b18);
        c17049x96919289.setTextColor(item.f557298h);
        c17049x96919289.m68263x630fd73d(item.f557299i);
        c17049x96919289.setTextSize(0, m179504x40077844());
        c17049x96919289.setText(java.lang.String.valueOf(item.f557297g));
        c17049x96919289.setSingleLine(false);
        if (!(item.f557301k.length() > 0)) {
            c17049x96919289.setTypeface(c17049x96919289.getTypeface(), 1);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(item.f557301k)) {
            c17049x96919289.setTypeface(android.graphics.Typeface.createFromFile(item.f557301k));
        } else {
            c17049x96919289.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        if (item.f557299i == 0 && item.f557298h != -16777216) {
            pm0.v.c(c17049x96919289);
        }
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402795c;
        int width = rect.width();
        if (width > 0) {
            c17049x96919289.setMaxWidth(width);
        }
        c17049x96919289.measure(0, 0);
        int width2 = (c17049x96919289.getMeasuredWidth() <= 0 || c17049x96919289.getMeasuredWidth() > rect.width()) ? rect.width() : c17049x96919289.getMeasuredWidth();
        int height = (c17049x96919289.getMeasuredHeight() <= 0 || c17049x96919289.getMeasuredHeight() > rect.height()) ? rect.height() : c17049x96919289.getMeasuredHeight();
        if (width2 <= 0 || height <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.C, "create bitmap size error: " + width2 + ", " + height);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        } else {
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(height));
            arrayList2.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/TextItemView", "createBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/TextItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        c17049x96919289.draw(canvas);
        canvas.save();
        canvas.translate(b17, b18);
        c17049x96919289.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    public final av3.c d(zu3.a0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        av3.c cVar = new av3.c(c(item), item.f557296f);
        r45.bi0 bi0Var = new r45.bi0();
        bv3.d dVar = item.f557293c;
        bi0Var.f452305d = dVar.c();
        bi0Var.f452306e = dVar.b();
        cVar.f95746c = bi0Var;
        return cVar;
    }

    public final void f(float f17, float f18) {
        if (f17 == 0.0f) {
            return;
        }
        if (f18 == 0.0f) {
            return;
        }
        m179509xbfb64d6f().f106450g.setScale(f17, f18);
    }

    @Override // zu3.c, zu3.n
    public zu3.a g() {
        zu3.a g17 = super.g();
        zu3.a0 a0Var = this.D;
        if (a0Var != null) {
            if (g17 != null) {
                bv3.d range = a0Var.f557293c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
                g17.f557293c.d(range.c(), range.b());
            }
            if (g17 != null) {
                g17.f557294d = a0Var.f557294d;
            }
            if (g17 instanceof zu3.a0) {
                zu3.a0 a0Var2 = (zu3.a0) g17;
                java.lang.String str = this.E;
                a0Var2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                a0Var2.f557301k = str;
            }
        }
        return g17;
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.D;
    }

    /* renamed from: getFont */
    public final java.lang.String m179490xfb7f74c5() {
        return this.E;
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305698d;
    }

    public final void k(zu3.a0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        m179492x765074af(item);
        m179525xa21f74c8(item.f557296f);
        m179509xbfb64d6f().f106450g.set(item.f557296f);
        m179517xcfebc441(zu3.e.f557329e);
    }

    /* renamed from: setFont */
    public final void m179491x764a3bd1(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.E = str;
    }

    /* renamed from: setText */
    public final void m179492x765074af(zu3.a0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.D = item;
        android.graphics.Bitmap c17 = c(item);
        m179519x765074af(item.f557297g);
        m179517xcfebc441(zu3.e.f557329e);
        m179513x52d2f021(item.f557298h);
        m179520x24060d54(item.f557299i);
        this.E = item.f557301k;
        if (m179493x12501425() == null) {
            m179509xbfb64d6f().f106450g.postTranslate((-getWidth()) / 2.0f, -((((m179495x4003fc90().top + m179495x4003fc90().bottom) / 2) - ((m179510xbd40714a().top + m179510xbd40714a().bottom) / 2.0f)) + (getHeight() / 2.0f)));
        }
        if (m179493x12501425() != null) {
            m179509xbfb64d6f().f106450g.preTranslate(r7.getWidth() / 2.0f, r7.getHeight() / 2.0f);
        }
        m179512x5854831(c17);
        postInvalidate();
    }
}
