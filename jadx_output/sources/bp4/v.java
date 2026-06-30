package bp4;

/* loaded from: classes3.dex */
public final class v extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final float f23393d = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bp4.x f23394e;

    public v(bp4.x xVar) {
        this.f23394e = xVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int adapterPosition = parent.w0(view).getAdapterPosition();
        float f17 = this.f23393d;
        outRect.left = (int) f17;
        if (adapterPosition + 1 == this.f23394e.f23417g.size()) {
            outRect.right = (int) f17;
        }
    }
}
