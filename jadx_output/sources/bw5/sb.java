package bw5;

/* loaded from: classes10.dex */
public class sb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ub f32874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32875e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.tb f32876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32877g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.tb f32878h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32879i = new boolean[6];

    static {
        new bw5.sb();
    }

    public java.lang.String b() {
        return this.f32879i[2] ? this.f32875e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.sb parseFrom(byte[] bArr) {
        return (bw5.sb) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sb)) {
            return false;
        }
        bw5.sb sbVar = (bw5.sb) fVar;
        return n51.f.a(this.f32874d, sbVar.f32874d) && n51.f.a(this.f32875e, sbVar.f32875e) && n51.f.a(this.f32876f, sbVar.f32876f) && n51.f.a(this.f32877g, sbVar.f32877g) && n51.f.a(this.f32878h, sbVar.f32878h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sb();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32879i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ub ubVar = this.f32874d;
            if (ubVar != null && zArr[1]) {
                fVar.e(1, ubVar.f33834d);
            }
            java.lang.String str = this.f32875e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.tb tbVar = this.f32876f;
            if (tbVar != null && zArr[3]) {
                fVar.i(3, tbVar.computeSize());
                this.f32876f.writeFields(fVar);
            }
            java.lang.String str2 = this.f32877g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.tb tbVar2 = this.f32878h;
            if (tbVar2 != null && zArr[5]) {
                fVar.i(5, tbVar2.computeSize());
                this.f32878h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ub ubVar2 = this.f32874d;
            if (ubVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ubVar2.f33834d);
            }
            java.lang.String str3 = this.f32875e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            bw5.tb tbVar3 = this.f32876f;
            if (tbVar3 != null && zArr[3]) {
                i18 += b36.f.i(3, tbVar3.computeSize());
            }
            java.lang.String str4 = this.f32877g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            bw5.tb tbVar4 = this.f32878h;
            return (tbVar4 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, tbVar4.computeSize());
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
            int g17 = aVar2.g(intValue);
            this.f32874d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ub.LivePhoto : bw5.ub.Video : bw5.ub.Image;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32875e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.tb tbVar5 = new bw5.tb();
                if (bArr != null && bArr.length > 0) {
                    tbVar5.parseFrom(bArr);
                }
                this.f32876f = tbVar5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f32877g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.tb tbVar6 = new bw5.tb();
            if (bArr2 != null && bArr2.length > 0) {
                tbVar6.parseFrom(bArr2);
            }
            this.f32878h = tbVar6;
        }
        zArr[5] = true;
        return 0;
    }
}
