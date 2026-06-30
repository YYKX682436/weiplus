package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CCronetTaskResult */
/* loaded from: classes15.dex */
public class C27075x8c4d86f0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 f58778xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0();

    /* renamed from: hasSetFields */
    private final boolean[] f58779xcb94b041 = new boolean[7];

    /* renamed from: performance_ */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 f58780x509ef62f;

    /* renamed from: socket_reused */
    private boolean f58781x24cccebc;

    /* renamed from: status_code */
    private int f58782xcad9be1a;

    /* renamed from: status_text */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58783xcae1555a;

    /* renamed from: use_http2 */
    private boolean f58784xf44faff2;

    /* renamed from: use_quic */
    private boolean f58785xef1f71f6;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109260xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109261x7c90cfc0() {
        return f58778xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109262x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109263x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 c27075x8c4d86f0 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f58785xef1f71f6), java.lang.Boolean.valueOf(c27075x8c4d86f0.f58785xef1f71f6)) && n51.f.a(java.lang.Boolean.valueOf(this.f58784xf44faff2), java.lang.Boolean.valueOf(c27075x8c4d86f0.f58784xf44faff2)) && n51.f.a(java.lang.Boolean.valueOf(this.f58781x24cccebc), java.lang.Boolean.valueOf(c27075x8c4d86f0.f58781x24cccebc)) && n51.f.a(java.lang.Integer.valueOf(this.f58782xcad9be1a), java.lang.Integer.valueOf(c27075x8c4d86f0.f58782xcad9be1a)) && n51.f.a(this.f58783xcae1555a, c27075x8c4d86f0.f58783xcae1555a) && n51.f.a(this.f58780x509ef62f, c27075x8c4d86f0.f58780x509ef62f);
    }

    /* renamed from: getPerformance_ */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m109264xb19188a5() {
        return this.f58779xcb94b041[6] ? this.f58780x509ef62f : com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941.m110096xaf65a0fc();
    }

    /* renamed from: getSocketReused */
    public boolean m109265x5bc7a439() {
        return this.f58781x24cccebc;
    }

    /* renamed from: getStatusCode */
    public int m109266xfd0160f5() {
        return this.f58782xcad9be1a;
    }

    /* renamed from: getStatusText */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109267xfd08f835() {
        return this.f58779xcb94b041[5] ? this.f58783xcae1555a : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getUseHttp2 */
    public boolean m109268x69b6ecd9() {
        return this.f58784xf44faff2;
    }

    /* renamed from: getUseQuic */
    public boolean m109269x34f97c2f() {
        return this.f58785xef1f71f6;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109270x6e095e9(int i17) {
        return this.f58779xcb94b041[i17];
    }

    /* renamed from: hasPerformance_ */
    public boolean m109271x9572c5e9() {
        return m109270x6e095e9(6);
    }

    /* renamed from: hasSocketReused */
    public boolean m109272x3fa8e17d() {
        return m109270x6e095e9(3);
    }

    /* renamed from: hasStatusCode */
    public boolean m109273x37d91f39() {
        return m109270x6e095e9(4);
    }

    /* renamed from: hasStatusText */
    public boolean m109274x37e0b679() {
        return m109270x6e095e9(5);
    }

    /* renamed from: hasUseHttp2 */
    public boolean m109275x99316c1d() {
        return m109270x6e095e9(2);
    }

    /* renamed from: hasUseQuic */
    public boolean m109276x7050046b() {
        return m109270x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109277x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58779xcb94b041[1]) {
                fVar.a(1, this.f58785xef1f71f6);
            }
            if (this.f58779xcb94b041[2]) {
                fVar.a(2, this.f58784xf44faff2);
            }
            if (this.f58779xcb94b041[3]) {
                fVar.a(3, this.f58781x24cccebc);
            }
            if (this.f58779xcb94b041[4]) {
                fVar.e(4, this.f58782xcad9be1a);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58783xcae1555a;
            if (gVar != null && this.f58779xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 c27090xe6a9b941 = this.f58780x509ef62f;
            if (c27090xe6a9b941 != null && this.f58779xcb94b041[6]) {
                fVar.i(6, c27090xe6a9b941.mo75928xcd1e8d8());
                this.f58780x509ef62f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f58779xcb94b041[1] ? 0 + b36.f.a(1, this.f58785xef1f71f6) : 0;
            if (this.f58779xcb94b041[2]) {
                a17 += b36.f.a(2, this.f58784xf44faff2);
            }
            if (this.f58779xcb94b041[3]) {
                a17 += b36.f.a(3, this.f58781x24cccebc);
            }
            if (this.f58779xcb94b041[4]) {
                a17 += b36.f.e(4, this.f58782xcad9be1a);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58783xcae1555a;
            if (gVar2 != null && this.f58779xcb94b041[5]) {
                a17 += b36.f.b(5, gVar2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 c27090xe6a9b9412 = this.f58780x509ef62f;
            return (c27090xe6a9b9412 == null || !this.f58779xcb94b041[6]) ? a17 : a17 + b36.f.i(6, c27090xe6a9b9412.mo75928xcd1e8d8());
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
                this.f58785xef1f71f6 = aVar2.c(intValue);
                this.f58779xcb94b041[1] = true;
                return 0;
            case 2:
                this.f58784xf44faff2 = aVar2.c(intValue);
                this.f58779xcb94b041[2] = true;
                return 0;
            case 3:
                this.f58781x24cccebc = aVar2.c(intValue);
                this.f58779xcb94b041[3] = true;
                return 0;
            case 4:
                this.f58782xcad9be1a = aVar2.g(intValue);
                this.f58779xcb94b041[4] = true;
                return 0;
            case 5:
                this.f58783xcae1555a = aVar2.d(intValue);
                this.f58779xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 c27090xe6a9b9413 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941();
                    if (bArr != null && bArr.length > 0) {
                        c27090xe6a9b9413.mo11468x92b714fd(bArr);
                    }
                    this.f58780x509ef62f = c27090xe6a9b9413;
                }
                this.f58779xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setPerformance_ */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109279xe7da83b1(com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 c27090xe6a9b941) {
        this.f58780x509ef62f = c27090xe6a9b941;
        this.f58779xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSocketReused */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109280x92109f45(boolean z17) {
        this.f58781x24cccebc = z17;
        this.f58779xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setStatusCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109281x2b25af01(int i17) {
        this.f58782xcad9be1a = i17;
        this.f58779xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setStatusText */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109282x2b2d4641(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58783xcae1555a = gVar;
        this.f58779xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUseHttp2 */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109283x646f4de5(boolean z17) {
        this.f58784xf44faff2 = z17;
        this.f58779xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUseQuic */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109284xa86ac9a3(boolean z17) {
        this.f58785xef1f71f6 = z17;
        this.f58779xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 m109278x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27075x8c4d86f0) super.mo11468x92b714fd(bArr);
    }
}
