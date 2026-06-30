package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class h2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297778d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2 f297779e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f297780f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2 h2Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2) fVar;
        return n51.f.a(this.f297778d, h2Var.f297778d) && n51.f.a(this.f297779e, h2Var.f297779e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297780f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297778d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2 g2Var = this.f297779e;
            if (g2Var != null && zArr[2]) {
                fVar.e(2, g2Var.f297771d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f297778d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2 g2Var2 = this.f297779e;
            return (g2Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, g2Var2.f297771d);
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
            this.f297778d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f297779e = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2.MEETINGTYPE_IN_PROCESS : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2.MEETINGTYPE_END : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g2.MEETINGTYPE_BEGIN;
        zArr[2] = true;
        return 0;
    }
}
