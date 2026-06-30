package bw5;

/* loaded from: classes2.dex */
public class ip0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28663d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ja0 f28664e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28665f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v40 f28666g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28667h = new boolean[5];

    static {
        new bw5.ip0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ip0 parseFrom(byte[] bArr) {
        return (bw5.ip0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ip0)) {
            return false;
        }
        bw5.ip0 ip0Var = (bw5.ip0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28663d), java.lang.Integer.valueOf(ip0Var.f28663d)) && n51.f.a(this.f28664e, ip0Var.f28664e) && n51.f.a(this.f28665f, ip0Var.f28665f) && n51.f.a(this.f28666g, ip0Var.f28666g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ip0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28667h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28663d);
            }
            bw5.ja0 ja0Var = this.f28664e;
            if (ja0Var != null && zArr[2]) {
                fVar.i(2, ja0Var.computeSize());
                this.f28664e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f28665f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.v40 v40Var = this.f28666g;
            if (v40Var != null && zArr[4]) {
                fVar.i(4, v40Var.computeSize());
                this.f28666g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28663d) : 0;
            bw5.ja0 ja0Var2 = this.f28664e;
            if (ja0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, ja0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28665f;
            if (gVar2 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            bw5.v40 v40Var2 = this.f28666g;
            return (v40Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, v40Var2.computeSize());
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
            this.f28663d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ja0 ja0Var3 = new bw5.ja0();
                if (bArr != null && bArr.length > 0) {
                    ja0Var3.parseFrom(bArr);
                }
                this.f28664e = ja0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28665f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.v40 v40Var3 = new bw5.v40();
            if (bArr2 != null && bArr2.length > 0) {
                v40Var3.parseFrom(bArr2);
            }
            this.f28666g = v40Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
