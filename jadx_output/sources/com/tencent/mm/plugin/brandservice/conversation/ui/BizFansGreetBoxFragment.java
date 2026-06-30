package com.tencent.mm.plugin.brandservice.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansGreetBoxFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lhr1/e;", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizFansGreetBoxFragment extends com.tencent.mm.chatting.BasePrivateMsgConvListFragment<hr1.e> {

    /* renamed from: w, reason: collision with root package name */
    public final int f93951w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f93952x = jz5.h.b(new ir1.j0(this));

    public BizFansGreetBoxFragment(int i17) {
        this.f93951w = i17;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View A0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public int B0() {
        return 15;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View C0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ilq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.u F0() {
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(requireActivity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) requireActivity).a(wn.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (wn.u) a17;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public androidx.recyclerview.widget.RecyclerView G0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ciw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (androidx.recyclerview.widget.RecyclerView) findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public com.tencent.mm.view.RefreshLoadMoreLayout H0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzf;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        return (ir1.e0) ((jz5.n) this.f93952x).getValue();
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public java.util.List u0() {
        return this.f93951w == 5 ? kz5.b0.c(yq1.u0.Ui()) : kz5.b0.c(yq1.u0.Bi());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.b y0() {
        return this.f93951w == 5 ? new mr1.g() : new ir1.i0();
    }
}
