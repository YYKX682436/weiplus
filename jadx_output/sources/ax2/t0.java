package ax2;

/* loaded from: classes10.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView f15090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView livePkCritDoneView) {
        super(0);
        this.f15090d = livePkCritDoneView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15090d.f131847e;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i9e);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
