package bw5;

/* loaded from: classes7.dex */
public class sz extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fz f33177d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33178e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33180g;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f33179f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33181h = new boolean[6];

    static {
        new bw5.sz();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sz)) {
            return false;
        }
        bw5.sz szVar = (bw5.sz) fVar;
        return n51.f.a(this.BaseRequest, szVar.BaseRequest) && n51.f.a(this.f33177d, szVar.f33177d) && n51.f.a(java.lang.Boolean.valueOf(this.f33178e), java.lang.Boolean.valueOf(szVar.f33178e)) && n51.f.a(this.f33179f, szVar.f33179f) && n51.f.a(this.f33180g, szVar.f33180g);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f33181h[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33181h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            bw5.fz fzVar = this.f33177d;
            if (fzVar != null && zArr[2]) {
                fVar.i(2, fzVar.computeSize());
                this.f33177d.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f33178e);
            }
            fVar.g(4, 1, this.f33179f);
            java.lang.String str = this.f33180g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            bw5.fz fzVar2 = this.f33177d;
            if (fzVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, fzVar2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f33178e);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f33179f);
            java.lang.String str2 = this.f33180g;
            return (str2 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str2);
        }
        if (i17 == 2) {
            this.f33179f.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                this.BaseRequest = heVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f33178e = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f33179f.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f33180g = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.fz fzVar3 = new bw5.fz();
            if (bArr2 != null && bArr2.length > 0) {
                fzVar3.parseFrom(bArr2);
            }
            this.f33177d = fzVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.sz) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f33181h[1] = true;
        return this;
    }
}
