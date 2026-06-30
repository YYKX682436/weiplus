package ax2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView f15093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView) {
        super(0);
        this.f15093d = livePkCritBuffView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15093d.f131820e;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.kvy);
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }
}
