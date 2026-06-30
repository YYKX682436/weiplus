package com.tencent.mm.plugin.brandservice.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizFansConversationListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final int f93948d = 1;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment f93949e;

    /* renamed from: f, reason: collision with root package name */
    public int f93950f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzb;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        ((ty.o0) i95.n0.c(ty.o0.class)).getClass();
        return kz5.o1.c(wn.v.class);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f93948d && i18 == -1 && intent != null) {
            if (!intent.getBooleanExtra("key_remind_changed", false)) {
                intent = null;
            }
            if (intent != null) {
                com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment bizFansConversationFragment = this.f93949e;
                if (bizFansConversationFragment != null) {
                    ((ir1.e0) ((jz5.n) bizFansConversationFragment.f93947x).getValue()).notifyDataSetChanged();
                } else {
                    kotlin.jvm.internal.o.o("fragment");
                    throw null;
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f93950f = intent != null ? intent.getIntExtra("serviceType", 0) : 0;
        addIconOptionMenu(0, com.tencent.mm.R.string.w_, com.tencent.mm.R.raw.icons_outlined_more, new ir1.h0(this));
        dr1.a.f242584a.c(this.f93950f);
        int i17 = this.f93950f;
        jr1.i iVar = jr1.i.f301360a;
        if (i17 == 5) {
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            ((ox.r) d0Var).Bi(2).d(br1.l.f23621a);
            iVar.b();
        } else {
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            ((ox.r) d0Var2).Bi(1).d(br1.k.f23618a);
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("bizfansnofiticationholder@bizfansmsg");
            Di.m(linkedList);
            hr1.i Di2 = yq1.u0.Di();
            hr1.e z07 = Di2.z0("bizfansnofiticationholder@bizfansmsg");
            if (z07.systemRowid < 0) {
                hr1.g gVar = hr1.i.f283349e;
                hr1.e eVar = new hr1.e(hr1.i.f283351g);
                jr1.j.f(eVar, 0);
                Di2.replace(eVar, true);
            }
            com.tencent.wechat.iam.biz.l0.f217758c.h(((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(1).c(), new jr1.d(z07, Di2));
        }
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment bizFansConversationFragment = new com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationFragment(this.f93950f);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, bizFansConversationFragment, null);
        beginTransaction.f();
        this.f93949e = bizFansConversationFragment;
        iVar.e(1, "", 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setMMTitle(com.tencent.mm.R.string.f490736n54);
    }
}
