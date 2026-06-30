package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class ea extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f105499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.na f105500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f105501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(boolean z17, zy2.na naVar, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f105499d = z17;
        this.f105500e = naVar;
        this.f105501f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f105499d);
        sb6.append('_');
        sb6.append((java.lang.Object) this.f105500e.f477488d);
        sb6.append('_');
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) this.f105501f.f310123d;
        sb6.append(jbVar != null ? jbVar.field_tips_uuid : null);
        return sb6.toString();
    }
}
