package gt4;

/* loaded from: classes13.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f357108d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f357108d = c19151x10374577;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577 = this.f357108d;
        if (c19151x10374577.f262272n.getHeight() != c19151x10374577.getHeight()) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c19151x10374577.f262272n.getLayoutParams();
            layoutParams.width = c19151x10374577.f262269h.getWidth();
            layoutParams.height = c19151x10374577.f262269h.getHeight();
            c19151x10374577.f262272n.setLayoutParams(layoutParams);
        }
        int i17 = c19151x10374577.f262274p.f82643m;
        boolean z17 = i17 == 1 || i17 == 3;
        boolean z18 = i17 == 2 || i17 == 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "initScratchShakeView, canScratch: %s, canShrake: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        int b17 = i65.a.b(c19151x10374577.getContext(), 50);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a = c19151x10374577.f262272n;
        float f17 = b17;
        int i18 = b17 / 2;
        c19149x469f632a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "init canShake: %s, canScratch: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        c19149x469f632a.f262262f = z17;
        c19149x469f632a.f262261e = z18;
        gt4.r1 r1Var = c19149x469f632a.f262260d;
        if (r1Var != null) {
            c19149x469f632a.removeView(r1Var);
            c19149x469f632a.f262260d = null;
        }
        gt4.r1 r1Var2 = new gt4.r1(c19149x469f632a, c19149x469f632a.getContext());
        c19149x469f632a.f262260d = r1Var2;
        c19149x469f632a.addView(r1Var2, new android.view.ViewGroup.LayoutParams(-1, -1));
        gt4.r1 r1Var3 = c19149x469f632a.f262260d;
        r1Var3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletScratchShakeView", "init inner view");
        android.graphics.Paint paint = new android.graphics.Paint();
        r1Var3.f357048f = paint;
        paint.setAntiAlias(true);
        r1Var3.f357048f.setDither(true);
        android.content.res.Resources resources = r1Var3.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563747ci0));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(FI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(FI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        int[] iArr = {30, decodeResource.getWidth() / 3, decodeResource.getWidth() - (decodeResource.getWidth() / 3), decodeResource.getWidth() - 30};
        int[] iArr2 = {0, decodeResource.getHeight()};
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(92).order(java.nio.ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 4);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(iArr[0]);
        order.putInt(iArr[1]);
        order.putInt(iArr[2]);
        order.putInt(iArr[3]);
        order.putInt(iArr2[0]);
        order.putInt(iArr2[1]);
        for (int i19 = 0; i19 < 9; i19++) {
            order.putInt(1);
        }
        r1Var3.f357049g = new android.graphics.drawable.NinePatchDrawable(r1Var3.getResources(), new android.graphics.NinePatch(decodeResource, order.array(), "shake_bg"));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        r1Var3.f357050h = paint2;
        paint2.setAntiAlias(true);
        r1Var3.f357050h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        r1Var3.f357050h.setStyle(android.graphics.Paint.Style.STROKE);
        r1Var3.f357050h.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r1Var3.f357050h.setStrokeWidth(f17);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        r1Var3.f357051i = paint3;
        paint3.setAntiAlias(true);
        r1Var3.f357051i.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        r1Var3.f357051i.setStyle(android.graphics.Paint.Style.FILL);
        r1Var3.f357051i.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r1Var3.f357052m = new android.graphics.Path();
        r1Var3.f357053n = new android.graphics.Path();
        r1Var3.f357062w = 0.0f;
        r1Var3.f357061v = 0.0f;
        r1Var3.f357056q = android.view.ViewConfiguration.get(r1Var3.getContext()).getScaledTouchSlop();
        r1Var3.f357058s = false;
        r1Var3.f357059t = false;
        if (r1Var3.C.f262261e) {
            q35.d dVar = new q35.d(r1Var3.getContext());
            r1Var3.f357060u = dVar;
            dVar.a(new gt4.m1(r1Var3));
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            r1Var3.f357064y = android.os.SystemClock.elapsedRealtime();
        }
        r1Var3.invalidate();
        c19149x469f632a.setClipChildren(false);
        c19151x10374577.f262272n.m73928x2acfc13(new gt4.v1(c19151x10374577));
    }
}
