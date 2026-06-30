package as3;

/* loaded from: classes11.dex */
public final class f0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13504d;

    public f0(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView) {
        this.f13504d = bizProfileTopicFlowView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        yz5.l lVar;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        vr3.d0 d0Var = (vr3.d0) holder.f293125i;
        if (d0Var != null) {
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView = this.f13504d;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = bizProfileTopicFlowView.adapter;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = bizProfileTopicFlowView.foldAdapter;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
            as3.a0 presenter = bizProfileTopicFlowView.getPresenter();
            if (presenter == null || (lVar = presenter.f13487f) == null) {
                return;
            }
            lVar.invoke(d0Var);
        }
    }
}
