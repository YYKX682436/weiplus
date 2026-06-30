package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class q1 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f274878b;

    public q1(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f274877a = i17;
        this.f274878b = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (i17 != this.f274877a || !(item instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1)) {
            return true;
        }
        this.f274878b.f391656d = item;
        return true;
    }
}
