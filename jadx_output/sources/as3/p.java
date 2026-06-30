package as3;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView f13537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView bizProfilePicTabRecyclerView) {
        super(0);
        this.f13537d = bizProfilePicTabRecyclerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new androidx.recyclerview.widget.LinearLayoutManager(this.f13537d.getContext());
    }
}
