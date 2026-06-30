package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f93610g = {android.R.attr.listDivider};

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93611d;

    /* renamed from: e, reason: collision with root package name */
    public int f93612e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f93613f = new android.graphics.Rect();

    public i0(android.content.Context context, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f93610g);
        this.f93611d = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f93612e = i17;
    }

    public void d(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.IllegalArgumentException("Drawable cannot be null.");
        }
        this.f93611d = drawable;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        android.graphics.drawable.Drawable drawable = this.f93611d;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f93612e == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int height;
        int i17;
        int width;
        int i18;
        if (c1163xf1deaba4.getLayoutManager() == null || this.f93611d == null) {
            return;
        }
        int i19 = this.f93612e;
        android.graphics.Rect rect = this.f93613f;
        int i27 = 0;
        if (i19 == 1) {
            canvas.save();
            if (c1163xf1deaba4.getClipToPadding()) {
                i18 = c1163xf1deaba4.getPaddingLeft();
                width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
                canvas.clipRect(i18, c1163xf1deaba4.getPaddingTop(), width, c1163xf1deaba4.getHeight() - c1163xf1deaba4.getPaddingBottom());
            } else {
                width = c1163xf1deaba4.getWidth();
                i18 = 0;
            }
            int childCount = c1163xf1deaba4.getChildCount();
            while (i27 < childCount) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(i27);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.z0(childAt, rect);
                int round = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
                this.f93611d.setBounds(i18, round - this.f93611d.getIntrinsicHeight(), width, round);
                this.f93611d.draw(canvas);
                i27++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (c1163xf1deaba4.getClipToPadding()) {
            i17 = c1163xf1deaba4.getPaddingTop();
            height = c1163xf1deaba4.getHeight() - c1163xf1deaba4.getPaddingBottom();
            canvas.clipRect(c1163xf1deaba4.getPaddingLeft(), i17, c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight(), height);
        } else {
            height = c1163xf1deaba4.getHeight();
            i17 = 0;
        }
        int childCount2 = c1163xf1deaba4.getChildCount();
        while (i27 < childCount2) {
            android.view.View childAt2 = c1163xf1deaba4.getChildAt(i27);
            c1163xf1deaba4.getLayoutManager().m8011x8b74aca9(childAt2, rect);
            int round2 = rect.right + java.lang.Math.round(childAt2.getTranslationX());
            this.f93611d.setBounds(round2 - this.f93611d.getIntrinsicWidth(), i17, round2, height);
            this.f93611d.draw(canvas);
            i27++;
        }
        canvas.restore();
    }
}
