package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f183840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f183841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f183842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(android.widget.FrameLayout frameLayout, gx2.q qVar, yz5.a aVar) {
        super(1);
        this.f183840d = frameLayout;
        this.f183841e = qVar;
        this.f183842f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) obj;
        gx2.q qVar = this.f183841e;
        if (abstractActivityC22579xbed01a37 != null) {
            this.f183840d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i3(abstractActivityC22579xbed01a37, qVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = abstractActivityC22579xbed01a37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) abstractActivityC22579xbed01a37 : null;
        if (activityC14075x761bf857 != null) {
            activityC14075x761bf857.f191046u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j3(qVar, this.f183842f, abstractActivityC22579xbed01a37);
        }
        return jz5.f0.f384359a;
    }
}
