package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class m0 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274845c;

    public m0(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f274843a = i17;
        this.f274844b = f0Var;
        this.f274845c = f0Var2;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i19 = i18 - 1;
        if (i19 <= this.f274843a) {
            this.f274844b.f391649d = i19;
        }
        this.f274845c.f391649d = i19;
        return true;
    }
}
