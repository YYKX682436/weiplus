package ax2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView f15040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView) {
        super(0);
        this.f15040d = livePkCritAnounceView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15040d.f131808e;
        if (view != null) {
            return (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ffn);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
