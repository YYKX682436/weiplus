package com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e f299217f = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.d f299218d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f299219e = new boolean[2];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e) && n51.f.a(this.f299218d, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e) fVar).f299218d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299219e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.d dVar = this.f299218d;
            if (dVar != null && zArr[1]) {
                fVar.e(1, dVar.f299216d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.d dVar2 = this.f299218d;
            if (dVar2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.e(1, dVar2.f299216d);
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
        int g17 = aVar2.g(intValue);
        this.f299218d = g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.d.WeNoteFlutterPageState_PageExit : com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.d.WeNoteFlutterPageState_WillDisappear;
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.e) super.mo11468x92b714fd(bArr);
    }
}
