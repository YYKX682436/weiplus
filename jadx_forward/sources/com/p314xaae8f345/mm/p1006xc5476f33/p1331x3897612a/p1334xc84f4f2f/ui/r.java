package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f177861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f177862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177863f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd, android.view.ViewGroup viewGroup, android.widget.ImageView imageView) {
        this.f177863f = activityC13135x13db66fd;
        this.f177861d = viewGroup;
        this.f177862e = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = this.f177861d;
        viewGroup.getHeight();
        viewGroup.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177863f;
        int width = activityC13135x13db66fd.f177766i.getWidth();
        int height = activityC13135x13db66fd.f177766i.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI$16", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        activityC13135x13db66fd.f177766i.draw(new android.graphics.Canvas(createBitmap));
        this.f177862e.setImageBitmap(createBitmap);
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap2, 100, android.graphics.Bitmap.CompressFormat.PNG, sb7, false);
            dp.a.m125854x26a183b(activityC13135x13db66fd.mo55332x76847179(), activityC13135x13db66fd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572555bm2, q75.c.c(sb7)), 1).show();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13135x13db66fd.mo55332x76847179();
            ((ub0.r) oVar).getClass();
            q75.c.f(sb7, mo55332x76847179);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QrRewardMainUI", "save fixed amount qrcode failed!" + e17.getMessage());
        }
        activityC13135x13db66fd.f177775u.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "bitmap recycle %s", createBitmap2.toString());
        createBitmap2.recycle();
    }
}
