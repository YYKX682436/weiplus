package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadRequest */
/* loaded from: classes8.dex */
public class C4482x1d6e50c7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 f18617xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7();

    /* renamed from: append_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request f18618x8f937f8a;

    /* renamed from: apptype */
    private int f18619xd0bc10db;

    /* renamed from: base */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 f18620x2e06d1;

    /* renamed from: behavior */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 f18621x5a0eb252;

    /* renamed from: bizid */
    private int f18622x596916e;

    /* renamed from: fileid_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f f18623x7078012d;

    /* renamed from: filekey */
    private java.lang.String f18624xcd09e763;

    /* renamed from: finder_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 f18625x24d1d31a;

    /* renamed from: hasSetFields */
    private final boolean[] f18626xcb94b041 = new boolean[20];

    /* renamed from: hls_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf f18627x3c54e263;

    /* renamed from: image_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 f18628xcbad61cf;

    /* renamed from: mode */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b f18629x3339a3;

    /* renamed from: preload_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 f18630xd9c91f7d;

    /* renamed from: sns_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 f18631x85a31f6c;

    /* renamed from: storage */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b f18632x8fb0427b;
    private java.lang.String uri;

    /* renamed from: url_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f f18633xf5e053e3;

    /* renamed from: url_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 f18634xc62c3655;

    /* renamed from: verify */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 f18635xcf208879;

    /* renamed from: video_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 f18636x4f783cef;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38640xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38641x7c90cfc0() {
        return f18617xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38642x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38643x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 c4482x1d6e50c7 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7) fVar;
        return n51.f.a(this.f18624xcd09e763, c4482x1d6e50c7.f18624xcd09e763) && n51.f.a(java.lang.Integer.valueOf(this.f18622x596916e), java.lang.Integer.valueOf(c4482x1d6e50c7.f18622x596916e)) && n51.f.a(java.lang.Integer.valueOf(this.f18619xd0bc10db), java.lang.Integer.valueOf(c4482x1d6e50c7.f18619xd0bc10db)) && n51.f.a(this.f18620x2e06d1, c4482x1d6e50c7.f18620x2e06d1) && n51.f.a(this.f18632x8fb0427b, c4482x1d6e50c7.f18632x8fb0427b) && n51.f.a(this.f18629x3339a3, c4482x1d6e50c7.f18629x3339a3) && n51.f.a(this.f18621x5a0eb252, c4482x1d6e50c7.f18621x5a0eb252) && n51.f.a(this.f18628xcbad61cf, c4482x1d6e50c7.f18628xcbad61cf) && n51.f.a(this.f18636x4f783cef, c4482x1d6e50c7.f18636x4f783cef) && n51.f.a(this.f18631x85a31f6c, c4482x1d6e50c7.f18631x85a31f6c) && n51.f.a(this.f18633xf5e053e3, c4482x1d6e50c7.f18633xf5e053e3) && n51.f.a(this.f18635xcf208879, c4482x1d6e50c7.f18635xcf208879) && n51.f.a(this.f18623x7078012d, c4482x1d6e50c7.f18623x7078012d) && n51.f.a(this.f18634xc62c3655, c4482x1d6e50c7.f18634xc62c3655) && n51.f.a(this.uri, c4482x1d6e50c7.uri) && n51.f.a(this.f18618x8f937f8a, c4482x1d6e50c7.f18618x8f937f8a) && n51.f.a(this.f18630xd9c91f7d, c4482x1d6e50c7.f18630xd9c91f7d) && n51.f.a(this.f18627x3c54e263, c4482x1d6e50c7.f18627x3c54e263) && n51.f.a(this.f18625x24d1d31a, c4482x1d6e50c7.f18625x24d1d31a);
    }

    /* renamed from: getAppendTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request m38644x6ebc13b5() {
        return this.f18626xcb94b041[16] ? this.f18618x8f937f8a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request.m38001xaf65a0fc();
    }

    /* renamed from: getApptype */
    public int m38645xe894ca5() {
        return this.f18619xd0bc10db;
    }

    /* renamed from: getBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38646xfb7d6f47() {
        return this.f18626xcb94b041[4] ? this.f18620x2e06d1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1.m38058xaf65a0fc();
    }

    /* renamed from: getBehavior */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38647xd5e8efc8() {
        return this.f18626xcb94b041[7] ? this.f18621x5a0eb252 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672.m38191xaf65a0fc();
    }

    /* renamed from: getBizid */
    public int m38648x743437b8() {
        return this.f18622x596916e;
    }

    /* renamed from: getFileidTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f m38649x7e3f51b2() {
        return this.f18626xcb94b041[13] ? this.f18623x7078012d : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f.m38833xaf65a0fc();
    }

    /* renamed from: getFilekey */
    public java.lang.String m38650xad7232d() {
        return this.f18626xcb94b041[1] ? this.f18624xcd09e763 : "";
    }

    /* renamed from: getFinderOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38651x196375f7() {
        return this.f18626xcb94b041[19] ? this.f18625x24d1d31a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909.m38953xaf65a0fc();
    }

    /* renamed from: getHlsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m38652x1cb68b3a() {
        return this.f18626xcb94b041[18] ? this.f18627x3c54e263 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf.m39116xaf65a0fc();
    }

    /* renamed from: getImageOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 m38653x489d88ce() {
        return this.f18626xcb94b041[8] ? this.f18628xcbad61cf : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3.m39147xaf65a0fc();
    }

    /* renamed from: getMode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b m38654xfb82a219() {
        return this.f18626xcb94b041[6] ? this.f18629x3339a3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b.DOWNLOAD_MODE_STORAGE;
    }

    /* renamed from: getPreloadOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 m38655xe4c2d7e0() {
        return this.f18626xcb94b041[17] ? this.f18630xd9c91f7d : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075.m39343xaf65a0fc();
    }

    /* renamed from: getSnsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m38656x2f980911() {
        return this.f18626xcb94b041[10] ? this.f18631x85a31f6c : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626.m39445xaf65a0fc();
    }

    /* renamed from: getStorage */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b m38657xcd7d7e45() {
        return this.f18626xcb94b041[5] ? this.f18632x8fb0427b : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b.m39490xaf65a0fc();
    }

    /* renamed from: getUri */
    public java.lang.String m38658xb5887636() {
        return this.f18626xcb94b041[15] ? this.uri : "";
    }

    /* renamed from: getUrlOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f m38659x3336e9ba() {
        return this.f18626xcb94b041[11] ? this.f18633xf5e053e3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f.m39828xaf65a0fc();
    }

    /* renamed from: getUrlTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 m38660x33a85b5e() {
        return this.f18626xcb94b041[14] ? this.f18634xc62c3655 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7.m39802xaf65a0fc();
    }

    /* renamed from: getVerify */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 m38661x3437ab6f() {
        return this.f18626xcb94b041[12] ? this.f18635xcf208879 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3.m38569xaf65a0fc();
    }

    /* renamed from: getVideoOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 m38662xc07ac9ae() {
        return this.f18626xcb94b041[9] ? this.f18636x4f783cef : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3.m39845xaf65a0fc();
    }

    /* renamed from: hasAppendTask */
    public boolean m38663xa993d1f9() {
        return m38668x6e095e9(16);
    }

    /* renamed from: hasApptype */
    public boolean m38664x49dfd4e1() {
        return m38668x6e095e9(3);
    }

    /* renamed from: hasBase */
    public boolean m38665x2982308b() {
        return m38668x6e095e9(4);
    }

    /* renamed from: hasBehavior */
    public boolean m38666x5636f0c() {
        return m38668x6e095e9(7);
    }

    /* renamed from: hasBizid */
    public boolean m38667x6c79ef4() {
        return m38668x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38668x6e095e9(int i17) {
        return this.f18626xcb94b041[i17];
    }

    /* renamed from: hasFileidTask */
    public boolean m38669xb9170ff6() {
        return m38668x6e095e9(13);
    }

    /* renamed from: hasFilekey */
    public boolean m38670x462dab69() {
        return m38668x6e095e9(1);
    }

    /* renamed from: hasFinderOpt */
    public boolean m38671xd938df33() {
        return m38668x6e095e9(19);
    }

    /* renamed from: hasHlsOpt */
    public boolean m38672xdc900b7e() {
        return m38668x6e095e9(18);
    }

    /* renamed from: hasImageOpt */
    public boolean m38673x78180812() {
        return m38668x6e095e9(8);
    }

    /* renamed from: hasMode */
    public boolean m38674x2987635d() {
        return m38668x6e095e9(6);
    }

    /* renamed from: hasPreloadOpt */
    public boolean m38675x1f9a9624() {
        return m38668x6e095e9(17);
    }

    /* renamed from: hasSnsOpt */
    public boolean m38676xef718955() {
        return m38668x6e095e9(10);
    }

    /* renamed from: hasStorage */
    public boolean m38677x8d40681() {
        return m38668x6e095e9(5);
    }

    /* renamed from: hasUri */
    public boolean m38678xb7047c72() {
        return m38668x6e095e9(15);
    }

    /* renamed from: hasUrlOpt */
    public boolean m38679xf31069fe() {
        return m38668x6e095e9(11);
    }

    /* renamed from: hasUrlTask */
    public boolean m38680x6efee39a() {
        return m38668x6e095e9(14);
    }

    /* renamed from: hasVerify */
    public boolean m38681xf4112bb3() {
        return m38668x6e095e9(12);
    }

    /* renamed from: hasVideoOpt */
    public boolean m38682xeff548f2() {
        return m38668x6e095e9(9);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38683x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18624xcd09e763;
            if (str != null && this.f18626xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18626xcb94b041[2]) {
                fVar.e(2, this.f18622x596916e);
            }
            if (this.f18626xcb94b041[3]) {
                fVar.e(3, this.f18619xd0bc10db);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1 = this.f18620x2e06d1;
            if (c4454x1f7af1 != null && this.f18626xcb94b041[4]) {
                fVar.i(4, c4454x1f7af1.mo75928xcd1e8d8());
                this.f18620x2e06d1.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b c4525xf2e8da5b = this.f18632x8fb0427b;
            if (c4525xf2e8da5b != null && this.f18626xcb94b041[5]) {
                fVar.i(5, c4525xf2e8da5b.mo75928xcd1e8d8());
                this.f18632x8fb0427b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b = this.f18629x3339a3;
            if (enumC4481x4be3466b != null && this.f18626xcb94b041[6]) {
                fVar.e(6, enumC4481x4be3466b.f18616x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 c4459x5de91672 = this.f18621x5a0eb252;
            if (c4459x5de91672 != null && this.f18626xcb94b041[7]) {
                fVar.i(7, c4459x5de91672.mo75928xcd1e8d8());
                this.f18621x5a0eb252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 c4503xe2fa9ce3 = this.f18628xcbad61cf;
            if (c4503xe2fa9ce3 != null && this.f18626xcb94b041[8]) {
                fVar.i(8, c4503xe2fa9ce3.mo75928xcd1e8d8());
                this.f18628xcbad61cf.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 c4539xb68c6dc3 = this.f18636x4f783cef;
            if (c4539xb68c6dc3 != null && this.f18626xcb94b041[9]) {
                fVar.i(9, c4539xb68c6dc3.mo75928xcd1e8d8());
                this.f18636x4f783cef.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 c4522xac1da626 = this.f18631x85a31f6c;
            if (c4522xac1da626 != null && this.f18626xcb94b041[10]) {
                fVar.i(10, c4522xac1da626.mo75928xcd1e8d8());
                this.f18631x85a31f6c.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f c4537xe9a0a4f = this.f18633xf5e053e3;
            if (c4537xe9a0a4f != null && this.f18626xcb94b041[11]) {
                fVar.i(11, c4537xe9a0a4f.mo75928xcd1e8d8());
                this.f18633xf5e053e3.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 c4477xc73a58e3 = this.f18635xcf208879;
            if (c4477xc73a58e3 != null && this.f18626xcb94b041[12]) {
                fVar.i(12, c4477xc73a58e3.mo75928xcd1e8d8());
                this.f18635xcf208879.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f c4486x8030e17f = this.f18623x7078012d;
            if (c4486x8030e17f != null && this.f18626xcb94b041[13]) {
                fVar.i(13, c4486x8030e17f.mo75928xcd1e8d8());
                this.f18623x7078012d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 c4536x1e77baf7 = this.f18634xc62c3655;
            if (c4536x1e77baf7 != null && this.f18626xcb94b041[14]) {
                fVar.i(14, c4536x1e77baf7.mo75928xcd1e8d8());
                this.f18634xc62c3655.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.uri;
            if (str2 != null && this.f18626xcb94b041[15]) {
                fVar.j(15, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request request = this.f18618x8f937f8a;
            if (request != null && this.f18626xcb94b041[16]) {
                fVar.i(16, request.mo75928xcd1e8d8());
                this.f18618x8f937f8a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 c4515x6bb45075 = this.f18630xd9c91f7d;
            if (c4515x6bb45075 != null && this.f18626xcb94b041[17]) {
                fVar.i(17, c4515x6bb45075.mo75928xcd1e8d8());
                this.f18630xd9c91f7d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf c4501x46cebcf = this.f18627x3c54e263;
            if (c4501x46cebcf != null && this.f18626xcb94b041[18]) {
                fVar.i(18, c4501x46cebcf.mo75928xcd1e8d8());
                this.f18627x3c54e263.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 c4493xe5589909 = this.f18625x24d1d31a;
            if (c4493xe5589909 != null && this.f18626xcb94b041[19]) {
                fVar.i(19, c4493xe5589909.mo75928xcd1e8d8());
                this.f18625x24d1d31a.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f18624xcd09e763;
            if (str3 != null && this.f18626xcb94b041[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (this.f18626xcb94b041[2]) {
                i18 += b36.f.e(2, this.f18622x596916e);
            }
            if (this.f18626xcb94b041[3]) {
                i18 += b36.f.e(3, this.f18619xd0bc10db);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af12 = this.f18620x2e06d1;
            if (c4454x1f7af12 != null && this.f18626xcb94b041[4]) {
                i18 += b36.f.i(4, c4454x1f7af12.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b c4525xf2e8da5b2 = this.f18632x8fb0427b;
            if (c4525xf2e8da5b2 != null && this.f18626xcb94b041[5]) {
                i18 += b36.f.i(5, c4525xf2e8da5b2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b2 = this.f18629x3339a3;
            if (enumC4481x4be3466b2 != null && this.f18626xcb94b041[6]) {
                i18 += b36.f.e(6, enumC4481x4be3466b2.f18616x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 c4459x5de916722 = this.f18621x5a0eb252;
            if (c4459x5de916722 != null && this.f18626xcb94b041[7]) {
                i18 += b36.f.i(7, c4459x5de916722.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 c4503xe2fa9ce32 = this.f18628xcbad61cf;
            if (c4503xe2fa9ce32 != null && this.f18626xcb94b041[8]) {
                i18 += b36.f.i(8, c4503xe2fa9ce32.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 c4539xb68c6dc32 = this.f18636x4f783cef;
            if (c4539xb68c6dc32 != null && this.f18626xcb94b041[9]) {
                i18 += b36.f.i(9, c4539xb68c6dc32.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 c4522xac1da6262 = this.f18631x85a31f6c;
            if (c4522xac1da6262 != null && this.f18626xcb94b041[10]) {
                i18 += b36.f.i(10, c4522xac1da6262.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f c4537xe9a0a4f2 = this.f18633xf5e053e3;
            if (c4537xe9a0a4f2 != null && this.f18626xcb94b041[11]) {
                i18 += b36.f.i(11, c4537xe9a0a4f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 c4477xc73a58e32 = this.f18635xcf208879;
            if (c4477xc73a58e32 != null && this.f18626xcb94b041[12]) {
                i18 += b36.f.i(12, c4477xc73a58e32.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f c4486x8030e17f2 = this.f18623x7078012d;
            if (c4486x8030e17f2 != null && this.f18626xcb94b041[13]) {
                i18 += b36.f.i(13, c4486x8030e17f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 c4536x1e77baf72 = this.f18634xc62c3655;
            if (c4536x1e77baf72 != null && this.f18626xcb94b041[14]) {
                i18 += b36.f.i(14, c4536x1e77baf72.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.uri;
            if (str4 != null && this.f18626xcb94b041[15]) {
                i18 += b36.f.j(15, str4);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request request2 = this.f18618x8f937f8a;
            if (request2 != null && this.f18626xcb94b041[16]) {
                i18 += b36.f.i(16, request2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 c4515x6bb450752 = this.f18630xd9c91f7d;
            if (c4515x6bb450752 != null && this.f18626xcb94b041[17]) {
                i18 += b36.f.i(17, c4515x6bb450752.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf c4501x46cebcf2 = this.f18627x3c54e263;
            if (c4501x46cebcf2 != null && this.f18626xcb94b041[18]) {
                i18 += b36.f.i(18, c4501x46cebcf2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 c4493xe55899092 = this.f18625x24d1d31a;
            return (c4493xe55899092 == null || !this.f18626xcb94b041[19]) ? i18 : i18 + b36.f.i(19, c4493xe55899092.mo75928xcd1e8d8());
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
                this.f18624xcd09e763 = aVar2.k(intValue);
                this.f18626xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18622x596916e = aVar2.g(intValue);
                this.f18626xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18619xd0bc10db = aVar2.g(intValue);
                this.f18626xcb94b041[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af13 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
                    if (bArr != null && bArr.length > 0) {
                        c4454x1f7af13.mo11468x92b714fd(bArr);
                    }
                    this.f18620x2e06d1 = c4454x1f7af13;
                }
                this.f18626xcb94b041[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b c4525xf2e8da5b3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4525xf2e8da5b3.mo11468x92b714fd(bArr2);
                    }
                    this.f18632x8fb0427b = c4525xf2e8da5b3;
                }
                this.f18626xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18629x3339a3 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b.m38635x382ad972(aVar2.g(intValue));
                this.f18626xcb94b041[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 c4459x5de916723 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4459x5de916723.mo11468x92b714fd(bArr3);
                    }
                    this.f18621x5a0eb252 = c4459x5de916723;
                }
                this.f18626xcb94b041[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 c4503xe2fa9ce33 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4503xe2fa9ce33.mo11468x92b714fd(bArr4);
                    }
                    this.f18628xcbad61cf = c4503xe2fa9ce33;
                }
                this.f18626xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 c4539xb68c6dc33 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4539xb68c6dc33.mo11468x92b714fd(bArr5);
                    }
                    this.f18636x4f783cef = c4539xb68c6dc33;
                }
                this.f18626xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 c4522xac1da6263 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4522xac1da6263.mo11468x92b714fd(bArr6);
                    }
                    this.f18631x85a31f6c = c4522xac1da6263;
                }
                this.f18626xcb94b041[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f c4537xe9a0a4f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f();
                    if (bArr7 != null && bArr7.length > 0) {
                        c4537xe9a0a4f3.mo11468x92b714fd(bArr7);
                    }
                    this.f18633xf5e053e3 = c4537xe9a0a4f3;
                }
                this.f18626xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 c4477xc73a58e33 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3();
                    if (bArr8 != null && bArr8.length > 0) {
                        c4477xc73a58e33.mo11468x92b714fd(bArr8);
                    }
                    this.f18635xcf208879 = c4477xc73a58e33;
                }
                this.f18626xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f c4486x8030e17f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f();
                    if (bArr9 != null && bArr9.length > 0) {
                        c4486x8030e17f3.mo11468x92b714fd(bArr9);
                    }
                    this.f18623x7078012d = c4486x8030e17f3;
                }
                this.f18626xcb94b041[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 c4536x1e77baf73 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7();
                    if (bArr10 != null && bArr10.length > 0) {
                        c4536x1e77baf73.mo11468x92b714fd(bArr10);
                    }
                    this.f18634xc62c3655 = c4536x1e77baf73;
                }
                this.f18626xcb94b041[14] = true;
                return 0;
            case 15:
                this.uri = aVar2.k(intValue);
                this.f18626xcb94b041[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request request3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request();
                    if (bArr11 != null && bArr11.length > 0) {
                        request3.mo11468x92b714fd(bArr11);
                    }
                    this.f18618x8f937f8a = request3;
                }
                this.f18626xcb94b041[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 c4515x6bb450753 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075();
                    if (bArr12 != null && bArr12.length > 0) {
                        c4515x6bb450753.mo11468x92b714fd(bArr12);
                    }
                    this.f18630xd9c91f7d = c4515x6bb450753;
                }
                this.f18626xcb94b041[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf c4501x46cebcf3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf();
                    if (bArr13 != null && bArr13.length > 0) {
                        c4501x46cebcf3.mo11468x92b714fd(bArr13);
                    }
                    this.f18627x3c54e263 = c4501x46cebcf3;
                }
                this.f18626xcb94b041[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 c4493xe55899093 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909();
                    if (bArr14 != null && bArr14.length > 0) {
                        c4493xe55899093.mo11468x92b714fd(bArr14);
                    }
                    this.f18625x24d1d31a = c4493xe55899093;
                }
                this.f18626xcb94b041[19] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppendTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38685x9ce061c1(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Request request) {
        this.f18618x8f937f8a = request;
        this.f18626xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setApptype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38686x81fa9a19(int i17) {
        this.f18619xd0bc10db = i17;
        this.f18626xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38687x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1) {
        this.f18620x2e06d1 = c4454x1f7af1;
        this.f18626xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBehavior */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38688xd0a150d4(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 c4459x5de91672) {
        this.f18621x5a0eb252 = c4459x5de91672;
        this.f18626xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setBizid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38689x52c2522c(int i17) {
        this.f18622x596916e = i17;
        this.f18626xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFileidTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38690xac639fbe(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4486x8030e17f c4486x8030e17f) {
        this.f18623x7078012d = c4486x8030e17f;
        this.f18626xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setFilekey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38691x7e4870a1(java.lang.String str) {
        this.f18624xcd09e763 = str;
        this.f18626xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFinderOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38692x75b7366b(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 c4493xe5589909) {
        this.f18625x24d1d31a = c4493xe5589909;
        this.f18626xcb94b041[19] = true;
        return this;
    }

    /* renamed from: setHlsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38693xfebbf46(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf c4501x46cebcf) {
        this.f18627x3c54e263 = c4501x46cebcf;
        this.f18626xcb94b041[18] = true;
        return this;
    }

    /* renamed from: setImageOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38694x4355e9da(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4503xe2fa9ce3 c4503xe2fa9ce3) {
        this.f18628xcbad61cf = c4503xe2fa9ce3;
        this.f18626xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setMode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38695x764d6925(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b) {
        this.f18629x3339a3 = enumC4481x4be3466b;
        this.f18626xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setPreloadOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38696x12e725ec(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4515x6bb45075 c4515x6bb45075) {
        this.f18630xd9c91f7d = c4515x6bb45075;
        this.f18626xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setSnsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38697x22cd3d1d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 c4522xac1da626) {
        this.f18631x85a31f6c = c4522xac1da626;
        this.f18626xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setStorage */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38698x40eecbb9(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4525xf2e8da5b c4525xf2e8da5b) {
        this.f18632x8fb0427b = c4525xf2e8da5b;
        this.f18626xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUri */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38699xca029daa(java.lang.String str) {
        this.uri = str;
        this.f18626xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setUrlOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38700x266c1dc6(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4537xe9a0a4f c4537xe9a0a4f) {
        this.f18633xf5e053e3 = c4537xe9a0a4f;
        this.f18626xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setUrlTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38701xa719a8d2(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4536x1e77baf7 c4536x1e77baf7) {
        this.f18634xc62c3655 = c4536x1e77baf7;
        this.f18626xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setVerify */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38702x276cdf7b(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4477xc73a58e3 c4477xc73a58e3) {
        this.f18635xcf208879 = c4477xc73a58e3;
        this.f18626xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setVideoOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38703xbb332aba(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4539xb68c6dc3 c4539xb68c6dc3) {
        this.f18636x4f783cef = c4539xb68c6dc3;
        this.f18626xcb94b041[9] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 m38684x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4482x1d6e50c7) super.mo11468x92b714fd(bArr);
    }
}
