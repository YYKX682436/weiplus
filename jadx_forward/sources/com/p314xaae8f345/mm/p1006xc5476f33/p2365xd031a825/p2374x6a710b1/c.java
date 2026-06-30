package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f262387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at4.k f262388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l f262389f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar, android.view.View view, at4.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar) {
        this.f262387d = view;
        this.f262388e = kVar;
        this.f262389f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable;
        android.view.View view = this.f262387d;
        view.invalidate();
        at4.k kVar = this.f262388e;
        java.lang.String str = kVar.f95412b;
        int i17 = (gt4.q.f357030a.equals(str) || gt4.q.f357031b.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.chb : (gt4.q.f357038i.equals(str) || gt4.q.f357039j.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.che : (gt4.q.f357036g.equals(str) || gt4.q.f357037h.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.chg : (gt4.q.f357040k.equals(str) || gt4.q.f357041l.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.chk : (gt4.q.f357032c.equals(str) || gt4.q.f357033d.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.chl : (gt4.q.f357034e.equals(str) || gt4.q.f357035f.equals(str)) ? com.p314xaae8f345.mm.R.C30861xcebc809e.chq : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar = this.f262389f;
        if (i17 != -1) {
            view.setBackgroundResource(i17);
            android.content.res.Resources resources = view.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/utils/BankcardLogoHelper$4", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/wallet_core/utils/BankcardLogoHelper$4", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int pixel = decodeResource.getPixel(decodeResource.getWidth() / 2, decodeResource.getHeight() / 2);
            android.widget.TextView textView = (android.widget.TextView) lVar.f262451h.get();
            if (textView != null) {
                textView.setTextColor(pixel);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f95412b)) {
            int i18 = kVar.f95415e;
            if (i18 > 0) {
                view.setBackgroundResource(i18);
                return;
            }
            return;
        }
        gt4.c1 c1Var = new gt4.c1(kVar.f95412b);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(lVar);
        if (d17 != null) {
            try {
                byte[] ninePatchChunk = d17.getNinePatchChunk();
                if (ninePatchChunk == null || !android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    com.p314xaae8f345.mm.vfs.w6.h(c1Var.k());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (d17 != null) {
            android.content.Context context = view.getContext();
            try {
                byte[] ninePatchChunk2 = d17.getNinePatchChunk();
                if (android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk2)) {
                    drawable = new android.graphics.drawable.NinePatchDrawable(context.getResources(), d17, ninePatchChunk2, new android.graphics.Rect(), null);
                    drawable.setBounds(0, 0, d17.getWidth(), d17.getHeight());
                } else {
                    drawable = new android.graphics.drawable.BitmapDrawable(d17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.BankcardListAdapter", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankcardListAdapter", e17, "", new java.lang.Object[0]);
                drawable = null;
            }
            view.setBackgroundDrawable(drawable);
            int pixel2 = d17.getPixel(d17.getWidth() / 2, d17.getHeight() / 2);
            android.widget.TextView textView2 = (android.widget.TextView) lVar.f262451h.get();
            if (textView2 != null) {
                textView2.setTextColor(pixel2);
            }
        }
    }
}
