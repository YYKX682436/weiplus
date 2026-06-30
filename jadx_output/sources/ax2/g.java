package ax2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView f15042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView) {
        super(0);
        this.f15042d = livePkCritAnounceView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15042d.f131808e;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.ffm);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
