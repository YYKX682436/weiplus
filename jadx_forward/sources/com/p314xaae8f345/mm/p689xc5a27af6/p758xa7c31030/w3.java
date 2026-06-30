package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f149299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(cr0.j jVar) {
        super(1);
        this.f149299d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cr0.r entry = (cr0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = entry.f303258d;
        int P = r26.n0.P(str, ".", 0, false, 6, null) + 1;
        if (P < 0) {
            P = 0;
        }
        java.lang.String substring = str.substring(P);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(':');
        float floatValue = entry.f303260f.f477085a.floatValue() * 100.0f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f149299d.f303323g.f477085a, "get(...)");
        sb6.append(a06.d.c(floatValue / r1.floatValue()));
        return sb6.toString();
    }
}
