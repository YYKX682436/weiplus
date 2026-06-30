package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class bf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14045x34601d2c f191239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14045x34601d2c activityC14045x34601d2c) {
        super(1);
        this.f191239d = activityC14045x34601d2c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.me2 cfg = (r45.me2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14045x34601d2c activityC14045x34601d2c = this.f191239d;
        intent.setClass(activityC14045x34601d2c.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14044x8d88ff9f.class);
        intent.putExtra("finderlivedetailparamvotinginfo", cfg.mo14344x5f01b1f6());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14045x34601d2c.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
