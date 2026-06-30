package zu3;

/* loaded from: classes10.dex */
public final class z extends zu3.c {
    public final java.lang.String C;
    public final int D;
    public final int E;
    public final int F;
    public final android.graphics.Matrix G;
    public zu3.s H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.C = "MicroMsg.PositionItemView";
        this.D = -1;
        this.E = -1;
        this.F = com.p314xaae8f345.mm.ui.zk.a(context, 32);
        this.G = new android.graphics.Matrix();
    }

    public final android.graphics.Bitmap c(zu3.s sVar) {
        this.H = sVar;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwe, (android.view.ViewGroup) relativeLayout, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bws);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kys);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.npg);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nph);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        pm0.v.c(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        pm0.v.c(textView2);
        textView.setText(sVar.f557359g);
        java.lang.String str = sVar.f557360h;
        textView2.setText(str);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79787x448e46cd, -1));
        if (android.text.TextUtils.isEmpty(r26.n0.u0(str).toString())) {
            textView.setTextSize(0, com.p314xaae8f345.mm.ui.zk.a(getContext(), 20));
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
        }
        if (android.text.TextUtils.isEmpty(r26.n0.u0(sVar.f557359g).toString())) {
            textView2.setTextSize(0, com.p314xaae8f345.mm.ui.zk.a(getContext(), 20));
            textView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402795c;
        int i17 = rect.left;
        int i18 = this.F;
        textView2.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
        inflate.measure(0, 0);
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, sVar + " parent.measuredWidth:" + inflate.getMeasuredWidth() + " , parent.measuredHeight:" + inflate.getMeasuredHeight());
        int width = (inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > rect.width()) ? rect.width() : inflate.getMeasuredWidth();
        int height = (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > rect.height()) ? rect.height() : inflate.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/PositionItemView", "createPositionBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/LocationItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/PositionItemView", "createPositionBitmap", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/item/LocationItem;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        relativeLayout.draw(new android.graphics.Canvas(createBitmap));
        m179513x52d2f021(this.D);
        m179520x24060d54(this.E);
        m179517xcfebc441(zu3.e.f557331g);
        m179515xe7e23e37(sVar);
        m179512x5854831(createBitmap);
        return createBitmap;
    }

    public final void d(zu3.s item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        c(item);
        m179525xa21f74c8(item.f557296f);
        m179509xbfb64d6f().f106450g.set(item.f557296f);
        m179517xcfebc441(zu3.e.f557331g);
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.H;
    }

    @Override // zu3.c, cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305700f;
    }

    @Override // zu3.c, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.graphics.Matrix matrix = this.G;
        matrix.set(m179509xbfb64d6f().f106450g);
        boolean onTouchEvent = super.onTouchEvent(event);
        m179509xbfb64d6f().f106450g.set(matrix);
        return onTouchEvent;
    }

    /* renamed from: setLocation */
    public final void m179593xe7e23e37(r45.tl5 location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.lang.String City = location.f468087f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(City, "City");
        java.lang.String poiName = location.f468088g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(poiName, "poiName");
        c(new zu3.s(City, poiName, location.f468085d, location.f468086e, new android.graphics.Matrix()));
        if (m179493x12501425() != null) {
            float height = ((m179510xbd40714a().height() - com.p314xaae8f345.mm.ui.zk.a(getContext(), 128)) - com.p314xaae8f345.mm.ui.bl.c(getContext())) - r8.getHeight();
            lt3.n nVar = lt3.n.f402793a;
            int i17 = lt3.n.f402795c.left;
            int i18 = this.F;
            m179509xbfb64d6f().f106450g.setTranslate(i18 >= i17 ? i18 : i17, height);
        }
    }

    @Override // zu3.c, cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        m179510xbd40714a().set(validRect);
    }
}
