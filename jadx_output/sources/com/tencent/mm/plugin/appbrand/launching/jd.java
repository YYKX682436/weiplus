package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class jd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f84708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f84709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(l81.e1 e1Var, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        super(0);
        this.f84708d = e1Var;
        this.f84709e = iPCString;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = this.f84709e;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null) {
            str = "";
        }
        this.f84708d.d(str);
        return jz5.f0.f302826a;
    }
}
