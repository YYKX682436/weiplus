package com.tencent.mm.chatroom.ui;

/* loaded from: classes2.dex */
public class r4 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f64472d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f64473e;

    /* renamed from: f, reason: collision with root package name */
    public final int f64474f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64475g;

    public r4(android.content.Context context, float f17, float f18) {
        this.f64474f = i65.a.a(context, f17);
        this.f64475g = i65.a.a(context, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f64472d = paint;
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f64473e = paint2;
        paint2.setColor(context.getResources().getColor(com.tencent.mm.R.color.BW_93));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        rect.bottom = this.f64474f;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.onDraw(canvas, recyclerView, h3Var);
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i17 = this.f64475g + paddingLeft;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = recyclerView.getChildAt(i18);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f64474f;
            if (i18 == childCount - 1) {
                canvas.drawRect(paddingLeft, bottom, width, bottom2, this.f64473e);
            } else {
                canvas.drawRect(i17, bottom, width, bottom2, this.f64472d);
            }
        }
    }
}
