package bw5;

/* loaded from: classes2.dex */
public class xr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35254e;

    /* renamed from: g, reason: collision with root package name */
    public int f35256g;

    /* renamed from: h, reason: collision with root package name */
    public int f35257h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f35255f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35258i = new boolean[6];

    static {
        new bw5.xr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xr parseFrom(byte[] bArr) {
        return (bw5.xr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xr)) {
            return false;
        }
        bw5.xr xrVar = (bw5.xr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35253d), java.lang.Long.valueOf(xrVar.f35253d)) && n51.f.a(this.f35254e, xrVar.f35254e) && n51.f.a(this.f35255f, xrVar.f35255f) && n51.f.a(java.lang.Integer.valueOf(this.f35256g), java.lang.Integer.valueOf(xrVar.f35256g)) && n51.f.a(java.lang.Integer.valueOf(this.f35257h), java.lang.Integer.valueOf(xrVar.f35257h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35255f;
        boolean[] zArr = this.f35258i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35253d);
            }
            java.lang.String str = this.f35254e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f35256g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35257h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f35253d) : 0;
            java.lang.String str2 = this.f35254e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            int g17 = h17 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f35256g);
            }
            return zArr[5] ? g17 + b36.f.e(5, this.f35257h) : g17;
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
            this.f35253d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35254e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f35256g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f35257h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vr vrVar = new bw5.vr();
            if (bArr != null && bArr.length > 0) {
                vrVar.parseFrom(bArr);
            }
            linkedList.add(vrVar);
        }
        zArr[3] = true;
        return 0;
    }
}
