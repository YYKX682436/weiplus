package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class r1 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f274891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274894d;

    public r1(java.lang.StringBuilder sb6, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.String str2) {
        this.f274891a = sb6;
        this.f274892b = str;
        this.f274893c = f0Var;
        this.f274894d = str2;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!(item instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1)) {
            return false;
        }
        java.lang.String str = this.f274892b;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f274893c;
        int i19 = f0Var.f391649d;
        java.lang.StringBuilder sb6 = this.f274891a;
        sb6.append((java.lang.CharSequence) str, i19, i17);
        sb6.append(this.f274894d);
        f0Var.f391649d = i18;
        return false;
    }
}
