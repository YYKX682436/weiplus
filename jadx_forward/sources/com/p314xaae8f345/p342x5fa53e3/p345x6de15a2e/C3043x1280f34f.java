package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkC2CUploadResult */
/* loaded from: classes8.dex */
public class C3043x1280f34f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f f10953xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f();

    /* renamed from: aeskey */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10954xab4b3f30;

    /* renamed from: error_code */
    private int f10955x617e99c4;

    /* renamed from: file_size */
    private long f10956xb18ab0e4;

    /* renamed from: file_url */
    private java.lang.String f10957xd42dcc2c;

    /* renamed from: fileid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10958xb4089397;

    /* renamed from: hasSetFields */
    private final boolean[] f10959xcb94b041 = new boolean[8];

    /* renamed from: task_ident */
    private java.lang.String f10960x4daa42b6;

    /* renamed from: thumb_url */
    private java.lang.String f10961x4f47cb86;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24115xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24116x7c90cfc0() {
        return f10953xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24117x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24118x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f c3043x1280f34f = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10955x617e99c4), java.lang.Integer.valueOf(c3043x1280f34f.f10955x617e99c4)) && n51.f.a(this.f10960x4daa42b6, c3043x1280f34f.f10960x4daa42b6) && n51.f.a(java.lang.Long.valueOf(this.f10956xb18ab0e4), java.lang.Long.valueOf(c3043x1280f34f.f10956xb18ab0e4)) && n51.f.a(this.f10957xd42dcc2c, c3043x1280f34f.f10957xd42dcc2c) && n51.f.a(this.f10961x4f47cb86, c3043x1280f34f.f10961x4f47cb86) && n51.f.a(this.f10958xb4089397, c3043x1280f34f.f10958xb4089397) && n51.f.a(this.f10954xab4b3f30, c3043x1280f34f.f10954xab4b3f30);
    }

    /* renamed from: getAeskey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24119x10626226() {
        return this.f10959xcb94b041[7] ? this.f10954xab4b3f30 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getErrorCode */
    public int m24120x130a215f() {
        return this.f10955x617e99c4;
    }

    /* renamed from: getFileSize */
    public long m24121x50026913() {
        return this.f10956xb18ab0e4;
    }

    /* renamed from: getFileUrl */
    public java.lang.String m24122xad6d21d() {
        return this.f10959xcb94b041[4] ? this.f10957xd42dcc2c : "";
    }

    /* renamed from: getFileid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24123x191fb68d() {
        return this.f10959xcb94b041[6] ? this.f10958xb4089397 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getTaskIdent */
    public java.lang.String m24124x8f898b5() {
        return this.f10959xcb94b041[2] ? this.f10960x4daa42b6 : "";
    }

    /* renamed from: getThumbUrl */
    public java.lang.String m24125xd93f812f() {
        return this.f10959xcb94b041[5] ? this.f10961x4f47cb86 : "";
    }

    /* renamed from: hasAeskey */
    public boolean m24126xd03be26a() {
        return m24128x6e095e9(7);
    }

    /* renamed from: hasErrorCode */
    public boolean m24127xd2df8a9b() {
        return m24128x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24128x6e095e9(int i17) {
        return this.f10959xcb94b041[i17];
    }

    /* renamed from: hasFileSize */
    public boolean m24129x7f7ce857() {
        return m24128x6e095e9(3);
    }

    /* renamed from: hasFileUrl */
    public boolean m24130x462d5a59() {
        return m24128x6e095e9(4);
    }

    /* renamed from: hasFileid */
    public boolean m24131xd8f936d1() {
        return m24128x6e095e9(6);
    }

    /* renamed from: hasTaskIdent */
    public boolean m24132xc8ce01f1() {
        return m24128x6e095e9(2);
    }

    /* renamed from: hasThumbUrl */
    public boolean m24133x8ba0073() {
        return m24128x6e095e9(5);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24134x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10959xcb94b041[1]) {
                fVar.e(1, this.f10955x617e99c4);
            }
            java.lang.String str = this.f10960x4daa42b6;
            if (str != null && this.f10959xcb94b041[2]) {
                fVar.j(2, str);
            }
            if (this.f10959xcb94b041[3]) {
                fVar.h(3, this.f10956xb18ab0e4);
            }
            java.lang.String str2 = this.f10957xd42dcc2c;
            if (str2 != null && this.f10959xcb94b041[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f10961x4f47cb86;
            if (str3 != null && this.f10959xcb94b041[5]) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10958xb4089397;
            if (gVar != null && this.f10959xcb94b041[6]) {
                fVar.b(6, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10954xab4b3f30;
            if (gVar2 != null && this.f10959xcb94b041[7]) {
                fVar.b(7, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10959xcb94b041[1] ? 0 + b36.f.e(1, this.f10955x617e99c4) : 0;
            java.lang.String str4 = this.f10960x4daa42b6;
            if (str4 != null && this.f10959xcb94b041[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (this.f10959xcb94b041[3]) {
                e17 += b36.f.h(3, this.f10956xb18ab0e4);
            }
            java.lang.String str5 = this.f10957xd42dcc2c;
            if (str5 != null && this.f10959xcb94b041[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f10961x4f47cb86;
            if (str6 != null && this.f10959xcb94b041[5]) {
                e17 += b36.f.j(5, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10958xb4089397;
            if (gVar3 != null && this.f10959xcb94b041[6]) {
                e17 += b36.f.b(6, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10954xab4b3f30;
            return (gVar4 == null || !this.f10959xcb94b041[7]) ? e17 : e17 + b36.f.b(7, gVar4);
        }
        if (i17 == 2) {
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
        switch (intValue) {
            case 1:
                this.f10955x617e99c4 = aVar2.g(intValue);
                this.f10959xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10960x4daa42b6 = aVar2.k(intValue);
                this.f10959xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10956xb18ab0e4 = aVar2.i(intValue);
                this.f10959xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10957xd42dcc2c = aVar2.k(intValue);
                this.f10959xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10961x4f47cb86 = aVar2.k(intValue);
                this.f10959xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10958xb4089397 = aVar2.d(intValue);
                this.f10959xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10954xab4b3f30 = aVar2.d(intValue);
                this.f10959xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24136x3979632(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10954xab4b3f30 = gVar;
        this.f10959xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24137x6f5de1d3(int i17) {
        this.f10955x617e99c4 = i17;
        this.f10959xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFileSize */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24138x4abaca1f(long j17) {
        this.f10956xb18ab0e4 = j17;
        this.f10959xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFileUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24139x7e481f91(java.lang.String str) {
        this.f10957xd42dcc2c = str;
        this.f10959xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFileid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24140xc54ea99(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10958xb4089397 = gVar;
        this.f10959xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setTaskIdent */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24141x654c5929(java.lang.String str) {
        this.f10960x4daa42b6 = str;
        this.f10959xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setThumbUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24142xd3f7e23b(java.lang.String str) {
        this.f10961x4f47cb86 = str;
        this.f10959xcb94b041[5] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f m24135x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f) super.mo11468x92b714fd(bArr);
    }
}
