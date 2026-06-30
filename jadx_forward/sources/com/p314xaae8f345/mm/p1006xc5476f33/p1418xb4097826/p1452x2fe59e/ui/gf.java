package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class gf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 f191618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 viewOnClickListenerC14047x4c222b89) {
        super(0);
        this.f191618d = viewOnClickListenerC14047x4c222b89;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89.F;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before updateChooseList size:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14047x4c222b89 viewOnClickListenerC14047x4c222b89 = this.f191618d;
        java.util.LinkedList linkedList = viewOnClickListenerC14047x4c222b89.B;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveWhiteListUI", sb6.toString());
        linkedList.clear();
        for (bm2.r8 r8Var : viewOnClickListenerC14047x4c222b89.E) {
            if (r8Var.f103811a) {
                linkedList.add(r8Var.f103812b);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveWhiteListUI", "after updateChooseList size:" + linkedList.size());
        viewOnClickListenerC14047x4c222b89.e7();
        return jz5.f0.f384359a;
    }
}
