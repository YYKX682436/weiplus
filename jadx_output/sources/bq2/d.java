package bq2;

/* loaded from: classes2.dex */
public final class d extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final r45.pw1 f23565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.pw1 info, int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23565e = info;
    }

    public java.lang.String toString() {
        return "entry_type: " + this.f23565e.getInteger(0) + " belongRecyclerView: " + this.f23561b + " belongAdapter: " + this.f23562c;
    }
}
