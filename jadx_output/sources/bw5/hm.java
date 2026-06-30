package bw5;

/* loaded from: classes2.dex */
public class hm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28267d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gm f28268e;

    /* renamed from: f, reason: collision with root package name */
    public int f28269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28270g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pj f28271h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28272i = new boolean[6];

    static {
        new bw5.hm();
    }

    public bw5.gm b() {
        return this.f28272i[2] ? this.f28268e : new bw5.gm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.hm parseFrom(byte[] bArr) {
        return (bw5.hm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hm)) {
            return false;
        }
        bw5.hm hmVar = (bw5.hm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28267d), java.lang.Integer.valueOf(hmVar.f28267d)) && n51.f.a(this.f28268e, hmVar.f28268e) && n51.f.a(java.lang.Integer.valueOf(this.f28269f), java.lang.Integer.valueOf(hmVar.f28269f)) && n51.f.a(this.f28270g, hmVar.f28270g) && n51.f.a(this.f28271h, hmVar.f28271h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28272i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28267d);
            }
            bw5.gm gmVar = this.f28268e;
            if (gmVar != null && zArr[2]) {
                fVar.i(2, gmVar.computeSize());
                this.f28268e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28269f);
            }
            java.lang.String str = this.f28270g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.pj pjVar = this.f28271h;
            if (pjVar != null && zArr[5]) {
                fVar.i(5, pjVar.computeSize());
                this.f28271h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28267d) : 0;
            bw5.gm gmVar2 = this.f28268e;
            if (gmVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, gmVar2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28269f);
            }
            java.lang.String str2 = this.f28270g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            bw5.pj pjVar2 = this.f28271h;
            return (pjVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, pjVar2.computeSize());
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
            this.f28267d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.gm gmVar3 = new bw5.gm();
                if (bArr != null && bArr.length > 0) {
                    gmVar3.parseFrom(bArr);
                }
                this.f28268e = gmVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28269f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28270g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr2 != null && bArr2.length > 0) {
                pjVar3.parseFrom(bArr2);
            }
            this.f28271h = pjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
