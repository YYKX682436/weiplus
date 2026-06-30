package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.AppendPut */
/* loaded from: classes4.dex */
public class C4453xef33fd75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 f18388xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75();

    /* renamed from: hasSetFields */
    private final boolean[] f18389xcb94b041 = new boolean[1];

    /* renamed from: com.tencent.mars.cdn.proto.AppendPut$Request */
    /* loaded from: classes8.dex */
    public static class Request extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request f18390xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request();

        /* renamed from: data_ */
        private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18391x5af05f5;

        /* renamed from: fileid */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 f18392xb4089397;

        /* renamed from: filetype */
        private int f18393xd43766b6;

        /* renamed from: hasSetFields */
        private final boolean[] f18394xcb94b041 = new boolean[4];

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38030xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38031x7c90cfc0() {
            return f18390xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38032x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38033x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request request = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request) fVar;
            return n51.f.a(this.f18391x5af05f5, request.f18391x5af05f5) && n51.f.a(java.lang.Integer.valueOf(this.f18393xd43766b6), java.lang.Integer.valueOf(request.f18393xd43766b6)) && n51.f.a(this.f18392xb4089397, request.f18392xb4089397);
        }

        /* renamed from: getData_ */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38034x744cac3f() {
            return this.f18394xcb94b041[1] ? this.f18391x5af05f5 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        }

        /* renamed from: getFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 m38035x191fb68d() {
            return this.f18394xcb94b041[3] ? this.f18392xb4089397 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6.m38847xaf65a0fc();
        }

        /* renamed from: getFiletype */
        public int m38036x5011a42c() {
            return this.f18393xd43766b6;
        }

        /* renamed from: hasData_ */
        public boolean m38037x6e0137b() {
            return m38038x6e095e9(1);
        }

        /* renamed from: hasFieldNumber */
        public boolean m38038x6e095e9(int i17) {
            return this.f18394xcb94b041[i17];
        }

        /* renamed from: hasFileid */
        public boolean m38039xd8f936d1() {
            return m38038x6e095e9(3);
        }

        /* renamed from: hasFiletype */
        public boolean m38040x7f8c2370() {
            return m38038x6e095e9(2);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38041x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18391x5af05f5;
                if (gVar != null && this.f18394xcb94b041[1]) {
                    fVar.b(1, gVar);
                }
                if (this.f18394xcb94b041[2]) {
                    fVar.e(2, this.f18393xd43766b6);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6 = this.f18392xb4089397;
                if (c4487x363e7af6 != null && this.f18394xcb94b041[3]) {
                    fVar.i(3, c4487x363e7af6.mo75928xcd1e8d8());
                    this.f18392xb4089397.mo75956x3d5d1f78(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18391x5af05f5;
                if (gVar2 != null && this.f18394xcb94b041[1]) {
                    i18 = 0 + b36.f.b(1, gVar2);
                }
                if (this.f18394xcb94b041[2]) {
                    i18 += b36.f.e(2, this.f18393xd43766b6);
                }
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af62 = this.f18392xb4089397;
                return (c4487x363e7af62 == null || !this.f18394xcb94b041[3]) ? i18 : i18 + b36.f.i(3, c4487x363e7af62.mo75928xcd1e8d8());
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
                this.f18391x5af05f5 = aVar2.d(intValue);
                this.f18394xcb94b041[1] = true;
                return 0;
            }
            if (intValue == 2) {
                this.f18393xd43766b6 = aVar2.g(intValue);
                this.f18394xcb94b041[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af63 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6();
                if (bArr != null && bArr.length > 0) {
                    c4487x363e7af63.mo11468x92b714fd(bArr);
                }
                this.f18392xb4089397 = c4487x363e7af63;
            }
            this.f18394xcb94b041[3] = true;
            return 0;
        }

        /* renamed from: setData_ */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38043x52dac6b3(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
            this.f18391x5af05f5 = gVar;
            this.f18394xcb94b041[1] = true;
            return this;
        }

        /* renamed from: setFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38044xc54ea99(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6) {
            this.f18392xb4089397 = c4487x363e7af6;
            this.f18394xcb94b041[3] = true;
            return this;
        }

        /* renamed from: setFiletype */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38045x4aca0538(int i17) {
            this.f18393xd43766b6 = i17;
            this.f18394xcb94b041[2] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m38042x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: com.tencent.mars.cdn.proto.AppendPut$Result */
    /* loaded from: classes8.dex */
    public static class Result extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

        /* renamed from: DEFAULT_INSTANCE */
        private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result f18395xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result();

        /* renamed from: fileid */
        private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 f18396xb4089397;

        /* renamed from: hasSetFields */
        private final boolean[] f18397xcb94b041 = new boolean[2];

        /* renamed from: create */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38047xaf65a0fc() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result();
        }

        /* renamed from: getDefaultInstance */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38048x7c90cfc0() {
            return f18395xb3e828f3;
        }

        /* renamed from: newBuilder */
        public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38049x3136c9db() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result();
        }

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38050x59bc66e() {
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: compareContent */
        public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result) && n51.f.a(this.f18396xb4089397, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result) fVar).f18396xb4089397);
        }

        /* renamed from: getFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 m38051x191fb68d() {
            return this.f18397xcb94b041[1] ? this.f18396xb4089397 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4.m38864xaf65a0fc();
        }

        /* renamed from: hasFieldNumber */
        public boolean m38052x6e095e9(int i17) {
            return this.f18397xcb94b041[i17];
        }

        /* renamed from: hasFileid */
        public boolean m38053xd8f936d1() {
            return m38052x6e095e9(1);
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38054x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
            mo11468x92b714fd(fVar.m75960xfb7e5820());
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: newInstance */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
            return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result();
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4 = this.f18396xb4089397;
                if (c4488x9533b2d4 != null && this.f18397xcb94b041[1]) {
                    fVar.i(1, c4488x9533b2d4.mo75928xcd1e8d8());
                    this.f18396xb4089397.mo75956x3d5d1f78(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d42 = this.f18396xb4089397;
                if (c4488x9533b2d42 == null || !this.f18397xcb94b041[1]) {
                    return 0;
                }
                return 0 + b36.f.i(1, c4488x9533b2d42.mo75928xcd1e8d8());
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
            if (intValue != 1) {
                return -1;
            }
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d43 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4();
                if (bArr != null && bArr.length > 0) {
                    c4488x9533b2d43.mo11468x92b714fd(bArr);
                }
                this.f18396xb4089397 = c4488x9533b2d43;
            }
            this.f18397xcb94b041[1] = true;
            return 0;
        }

        /* renamed from: setFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38056xc54ea99(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4488x9533b2d4 c4488x9533b2d4) {
            this.f18396xb4089397 = c4488x9533b2d4;
            this.f18397xcb94b041[1] = true;
            return this;
        }

        /* renamed from: mergeFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m38055x60f45402(byte[] bArr) {
            mo11468x92b714fd(bArr);
            return this;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
        /* renamed from: parseFrom */
        public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result mo11468x92b714fd(byte[] bArr) {
            return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result) super.mo11468x92b714fd(bArr);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38022xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38023x7c90cfc0() {
        return f18388xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38024x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38025x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75)) {
            return false;
        }
        return true;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38026x6e095e9(int i17) {
        return this.f18389xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38027x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75();
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
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 m38028x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75) super.mo11468x92b714fd(bArr);
    }
}
