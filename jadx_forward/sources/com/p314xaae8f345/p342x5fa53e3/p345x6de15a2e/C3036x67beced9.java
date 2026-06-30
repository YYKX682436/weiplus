package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkC2CDownload */
/* loaded from: classes8.dex */
public class C3036x67beced9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 f10745xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9();

    /* renamed from: aeskey */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10746xab4b3f30;

    /* renamed from: app_type */
    private int f10747x459bfa98;

    /* renamed from: bizid */
    private int f10748x596916e;

    /* renamed from: concurrent_count */
    private int f10749xd8183487;

    /* renamed from: debugip */
    private java.lang.String f10751x5be45aba;

    /* renamed from: download_mode */
    private int f10752x1e33efa;

    /* renamed from: file_path */
    private java.lang.String f10753xb1893508;

    /* renamed from: file_size */
    private long f10754xb18ab0e4;

    /* renamed from: file_type */
    private int f10755xb18b601d;

    /* renamed from: file_url */
    private java.lang.String f10756xd42dcc2c;

    /* renamed from: fileid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10757xb4089397;

    /* renamed from: need_report */
    private boolean f10759xd7f014fd;

    /* renamed from: sns_decrypt_key */
    private long f10760x54324066;

    /* renamed from: task_ident */
    private java.lang.String f10761x4daa42b6;

    /* renamed from: custom_headers */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169> f10750x1007a0b8 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10758xcb94b041 = new boolean[16];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23460xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23461x7c90cfc0() {
        return f10745xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23462x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9();
    }

    /* renamed from: addAllElementCustomHeaders */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23463x55bd0299(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169> collection) {
        this.f10750x1007a0b8.addAll(collection);
        this.f10758xcb94b041[12] = true;
        return this;
    }

    /* renamed from: addElementCustomHeaders */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23464x3c28477a(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 c3050xd357a169) {
        this.f10750x1007a0b8.add(c3050xd357a169);
        this.f10758xcb94b041[12] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23465x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 c3036x67beced9 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9) fVar;
        return n51.f.a(this.f10761x4daa42b6, c3036x67beced9.f10761x4daa42b6) && n51.f.a(java.lang.Integer.valueOf(this.f10755xb18b601d), java.lang.Integer.valueOf(c3036x67beced9.f10755xb18b601d)) && n51.f.a(this.f10753xb1893508, c3036x67beced9.f10753xb1893508) && n51.f.a(java.lang.Long.valueOf(this.f10754xb18ab0e4), java.lang.Long.valueOf(c3036x67beced9.f10754xb18ab0e4)) && n51.f.a(this.f10756xd42dcc2c, c3036x67beced9.f10756xd42dcc2c) && n51.f.a(this.f10746xab4b3f30, c3036x67beced9.f10746xab4b3f30) && n51.f.a(this.f10757xb4089397, c3036x67beced9.f10757xb4089397) && n51.f.a(java.lang.Integer.valueOf(this.f10749xd8183487), java.lang.Integer.valueOf(c3036x67beced9.f10749xd8183487)) && n51.f.a(java.lang.Integer.valueOf(this.f10748x596916e), java.lang.Integer.valueOf(c3036x67beced9.f10748x596916e)) && n51.f.a(java.lang.Integer.valueOf(this.f10747x459bfa98), java.lang.Integer.valueOf(c3036x67beced9.f10747x459bfa98)) && n51.f.a(java.lang.Integer.valueOf(this.f10752x1e33efa), java.lang.Integer.valueOf(c3036x67beced9.f10752x1e33efa)) && n51.f.a(this.f10750x1007a0b8, c3036x67beced9.f10750x1007a0b8) && n51.f.a(this.f10751x5be45aba, c3036x67beced9.f10751x5be45aba) && n51.f.a(java.lang.Boolean.valueOf(this.f10759xd7f014fd), java.lang.Boolean.valueOf(c3036x67beced9.f10759xd7f014fd)) && n51.f.a(java.lang.Long.valueOf(this.f10760x54324066), java.lang.Long.valueOf(c3036x67beced9.f10760x54324066));
    }

    /* renamed from: getAeskey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23466x10626226() {
        return this.f10758xcb94b041[6] ? this.f10746xab4b3f30 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getAppType */
    public int m23467xe7ac0c5() {
        return this.f10747x459bfa98;
    }

    /* renamed from: getBizid */
    public int m23468x743437b8() {
        return this.f10748x596916e;
    }

    /* renamed from: getConcurrentCount */
    public int m23469x65b44762() {
        return this.f10749xd8183487;
    }

    /* renamed from: getCustomHeaders */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169> m23470x296ba71f() {
        return this.f10750x1007a0b8;
    }

    /* renamed from: getDebugip */
    public java.lang.String m23471x99b19684() {
        return this.f10758xcb94b041[13] ? this.f10751x5be45aba : "";
    }

    /* renamed from: getDownloadMode */
    public int m23472xa30a84c1() {
        return this.f10752x1e33efa;
    }

    /* renamed from: getFilePath */
    public java.lang.String m23473x5000ed37() {
        return this.f10758xcb94b041[3] ? this.f10753xb1893508 : "";
    }

    /* renamed from: getFileSize */
    public long m23474x50026913() {
        return this.f10754xb18ab0e4;
    }

    /* renamed from: getFileType */
    public int m23475x5003184c() {
        return this.f10755xb18b601d;
    }

    /* renamed from: getFileUrl */
    public java.lang.String m23476xad6d21d() {
        return this.f10758xcb94b041[5] ? this.f10756xd42dcc2c : "";
    }

    /* renamed from: getFileid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23477x191fb68d() {
        return this.f10758xcb94b041[7] ? this.f10757xb4089397 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getNeedReport */
    public boolean m23478x9c463960() {
        return this.f10759xd7f014fd;
    }

    /* renamed from: getSnsDecryptKey */
    public long m23479x5442574() {
        return this.f10760x54324066;
    }

    /* renamed from: getTaskIdent */
    public java.lang.String m23480x8f898b5() {
        return this.f10758xcb94b041[1] ? this.f10761x4daa42b6 : "";
    }

    /* renamed from: hasAeskey */
    public boolean m23481xd03be26a() {
        return m23488x6e095e9(6);
    }

    /* renamed from: hasAppType */
    public boolean m23482x49d14901() {
        return m23488x6e095e9(10);
    }

    /* renamed from: hasBizid */
    public boolean m23483x6c79ef4() {
        return m23488x6e095e9(9);
    }

    /* renamed from: hasConcurrentCount */
    public boolean m23484x60cd39e() {
        return m23488x6e095e9(8);
    }

    /* renamed from: hasCustomHeaders */
    public boolean m23485xc1b2125b() {
        return m23488x6e095e9(12);
    }

    /* renamed from: hasDebugip */
    public boolean m23486xd5081ec0() {
        return m23488x6e095e9(13);
    }

    /* renamed from: hasDownloadMode */
    public boolean m23487x86ebc205() {
        return m23488x6e095e9(11);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23488x6e095e9(int i17) {
        return this.f10758xcb94b041[i17];
    }

    /* renamed from: hasFilePath */
    public boolean m23489x7f7b6c7b() {
        return m23488x6e095e9(3);
    }

    /* renamed from: hasFileSize */
    public boolean m23490x7f7ce857() {
        return m23488x6e095e9(4);
    }

    /* renamed from: hasFileType */
    public boolean m23491x7f7d9790() {
        return m23488x6e095e9(2);
    }

    /* renamed from: hasFileUrl */
    public boolean m23492x462d5a59() {
        return m23488x6e095e9(5);
    }

    /* renamed from: hasFileid */
    public boolean m23493xd8f936d1() {
        return m23488x6e095e9(7);
    }

    /* renamed from: hasNeedReport */
    public boolean m23494xd71df7a4() {
        return m23488x6e095e9(14);
    }

    /* renamed from: hasSnsDecryptKey */
    public boolean m23495x9d8a90b0() {
        return m23488x6e095e9(15);
    }

    /* renamed from: hasTaskIdent */
    public boolean m23496xc8ce01f1() {
        return m23488x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23497x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10761x4daa42b6;
            if (str != null && this.f10758xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f10758xcb94b041[2]) {
                fVar.e(2, this.f10755xb18b601d);
            }
            java.lang.String str2 = this.f10753xb1893508;
            if (str2 != null && this.f10758xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f10758xcb94b041[4]) {
                fVar.h(4, this.f10754xb18ab0e4);
            }
            java.lang.String str3 = this.f10756xd42dcc2c;
            if (str3 != null && this.f10758xcb94b041[5]) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10746xab4b3f30;
            if (gVar != null && this.f10758xcb94b041[6]) {
                fVar.b(6, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10757xb4089397;
            if (gVar2 != null && this.f10758xcb94b041[7]) {
                fVar.b(7, gVar2);
            }
            if (this.f10758xcb94b041[8]) {
                fVar.e(8, this.f10749xd8183487);
            }
            if (this.f10758xcb94b041[9]) {
                fVar.e(9, this.f10748x596916e);
            }
            if (this.f10758xcb94b041[10]) {
                fVar.e(10, this.f10747x459bfa98);
            }
            if (this.f10758xcb94b041[11]) {
                fVar.e(11, this.f10752x1e33efa);
            }
            fVar.g(12, 8, this.f10750x1007a0b8);
            java.lang.String str4 = this.f10751x5be45aba;
            if (str4 != null && this.f10758xcb94b041[13]) {
                fVar.j(13, str4);
            }
            if (this.f10758xcb94b041[14]) {
                fVar.a(14, this.f10759xd7f014fd);
            }
            if (this.f10758xcb94b041[15]) {
                fVar.h(15, this.f10760x54324066);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f10761x4daa42b6;
            if (str5 != null && this.f10758xcb94b041[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (this.f10758xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10755xb18b601d);
            }
            java.lang.String str6 = this.f10753xb1893508;
            if (str6 != null && this.f10758xcb94b041[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (this.f10758xcb94b041[4]) {
                i18 += b36.f.h(4, this.f10754xb18ab0e4);
            }
            java.lang.String str7 = this.f10756xd42dcc2c;
            if (str7 != null && this.f10758xcb94b041[5]) {
                i18 += b36.f.j(5, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10746xab4b3f30;
            if (gVar3 != null && this.f10758xcb94b041[6]) {
                i18 += b36.f.b(6, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10757xb4089397;
            if (gVar4 != null && this.f10758xcb94b041[7]) {
                i18 += b36.f.b(7, gVar4);
            }
            if (this.f10758xcb94b041[8]) {
                i18 += b36.f.e(8, this.f10749xd8183487);
            }
            if (this.f10758xcb94b041[9]) {
                i18 += b36.f.e(9, this.f10748x596916e);
            }
            if (this.f10758xcb94b041[10]) {
                i18 += b36.f.e(10, this.f10747x459bfa98);
            }
            if (this.f10758xcb94b041[11]) {
                i18 += b36.f.e(11, this.f10752x1e33efa);
            }
            int g17 = i18 + b36.f.g(12, 8, this.f10750x1007a0b8);
            java.lang.String str8 = this.f10751x5be45aba;
            if (str8 != null && this.f10758xcb94b041[13]) {
                g17 += b36.f.j(13, str8);
            }
            if (this.f10758xcb94b041[14]) {
                g17 += b36.f.a(14, this.f10759xd7f014fd);
            }
            return this.f10758xcb94b041[15] ? g17 + b36.f.h(15, this.f10760x54324066) : g17;
        }
        if (i17 == 2) {
            this.f10750x1007a0b8.clear();
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
                this.f10761x4daa42b6 = aVar2.k(intValue);
                this.f10758xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10755xb18b601d = aVar2.g(intValue);
                this.f10758xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10753xb1893508 = aVar2.k(intValue);
                this.f10758xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10754xb18ab0e4 = aVar2.i(intValue);
                this.f10758xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10756xd42dcc2c = aVar2.k(intValue);
                this.f10758xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10746xab4b3f30 = aVar2.d(intValue);
                this.f10758xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10757xb4089397 = aVar2.d(intValue);
                this.f10758xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10749xd8183487 = aVar2.g(intValue);
                this.f10758xcb94b041[8] = true;
                return 0;
            case 9:
                this.f10748x596916e = aVar2.g(intValue);
                this.f10758xcb94b041[9] = true;
                return 0;
            case 10:
                this.f10747x459bfa98 = aVar2.g(intValue);
                this.f10758xcb94b041[10] = true;
                return 0;
            case 11:
                this.f10752x1e33efa = aVar2.g(intValue);
                this.f10758xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 c3050xd357a169 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169();
                    if (bArr != null && bArr.length > 0) {
                        c3050xd357a169.mo11468x92b714fd(bArr);
                    }
                    this.f10750x1007a0b8.add(c3050xd357a169);
                }
                this.f10758xcb94b041[12] = true;
                return 0;
            case 13:
                this.f10751x5be45aba = aVar2.k(intValue);
                this.f10758xcb94b041[13] = true;
                return 0;
            case 14:
                this.f10759xd7f014fd = aVar2.c(intValue);
                this.f10758xcb94b041[14] = true;
                return 0;
            case 15:
                this.f10760x54324066 = aVar2.i(intValue);
                this.f10758xcb94b041[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23499x3979632(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10746xab4b3f30 = gVar;
        this.f10758xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setAppType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23500x81ec0e39(int i17) {
        this.f10747x459bfa98 = i17;
        this.f10758xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setBizid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23501x52c2522c(int i17) {
        this.f10748x596916e = i17;
        this.f10758xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setConcurrentCount */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23502x9c8ae0d6(int i17) {
        this.f10749xd8183487 = i17;
        this.f10758xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setCustomHeaders */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23503xbc420d93(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169> linkedList) {
        this.f10750x1007a0b8 = linkedList;
        this.f10758xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setDebugip */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23504xd22e3f8(java.lang.String str) {
        this.f10751x5be45aba = str;
        this.f10758xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setDownloadMode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23505xd9537fcd(int i17) {
        this.f10752x1e33efa = i17;
        this.f10758xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setFilePath */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23506x4ab94e43(java.lang.String str) {
        this.f10753xb1893508 = str;
        this.f10758xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFileSize */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23507x4abaca1f(long j17) {
        this.f10754xb18ab0e4 = j17;
        this.f10758xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFileType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23508x4abb7958(int i17) {
        this.f10755xb18b601d = i17;
        this.f10758xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFileUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23509x7e481f91(java.lang.String str) {
        this.f10756xd42dcc2c = str;
        this.f10758xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFileid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23510xc54ea99(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10757xb4089397 = gVar;
        this.f10758xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setNeedReport */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23511xca6a876c(boolean z17) {
        this.f10759xd7f014fd = z17;
        this.f10758xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setSnsDecryptKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23512x981a8be8(long j17) {
        this.f10760x54324066 = j17;
        this.f10758xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setTaskIdent */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23513x654c5929(java.lang.String str) {
        this.f10761x4daa42b6 = str;
        this.f10758xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 m23498x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9) super.mo11468x92b714fd(bArr);
    }
}
