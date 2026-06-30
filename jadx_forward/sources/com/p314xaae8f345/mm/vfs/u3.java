package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class u3 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f294727e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294728f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f294729g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f294730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22753xce8a3519 f294731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.p314xaae8f345.mm.vfs.C22753xce8a3519 c22753xce8a3519, java.util.List list, boolean z17, boolean z18, boolean z19, java.util.Map map) {
        super(c22753xce8a3519, map);
        this.f294731i = c22753xce8a3519;
        this.f294727e = list;
        this.f294728f = z17;
        this.f294729g = z18;
        this.f294730h = z19;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public boolean F(java.lang.String str) {
        java.util.Iterator it = this.f294727e.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.vfs.q2) it.next()).F(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294727e;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        java.util.List<com.p314xaae8f345.mm.vfs.q2> list = this.f294727e;
        if (i17 == 1 || i17 == 3) {
            for (com.p314xaae8f345.mm.vfs.q2 q2Var : list) {
                if (q2Var.F(str)) {
                    return q2Var;
                }
            }
        }
        return (com.p314xaae8f345.mm.vfs.q2) list.get(0);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.util.Iterator it = this.f294727e.iterator();
        java.io.FileNotFoundException fileNotFoundException = null;
        while (it.hasNext()) {
            try {
                return ((com.p314xaae8f345.mm.vfs.q2) it.next()).a(str);
            } catch (java.io.FileNotFoundException e17) {
                if (fileNotFoundException == null) {
                    fileNotFoundException = e17;
                }
            }
        }
        if (fileNotFoundException != null) {
            throw fileNotFoundException;
        }
        throw new java.io.FileNotFoundException(str + " not found on any file systems.");
    }

    /* renamed from: equals */
    public boolean m82477xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.u3)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.u3 u3Var = (com.p314xaae8f345.mm.vfs.u3) obj;
        return this.f294727e.equals(u3Var.f294727e) && this.f294728f == u3Var.f294728f && this.f294729g == u3Var.f294729g;
    }

    /* renamed from: hashCode */
    public int m82478x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.u3.class.hashCode();
        java.lang.Object[] objArr = {this.f294727e, java.lang.Boolean.valueOf(this.f294728f), java.lang.Boolean.valueOf(this.f294729g)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.x1 m(java.lang.String str) {
        java.util.Iterator it = this.f294727e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.x1 m17 = ((com.p314xaae8f345.mm.vfs.q2) it.next()).m(str);
            if (m17 != null) {
                return m17;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d A[Catch: Exception -> 0x0175, TRY_ENTER, TryCatch #7 {Exception -> 0x0175, blocks: (B:29:0x00a1, B:31:0x00a5, B:36:0x00ab, B:38:0x00b1, B:40:0x00b8, B:54:0x00c1, B:56:0x00c9, B:58:0x00cf, B:60:0x00d6, B:61:0x00d9, B:65:0x00e5, B:71:0x00ed, B:95:0x00fc, B:74:0x0101, B:77:0x010b, B:81:0x011d, B:83:0x014f, B:84:0x0165, B:88:0x016d, B:93:0x0160, B:102:0x00f5, B:106:0x0112, B:112:0x0187, B:113:0x018f, B:115:0x0195), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r47) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.u3.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.util.Iterator it = this.f294727e.iterator();
        java.io.FileNotFoundException fileNotFoundException = null;
        while (it.hasNext()) {
            try {
                return ((com.p314xaae8f345.mm.vfs.q2) it.next()).s(str);
            } catch (java.io.FileNotFoundException e17) {
                if (fileNotFoundException == null) {
                    fileNotFoundException = e17;
                }
            }
        }
        if (fileNotFoundException != null) {
            throw fileNotFoundException;
        }
        throw new java.io.FileNotFoundException(str + " not found on any file systems.");
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("migrate(");
        sb6.append(this.f294728f ? 'P' : '-');
        sb6.append(") ");
        java.util.List list = this.f294727e;
        sb6.append(list.get(0));
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : list.subList(1, list.size())) {
            sb6.append("\n  <- ");
            sb6.append(q2Var);
        }
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294731i;
    }
}
