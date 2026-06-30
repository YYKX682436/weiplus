package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ti implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f104629e;

    public ti(com.tencent.mm.plugin.finder.convert.oj ojVar, so2.n1 n1Var) {
        this.f104628d = ojVar;
        this.f104629e = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104628d.B("JumpOther_onBindViewHolder", this.f104629e, com.tencent.mm.plugin.finder.convert.fi.f103385g);
    }
}
