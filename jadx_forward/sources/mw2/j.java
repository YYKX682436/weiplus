package mw2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f413255a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f413256b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mb4 f413257c;

    /* renamed from: d, reason: collision with root package name */
    public long f413258d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f413259e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f413260f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f413261g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f413262h;

    public j(android.content.Context context, android.widget.ImageView imageView, r45.mb4 mb4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f413255a = context;
        this.f413256b = imageView;
        this.f413257c = mb4Var;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f413259e = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209341lb).mo141623x754a37bb()).r()).booleanValue();
        this.f413260f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(10);
        this.f413262h = new java.util.concurrent.ConcurrentHashMap();
    }

    public final r45.ir2 a() {
        r45.mb4 mb4Var = this.f413257c;
        if (mb4Var != null) {
            return (r45.ir2) mb4Var.m75936x14adae67(68);
        }
        return null;
    }

    public final void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (this.f413259e) {
            android.widget.ImageView imageView = this.f413256b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            }
            r45.ir2 a17 = a();
            if (a17 == null || a17.m75939xb282bd08(10) <= 0 || a17.m75939xb282bd08(9) <= 0) {
                return;
            }
            int m75939xb282bd08 = a17.m75939xb282bd08(10);
            int m75939xb282bd082 = a17.m75939xb282bd08(9);
            android.content.Context context = this.f413255a;
            if (m75939xb282bd08 > m75939xb282bd082) {
                android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562024ap0);
                }
                layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562025ap1);
                }
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.width = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562025ap1);
                }
                layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562024ap0);
                }
            }
            if (imageView != null) {
                imageView.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mw2.j.c(long, long):void");
    }
}
