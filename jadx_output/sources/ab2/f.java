package ab2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.g f2765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ab2.g gVar) {
        super(1);
        this.f2765d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.content.Intent data = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(data, "data");
        ab2.a aVar = (ab2.a) this.f2765d.z();
        com.tencent.mm.plugin.finder.feed.a1 a1Var = aVar.f107157f;
        if (a1Var != null && (recyclerView = a1Var.getRecyclerView()) != null) {
            hc2.f1.w(recyclerView, data, aVar.f107156e, false, null, 12, null);
        }
        return jz5.f0.f302826a;
    }
}
