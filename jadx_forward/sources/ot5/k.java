package ot5;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f430412a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;

    /* renamed from: b, reason: collision with root package name */
    public final com.qq.taf.C2853x7d14f3d7 f430413b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f430414c;

    public k(boolean z17) {
        com.qq.taf.C2853x7d14f3d7 c2853x7d14f3d7 = new com.qq.taf.C2853x7d14f3d7();
        this.f430413b = c2853x7d14f3d7;
        this.f430414c = new java.util.HashMap();
        new java.util.HashMap();
        c2853x7d14f3d7.f9739x13891c2f = (short) 3;
    }

    public byte[] a() {
        com.qq.taf.C2853x7d14f3d7 c2853x7d14f3d7 = this.f430413b;
        if (c2853x7d14f3d7.f9742xd1aa19c9 == null) {
            c2853x7d14f3d7.f9742xd1aa19c9 = "";
        }
        if (c2853x7d14f3d7.f9741xf0d65102 == null) {
            c2853x7d14f3d7.f9741xf0d65102 = "";
        }
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d = new com.qq.taf.jce.C2860x6de9642d(0);
        c2860x6de9642d.m21333x26b402b8(this.f430412a);
        c2860x6de9642d.m21351x6c257df((java.util.Map) this.f430414c, 0);
        c2853x7d14f3d7.f9740x3aad1e93 = com.qq.taf.jce.C2862xf934904e.m21405x1f0d4cdc(c2860x6de9642d.m21331xeed4b35e());
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d2 = new com.qq.taf.jce.C2860x6de9642d(0);
        c2860x6de9642d2.m21333x26b402b8(this.f430412a);
        c2853x7d14f3d7.mo21235x5f8be6ba(c2860x6de9642d2);
        byte[] m21405x1f0d4cdc = com.qq.taf.jce.C2862xf934904e.m21405x1f0d4cdc(c2860x6de9642d2.m21331xeed4b35e());
        int length = m21405x1f0d4cdc.length + 4;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(length);
        allocate.putInt(length).put(m21405x1f0d4cdc).flip();
        return allocate.array();
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        if (str == null || str.startsWith(".") || obj == null || (obj instanceof java.util.Set)) {
            throw new java.lang.IllegalArgumentException("wup put err");
        }
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d = new com.qq.taf.jce.C2860x6de9642d();
        c2860x6de9642d.m21333x26b402b8(this.f430412a);
        c2860x6de9642d.m21347x6c257df(obj, 0);
        this.f430414c.put(str, com.qq.taf.jce.C2862xf934904e.m21405x1f0d4cdc(c2860x6de9642d.m21331xeed4b35e()));
    }
}
