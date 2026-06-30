package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.y20 f106283a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106284b;

    /* renamed from: c, reason: collision with root package name */
    public r45.x84 f106285c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106286d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f106287e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f106288f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f106289g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f106290h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f106291i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.xn1 f106292j;

    public ag(com.tencent.mm.plugin.finder.feed.y20 ability, int i17) {
        kotlin.jvm.internal.o.g(ability, "ability");
        this.f106283a = ability;
        this.f106284b = i17;
        this.f106286d = "FinderLiveKTVParser_" + hashCode();
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new om2.v());
        this.f106287e = a17;
        this.f106288f = a17;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(10, 0, null, 6, null);
        this.f106289g = b17;
        this.f106290h = b17;
        r45.xn1 xn1Var = new r45.xn1();
        xn1Var.set(0, new com.tencent.mm.protocal.protobuf.FinderContact());
        this.f106292j = xn1Var;
    }

    public final void a(om2.d0 d0Var) {
        kotlinx.coroutines.flow.j2 j2Var = this.f106287e;
        om2.d0 d0Var2 = (om2.d0) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
        if (d0Var2 == null) {
            ((kotlinx.coroutines.flow.h3) j2Var).k(d0Var);
        } else {
            if (d0Var2.getClass() != d0Var.getClass()) {
                ((kotlinx.coroutines.flow.h3) j2Var).k(d0Var);
                return;
            }
            if (d0Var.a(d0Var2)) {
                ((kotlinx.coroutines.flow.h3) j2Var).k(d0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ag.b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
