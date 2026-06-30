package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CQuicHostMap */
/* loaded from: classes8.dex */
public class C27083x3d199685 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 f58985xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685();

    /* renamed from: hasSetFields */
    private final boolean[] f58986xcb94b041 = new boolean[4];

    /* renamed from: host */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58987x30f5a8;

    /* renamed from: ip, reason: collision with root package name */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f297257ip;

    /* renamed from: port */
    private int f58988x349881;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109919xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109920x7c90cfc0() {
        return f58985xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109921x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109922x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 c27083x3d199685 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685) fVar;
        return n51.f.a(this.f58987x30f5a8, c27083x3d199685.f58987x30f5a8) && n51.f.a(this.f297257ip, c27083x3d199685.f297257ip) && n51.f.a(java.lang.Integer.valueOf(this.f58988x349881), java.lang.Integer.valueOf(c27083x3d199685.f58988x349881));
    }

    /* renamed from: getHost */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109923xfb805e1e() {
        return this.f58986xcb94b041[1] ? this.f58987x30f5a8 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getIp */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109924x5db1b1d() {
        return this.f58986xcb94b041[2] ? this.f297257ip : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPort */
    public int m109925xfb8400f7() {
        return this.f58988x349881;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109926x6e095e9(int i17) {
        return this.f58986xcb94b041[i17];
    }

    /* renamed from: hasHost */
    public boolean m109927x29851f62() {
        return m109926x6e095e9(1);
    }

    /* renamed from: hasIp */
    public boolean m109928x5e75d61() {
        return m109926x6e095e9(2);
    }

    /* renamed from: hasPort */
    public boolean m109929x2988c23b() {
        return m109926x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109930x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58987x30f5a8;
            if (gVar != null && this.f58986xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f297257ip;
            if (gVar2 != null && this.f58986xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            if (this.f58986xcb94b041[3]) {
                fVar.e(3, this.f58988x349881);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f58987x30f5a8;
            if (gVar3 != null && this.f58986xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f297257ip;
            if (gVar4 != null && this.f58986xcb94b041[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            return this.f58986xcb94b041[3] ? i18 + b36.f.e(3, this.f58988x349881) : i18;
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
            this.f58987x30f5a8 = aVar2.d(intValue);
            this.f58986xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f297257ip = aVar2.d(intValue);
            this.f58986xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f58988x349881 = aVar2.g(intValue);
        this.f58986xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setHost */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109932x764b252a(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58987x30f5a8 = gVar;
        this.f58986xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIp */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109933x6843529(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f297257ip = gVar;
        this.f58986xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setPort */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109934x764ec803(int i17) {
        this.f58988x349881 = i17;
        this.f58986xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 m109931x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685) super.mo11468x92b714fd(bArr);
    }
}
