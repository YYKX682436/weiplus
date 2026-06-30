package ax2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView) {
        super(0);
        this.f15039d = livePkCritDoingView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15039d.f131830e;
        if (view != null) {
            return (android.widget.ScrollView) view.findViewById(com.tencent.mm.R.id.cms);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
