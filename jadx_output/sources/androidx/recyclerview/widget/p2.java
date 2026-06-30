package androidx.recyclerview.widget;

/* loaded from: classes2.dex */
public abstract class p2 {
    @java.lang.Deprecated
    public void getItemOffsets(android.graphics.Rect rect, int i17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @java.lang.Deprecated
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    @java.lang.Deprecated
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        getItemOffsets(rect, ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).b(), recyclerView);
    }

    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        onDrawOver(canvas, recyclerView);
    }
}
