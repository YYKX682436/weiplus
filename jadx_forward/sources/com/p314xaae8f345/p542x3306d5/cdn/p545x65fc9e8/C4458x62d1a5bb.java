package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.BatchUpload */
/* loaded from: classes4.dex */
public class C4458x62d1a5bb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb f18425xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb();

    /* renamed from: hasSetFields */
    private final boolean[] f18426xcb94b041 = new boolean[1];

    /* renamed from: com.tencent.mars.cdn.proto.BatchUpload$Request */
    /* loaded from: classes8.dex */
    public static class Request extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request f18427xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request();

        /* renamed from: files */
        private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> f18428x5ceba77 = new java.util.LinkedList<>();

        /* renamed from: hasSetFields */
        private final boolean[] f18429xcb94b041 = new boolean[2];

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38160xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38161x7c90cfc0() {
            return f18427xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38162x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request();
        }

        /* renamed from: addAllElementFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38163xba65d63b(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> collection) {
            this.f18428x5ceba77.addAll(collection);
            this.f18429xcb94b041[1] = true;
            return this;
        }

        /* renamed from: addElementFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38164x58308c1c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf) {
            this.f18428x5ceba77.add(c4489xd7fe2acf);
            this.f18429xcb94b041[1] = true;
            return this;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38165x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request) && n51.f.a(this.f18428x5ceba77, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request) fVar).f18428x5ceba77);
        }

        /* renamed from: getFiles */
        public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> m38166x746c60c1() {
            return this.f18428x5ceba77;
        }

        /* renamed from: hasFieldNumber */
        public boolean m38167x6e095e9(int i17) {
            return this.f18429xcb94b041[i17];
        }

        /* renamed from: hasFiles */
        public boolean m38168x6ffc7fd() {
            return m38167x6e095e9(1);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38169x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                ((g36.f) objArr[0]).g(1, 8, this.f18428x5ceba77);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.g(1, 8, this.f18428x5ceba77) + 0;
            }
            if (i17 == 2) {
                this.f18428x5ceba77.clear();
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
            if (intValue != 1) {
                return -1;
            }
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf c4489xd7fe2acf = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf();
                if (bArr != null && bArr.length > 0) {
                    c4489xd7fe2acf.mo11468x92b714fd(bArr);
                }
                this.f18428x5ceba77.add(c4489xd7fe2acf);
            }
            this.f18429xcb94b041[1] = true;
            return 0;
        }

        /* renamed from: setFiles */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38171x52fa7b35(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4489xd7fe2acf> linkedList) {
            this.f18428x5ceba77 = linkedList;
            this.f18429xcb94b041[1] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m38170x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.mars.cdn.proto.BatchUpload$Result */
    /* loaded from: classes8.dex */
    public static class Result extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result f18430xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result();

        /* renamed from: fileid */
        private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4> f18431xb4089397 = new java.util.LinkedList<>();
        private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33> url = new java.util.LinkedList<>();

        /* renamed from: hasSetFields */
        private final boolean[] f18432xcb94b041 = new boolean[3];

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38173xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38174x7c90cfc0() {
            return f18430xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38175x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result();
        }

        /* renamed from: addAllElementFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38176x9254f053(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4> collection) {
            this.f18431xb4089397.addAll(collection);
            this.f18432xcb94b041[1] = true;
            return this;
        }

        /* renamed from: addAllElementUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38177x4750233(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33> collection) {
            this.url.addAll(collection);
            this.f18432xcb94b041[2] = true;
            return this;
        }

        /* renamed from: addElementFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38178xade0f692(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4) {
            this.f18431xb4089397.add(c4488x9533b2d4);
            this.f18432xcb94b041[1] = true;
            return this;
        }

        /* renamed from: addElementUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38179x2385bc54(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33) {
            this.url.add(c4492x30422e33);
            this.f18432xcb94b041[2] = true;
            return this;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38180x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result result = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result) fVar;
            return n51.f.a(this.f18431xb4089397, result.f18431xb4089397) && n51.f.a(this.url, result.url);
        }

        /* renamed from: getFileid */
        public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4> m38181x191fb68d() {
            return this.f18431xb4089397;
        }

        /* renamed from: getUrl */
        public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33> m38182xb5887639() {
            return this.url;
        }

        /* renamed from: hasFieldNumber */
        public boolean m38183x6e095e9(int i17) {
            return this.f18432xcb94b041[i17];
        }

        /* renamed from: hasFileid */
        public boolean m38184xd8f936d1() {
            return m38183x6e095e9(1);
        }

        /* renamed from: hasUrl */
        public boolean m38185xb7047c75() {
            return m38183x6e095e9(2);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38186x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.g(1, 8, this.f18431xb4089397);
                fVar.g(2, 8, this.url);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.g(1, 8, this.f18431xb4089397) + 0 + b36.f.g(2, 8, this.url);
            }
            if (i17 == 2) {
                this.f18431xb4089397.clear();
                this.url.clear();
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
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
                    if (bArr != null && bArr.length > 0) {
                        c4488x9533b2d4.mo11468x92b714fd(bArr);
                    }
                    this.f18431xb4089397.add(c4488x9533b2d4);
                }
                this.f18432xcb94b041[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
                if (bArr2 != null && bArr2.length > 0) {
                    c4492x30422e33.mo11468x92b714fd(bArr2);
                }
                this.url.add(c4492x30422e33);
            }
            this.f18432xcb94b041[2] = true;
            return 0;
        }

        /* renamed from: setFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38188xc54ea99(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4> linkedList) {
            this.f18431xb4089397 = linkedList;
            this.f18432xcb94b041[1] = true;
            return this;
        }

        /* renamed from: setUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38189xca029dad(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33> linkedList) {
            this.url = linkedList;
            this.f18432xcb94b041[2] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m38187x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38152xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38153x7c90cfc0() {
        return f18425xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38154x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38155x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb)) {
            return false;
        }
        return true;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38156x6e095e9(int i17) {
        return this.f18426xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38157x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb();
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
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb m38158x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb) super.mo11468x92b714fd(bArr);
    }
}
