package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vk implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f104794b;

    public vk(in5.s0 s0Var, r45.mb4 mb4Var) {
        this.f104793a = s0Var;
        this.f104794b = mb4Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        long a17 = hq.d.a();
        in5.s0 s0Var = this.f104793a;
        s0Var.itemView.setTag(com.tencent.mm.R.id.teh, java.lang.Long.valueOf(a17));
        android.view.View view = s0Var.itemView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f104794b;
        sb6.append(mb4Var.getString(16));
        sb6.append(mb4Var.getString(20));
        view.setTag(com.tencent.mm.R.id.tei, sb6.toString());
    }
}
