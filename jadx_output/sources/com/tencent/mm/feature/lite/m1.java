package com.tencent.mm.feature.lite;

/* loaded from: classes7.dex */
public class m1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f67221a;

    public m1(com.tencent.mm.feature.lite.n1 n1Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f67221a = rVar;
    }

    @Override // q80.f0
    public void fail() {
        this.f67221a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }

    @Override // q80.f0
    public void success() {
        this.f67221a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }
}
