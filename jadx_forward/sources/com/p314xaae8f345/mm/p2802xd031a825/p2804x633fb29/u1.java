package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f295531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(0);
        this.f295530d = str;
        this.f295531e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
        java.lang.String str = this.f295530d;
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295575b;
        synchronized (hashSet) {
            if (hashSet.contains(str)) {
                z17 = false;
            } else {
                hashSet.add(str);
                z17 = true;
            }
        }
        if (z17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) this.f295531e).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
