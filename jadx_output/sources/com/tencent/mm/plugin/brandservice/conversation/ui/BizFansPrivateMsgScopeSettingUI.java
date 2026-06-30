package com.tencent.mm.plugin.brandservice.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lir1/m1;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BizFansPrivateMsgScopeSettingUI extends com.tencent.mm.ui.MMActivity implements ir1.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f93954d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f93955e = jz5.h.b(new ir1.k1(this));

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f93956f;

    public final androidx.recyclerview.widget.RecyclerView T6() {
        java.lang.Object value = ((jz5.n) this.f93955e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzm;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.nfm);
        setBackBtn(new ir1.j1(this));
        hideActionbarLine();
        T6().setAdapter(new ir1.l1(this.f93954d, this));
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        T6().setLayoutManager(wxLinearLayoutManager);
        androidx.recyclerview.widget.RecyclerView T6 = T6();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        in5.t0 t0Var = new in5.t0(context);
        t0Var.f293129c = in5.q.f293113d;
        t0Var.c(com.tencent.mm.R.color.f479307vn);
        t0Var.b(com.tencent.mm.R.color.a9e);
        t0Var.d(com.tencent.mm.R.dimen.f479638bd);
        android.content.res.Resources resources = t0Var.f293128b;
        t0Var.f293131e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        t0Var.f293132f = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        T6.N(t0Var.a());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_ori_scope_type", this.f93956f);
        setResult(-1, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList arrayList = this.f93954d;
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.nfr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ir1.j2 j2Var = new ir1.j2(0, string);
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.nfs);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        ir1.j2 j2Var2 = new ir1.j2(1, string2);
        java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.nft);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        ir1.j2 j2Var3 = new ir1.j2(2, string3);
        java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.nfu);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        arrayList.addAll(new java.util.ArrayList(kz5.c0.i(j2Var, j2Var2, j2Var3, new ir1.j2(3, string4))));
        this.f93956f = java.lang.Integer.valueOf(getIntent().getIntExtra("key_ori_scope_type", 0));
        initView();
    }
}
