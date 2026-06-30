package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes5.dex */
public class a0 implements kg1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84128a;

    public a0(java.util.List list) {
        this.f84128a = list;
    }

    @Override // kg1.l
    public void a(kg1.m mVar) {
        kg1.a b17 = mVar.b();
        if (b17 == null) {
            return;
        }
        this.f84128a.add(new kg1.o(b17, mVar.f307708c));
    }
}
