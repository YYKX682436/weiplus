package ro2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f479622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479625i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479626m;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, int i17, int i18, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f479620d = qeVar;
        this.f479621e = s0Var;
        this.f479622f = c1073x7e08a787;
        this.f479623g = i17;
        this.f479624h = i18;
        this.f479625i = context;
        this.f479626m = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479620d;
        int i17 = this.f479623g;
        int i18 = this.f479624h;
        in5.s0 s0Var = this.f479621e;
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f479622f;
        int width = c1073x7e08a787.getWidth();
        int height = c1073x7e08a787.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "saveMileStoneBitmap", "(Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "saveMileStoneBitmap", "(Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d1d);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        c1073x7e08a787.draw(canvas);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = s0Var.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ro2.o(createBitmap, context, i17, i18, abstractC14490x69736cb5, qeVar, s0Var, null), 3, null);
        }
        ro2.t tVar = ro2.t.f479628f;
        android.content.Context context2 = this.f479625i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f479626m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2 = this.f479620d;
        ro2.r.h(qeVar2, tVar, context2, item);
        ro2.r.c(qeVar2, s0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
