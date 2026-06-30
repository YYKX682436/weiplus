package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage */
/* loaded from: classes8.dex */
public class C15727xf21b07cd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: aeskey */
    public java.lang.String f36543xab4b3f30;

    /* renamed from: crypt_ver */
    public int f36544x5f3d4d52;

    /* renamed from: hd_height */
    public int f36545x286b2dca;

    /* renamed from: hd_size */
    public int f36546x2d9d4964;

    /* renamed from: hd_width */
    public int f36547x8643f0c3;

    /* renamed from: hevc_hd_size */
    public int f36548x88e3b68f;

    /* renamed from: hevc_mid_size */
    public int f36549xaaead7cd;

    /* renamed from: hevc_thumb_size */
    public int f36550x624a9bbf;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f220231md5;

    /* renamed from: mid_height */
    public int f36551xbff4c6fe;

    /* renamed from: mid_size */
    public int f36552x9d639f98;

    /* renamed from: mid_width */
    public int f36553xf48610f;

    /* renamed from: thumb_height */
    public int f36554xdcf73fb0;

    /* renamed from: thumb_size */
    public int f36555x99b09cca;

    /* renamed from: thumb_width */
    public int f36556x9c9b0a1d;
    public java.lang.String url;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63889xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd c15727xf21b07cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd) fVar;
        return n51.f.a(this.f36543xab4b3f30, c15727xf21b07cd.f36543xab4b3f30) && n51.f.a(java.lang.Integer.valueOf(this.f36544x5f3d4d52), java.lang.Integer.valueOf(c15727xf21b07cd.f36544x5f3d4d52)) && n51.f.a(this.url, c15727xf21b07cd.url) && n51.f.a(java.lang.Integer.valueOf(this.f36546x2d9d4964), java.lang.Integer.valueOf(c15727xf21b07cd.f36546x2d9d4964)) && n51.f.a(java.lang.Integer.valueOf(this.f36552x9d639f98), java.lang.Integer.valueOf(c15727xf21b07cd.f36552x9d639f98)) && n51.f.a(java.lang.Integer.valueOf(this.f36555x99b09cca), java.lang.Integer.valueOf(c15727xf21b07cd.f36555x99b09cca)) && n51.f.a(java.lang.Integer.valueOf(this.f36554xdcf73fb0), java.lang.Integer.valueOf(c15727xf21b07cd.f36554xdcf73fb0)) && n51.f.a(java.lang.Integer.valueOf(this.f36556x9c9b0a1d), java.lang.Integer.valueOf(c15727xf21b07cd.f36556x9c9b0a1d)) && n51.f.a(this.f220231md5, c15727xf21b07cd.f220231md5) && n51.f.a(java.lang.Integer.valueOf(this.f36551xbff4c6fe), java.lang.Integer.valueOf(c15727xf21b07cd.f36551xbff4c6fe)) && n51.f.a(java.lang.Integer.valueOf(this.f36553xf48610f), java.lang.Integer.valueOf(c15727xf21b07cd.f36553xf48610f)) && n51.f.a(java.lang.Integer.valueOf(this.f36545x286b2dca), java.lang.Integer.valueOf(c15727xf21b07cd.f36545x286b2dca)) && n51.f.a(java.lang.Integer.valueOf(this.f36547x8643f0c3), java.lang.Integer.valueOf(c15727xf21b07cd.f36547x8643f0c3)) && n51.f.a(java.lang.Integer.valueOf(this.f36548x88e3b68f), java.lang.Integer.valueOf(c15727xf21b07cd.f36548x88e3b68f)) && n51.f.a(java.lang.Integer.valueOf(this.f36549xaaead7cd), java.lang.Integer.valueOf(c15727xf21b07cd.f36549xaaead7cd)) && n51.f.a(java.lang.Integer.valueOf(this.f36550x624a9bbf), java.lang.Integer.valueOf(c15727xf21b07cd.f36550x624a9bbf));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36543xab4b3f30;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f36544x5f3d4d52);
            java.lang.String str2 = this.url;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f36546x2d9d4964);
            fVar.e(5, this.f36552x9d639f98);
            fVar.e(6, this.f36555x99b09cca);
            fVar.e(7, this.f36554xdcf73fb0);
            fVar.e(8, this.f36556x9c9b0a1d);
            java.lang.String str3 = this.f220231md5;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f36551xbff4c6fe);
            fVar.e(11, this.f36553xf48610f);
            fVar.e(12, this.f36545x286b2dca);
            fVar.e(13, this.f36547x8643f0c3);
            fVar.e(14, this.f36548x88e3b68f);
            fVar.e(15, this.f36549xaaead7cd);
            fVar.e(16, this.f36550x624a9bbf);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36543xab4b3f30;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f36544x5f3d4d52);
            java.lang.String str5 = this.url;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f36546x2d9d4964) + b36.f.e(5, this.f36552x9d639f98) + b36.f.e(6, this.f36555x99b09cca) + b36.f.e(7, this.f36554xdcf73fb0) + b36.f.e(8, this.f36556x9c9b0a1d);
            java.lang.String str6 = this.f220231md5;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f36551xbff4c6fe) + b36.f.e(11, this.f36553xf48610f) + b36.f.e(12, this.f36545x286b2dca) + b36.f.e(13, this.f36547x8643f0c3) + b36.f.e(14, this.f36548x88e3b68f) + b36.f.e(15, this.f36549xaaead7cd) + b36.f.e(16, this.f36550x624a9bbf);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd c15727xf21b07cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15727xf21b07cd.f36543xab4b3f30 = aVar2.k(intValue);
                return 0;
            case 2:
                c15727xf21b07cd.f36544x5f3d4d52 = aVar2.g(intValue);
                return 0;
            case 3:
                c15727xf21b07cd.url = aVar2.k(intValue);
                return 0;
            case 4:
                c15727xf21b07cd.f36546x2d9d4964 = aVar2.g(intValue);
                return 0;
            case 5:
                c15727xf21b07cd.f36552x9d639f98 = aVar2.g(intValue);
                return 0;
            case 6:
                c15727xf21b07cd.f36555x99b09cca = aVar2.g(intValue);
                return 0;
            case 7:
                c15727xf21b07cd.f36554xdcf73fb0 = aVar2.g(intValue);
                return 0;
            case 8:
                c15727xf21b07cd.f36556x9c9b0a1d = aVar2.g(intValue);
                return 0;
            case 9:
                c15727xf21b07cd.f220231md5 = aVar2.k(intValue);
                return 0;
            case 10:
                c15727xf21b07cd.f36551xbff4c6fe = aVar2.g(intValue);
                return 0;
            case 11:
                c15727xf21b07cd.f36553xf48610f = aVar2.g(intValue);
                return 0;
            case 12:
                c15727xf21b07cd.f36545x286b2dca = aVar2.g(intValue);
                return 0;
            case 13:
                c15727xf21b07cd.f36547x8643f0c3 = aVar2.g(intValue);
                return 0;
            case 14:
                c15727xf21b07cd.f36548x88e3b68f = aVar2.g(intValue);
                return 0;
            case 15:
                c15727xf21b07cd.f36549xaaead7cd = aVar2.g(intValue);
                return 0;
            case 16:
                c15727xf21b07cd.f36550x624a9bbf = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63890x3979632(java.lang.String str) {
        this.f36543xab4b3f30 = str;
        return this;
    }

    /* renamed from: setCrypt_ver */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63891xbafe7f10(int i17) {
        this.f36544x5f3d4d52 = i17;
        return this;
    }

    /* renamed from: setHd_height */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63892x842c5f88(int i17) {
        this.f36545x286b2dca = i17;
        return this;
    }

    /* renamed from: setHd_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63893xdedbd2a2(int i17) {
        this.f36546x2d9d4964 = i17;
        return this;
    }

    /* renamed from: setHd_width */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63894xfcd68f45(int i17) {
        this.f36547x8643f0c3 = i17;
        return this;
    }

    /* renamed from: setHevc_hd_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63895x201f4411(int i17) {
        this.f36548x88e3b68f = i17;
        return this;
    }

    /* renamed from: setHevc_mid_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63896xfb20fa8b(int i17) {
        this.f36549xaaead7cd = i17;
        return this;
    }

    /* renamed from: setHevc_thumb_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63897x7d8306fd(int i17) {
        this.f36550x624a9bbf = i17;
        return this;
    }

    /* renamed from: setMd5 */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63898xca027dbc(java.lang.String str) {
        this.f220231md5 = str;
        return this;
    }

    /* renamed from: setMid_height */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63899xdc59cd00(int i17) {
        this.f36551xbff4c6fe = i17;
        return this;
    }

    /* renamed from: setMid_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63900x13f63e1a(int i17) {
        this.f36552x9d639f98 = i17;
        return this;
    }

    /* renamed from: setMid_width */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63901x6b0992cd(int i17) {
        this.f36553xf48610f = i17;
        return this;
    }

    /* renamed from: setThumb_height */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63902x7432cd32(int i17) {
        this.f36554xdcf73fb0 = i17;
        return this;
    }

    /* renamed from: setThumb_size */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63903xb615a2cc(int i17) {
        this.f36555x99b09cca = i17;
        return this;
    }

    /* renamed from: setThumb_width */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63904xcd6c45b(int i17) {
        this.f36556x9c9b0a1d = i17;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd m63905xca029dad(java.lang.String str) {
        this.url = str;
        return this;
    }
}
