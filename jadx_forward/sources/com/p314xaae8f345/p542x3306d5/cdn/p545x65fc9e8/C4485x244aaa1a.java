package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.EmbedUpload */
/* loaded from: classes4.dex */
public class C4485x244aaa1a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a f18662xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a();

    /* renamed from: hasSetFields */
    private final boolean[] f18663xcb94b041 = new boolean[1];

    /* renamed from: com.tencent.mars.cdn.proto.EmbedUpload$Request */
    /* loaded from: classes8.dex */
    public static class Request extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request f18664xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request();

        /* renamed from: files */
        private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> f18665x5ceba77 = new java.util.LinkedList<>();

        /* renamed from: hasSetFields */
        private final boolean[] f18666xcb94b041 = new boolean[3];

        /* renamed from: legacy */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 f18667xbe0af3c9;

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38794xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38795x7c90cfc0() {
            return f18664xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38796x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request();
        }

        /* renamed from: addAllElementFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38797xba65d63b(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> collection) {
            this.f18665x5ceba77.addAll(collection);
            this.f18666xcb94b041[2] = true;
            return this;
        }

        /* renamed from: addElementFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38798x58308c1c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf) {
            this.f18665x5ceba77.add(c4489xd7fe2acf);
            this.f18666xcb94b041[2] = true;
            return this;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38799x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request request = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request) fVar;
            return n51.f.a(this.f18667xbe0af3c9, request.f18667xbe0af3c9) && n51.f.a(this.f18665x5ceba77, request.f18665x5ceba77);
        }

        /* renamed from: getFiles */
        public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> m38800x746c60c1() {
            return this.f18665x5ceba77;
        }

        /* renamed from: getLegacy */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 m38801x232216bf() {
            return this.f18666xcb94b041[1] ? this.f18667xbe0af3c9 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870.m39191xaf65a0fc();
        }

        /* renamed from: hasFieldNumber */
        public boolean m38802x6e095e9(int i17) {
            return this.f18666xcb94b041[i17];
        }

        /* renamed from: hasFiles */
        public boolean m38803x6ffc7fd() {
            return m38802x6e095e9(2);
        }

        /* renamed from: hasLegacy */
        public boolean m38804xe2fb9703() {
            return m38802x6e095e9(1);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38805x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 c4506xe03c0870 = this.f18667xbe0af3c9;
                if (c4506xe03c0870 != null && this.f18666xcb94b041[1]) {
                    fVar.i(1, c4506xe03c0870.mo75928xcd1e8d8());
                    this.f18667xbe0af3c9.mo75956x3d5d1f78(fVar);
                }
                fVar.g(2, 8, this.f18665x5ceba77);
                return 0;
            }
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 c4506xe03c08702 = this.f18667xbe0af3c9;
                if (c4506xe03c08702 != null && this.f18666xcb94b041[1]) {
                    i18 = 0 + b36.f.i(1, c4506xe03c08702.mo75928xcd1e8d8());
                }
                return i18 + b36.f.g(2, 8, this.f18665x5ceba77);
            }
            if (i17 == 2) {
                this.f18665x5ceba77.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 c4506xe03c08703 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870();
                    if (bArr != null && bArr.length > 0) {
                        c4506xe03c08703.mo11468x92b714fd(bArr);
                    }
                    this.f18667xbe0af3c9 = c4506xe03c08703;
                }
                this.f18666xcb94b041[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
                if (bArr2 != null && bArr2.length > 0) {
                    c4489xd7fe2acf.mo11468x92b714fd(bArr2);
                }
                this.f18665x5ceba77.add(c4489xd7fe2acf);
            }
            this.f18666xcb94b041[2] = true;
            return 0;
        }

        /* renamed from: setFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38807x52fa7b35(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> linkedList) {
            this.f18665x5ceba77 = linkedList;
            this.f18666xcb94b041[2] = true;
            return this;
        }

        /* renamed from: setLegacy */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38808x16574acb(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4506xe03c0870 c4506xe03c0870) {
            this.f18667xbe0af3c9 = c4506xe03c0870;
            this.f18666xcb94b041[1] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m38806x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.mars.cdn.proto.EmbedUpload$Result */
    /* loaded from: classes8.dex */
    public static class Result extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result f18668xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result();

        /* renamed from: fileid */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 f18669xb4089397;

        /* renamed from: hasSetFields */
        private final boolean[] f18670xcb94b041 = new boolean[6];

        /* renamed from: main */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 f18671x3305b9;
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 mid;

        /* renamed from: thumb */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 f18672x693b1d6;
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 url;

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38810xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38811x7c90cfc0() {
            return f18668xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38812x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38813x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result result = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result) fVar;
            return n51.f.a(this.f18669xb4089397, result.f18669xb4089397) && n51.f.a(this.url, result.url) && n51.f.a(this.f18671x3305b9, result.f18671x3305b9) && n51.f.a(this.f18672x693b1d6, result.f18672x693b1d6) && n51.f.a(this.mid, result.mid);
        }

        /* renamed from: getFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38814x191fb68d() {
            return this.f18670xcb94b041[1] ? this.f18669xb4089397 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4.m38864xaf65a0fc();
        }

        /* renamed from: getMain */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38815xfb826e2f() {
            return this.f18670xcb94b041[3] ? this.f18671x3305b9 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610.m38907xaf65a0fc();
        }

        /* renamed from: getMid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38816xb5885712() {
            return this.f18670xcb94b041[5] ? this.mid : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610.m38907xaf65a0fc();
        }

        /* renamed from: getThumb */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38817x75315820() {
            return this.f18670xcb94b041[4] ? this.f18672x693b1d6 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610.m38907xaf65a0fc();
        }

        /* renamed from: getUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38818xb5887639() {
            return this.f18670xcb94b041[2] ? this.url : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33.m38936xaf65a0fc();
        }

        /* renamed from: hasFieldNumber */
        public boolean m38819x6e095e9(int i17) {
            return this.f18670xcb94b041[i17];
        }

        /* renamed from: hasFileid */
        public boolean m38820xd8f936d1() {
            return m38819x6e095e9(1);
        }

        /* renamed from: hasMain */
        public boolean m38821x29872f73() {
            return m38819x6e095e9(3);
        }

        /* renamed from: hasMid */
        public boolean m38822xb7045d4e() {
            return m38819x6e095e9(5);
        }

        /* renamed from: hasThumb */
        public boolean m38823x7c4bf5c() {
            return m38819x6e095e9(4);
        }

        /* renamed from: hasUrl */
        public boolean m38824xb7047c75() {
            return m38819x6e095e9(2);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38825x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4 = this.f18669xb4089397;
                if (c4488x9533b2d4 != null && this.f18670xcb94b041[1]) {
                    fVar.i(1, c4488x9533b2d4.mo75928xcd1e8d8());
                    this.f18669xb4089397.mo75956x3d5d1f78(fVar);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33 = this.url;
                if (c4492x30422e33 != null && this.f18670xcb94b041[2]) {
                    fVar.i(2, c4492x30422e33.mo75928xcd1e8d8());
                    this.url.mo75956x3d5d1f78(fVar);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610 = this.f18671x3305b9;
                if (c4490xd802b610 != null && this.f18670xcb94b041[3]) {
                    fVar.i(3, c4490xd802b610.mo75928xcd1e8d8());
                    this.f18671x3305b9.mo75956x3d5d1f78(fVar);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6102 = this.f18672x693b1d6;
                if (c4490xd802b6102 != null && this.f18670xcb94b041[4]) {
                    fVar.i(4, c4490xd802b6102.mo75928xcd1e8d8());
                    this.f18672x693b1d6.mo75956x3d5d1f78(fVar);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6103 = this.mid;
                if (c4490xd802b6103 != null && this.f18670xcb94b041[5]) {
                    fVar.i(5, c4490xd802b6103.mo75928xcd1e8d8());
                    this.mid.mo75956x3d5d1f78(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d42 = this.f18669xb4089397;
                if (c4488x9533b2d42 != null && this.f18670xcb94b041[1]) {
                    i18 = 0 + b36.f.i(1, c4488x9533b2d42.mo75928xcd1e8d8());
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e332 = this.url;
                if (c4492x30422e332 != null && this.f18670xcb94b041[2]) {
                    i18 += b36.f.i(2, c4492x30422e332.mo75928xcd1e8d8());
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6104 = this.f18671x3305b9;
                if (c4490xd802b6104 != null && this.f18670xcb94b041[3]) {
                    i18 += b36.f.i(3, c4490xd802b6104.mo75928xcd1e8d8());
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6105 = this.f18672x693b1d6;
                if (c4490xd802b6105 != null && this.f18670xcb94b041[4]) {
                    i18 += b36.f.i(4, c4490xd802b6105.mo75928xcd1e8d8());
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6106 = this.mid;
                return (c4490xd802b6106 == null || !this.f18670xcb94b041[5]) ? i18 : i18 + b36.f.i(5, c4490xd802b6106.mo75928xcd1e8d8());
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
            if (intValue == 1) {
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d43 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
                    if (bArr != null && bArr.length > 0) {
                        c4488x9533b2d43.mo11468x92b714fd(bArr);
                    }
                    this.f18669xb4089397 = c4488x9533b2d43;
                }
                this.f18670xcb94b041[1] = true;
                return 0;
            }
            if (intValue == 2) {
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e333 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4492x30422e333.mo11468x92b714fd(bArr2);
                    }
                    this.url = c4492x30422e333;
                }
                this.f18670xcb94b041[2] = true;
                return 0;
            }
            if (intValue == 3) {
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6107 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4490xd802b6107.mo11468x92b714fd(bArr3);
                    }
                    this.f18671x3305b9 = c4490xd802b6107;
                }
                this.f18670xcb94b041[3] = true;
                return 0;
            }
            if (intValue == 4) {
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6108 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4490xd802b6108.mo11468x92b714fd(bArr4);
                    }
                    this.f18672x693b1d6 = c4490xd802b6108;
                }
                this.f18670xcb94b041[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b6109 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
                if (bArr5 != null && bArr5.length > 0) {
                    c4490xd802b6109.mo11468x92b714fd(bArr5);
                }
                this.mid = c4490xd802b6109;
            }
            this.f18670xcb94b041[5] = true;
            return 0;
        }

        /* renamed from: setFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38827xc54ea99(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4) {
            this.f18669xb4089397 = c4488x9533b2d4;
            this.f18670xcb94b041[1] = true;
            return this;
        }

        /* renamed from: setMain */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38828x764d353b(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610) {
            this.f18671x3305b9 = c4490xd802b610;
            this.f18670xcb94b041[3] = true;
            return this;
        }

        /* renamed from: setMid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38829xca027e86(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610) {
            this.mid = c4490xd802b610;
            this.f18670xcb94b041[5] = true;
            return this;
        }

        /* renamed from: setThumb */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38830x53bf7294(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610) {
            this.f18672x693b1d6 = c4490xd802b610;
            this.f18670xcb94b041[4] = true;
            return this;
        }

        /* renamed from: setUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38831xca029dad(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33) {
            this.url = c4492x30422e33;
            this.f18670xcb94b041[2] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m38826x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38786xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38787x7c90cfc0() {
        return f18662xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38788x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38789x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a)) {
            return false;
        }
        return true;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38790x6e095e9(int i17) {
        return this.f18663xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38791x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 0;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                ((java.lang.Integer) objArr[2]).intValue();
            }
            return -1;
        }
        c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
        for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
            if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                aVar.b();
            }
        }
        return 0;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a m38792x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a) super.mo11468x92b714fd(bArr);
    }
}
