package com.p314xaae8f345.mm.udr;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/udr/o0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "", "<init>", "()V", "udr-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class o0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        da5.r rVar = da5.r.f309350a;
        if (rVar.b()) {
            rVar.c();
        }
        return (byte[]) com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.i(data.getString("projectId"), data.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)).orElse(null);
    }
}
