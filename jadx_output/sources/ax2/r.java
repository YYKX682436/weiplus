package ax2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView f15085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView) {
        super(0);
        this.f15085d = livePkCritBuffView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f15085d.f131820e;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.f486315kw0);
        mMNeat7extView.setTextGravity(17);
        return mMNeat7extView;
    }
}
