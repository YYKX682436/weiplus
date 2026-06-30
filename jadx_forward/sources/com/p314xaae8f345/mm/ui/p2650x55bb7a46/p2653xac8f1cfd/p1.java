package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f281196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281197g;

    public p1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList) {
        this.f281197g = q2Var;
        this.f281194d = i17;
        this.f281195e = f9Var;
        this.f281196f = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f281194d == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = this.f281197g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281195e;
            int intValue = q2Var.f281277p.intValue();
            java.util.LinkedList linkedList = this.f281196f;
            q2Var.w0(f9Var, intValue, linkedList, 1, 1, 1, (java.lang.String) linkedList.get(0));
        }
    }
}
