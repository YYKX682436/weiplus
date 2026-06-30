package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f96328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f96329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96330f;

    public r(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, android.view.ViewGroup viewGroup, android.widget.ImageView imageView) {
        this.f96330f = qrRewardMainUI;
        this.f96328d = viewGroup;
        this.f96329e = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = this.f96328d;
        viewGroup.getHeight();
        viewGroup.getWidth();
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96330f;
        int width = qrRewardMainUI.f96233i.getWidth();
        int height = qrRewardMainUI.f96233i.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        qrRewardMainUI.f96233i.draw(new android.graphics.Canvas(createBitmap));
        this.f96329e.setImageBitmap(createBitmap);
        int width2 = viewGroup.getWidth();
        int height2 = viewGroup.getHeight();
        android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config2);
        arrayList2.add(java.lang.Integer.valueOf(height2));
        arrayList2.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        viewGroup.draw(new android.graphics.Canvas(createBitmap2));
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb6.append(q75.c.d());
            sb6.append("mm_reward_qrcode_");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(".png");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap2, 100, android.graphics.Bitmap.CompressFormat.PNG, sb7, false);
            dp.a.makeText(qrRewardMainUI.getContext(), qrRewardMainUI.getString(com.tencent.mm.R.string.f491022bm2, q75.c.c(sb7)), 1).show();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            androidx.appcompat.app.AppCompatActivity context = qrRewardMainUI.getContext();
            ((ub0.r) oVar).getClass();
            q75.c.f(sb7, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QrRewardMainUI", "save fixed amount qrcode failed!" + e17.getMessage());
        }
        qrRewardMainUI.f96242u.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "bitmap recycle %s", createBitmap2.toString());
        createBitmap2.recycle();
    }
}
