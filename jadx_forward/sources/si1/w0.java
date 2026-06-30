package si1;

/* loaded from: classes7.dex */
public class w0 implements si1.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f489830d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f489831e;

    static {
        new si1.w0();
    }

    public w0() {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f489830d = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        this.f489831e = hashSet2;
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.c.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.i.class);
        hashSet.add(yc1.p.class);
        hashSet2.add(vb1.m.class);
        hashSet2.add(nd1.d.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.g0.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.y.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d2.class);
        hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k0.class);
    }

    @Override // si1.r0
    public boolean J2(java.lang.Class cls) {
        if (cls == null) {
            return false;
        }
        return ((java.util.HashSet) this.f489831e).contains(cls) || ((java.util.HashSet) this.f489830d).contains(cls);
    }

    @Override // si1.r0
    public boolean N4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h hVar) {
        if (hVar == null) {
            return false;
        }
        return J2(hVar.getClass());
    }
}
