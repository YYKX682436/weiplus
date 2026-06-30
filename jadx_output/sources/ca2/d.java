package ca2;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479648bn);
        outRect.left = dimension2;
        outRect.right = dimension2;
        outRect.bottom = dimension;
        outRect.top = dimension;
    }
}
