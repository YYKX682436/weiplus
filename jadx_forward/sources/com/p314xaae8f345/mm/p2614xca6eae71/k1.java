package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class k1 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274839b;

    public k1(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f274838a = i17;
        this.f274839b = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i19 = this.f274838a;
        if (i18 <= i19) {
            return false;
        }
        if (i17 >= i19) {
            return true;
        }
        this.f274839b.f391649d = i18;
        return true;
    }
}
