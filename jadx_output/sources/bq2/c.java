package bq2;

/* loaded from: classes2.dex */
public final class c extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final r45.le1 f23564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.le1 cardInfo, int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        kotlin.jvm.internal.o.g(cardInfo, "cardInfo");
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23564e = cardInfo;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("card id: ");
        r45.le1 le1Var = this.f23564e;
        sb6.append(le1Var.f379347d);
        sb6.append(" card type: ");
        sb6.append(le1Var.f379348e);
        sb6.append(" belongRecyclerView: ");
        sb6.append(this.f23561b);
        sb6.append(" belongAdapter: ");
        sb6.append(this.f23562c);
        return sb6.toString();
    }
}
