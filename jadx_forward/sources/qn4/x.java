package qn4;

/* loaded from: classes12.dex */
public final class x implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f446832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f446834c;

    public x(java.lang.StringBuilder sb6, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f446832a = sb6;
        this.f446833b = str;
        this.f446834c = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f446834c;
        int i19 = f0Var.f391649d;
        java.lang.StringBuilder sb6 = this.f446832a;
        java.lang.String str = this.f446833b;
        sb6.append((java.lang.CharSequence) str, i19, i17);
        if (item instanceof com.p314xaae8f345.mm.p2614xca6eae71.h1) {
            java.lang.String substring = str.substring(i17, i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String a07 = r26.n0.a0(substring, "[", "]");
            sb6.append(" ");
            sb6.append(a07);
            sb6.append(" ");
        } else if (item instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
            java.lang.String substring2 = str.substring(i17, i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            java.lang.String a08 = r26.n0.a0(substring2, "[", "]");
            sb6.append(" ");
            sb6.append(a08);
            sb6.append(" ");
        } else {
            sb6.append((java.lang.CharSequence) str, i17, i18);
        }
        f0Var.f391649d = i18;
        return false;
    }
}
