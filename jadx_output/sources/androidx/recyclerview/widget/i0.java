package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class i0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f12077g = {android.R.attr.listDivider};

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f12078d;

    /* renamed from: e, reason: collision with root package name */
    public int f12079e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f12080f = new android.graphics.Rect();

    public i0(android.content.Context context, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f12077g);
        this.f12078d = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f12079e = i17;
    }

    public void d(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.IllegalArgumentException("Drawable cannot be null.");
        }
        this.f12078d = drawable;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        android.graphics.drawable.Drawable drawable = this.f12078d;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f12079e == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int height;
        int i17;
        int width;
        int i18;
        if (recyclerView.getLayoutManager() == null || this.f12078d == null) {
            return;
        }
        int i19 = this.f12079e;
        android.graphics.Rect rect = this.f12080f;
        int i27 = 0;
        if (i19 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i18 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i18, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i18 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i27 < childCount) {
                android.view.View childAt = recyclerView.getChildAt(i27);
                androidx.recyclerview.widget.RecyclerView.z0(childAt, rect);
                int round = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
                this.f12078d.setBounds(i18, round - this.f12078d.getIntrinsicHeight(), width, round);
                this.f12078d.draw(canvas);
                i27++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i17 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i17, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i17 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i27 < childCount2) {
            android.view.View childAt2 = recyclerView.getChildAt(i27);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int round2 = rect.right + java.lang.Math.round(childAt2.getTranslationX());
            this.f12078d.setBounds(round2 - this.f12078d.getIntrinsicWidth(), i17, round2, height);
            this.f12078d.draw(canvas);
            i27++;
        }
        canvas.restore();
    }
}
