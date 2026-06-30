package bq2;

/* loaded from: classes2.dex */
public final class g extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final long f23569e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f23570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, com.tencent.mm.protobuf.g gVar, int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23569e = j17;
        this.f23570f = gVar;
    }

    public java.lang.String toString() {
        return "id=" + pm0.v.u(this.f23569e) + ", lastBuffer=" + this.f23570f + ", itemPosition=" + this.f23560a + ", belongRecyclerView=" + this.f23561b + ", belongAdapter=" + this.f23562c;
    }
}
