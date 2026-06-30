package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkC2CUpload */
/* loaded from: classes8.dex */
public class C3042xcbe77492 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 f10939xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492();

    /* renamed from: app_type */
    private int f10940x459bfa98;

    /* renamed from: biz_scene */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b f10941x3be59e60;

    /* renamed from: debugip */
    private java.lang.String f10942x5be45aba;

    /* renamed from: file_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10943xb183c08d;

    /* renamed from: file_path */
    private java.lang.String f10944xb1893508;

    /* renamed from: file_type */
    private int f10945xb18b601d;

    /* renamed from: hasSetFields */
    private final boolean[] f10946xcb94b041 = new boolean[13];

    /* renamed from: is_storage_mode */
    private boolean f10947x9ba95dc;

    /* renamed from: need_report */
    private boolean f10948xd7f014fd;

    /* renamed from: sns_upload_version */
    private int f10949x21585241;

    /* renamed from: task_ident */
    private java.lang.String f10950x4daa42b6;

    /* renamed from: thumb_filedata */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10951x84fcf76f;

    /* renamed from: thumb_filepath */
    private java.lang.String f10952x85026bea;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24071xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24072x7c90cfc0() {
        return f10939xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24073x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24074x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 c3042xcbe77492 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492) fVar;
        return n51.f.a(this.f10950x4daa42b6, c3042xcbe77492.f10950x4daa42b6) && n51.f.a(java.lang.Integer.valueOf(this.f10945xb18b601d), java.lang.Integer.valueOf(c3042xcbe77492.f10945xb18b601d)) && n51.f.a(this.f10944xb1893508, c3042xcbe77492.f10944xb1893508) && n51.f.a(this.f10952x85026bea, c3042xcbe77492.f10952x85026bea) && n51.f.a(this.f10941x3be59e60, c3042xcbe77492.f10941x3be59e60) && n51.f.a(java.lang.Integer.valueOf(this.f10940x459bfa98), java.lang.Integer.valueOf(c3042xcbe77492.f10940x459bfa98)) && n51.f.a(java.lang.Boolean.valueOf(this.f10947x9ba95dc), java.lang.Boolean.valueOf(c3042xcbe77492.f10947x9ba95dc)) && n51.f.a(java.lang.Integer.valueOf(this.f10949x21585241), java.lang.Integer.valueOf(c3042xcbe77492.f10949x21585241)) && n51.f.a(this.f10943xb183c08d, c3042xcbe77492.f10943xb183c08d) && n51.f.a(this.f10951x84fcf76f, c3042xcbe77492.f10951x84fcf76f) && n51.f.a(this.f10942x5be45aba, c3042xcbe77492.f10942x5be45aba) && n51.f.a(java.lang.Boolean.valueOf(this.f10948xd7f014fd), java.lang.Boolean.valueOf(c3042xcbe77492.f10948xd7f014fd));
    }

    /* renamed from: getAppType */
    public int m24075xe7ac0c5() {
        return this.f10940x459bfa98;
    }

    /* renamed from: getBizScene */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b m24076xc76b1caf() {
        return this.f10946xcb94b041[5] ? this.f10941x3be59e60 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b.kC2CScene;
    }

    /* renamed from: getDebugip */
    public java.lang.String m24077x99b19684() {
        return this.f10946xcb94b041[11] ? this.f10942x5be45aba : "";
    }

    /* renamed from: getFileData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24078x4ffb78bc() {
        return this.f10946xcb94b041[9] ? this.f10943xb183c08d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getFilePath */
    public java.lang.String m24079x5000ed37() {
        return this.f10946xcb94b041[3] ? this.f10944xb1893508 : "";
    }

    /* renamed from: getFileType */
    public int m24080x5003184c() {
        return this.f10945xb18b601d;
    }

    /* renamed from: getIsStorageMode */
    public boolean m24081x49fd937e() {
        return this.f10947x9ba95dc;
    }

    /* renamed from: getNeedReport */
    public boolean m24082x9c463960() {
        return this.f10948xd7f014fd;
    }

    /* renamed from: getSnsUploadVersion */
    public int m24083x94e69075() {
        return this.f10949x21585241;
    }

    /* renamed from: getTaskIdent */
    public java.lang.String m24084x8f898b5() {
        return this.f10946xcb94b041[1] ? this.f10950x4daa42b6 : "";
    }

    /* renamed from: getThumbFiledata */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24085x9af16366() {
        return this.f10946xcb94b041[10] ? this.f10951x84fcf76f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getThumbFilepath */
    public java.lang.String m24086x9af6d7e1() {
        return this.f10946xcb94b041[4] ? this.f10952x85026bea : "";
    }

    /* renamed from: hasAppType */
    public boolean m24087x49d14901() {
        return m24090x6e095e9(6);
    }

    /* renamed from: hasBizScene */
    public boolean m24088xf6e59bf3() {
        return m24090x6e095e9(5);
    }

    /* renamed from: hasDebugip */
    public boolean m24089xd5081ec0() {
        return m24090x6e095e9(11);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24090x6e095e9(int i17) {
        return this.f10946xcb94b041[i17];
    }

    /* renamed from: hasFileData */
    public boolean m24091x7f75f800() {
        return m24090x6e095e9(9);
    }

    /* renamed from: hasFilePath */
    public boolean m24092x7f7b6c7b() {
        return m24090x6e095e9(3);
    }

    /* renamed from: hasFileType */
    public boolean m24093x7f7d9790() {
        return m24090x6e095e9(2);
    }

    /* renamed from: hasIsStorageMode */
    public boolean m24094xe243feba() {
        return m24090x6e095e9(7);
    }

    /* renamed from: hasNeedReport */
    public boolean m24095xd71df7a4() {
        return m24090x6e095e9(12);
    }

    /* renamed from: hasSnsUploadVersion */
    public boolean m24096xff9f8bb9() {
        return m24090x6e095e9(8);
    }

    /* renamed from: hasTaskIdent */
    public boolean m24097xc8ce01f1() {
        return m24090x6e095e9(1);
    }

    /* renamed from: hasThumbFiledata */
    public boolean m24098x3337cea2() {
        return m24090x6e095e9(10);
    }

    /* renamed from: hasThumbFilepath */
    public boolean m24099x333d431d() {
        return m24090x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24100x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10950x4daa42b6;
            if (str != null && this.f10946xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f10946xcb94b041[2]) {
                fVar.e(2, this.f10945xb18b601d);
            }
            java.lang.String str2 = this.f10944xb1893508;
            if (str2 != null && this.f10946xcb94b041[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f10952x85026bea;
            if (str3 != null && this.f10946xcb94b041[4]) {
                fVar.j(4, str3);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b enumC3054x8a36563b = this.f10941x3be59e60;
            if (enumC3054x8a36563b != null && this.f10946xcb94b041[5]) {
                fVar.e(5, enumC3054x8a36563b.f11034x6ac9171);
            }
            if (this.f10946xcb94b041[6]) {
                fVar.e(6, this.f10940x459bfa98);
            }
            if (this.f10946xcb94b041[7]) {
                fVar.a(7, this.f10947x9ba95dc);
            }
            if (this.f10946xcb94b041[8]) {
                fVar.e(8, this.f10949x21585241);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10943xb183c08d;
            if (gVar != null && this.f10946xcb94b041[9]) {
                fVar.b(9, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10951x84fcf76f;
            if (gVar2 != null && this.f10946xcb94b041[10]) {
                fVar.b(10, gVar2);
            }
            java.lang.String str4 = this.f10942x5be45aba;
            if (str4 != null && this.f10946xcb94b041[11]) {
                fVar.j(11, str4);
            }
            if (!this.f10946xcb94b041[12]) {
                return 0;
            }
            fVar.a(12, this.f10948xd7f014fd);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f10950x4daa42b6;
            int j17 = (str5 == null || !this.f10946xcb94b041[1]) ? 0 : 0 + b36.f.j(1, str5);
            if (this.f10946xcb94b041[2]) {
                j17 += b36.f.e(2, this.f10945xb18b601d);
            }
            java.lang.String str6 = this.f10944xb1893508;
            if (str6 != null && this.f10946xcb94b041[3]) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f10952x85026bea;
            if (str7 != null && this.f10946xcb94b041[4]) {
                j17 += b36.f.j(4, str7);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b enumC3054x8a36563b2 = this.f10941x3be59e60;
            if (enumC3054x8a36563b2 != null && this.f10946xcb94b041[5]) {
                j17 += b36.f.e(5, enumC3054x8a36563b2.f11034x6ac9171);
            }
            if (this.f10946xcb94b041[6]) {
                j17 += b36.f.e(6, this.f10940x459bfa98);
            }
            if (this.f10946xcb94b041[7]) {
                j17 += b36.f.a(7, this.f10947x9ba95dc);
            }
            if (this.f10946xcb94b041[8]) {
                j17 += b36.f.e(8, this.f10949x21585241);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10943xb183c08d;
            if (gVar3 != null && this.f10946xcb94b041[9]) {
                j17 += b36.f.b(9, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10951x84fcf76f;
            if (gVar4 != null && this.f10946xcb94b041[10]) {
                j17 += b36.f.b(10, gVar4);
            }
            java.lang.String str8 = this.f10942x5be45aba;
            if (str8 != null && this.f10946xcb94b041[11]) {
                j17 += b36.f.j(11, str8);
            }
            return this.f10946xcb94b041[12] ? j17 + b36.f.a(12, this.f10948xd7f014fd) : j17;
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
                this.f10950x4daa42b6 = aVar2.k(intValue);
                this.f10946xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10945xb18b601d = aVar2.g(intValue);
                this.f10946xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10944xb1893508 = aVar2.k(intValue);
                this.f10946xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10952x85026bea = aVar2.k(intValue);
                this.f10946xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10941x3be59e60 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b.m24264x382ad972(aVar2.g(intValue));
                this.f10946xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10940x459bfa98 = aVar2.g(intValue);
                this.f10946xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10947x9ba95dc = aVar2.c(intValue);
                this.f10946xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10949x21585241 = aVar2.g(intValue);
                this.f10946xcb94b041[8] = true;
                return 0;
            case 9:
                this.f10943xb183c08d = aVar2.d(intValue);
                this.f10946xcb94b041[9] = true;
                return 0;
            case 10:
                this.f10951x84fcf76f = aVar2.d(intValue);
                this.f10946xcb94b041[10] = true;
                return 0;
            case 11:
                this.f10942x5be45aba = aVar2.k(intValue);
                this.f10946xcb94b041[11] = true;
                return 0;
            case 12:
                this.f10948xd7f014fd = aVar2.c(intValue);
                this.f10946xcb94b041[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24102x81ec0e39(int i17) {
        this.f10940x459bfa98 = i17;
        this.f10946xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setBizScene */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24103xc2237dbb(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b enumC3054x8a36563b) {
        this.f10941x3be59e60 = enumC3054x8a36563b;
        this.f10946xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setDebugip */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24104xd22e3f8(java.lang.String str) {
        this.f10942x5be45aba = str;
        this.f10946xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setFileData */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24105x4ab3d9c8(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10943xb183c08d = gVar;
        this.f10946xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setFilePath */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24106x4ab94e43(java.lang.String str) {
        this.f10944xb1893508 = str;
        this.f10946xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFileType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24107x4abb7958(int i17) {
        this.f10945xb18b601d = i17;
        this.f10946xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIsStorageMode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24108xdcd3f9f2(boolean z17) {
        this.f10947x9ba95dc = z17;
        this.f10946xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setNeedReport */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24109xca6a876c(boolean z17) {
        this.f10948xd7f014fd = z17;
        this.f10946xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setSnsUploadVersion */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24110x38e32581(int i17) {
        this.f10949x21585241 = i17;
        this.f10946xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setTaskIdent */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24111x654c5929(java.lang.String str) {
        this.f10950x4daa42b6 = str;
        this.f10946xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setThumbFiledata */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24112x2dc7c9da(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10951x84fcf76f = gVar;
        this.f10946xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setThumbFilepath */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24113x2dcd3e55(java.lang.String str) {
        this.f10952x85026bea = str;
        this.f10946xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 m24101x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492) super.mo11468x92b714fd(bArr);
    }
}
