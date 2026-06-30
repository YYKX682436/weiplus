package lh;

/* loaded from: classes12.dex */
public final class c implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb f400122a;

    public c(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb) {
        this.f400122a = c4627xadd9bddb;
    }

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.util.Map m40827x8f8c4694;
        java.lang.String input = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = this.f400122a;
        m40827x8f8c4694 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40792x8d4e11de());
        java.lang.Object obj2 = m40827x8f8c4694.get(input);
        if (obj2 == null) {
            obj2 = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71();
            m40827x8f8c4694.put(input, obj2);
        }
        return (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71) obj2;
    }
}
