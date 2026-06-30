package ln2;

/* loaded from: classes10.dex */
public final class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.b04 f401410d;

    public c(r45.b04 wishType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishType, "wishType");
        this.f401410d = wishType;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        ln2.c cVar = obj instanceof ln2.c ? (ln2.c) obj : null;
        return (cVar == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(cVar.f401410d, this.f401410d)) ? -1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.u2.class.hashCode();
    }
}
