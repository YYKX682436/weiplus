package sp2;

/* loaded from: classes2.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(sp2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492712e = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.p1(this.f492712e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492711d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f492711d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f492712e.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.View decorView = activity.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderLiveScreenShotOperations", "takeScreenShot", "(Landroid/app/Activity;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/assist/FinderLiveScreenShotOperations", "takeScreenShot", "(Landroid/app/Activity;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        decorView.draw(new android.graphics.Canvas(createBitmap));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "take screenshot successfully");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5493x8cca4def c5493x8cca4def = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5493x8cca4def();
        c5493x8cca4def.f135826g.f89904a = createBitmap;
        c5493x8cca4def.e();
        return jz5.f0.f384359a;
    }
}
