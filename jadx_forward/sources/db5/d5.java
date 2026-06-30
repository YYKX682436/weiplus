package db5;

/* loaded from: classes5.dex */
public class d5 extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View.OnTouchListener f309851a;

    public d5(android.content.Context context) {
        super(context);
        super.setBackgroundDrawable(null);
        setContentView(new db5.c5(this, context));
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMPopupWindow", "dismiss exception, e = " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.widget.PopupWindow
    public android.graphics.drawable.Drawable getBackground() {
        android.view.View contentView = getContentView();
        if (contentView != null && (contentView instanceof db5.c5)) {
            return contentView.getBackground();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2.height == (-2)) goto L15;
     */
    @Override // android.widget.PopupWindow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.getContentView()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r1 = r0.getContext()
            boolean r2 = r0 instanceof db5.c5
            if (r2 == 0) goto L13
            r0.setBackgroundDrawable(r6)
            return
        L13:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r3 = -1
            if (r2 == 0) goto L20
            int r2 = r2.height
            r4 = -2
            if (r2 != r4) goto L20
            goto L21
        L20:
            r4 = r3
        L21:
            db5.c5 r2 = new db5.c5
            r2.<init>(r5, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r4)
            r2.setBackgroundDrawable(r6)
            r2.addView(r0, r1)
            super.setContentView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db5.d5.setBackgroundDrawable(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r1.height == (-2)) goto L17;
     */
    @Override // android.widget.PopupWindow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setContentView(android.view.View r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.getContentView()
            if (r0 != 0) goto La
            super.setContentView(r5)
            goto L33
        La:
            boolean r1 = r0 instanceof db5.c5
            if (r1 == 0) goto L33
            db5.c5 r0 = (db5.c5) r0
            r0.removeAllViews()
            if (r5 != 0) goto L19
            super.setContentView(r0)
            return
        L19:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r2 = -1
            if (r1 == 0) goto L26
            int r1 = r1.height
            r3 = -2
            if (r1 != r3) goto L26
            goto L27
        L26:
            r3 = r2
        L27:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r3)
            r0.addView(r5, r1)
            super.setContentView(r0)
            return
        L33:
            super.setContentView(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db5.d5.setContentView(android.view.View):void");
    }

    @Override // android.widget.PopupWindow
    public void setTouchInterceptor(android.view.View.OnTouchListener onTouchListener) {
        this.f309851a = onTouchListener;
    }

    public d5(android.view.View view) {
        super(view);
        super.setBackgroundDrawable(null);
    }

    public d5(android.view.View view, int i17, int i18) {
        super(view, i17, i18);
        super.setBackgroundDrawable(null);
    }

    public d5(android.view.View view, int i17, int i18, boolean z17) {
        super(view, i17, i18, z17);
        super.setBackgroundDrawable(null);
    }
}
