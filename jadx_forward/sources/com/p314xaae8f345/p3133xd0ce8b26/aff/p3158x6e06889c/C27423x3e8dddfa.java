package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderSyncClientInfo */
/* loaded from: classes8.dex */
public class C27423x3e8dddfa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa f60036xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa();

    /* renamed from: finder_entrance_title_length_limit */
    public int f60038x6e247f39 = 0;

    /* renamed from: finder_entrance_single_title_length_limit */
    public int f60037xf941e370 = 0;

    /* renamed from: longvideo_client_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 f60039x5a4ee3e2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8.m115686x7c90cfc0();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115214xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115215x7c90cfc0() {
        return f60036xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115216x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115217x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa c27423x3e8dddfa = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f60038x6e247f39), java.lang.Integer.valueOf(c27423x3e8dddfa.f60038x6e247f39)) && n51.f.a(java.lang.Integer.valueOf(this.f60037xf941e370), java.lang.Integer.valueOf(c27423x3e8dddfa.f60037xf941e370)) && n51.f.a(this.f60039x5a4ee3e2, c27423x3e8dddfa.f60039x5a4ee3e2);
    }

    /* renamed from: getFinderEntranceSingleTitleLengthLimit */
    public int m115218xdd4bcff7() {
        return this.f60037xf941e370;
    }

    /* renamed from: getFinderEntranceTitleLengthLimit */
    public int m115219x6a32ed0f() {
        return this.f60038x6e247f39;
    }

    /* renamed from: getFinder_entrance_single_title_length_limit */
    public int m115220x9f07acba() {
        return this.f60037xf941e370;
    }

    /* renamed from: getFinder_entrance_title_length_limit */
    public int m115221x29da352f() {
        return this.f60038x6e247f39;
    }

    /* renamed from: getLongvideoClientInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 m115222x4d0b90c2() {
        return this.f60039x5a4ee3e2;
    }

    /* renamed from: getLongvideo_client_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 m115223x65fab62c() {
        return this.f60039x5a4ee3e2;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115224x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f60038x6e247f39);
            fVar.e(2, this.f60037xf941e370);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 c27435x42233b8 = this.f60039x5a4ee3e2;
            if (c27435x42233b8 != null) {
                fVar.i(101, c27435x42233b8.mo75928xcd1e8d8());
                this.f60039x5a4ee3e2.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f60038x6e247f39) + 0 + b36.f.e(2, this.f60037xf941e370);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 c27435x42233b82 = this.f60039x5a4ee3e2;
            return c27435x42233b82 != null ? e17 + b36.f.i(101, c27435x42233b82.mo75928xcd1e8d8()) : e17;
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
            this.f60038x6e247f39 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60037xf941e370 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 c27435x42233b83 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8();
            if (bArr != null && bArr.length > 0) {
                c27435x42233b83.mo11468x92b714fd(bArr);
            }
            this.f60039x5a4ee3e2 = c27435x42233b83;
        }
        return 0;
    }

    /* renamed from: setFinderEntranceSingleTitleLengthLimit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115226x49576703(int i17) {
        this.f60037xf941e370 = i17;
        return this;
    }

    /* renamed from: setFinderEntranceTitleLengthLimit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115227x504fbd1b(int i17) {
        this.f60038x6e247f39 = i17;
        return this;
    }

    /* renamed from: setFinder_entrance_single_title_length_limit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115228xc21c9d2e(int i17) {
        this.f60037xf941e370 = i17;
        return this;
    }

    /* renamed from: setFinder_entrance_title_length_limit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115229x15b81f3b(int i17) {
        this.f60038x6e247f39 = i17;
        return this;
    }

    /* renamed from: setLongvideoClientInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115230x9b505036(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 c27435x42233b8) {
        this.f60039x5a4ee3e2 = c27435x42233b8;
        return this;
    }

    /* renamed from: setLongvideo_client_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115231x360d68a0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27435x42233b8 c27435x42233b8) {
        this.f60039x5a4ee3e2 = c27435x42233b8;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa m115225x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa) super.mo11468x92b714fd(bArr);
    }
}
