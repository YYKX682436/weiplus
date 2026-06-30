package a24;

/* loaded from: classes.dex */
public abstract class l extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public abstract in5.s T6();

    public final void U6(ym3.a dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(null);
        }
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(null);
        }
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getActivity()));
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(dataSource, new xm3.n0(), getActivity(), null, null, 24, null);
        if (wxRecyclerView != null) {
            c24.g gVar = new c24.g(mvvmList, T6(), true);
            gVar.F = new a24.j(this);
            wxRecyclerView.setAdapter(gVar);
        }
        this.f890d = mvvmList;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new a24.k(this));
    }
}
