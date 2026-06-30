package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.EncryptInfo */
/* loaded from: classes4.dex */
public class C2971x7865f893 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 f10194xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();

    /* renamed from: checkstr */
    private java.lang.String f10196x5b9b5c29;

    /* renamed from: deviceid */
    private java.lang.String f10197x421cedf1;

    /* renamed from: randstr */
    private java.lang.String f10199x3a49c3ec;

    /* renamed from: tmstamp */
    private int f10200xb8ddd8ea;

    /* renamed from: actions */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> f10195xbac048fd = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10198xcb94b041 = new boolean[6];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22388xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22389x7c90cfc0() {
        return f10194xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22390x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();
    }

    /* renamed from: addAllElementActions */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22391xa5ff83c1(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> collection) {
        this.f10195xbac048fd.addAll(collection);
        this.f10198xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementActions */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22392xfbf44562(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc enumC3007x10e598bc) {
        this.f10195xbac048fd.add(enumC3007x10e598bc);
        this.f10198xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22393x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f893 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893) fVar;
        return n51.f.a(this.f10197x421cedf1, c2971x7865f893.f10197x421cedf1) && n51.f.a(this.f10195xbac048fd, c2971x7865f893.f10195xbac048fd) && n51.f.a(java.lang.Integer.valueOf(this.f10200xb8ddd8ea), java.lang.Integer.valueOf(c2971x7865f893.f10200xb8ddd8ea)) && n51.f.a(this.f10199x3a49c3ec, c2971x7865f893.f10199x3a49c3ec) && n51.f.a(this.f10196x5b9b5c29, c2971x7865f893.f10196x5b9b5c29);
    }

    /* renamed from: getActions */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> m22394xf88d84c7() {
        return this.f10195xbac048fd;
    }

    /* renamed from: getCheckstr */
    public java.lang.String m22395xd775999f() {
        return this.f10198xcb94b041[5] ? this.f10196x5b9b5c29 : "";
    }

    /* renamed from: getDeviceid */
    public java.lang.String m22396xbdf72b67() {
        return this.f10198xcb94b041[1] ? this.f10197x421cedf1 : "";
    }

    /* renamed from: getRandstr */
    public java.lang.String m22397x7816ffb6() {
        return this.f10198xcb94b041[4] ? this.f10199x3a49c3ec : "";
    }

    /* renamed from: getTmstamp */
    public int m22398xf6ab14b4() {
        return this.f10200xb8ddd8ea;
    }

    /* renamed from: hasActions */
    public boolean m22399x33e40d03() {
        return m22402x6e095e9(2);
    }

    /* renamed from: hasCheckstr */
    public boolean m22400x6f018e3() {
        return m22402x6e095e9(5);
    }

    /* renamed from: hasDeviceid */
    public boolean m22401xed71aaab() {
        return m22402x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22402x6e095e9(int i17) {
        return this.f10198xcb94b041[i17];
    }

    /* renamed from: hasRandstr */
    public boolean m22403xb36d87f2() {
        return m22402x6e095e9(4);
    }

    /* renamed from: hasTmstamp */
    public boolean m22404x32019cf0() {
        return m22402x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22405x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10197x421cedf1;
            if (str != null && this.f10198xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> it = this.f10195xbac048fd.iterator();
            while (it.hasNext()) {
                linkedList.add(java.lang.Integer.valueOf(it.next().f10507x6ac9171));
            }
            fVar.g(2, 2, linkedList);
            if (this.f10198xcb94b041[3]) {
                fVar.e(3, this.f10200xb8ddd8ea);
            }
            java.lang.String str2 = this.f10199x3a49c3ec;
            if (str2 != null && this.f10198xcb94b041[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f10196x5b9b5c29;
            if (str3 != null && this.f10198xcb94b041[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f10197x421cedf1;
            if (str4 != null && this.f10198xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> it6 = this.f10195xbac048fd.iterator();
            while (it6.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(it6.next().f10507x6ac9171));
            }
            int g17 = i18 + b36.f.g(2, 2, linkedList2);
            if (this.f10198xcb94b041[3]) {
                g17 += b36.f.e(3, this.f10200xb8ddd8ea);
            }
            java.lang.String str5 = this.f10199x3a49c3ec;
            if (str5 != null && this.f10198xcb94b041[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f10196x5b9b5c29;
            return (str6 == null || !this.f10198xcb94b041[5]) ? g17 : g17 + b36.f.j(5, str6);
        }
        if (i17 == 2) {
            this.f10195xbac048fd.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f10197x421cedf1 = aVar2.k(intValue);
            this.f10198xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10195xbac048fd.add(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc.m22941x382ad972(aVar2.g(intValue)));
            this.f10198xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10200xb8ddd8ea = aVar2.g(intValue);
            this.f10198xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f10199x3a49c3ec = aVar2.k(intValue);
            this.f10198xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f10196x5b9b5c29 = aVar2.k(intValue);
        this.f10198xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setActions */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22407x6bfed23b(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc> linkedList) {
        this.f10195xbac048fd = linkedList;
        this.f10198xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setCheckstr */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22408xd22dfaab(java.lang.String str) {
        this.f10196x5b9b5c29 = str;
        this.f10198xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setDeviceid */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22409xb8af8c73(java.lang.String str) {
        this.f10197x421cedf1 = str;
        this.f10198xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setRandstr */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22410xeb884d2a(java.lang.String str) {
        this.f10199x3a49c3ec = str;
        this.f10198xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setTmstamp */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22411x6a1c6228(int i17) {
        this.f10200xb8ddd8ea = i17;
        this.f10198xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m22406x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893) super.mo11468x92b714fd(bArr);
    }
}
