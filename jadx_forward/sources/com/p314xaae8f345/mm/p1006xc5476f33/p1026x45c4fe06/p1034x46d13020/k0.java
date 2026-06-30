package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class k0 implements k91.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f158028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f158029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0 f158031d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0 l0Var, boolean z17, java.lang.Long l17, java.lang.Runnable runnable) {
        this.f158031d = l0Var;
        this.f158028a = z17;
        this.f158029b = l17;
        this.f158030c = runnable;
    }

    @Override // k91.e5
    public void a() {
        if (this.f158028a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd doNotify db");
            this.f158031d.mo142179xf35bbb4("batch", 3, this.f158029b);
            java.lang.Runnable runnable = this.f158030c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
