package q53;

/* loaded from: classes8.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u {
    public static final /* synthetic */ int D1 = 0;
    public boolean A1;
    public java.lang.String B1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 V;
    public final android.os.Bundle W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f441727l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f441728p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f441729p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f441730x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f441731x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f441732y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f441733y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f441734z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 page, android.os.Bundle params) {
        super(page);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.V = page;
        this.W = params;
        this.f441732y0 = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar$getUnreadGameMsgListener$1
            {
                this.f39173x3fe91575 = 98332773;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 c5625x88b37a55) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 event = c5625x88b37a55;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ug ugVar = event.f135952g;
                int i17 = ugVar.f89613a;
                int i18 = ugVar.f89615c;
                int i19 = ugVar.f89614b;
                boolean z17 = ugVar.f89616d;
                ((ku5.t0) ku5.t0.f394148d).B(new q53.b(q53.f.this, i17, i19, i18, z17));
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void d() {
        super.d();
        this.C1.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void e(boolean z17) {
        super.e(z17);
        for (android.widget.ImageView imageView : this.f441732y0) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                com.p314xaae8f345.mm.ui.uk.f(drawable, z17 ? b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz) : b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560249f7));
                imageView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: getGetUnreadGameMsgListener */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<?> m159519xef1b8414() {
        return this.C1;
    }

    /* renamed from: getPage */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 m159520xfb83cb05() {
        return this.V;
    }

    /* renamed from: getParams */
    public final android.os.Bundle m159521x29c21c7c() {
        return this.W;
    }

    public final void m(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(getContext(), i17);
        if (m9707x4a96be14 != null) {
            com.p314xaae8f345.mm.ui.uk.f(m9707x4a96be14, b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
            imageView.setImageDrawable(m9707x4a96be14);
        }
    }

    public final long n(android.net.Uri uri, java.lang.String str) {
        try {
            return java.lang.Long.parseLong(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameWebSettingActionBar", "gamelog parse long error key = " + str + " uri = " + uri);
            return 0L;
        }
    }

    public final void o(boolean z17, java.lang.String str) {
        if (str == null) {
            str = this.W.getString("game_tab_key");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isred", this.f441731x1 ? "1" : "2");
        hashMap.put("TotalNum", java.lang.String.valueOf(this.f441733y1));
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, java.lang.String.valueOf(str));
        android.content.Context context = getContext();
        int i17 = z17 ? 6 : 1;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(context, 37, 3701, z17 ? 1 : 0, i17, this.f441729p1, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255);
        java.util.Iterator it = this.f441732y0.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setImageAlpha(i17);
        }
    }
}
