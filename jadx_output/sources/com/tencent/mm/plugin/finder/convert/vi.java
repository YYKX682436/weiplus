package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f104791e;

    public vi(com.tencent.mm.plugin.finder.convert.oj ojVar, so2.n1 n1Var) {
        this.f104790d = ojVar;
        this.f104791e = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104790d.B("JumpOther_onBindViewHolder", this.f104791e, com.tencent.mm.plugin.finder.convert.fi.f103384f);
    }
}
