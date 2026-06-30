package ar2;

/* loaded from: classes2.dex */
public final class b extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f13383d;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f13383d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.u0(view) == 0) {
            outRect.top = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        }
        android.content.Context context = this.f13383d;
        outRect.left = i65.a.b(context, 12);
        outRect.right = i65.a.b(context, 12);
        outRect.bottom = i65.a.b(context, 12);
    }
}
