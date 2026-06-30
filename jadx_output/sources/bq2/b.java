package bq2;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f23560a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f23561b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f23562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f23563d;

    public b(int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23560a = i17;
        this.f23561b = belongRecyclerView;
        this.f23562c = belongAdapter;
        this.f23563d = new java.util.HashSet();
    }
}
