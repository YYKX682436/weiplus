package bw5;

/* loaded from: classes9.dex */
public class jf extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f28956e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.a9 f28957f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28955d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28958g = new boolean[4];

    static {
        new bw5.jf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jf parseFrom(byte[] bArr) {
        return (bw5.jf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jf)) {
            return false;
        }
        bw5.jf jfVar = (bw5.jf) fVar;
        return n51.f.a(this.f28955d, jfVar.f28955d) && n51.f.a(this.f28956e, jfVar.f28956e) && n51.f.a(this.f28957f, jfVar.f28957f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28955d;
        boolean[] zArr = this.f28958g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.a9 a9Var = this.f28956e;
            if (a9Var != null && zArr[2]) {
                fVar.i(2, a9Var.computeSize());
                this.f28956e.writeFields(fVar);
            }
            bw5.a9 a9Var2 = this.f28957f;
            if (a9Var2 != null && zArr[3]) {
                fVar.i(3, a9Var2.computeSize());
                this.f28957f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.a9 a9Var3 = this.f28956e;
            if (a9Var3 != null && zArr[2]) {
                g17 += b36.f.i(2, a9Var3.computeSize());
            }
            bw5.a9 a9Var4 = this.f28957f;
            return (a9Var4 == null || !zArr[3]) ? g17 : g17 + b36.f.i(3, a9Var4.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.c7 c7Var = new bw5.c7();
                if (bArr != null && bArr.length > 0) {
                    c7Var.parseFrom(bArr);
                }
                linkedList.add(c7Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.a9 a9Var5 = new bw5.a9();
                if (bArr2 != null && bArr2.length > 0) {
                    a9Var5.parseFrom(bArr2);
                }
                this.f28956e = a9Var5;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.a9 a9Var6 = new bw5.a9();
            if (bArr3 != null && bArr3.length > 0) {
                a9Var6.parseFrom(bArr3);
            }
            this.f28957f = a9Var6;
        }
        zArr[3] = true;
        return 0;
    }
}
