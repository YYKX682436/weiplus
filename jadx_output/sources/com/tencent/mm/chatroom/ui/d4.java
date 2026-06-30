package com.tencent.mm.chatroom.ui;

/* loaded from: classes2.dex */
public class d4 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f64105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64106e;

    public d4(android.content.Context context) {
        this.f64106e = i65.a.b(context, 8);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f64105d = paint;
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        rect.bottom = this.f64106e;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.onDraw(canvas, recyclerView, h3Var);
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            canvas.drawRect(paddingLeft, childAt.getBottom(), width, childAt.getBottom() + this.f64106e, this.f64105d);
        }
    }
}
