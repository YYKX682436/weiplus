package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo */
/* loaded from: classes2.dex */
public class C19814xef6bf6c8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f39059x2efe91;

    /* renamed from: icon_url */
    public java.lang.String f39060xd4094ca9;

    /* renamed from: title */
    public java.lang.String f39061x6942258;

    /* renamed from: username */
    public java.lang.String f39062xf02988d6;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 m77334xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 c19814xef6bf6c8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8) fVar;
        return n51.f.a(this.f39060xd4094ca9, c19814xef6bf6c8.f39060xd4094ca9) && n51.f.a(this.f39061x6942258, c19814xef6bf6c8.f39061x6942258) && n51.f.a(this.f39059x2efe91, c19814xef6bf6c8.f39059x2efe91) && n51.f.a(this.f39062xf02988d6, c19814xef6bf6c8.f39062xf02988d6);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f39060xd4094ca9;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f39061x6942258;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f39059x2efe91;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f39062xf02988d6;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f39060xd4094ca9;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f39061x6942258;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f39059x2efe91;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f39062xf02988d6;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 c19814xef6bf6c8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19814xef6bf6c8.f39060xd4094ca9 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c19814xef6bf6c8.f39061x6942258 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c19814xef6bf6c8.f39059x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c19814xef6bf6c8.f39062xf02988d6 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 m77335x76492e13(java.lang.String str) {
        this.f39059x2efe91 = str;
        return this;
    }

    /* renamed from: setIcon_url */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 m77336x4a9beb2b(java.lang.String str) {
        this.f39060xd4094ca9 = str;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 m77337x53bfe316(java.lang.String str) {
        this.f39061x6942258 = str;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19814xef6bf6c8 m77338x66bc2758(java.lang.String str) {
        this.f39062xf02988d6 = str;
        return this;
    }
}
