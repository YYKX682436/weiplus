package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class EmojiStoreV2TabView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f98318d;

    /* renamed from: e, reason: collision with root package name */
    public int f98319e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f98320f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f98321g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f98322h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f98323i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.MMTabView f98324m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.MMTabView f98325n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.h0 f98326o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f98327p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f98328q;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmojiStoreExptChangeEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1836181400;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.EmojiStoreExptChangeEvent emojiStoreExptChangeEvent) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.emoji.ui.v2.g0(this));
            return false;
        }
    }

    public EmojiStoreV2TabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f98319e = 0;
        this.f98323i = new android.graphics.Matrix();
        this.f98327p = new com.tencent.mm.plugin.emoji.ui.v2.f0(this);
        this.f98328q = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.AnonymousClass2(com.tencent.mm.app.a0.f53288d);
        a();
    }

    public final void a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        this.f98321g = linearLayout;
        linearLayout.setBackgroundResource(com.tencent.mm.R.color.aaw);
        this.f98321g.setId(com.tencent.mm.R.id.deh);
        this.f98321g.setOrientation(0);
        addView(this.f98321g, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f98322h = imageView;
        imageView.setImageMatrix(this.f98323i);
        this.f98322h.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f98322h.setId(com.tencent.mm.R.id.dei);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.b(getContext(), 3));
        layoutParams.addRule(8, com.tencent.mm.R.id.deh);
        addView(this.f98322h, layoutParams);
        com.tencent.mm.ui.MMTabView mMTabView = new com.tencent.mm.ui.MMTabView(getContext(), 0);
        mMTabView.setTag(0);
        android.view.View.OnClickListener onClickListener = this.f98327p;
        mMTabView.setOnClickListener(onClickListener);
        this.f98324m = mMTabView;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97589e)) {
            this.f98324m.setText(com.tencent.mm.plugin.emoji.model.o.a().f97589e);
        } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
            this.f98324m.setText(com.tencent.mm.R.string.byx);
        } else {
            this.f98324m.setText(com.tencent.mm.R.string.byw);
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aci));
        layoutParams2.weight = 1.0f;
        this.f98321g.addView(this.f98324m, layoutParams2);
        com.tencent.mm.ui.MMTabView mMTabView2 = new com.tencent.mm.ui.MMTabView(getContext(), 1);
        mMTabView2.setTag(1);
        mMTabView2.setOnClickListener(onClickListener);
        this.f98325n = mMTabView2;
        mMTabView2.setText(com.tencent.mm.R.string.f491111bz2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aci));
        layoutParams3.weight = 1.0f;
        this.f98321g.addView(this.f98325n, layoutParams3);
    }

    public int getCurentIndex() {
        return this.f98319e;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = (i19 - i17) / 2;
        this.f98318d = i28;
        android.graphics.Bitmap bitmap = this.f98320f;
        if ((bitmap == null || bitmap.getWidth() != i28) && i28 > 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.graphics.Bitmap bitmap2 = this.f98320f;
            objArr[0] = java.lang.Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = java.lang.Integer.valueOf(i28);
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2TabView", "sharp width changed, from %d to %d", objArr);
            int b17 = i65.a.b(getContext(), 3);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(b17));
            arrayList.add(java.lang.Integer.valueOf(i28));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f98320f = createBitmap;
            new android.graphics.Canvas(this.f98320f).drawColor(getResources().getColor(com.tencent.mm.R.color.aaq));
            android.graphics.Matrix matrix = this.f98323i;
            matrix.setTranslate(this.f98318d * (this.f98319e + 0.0f), 0.0f);
            this.f98322h.setImageMatrix(matrix);
            this.f98322h.setImageBitmap(this.f98320f);
        }
        setTo(this.f98319e);
    }

    public void setOnTabClickListener(com.tencent.mm.plugin.emoji.ui.v2.h0 h0Var) {
        this.f98326o = h0Var;
    }

    public void setPersonTabUnReadCount(java.lang.String str) {
        com.tencent.mm.ui.MMTabView mMTabView = this.f98325n;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setTo(int i17) {
        this.f98319e = i17;
        this.f98324m.setTextColor(i17 == 0 ? getResources().getColor(com.tencent.mm.R.color.aaq) : getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f98325n.setTextColor(this.f98319e == 1 ? getResources().getColor(com.tencent.mm.R.color.aaq) : getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    public EmojiStoreV2TabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98319e = 0;
        this.f98323i = new android.graphics.Matrix();
        this.f98327p = new com.tencent.mm.plugin.emoji.ui.v2.f0(this);
        this.f98328q = new com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.AnonymousClass2(com.tencent.mm.app.a0.f53288d);
        a();
    }
}
