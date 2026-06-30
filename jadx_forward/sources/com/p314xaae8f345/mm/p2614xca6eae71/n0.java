package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class n0 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274850b;

    public n0(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f274849a = i17;
        this.f274850b = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i19 = this.f274849a;
        if (!(i17 <= i19 && i19 <= i18)) {
            return i17 >= i19 && i18 >= i19;
        }
        this.f274850b.f391649d = i17 - 1;
        return true;
    }
}
