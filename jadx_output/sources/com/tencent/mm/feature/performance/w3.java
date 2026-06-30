package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f67766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(cr0.j jVar) {
        super(1);
        this.f67766d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cr0.r entry = (cr0.r) obj;
        kotlin.jvm.internal.o.g(entry, "entry");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = entry.f221725d;
        int P = r26.n0.P(str, ".", 0, false, 6, null) + 1;
        if (P < 0) {
            P = 0;
        }
        java.lang.String substring = str.substring(P);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(':');
        float floatValue = entry.f221727f.f395552a.floatValue() * 100.0f;
        kotlin.jvm.internal.o.f(this.f67766d.f221790g.f395552a, "get(...)");
        sb6.append(a06.d.c(floatValue / r1.floatValue()));
        return sb6.toString();
    }
}
