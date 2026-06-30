package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class d0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f84561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.e0 f84562e;

    public d0(com.tencent.mm.plugin.appbrand.launching.e0 e0Var, java.util.ArrayList arrayList) {
        this.f84562e = e0Var;
        this.f84561d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return new com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg(this.f84562e.f84582d.f77278d, this.f84561d, false);
    }
}
