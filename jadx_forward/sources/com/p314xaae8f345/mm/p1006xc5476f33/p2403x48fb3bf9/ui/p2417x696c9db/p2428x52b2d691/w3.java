package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e60.a1 f268131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 f268133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268134g;

    public w3(e60.a1 a1Var, nw4.k kVar, com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 c10612x9ba63641, nw4.y2 y2Var) {
        this.f268131d = a1Var;
        this.f268132e = kVar;
        this.f268133f = c10612x9ba63641;
        this.f268134g = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.k kVar = this.f268132e;
        android.content.Context context = kVar.f422393a;
        ((th5.g) this.f268131d).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 args = this.f268133f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (!args.f148622d.isEmpty()) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
            intent.putExtra("biz_photo_account_gallery_args", args);
            com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 c10614x23c16174 = args.f148624f;
            if (c10614x23c16174 != null) {
                int i17 = c10614x23c16174.f148636f;
                int i18 = c10614x23c16174.f148634d;
                int i19 = i17 - i18;
                if (i19 < 0) {
                    i19 = 0;
                }
                int i27 = c10614x23c16174.f148637g;
                int i28 = c10614x23c16174.f148635e;
                int i29 = i27 - i28;
                if (i29 < 0) {
                    i29 = 0;
                }
                if (i19 > 0 && i29 > 0) {
                    intent.putExtra("img_gallery_left", i18);
                    intent.putExtra("img_gallery_top", i28);
                    intent.putExtra("img_gallery_width", i19);
                    intent.putExtra("img_gallery_height", i29);
                }
            }
            pf5.j0.a(intent, th5.i.class);
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/media/bizphoto/BizPhotoAccountGalleryOpener", "open", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/media/bizphoto/BizPhotoAccountGalleryOpener", "open", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        nw4.g gVar = kVar.f422396d;
        nw4.y2 y2Var = this.f268134g;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
    }
}
