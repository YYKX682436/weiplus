package bw5;

/* loaded from: classes4.dex */
public class sh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32988d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f32990f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f32989e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32991g = new boolean[4];

    static {
        new bw5.sh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sh0 parseFrom(byte[] bArr) {
        return (bw5.sh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sh0)) {
            return false;
        }
        bw5.sh0 sh0Var = (bw5.sh0) fVar;
        return n51.f.a(this.f32988d, sh0Var.f32988d) && n51.f.a(this.f32989e, sh0Var.f32989e) && n51.f.a(this.f32990f, sh0Var.f32990f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32989e;
        boolean[] zArr = this.f32991g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32988d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.x7 x7Var = this.f32990f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f32990f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32988d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.x7 x7Var2 = this.f32990f;
            return (x7Var2 == null || !zArr[3]) ? g17 : g17 + b36.f.i(3, x7Var2.computeSize());
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
            this.f32988d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.rh0 rh0Var = new bw5.rh0();
                if (bArr != null && bArr.length > 0) {
                    rh0Var.parseFrom(bArr);
                }
                linkedList.add(rh0Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr2 != null && bArr2.length > 0) {
                x7Var3.parseFrom(bArr2);
            }
            this.f32990f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
