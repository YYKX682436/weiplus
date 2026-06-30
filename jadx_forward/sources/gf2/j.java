package gf2;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, android.view.View view, android.view.View view2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f352819d = c14195x2dafdb49;
        this.f352820e = view;
        this.f352821f = view2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gf2.j(this.f352819d, this.f352820e, this.f352821f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap createBitmap;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.view.View view = this.f352820e;
        int width = view.getWidth();
        int height = view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352819d;
        if (c14195x2dafdb49.f193117s == 0) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            new android.graphics.Canvas(createBitmap).drawColor(c14195x2dafdb49.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560046v, null));
        } else {
            int i17 = width + (((int) (c14195x2dafdb49.getResources().getDisplayMetrics().density * 28.0f)) * 2);
            int i18 = height + (((int) (c14195x2dafdb49.getResources().getDisplayMetrics().density * 24.0f)) * 2);
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(config2);
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView", "getBgBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            new android.graphics.Canvas(createBitmap).drawColor(-16777216);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view);
        if (b07 != null) {
            canvas.drawBitmap(b07, (canvas.getWidth() - b07.getWidth()) / 2.0f, (canvas.getHeight() - b07.getHeight()) / 2.0f, paint);
        }
        gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) c14195x2dafdb49.f193116r).getOrDefault(this.f352821f, null);
        android.graphics.Bitmap bitmap = zVar != null ? zVar.f352860b : null;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) / 2.0f, (canvas.getHeight() - bitmap.getHeight()) / 2.0f, paint);
        }
        return createBitmap;
    }
}
