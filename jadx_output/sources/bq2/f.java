package bq2;

/* loaded from: classes2.dex */
public final class f extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final long f23567e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ea2 f23568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, r45.ea2 streamCard, int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        kotlin.jvm.internal.o.g(streamCard, "streamCard");
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23567e = j17;
        this.f23568f = streamCard;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        sb6.append(pm0.v.u(this.f23567e));
        sb6.append(", type=");
        r45.qa2 qa2Var = (r45.qa2) this.f23568f.getCustom(15);
        sb6.append(qa2Var != null ? java.lang.Integer.valueOf(qa2Var.getInteger(0)) : null);
        sb6.append(", itemPosition=");
        sb6.append(this.f23560a);
        sb6.append(", belongRecyclerView=");
        sb6.append(this.f23561b);
        sb6.append(", belongAdapter=");
        sb6.append(this.f23562c);
        return sb6.toString();
    }
}
