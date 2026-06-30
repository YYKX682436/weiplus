package sf4;

/* loaded from: classes4.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f488986d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f488987e = new android.graphics.drawable.ColorDrawable(-16777216);

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f488988f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int f488989g = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);

    public e(int i17) {
        this.f488986d = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r3 < (r4 - 1)) goto L15;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7902x5db88677(android.graphics.Rect r2, android.view.View r3, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r5) {
        /*
            r1 = this;
            java.lang.String r0 = "outRect"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "parent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r4.getLayoutManager()
            if (r5 == 0) goto L23
            int r3 = r5.m8032xa86cd69f(r3)
            goto L24
        L23:
            r3 = -1
        L24:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            r5 = 0
            if (r4 == 0) goto L30
            int r4 = r4.m8020x7e414b06()
            goto L31
        L30:
            r4 = r5
        L31:
            if (r3 < 0) goto L38
            r0 = 1
            int r4 = r4 - r0
            if (r3 >= r4) goto L38
            goto L39
        L38:
            r0 = r5
        L39:
            if (r0 == 0) goto L48
            int r3 = r1.f488986d
            int r4 = r1.f488989g
            if (r3 != 0) goto L45
            r2.set(r5, r5, r4, r5)
            goto L48
        L45:
            r2.set(r5, r5, r5, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.e.mo7902x5db88677(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.h3):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        int height;
        int i17;
        int width;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (parent.getLayoutManager() == null) {
            return;
        }
        int i19 = this.f488986d;
        android.graphics.drawable.Drawable drawable = this.f488987e;
        int i27 = this.f488989g;
        android.graphics.Rect rect = this.f488988f;
        int i28 = 0;
        if (i19 == 1) {
            c17.save();
            if (parent.getClipToPadding()) {
                i18 = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                c17.clipRect(i18, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            } else {
                width = parent.getWidth();
                i18 = 0;
            }
            int childCount = parent.getChildCount();
            while (i28 < childCount) {
                android.view.View childAt = parent.getChildAt(i28);
                parent.y0(childAt, rect);
                int round = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
                drawable.setBounds(i18, round - i27, width, round);
                drawable.draw(c17);
                i28++;
            }
            c17.restore();
            return;
        }
        c17.save();
        if (parent.getClipToPadding()) {
            i17 = parent.getPaddingTop();
            height = parent.getHeight() - parent.getPaddingBottom();
            c17.clipRect(parent.getPaddingLeft(), i17, parent.getWidth() - parent.getPaddingRight(), height);
        } else {
            height = parent.getHeight();
            i17 = 0;
        }
        int childCount2 = parent.getChildCount();
        while (i28 < childCount2) {
            android.view.View childAt2 = parent.getChildAt(i28);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.m8011x8b74aca9(childAt2, rect);
            }
            int round2 = rect.right + java.lang.Math.round(childAt2.getTranslationX());
            drawable.setBounds(round2 - i27, i17, round2, height);
            drawable.draw(c17);
            i28++;
        }
        c17.restore();
    }
}
