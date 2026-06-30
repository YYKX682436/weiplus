package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderBaseRequest */
/* loaded from: classes2.dex */
public class C27394x1ee46258 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 f59790xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258();

    /* renamed from: ad_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 f59791xf34bd411;

    /* renamed from: client_flag */
    public int f59792xf59f6b60;

    /* renamed from: ctx_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 f59793xf698dbc6;

    /* renamed from: expt_buffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59794x7fec0388;

    /* renamed from: expt_flag */
    public int f59795x20a3a0b4;

    /* renamed from: extSpamInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59796xee0e40d8;

    /* renamed from: live_identity */
    public int f59797xc6d53ab1;

    /* renamed from: object_base_infos */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> f59798x8200ff97;

    /* renamed from: request_id */
    public long f59799x23640cb;

    /* renamed from: userver */
    public int f59801xf73b43f8 = 0;

    /* renamed from: scene */
    public int f59800x683188c = 0;

    public C27394x1ee46258() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        this.f59796xee0e40d8 = gVar;
        this.f59795x20a3a0b4 = 0;
        this.f59793xf698dbc6 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612.m113905x7c90cfc0();
        this.f59799x23640cb = 0L;
        this.f59797xc6d53ab1 = 0;
        this.f59798x8200ff97 = new java.util.LinkedList<>();
        this.f59792xf59f6b60 = 0;
        this.f59791xf34bd411 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5.m114106x7c90cfc0();
        this.f59794x7fec0388 = gVar;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114181xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114182x7c90cfc0() {
        return f59790xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114183x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258();
    }

    /* renamed from: addAllElementObjectBaseInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114184xc9d8bf79(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> collection) {
        this.f59798x8200ff97.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementObject_base_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114185x7a18955b(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> collection) {
        this.f59798x8200ff97.addAll(collection);
        return this;
    }

    /* renamed from: addElementObjectBaseInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114186xc286501a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 c27417xe073a564) {
        this.f59798x8200ff97.add(c27417xe073a564);
        return this;
    }

    /* renamed from: addElementObject_base_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114187xfda481bc(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 c27417xe073a564) {
        this.f59798x8200ff97.add(c27417xe073a564);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114188x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 c27394x1ee46258 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59801xf73b43f8), java.lang.Integer.valueOf(c27394x1ee46258.f59801xf73b43f8)) && n51.f.a(java.lang.Integer.valueOf(this.f59800x683188c), java.lang.Integer.valueOf(c27394x1ee46258.f59800x683188c)) && n51.f.a(this.f59796xee0e40d8, c27394x1ee46258.f59796xee0e40d8) && n51.f.a(java.lang.Integer.valueOf(this.f59795x20a3a0b4), java.lang.Integer.valueOf(c27394x1ee46258.f59795x20a3a0b4)) && n51.f.a(this.f59793xf698dbc6, c27394x1ee46258.f59793xf698dbc6) && n51.f.a(java.lang.Long.valueOf(this.f59799x23640cb), java.lang.Long.valueOf(c27394x1ee46258.f59799x23640cb)) && n51.f.a(java.lang.Integer.valueOf(this.f59797xc6d53ab1), java.lang.Integer.valueOf(c27394x1ee46258.f59797xc6d53ab1)) && n51.f.a(this.f59798x8200ff97, c27394x1ee46258.f59798x8200ff97) && n51.f.a(java.lang.Integer.valueOf(this.f59792xf59f6b60), java.lang.Integer.valueOf(c27394x1ee46258.f59792xf59f6b60)) && n51.f.a(this.f59791xf34bd411, c27394x1ee46258.f59791xf34bd411) && n51.f.a(this.f59794x7fec0388, c27394x1ee46258.f59794x7fec0388);
    }

    /* renamed from: getAdBasereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114189x10b693d4() {
        return this.f59791xf34bd411;
    }

    /* renamed from: getAd_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114190xe18c8c07() {
        return this.f59791xf34bd411;
    }

    /* renamed from: getClientFlag */
    public int m114191x2ff041cd() {
        return this.f59792xf59f6b60;
    }

    /* renamed from: getClient_flag */
    public int m114192xcf75b22a() {
        return this.f59792xf59f6b60;
    }

    /* renamed from: getCtxInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m114193x7f862b3f() {
        return this.f59793xf698dbc6;
    }

    /* renamed from: getCtx_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m114194x7273193c() {
        return this.f59793xf698dbc6;
    }

    /* renamed from: getExptBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114195xb1655d0d() {
        return this.f59794x7fec0388;
    }

    /* renamed from: getExptFlag */
    public int m114196x93f9779() {
        return this.f59795x20a3a0b4;
    }

    /* renamed from: getExpt_buffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114197x59c24a52() {
        return this.f59794x7fec0388;
    }

    /* renamed from: getExpt_flag */
    public int m114198x201111fe() {
        return this.f59795x20a3a0b4;
    }

    /* renamed from: getExtSpamInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114199xc7e487a2() {
        return this.f59796xee0e40d8;
    }

    /* renamed from: getLiveIdentity */
    public int m114200xc64e6c40() {
        return this.f59797xc6d53ab1;
    }

    /* renamed from: getLive_identity */
    public int m114201x8434f6fb() {
        return this.f59797xc6d53ab1;
    }

    /* renamed from: getObjectBaseInfos */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> m114202x6c705a7f() {
        return this.f59798x8200ff97;
    }

    /* renamed from: getObject_base_infos */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> m114203xd53586e1() {
        return this.f59798x8200ff97;
    }

    /* renamed from: getRequestId */
    public long m114204x28ca0554() {
        return this.f59799x23640cb;
    }

    /* renamed from: getRequest_id */
    public long m114205xf076f8c1() {
        return this.f59799x23640cb;
    }

    /* renamed from: getScene */
    public int m114206x7520bed6() {
        return this.f59800x683188c;
    }

    /* renamed from: getUserver */
    public int m114207x35087fc2() {
        return this.f59801xf73b43f8;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114208x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59801xf73b43f8);
            fVar.e(2, this.f59800x683188c);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59796xee0e40d8;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f59795x20a3a0b4);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd612 = this.f59793xf698dbc6;
            if (c27385x938cd612 != null) {
                fVar.i(5, c27385x938cd612.mo75928xcd1e8d8());
                this.f59793xf698dbc6.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f59799x23640cb);
            fVar.e(7, this.f59797xc6d53ab1);
            fVar.g(8, 8, this.f59798x8200ff97);
            fVar.e(10, this.f59792xf59f6b60);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb5 = this.f59791xf34bd411;
            if (c27392x69488bb5 != null) {
                fVar.i(11, c27392x69488bb5.mo75928xcd1e8d8());
                this.f59791xf34bd411.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59794x7fec0388;
            if (gVar2 != null) {
                fVar.b(12, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f59801xf73b43f8) + 0 + b36.f.e(2, this.f59800x683188c);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59796xee0e40d8;
            if (gVar3 != null) {
                e17 += b36.f.b(3, gVar3);
            }
            int e18 = e17 + b36.f.e(4, this.f59795x20a3a0b4);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd6122 = this.f59793xf698dbc6;
            if (c27385x938cd6122 != null) {
                e18 += b36.f.i(5, c27385x938cd6122.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(6, this.f59799x23640cb) + b36.f.e(7, this.f59797xc6d53ab1) + b36.f.g(8, 8, this.f59798x8200ff97) + b36.f.e(10, this.f59792xf59f6b60);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb52 = this.f59791xf34bd411;
            if (c27392x69488bb52 != null) {
                h17 += b36.f.i(11, c27392x69488bb52.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59794x7fec0388;
            return gVar4 != null ? h17 + b36.f.b(12, gVar4) : h17;
        }
        if (i17 == 2) {
            this.f59798x8200ff97.clear();
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
                this.f59801xf73b43f8 = aVar2.g(intValue);
                return 0;
            case 2:
                this.f59800x683188c = aVar2.g(intValue);
                return 0;
            case 3:
                this.f59796xee0e40d8 = aVar2.d(intValue);
                return 0;
            case 4:
                this.f59795x20a3a0b4 = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd6123 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612();
                    if (bArr != null && bArr.length > 0) {
                        c27385x938cd6123.mo11468x92b714fd(bArr);
                    }
                    this.f59793xf698dbc6 = c27385x938cd6123;
                }
                return 0;
            case 6:
                this.f59799x23640cb = aVar2.i(intValue);
                return 0;
            case 7:
                this.f59797xc6d53ab1 = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 c27417xe073a564 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27417xe073a564.mo11468x92b714fd(bArr2);
                    }
                    this.f59798x8200ff97.add(c27417xe073a564);
                }
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f59792xf59f6b60 = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb53 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5();
                    if (bArr3 != null && bArr3.length > 0) {
                        c27392x69488bb53.mo11468x92b714fd(bArr3);
                    }
                    this.f59791xf34bd411 = c27392x69488bb53;
                }
                return 0;
            case 12:
                this.f59794x7fec0388 = aVar2.d(intValue);
                return 0;
        }
    }

    /* renamed from: setAdBasereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114210x6d0a5448(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb5) {
        this.f59791xf34bd411 = c27392x69488bb5;
        return this;
    }

    /* renamed from: setAd_basereq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114211xfb0da13(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb5) {
        this.f59791xf34bd411 = c27392x69488bb5;
        return this;
    }

    /* renamed from: setClientFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114212x5e148fd9(int i17) {
        this.f59792xf59f6b60 = i17;
        return this;
    }

    /* renamed from: setClient_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114213x65db259e(int i17) {
        this.f59792xf59f6b60 = i17;
        return this;
    }

    /* renamed from: setCtxInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114214xf2f778b3(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd612) {
        this.f59793xf698dbc6 = c27385x938cd612;
        return this;
    }

    /* renamed from: setCtx_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114215x6d2b7a48(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd612) {
        this.f59793xf698dbc6 = c27385x938cd612;
        return this;
    }

    /* renamed from: setExptBuffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114216xdf89ab19(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59794x7fec0388 = gVar;
        return this;
    }

    /* renamed from: setExptFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114217x3f7f885(int i17) {
        this.f59795x20a3a0b4 = i17;
        return this;
    }

    /* renamed from: setExpt_buffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114218xf027bdc6(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59794x7fec0388 = gVar;
        return this;
    }

    /* renamed from: setExpt_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114219x7c64d272(int i17) {
        this.f59795x20a3a0b4 = i17;
        return this;
    }

    /* renamed from: setExtSpamInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114220x5e49fb16(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59796xee0e40d8 = gVar;
        return this;
    }

    /* renamed from: setLiveIdentity */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114221xfc97674c(int i17) {
        this.f59797xc6d53ab1 = i17;
        return this;
    }

    /* renamed from: setLive_identity */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114222x170b5d6f(int i17) {
        this.f59797xc6d53ab1 = i17;
        return this;
    }

    /* renamed from: setObjectBaseInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114223xa346f3f3(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> linkedList) {
        this.f59798x8200ff97 = linkedList;
        return this;
    }

    /* renamed from: setObject_base_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114224xb0cb9355(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564> linkedList) {
        this.f59798x8200ff97 = linkedList;
        return this;
    }

    /* renamed from: setRequestId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114225x851dc5c8(long j17) {
        this.f59799x23640cb = j17;
        return this;
    }

    /* renamed from: setRequest_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114226x1e9b46cd(long j17) {
        this.f59799x23640cb = j17;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114227x53aed94a(int i17) {
        this.f59800x683188c = i17;
        return this;
    }

    /* renamed from: setUserver */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114228xa879cd36(int i17) {
        this.f59801xf73b43f8 = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 m114209x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27394x1ee46258) super.mo11468x92b714fd(bArr);
    }
}
