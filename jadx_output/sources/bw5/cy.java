package bw5;

/* loaded from: classes8.dex */
public class cy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26240d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.tx f26241e;

    /* renamed from: f, reason: collision with root package name */
    public int f26242f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.jy f26243g;

    /* renamed from: h, reason: collision with root package name */
    public int f26244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26245i = new boolean[6];

    static {
        new bw5.cy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cy parseFrom(byte[] bArr) {
        return (bw5.cy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cy)) {
            return false;
        }
        bw5.cy cyVar = (bw5.cy) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26240d), java.lang.Integer.valueOf(cyVar.f26240d)) && n51.f.a(this.f26241e, cyVar.f26241e) && n51.f.a(java.lang.Integer.valueOf(this.f26242f), java.lang.Integer.valueOf(cyVar.f26242f)) && n51.f.a(this.f26243g, cyVar.f26243g) && n51.f.a(java.lang.Integer.valueOf(this.f26244h), java.lang.Integer.valueOf(cyVar.f26244h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26245i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26240d);
            }
            bw5.tx txVar = this.f26241e;
            if (txVar != null && zArr[2]) {
                fVar.i(2, txVar.computeSize());
                this.f26241e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26242f);
            }
            bw5.jy jyVar = this.f26243g;
            if (jyVar != null && zArr[4]) {
                fVar.e(4, jyVar.f29162d);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26244h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26240d) : 0;
            bw5.tx txVar2 = this.f26241e;
            if (txVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, txVar2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f26242f);
            }
            bw5.jy jyVar2 = this.f26243g;
            if (jyVar2 != null && zArr[4]) {
                e17 += b36.f.e(4, jyVar2.f29162d);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f26244h) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
            this.f26240d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.tx txVar3 = new bw5.tx();
                if (bArr != null && bArr.length > 0) {
                    txVar3.parseFrom(bArr);
                }
                this.f26241e = txVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26242f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f26243g = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.jy.FinderTabTipsDSLRenderVerticalAlign_AbsoluteCenter : bw5.jy.FinderTabTipsDSLRenderVerticalAlign_Bottom : bw5.jy.FinderTabTipsDSLRenderVerticalAlign_Center : bw5.jy.FinderTabTipsDSLRenderVerticalAlign_Defaut;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f26244h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
