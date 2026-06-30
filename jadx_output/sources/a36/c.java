package a36;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f1104d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f1105e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1106f;

    /* renamed from: g, reason: collision with root package name */
    public int f1107g;

    /* renamed from: h, reason: collision with root package name */
    public a36.a f1108h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1109i;

    /* renamed from: m, reason: collision with root package name */
    public int f1110m;

    /* renamed from: n, reason: collision with root package name */
    public int f1111n;

    /* renamed from: o, reason: collision with root package name */
    public a36.f f1112o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f1113p;

    /* renamed from: q, reason: collision with root package name */
    public a36.b f1114q;

    /* renamed from: r, reason: collision with root package name */
    public a36.d f1115r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof a36.c)) {
            return false;
        }
        a36.c cVar = (a36.c) fVar;
        return n51.f.a(this.f1104d, cVar.f1104d) && n51.f.a(java.lang.Integer.valueOf(this.f1105e), java.lang.Integer.valueOf(cVar.f1105e)) && n51.f.a(this.f1106f, cVar.f1106f) && n51.f.a(java.lang.Integer.valueOf(this.f1107g), java.lang.Integer.valueOf(cVar.f1107g)) && n51.f.a(this.f1108h, cVar.f1108h) && n51.f.a(this.f1109i, cVar.f1109i) && n51.f.a(java.lang.Integer.valueOf(this.f1110m), java.lang.Integer.valueOf(cVar.f1110m)) && n51.f.a(java.lang.Integer.valueOf(this.f1111n), java.lang.Integer.valueOf(cVar.f1111n)) && n51.f.a(this.f1112o, cVar.f1112o) && n51.f.a(this.f1113p, cVar.f1113p) && n51.f.a(this.f1114q, cVar.f1114q) && n51.f.a(this.f1115r, cVar.f1115r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f1104d);
            fVar.e(2, this.f1105e);
            java.lang.String str = this.f1106f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f1107g);
            a36.a aVar = this.f1108h;
            if (aVar != null) {
                fVar.i(5, aVar.computeSize());
                this.f1108h.writeFields(fVar);
            }
            java.lang.String str2 = this.f1109i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f1110m);
            fVar.e(8, this.f1111n);
            a36.f fVar2 = this.f1112o;
            if (fVar2 != null) {
                fVar.i(9, fVar2.computeSize());
                this.f1112o.writeFields(fVar);
            }
            java.lang.String str3 = this.f1113p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            a36.b bVar = this.f1114q;
            if (bVar != null) {
                fVar.i(11, bVar.computeSize());
                this.f1114q.writeFields(fVar);
            }
            a36.d dVar = this.f1115r;
            if (dVar != null) {
                fVar.i(12, dVar.computeSize());
                this.f1115r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f1104d) + 0 + b36.f.e(2, this.f1105e);
            java.lang.String str4 = this.f1106f;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            int e17 = g17 + b36.f.e(4, this.f1107g);
            a36.a aVar2 = this.f1108h;
            if (aVar2 != null) {
                e17 += b36.f.i(5, aVar2.computeSize());
            }
            java.lang.String str5 = this.f1109i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f1110m) + b36.f.e(8, this.f1111n);
            a36.f fVar3 = this.f1112o;
            if (fVar3 != null) {
                e18 += b36.f.i(9, fVar3.computeSize());
            }
            java.lang.String str6 = this.f1113p;
            if (str6 != null) {
                e18 += b36.f.j(10, str6);
            }
            a36.b bVar2 = this.f1114q;
            if (bVar2 != null) {
                e18 += b36.f.i(11, bVar2.computeSize());
            }
            a36.d dVar2 = this.f1115r;
            return dVar2 != null ? e18 + b36.f.i(12, dVar2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f1104d.clear();
            c36.a aVar3 = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        a36.c cVar = (a36.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    a36.i iVar = new a36.i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar.parseFrom(bArr2);
                    }
                    cVar.f1104d.add(iVar);
                }
                return 0;
            case 2:
                cVar.f1105e = aVar4.g(intValue);
                return 0;
            case 3:
                cVar.f1106f = aVar4.k(intValue);
                return 0;
            case 4:
                cVar.f1107g = aVar4.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    a36.a aVar5 = new a36.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.parseFrom(bArr3);
                    }
                    cVar.f1108h = aVar5;
                }
                return 0;
            case 6:
                cVar.f1109i = aVar4.k(intValue);
                return 0;
            case 7:
                cVar.f1110m = aVar4.g(intValue);
                return 0;
            case 8:
                cVar.f1111n = aVar4.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    a36.f fVar4 = new a36.f();
                    if (bArr4 != null && bArr4.length > 0) {
                        fVar4.parseFrom(bArr4);
                    }
                    cVar.f1112o = fVar4;
                }
                return 0;
            case 10:
                cVar.f1113p = aVar4.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    a36.b bVar3 = new a36.b();
                    if (bArr5 != null && bArr5.length > 0) {
                        bVar3.parseFrom(bArr5);
                    }
                    cVar.f1114q = bVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    a36.d dVar3 = new a36.d();
                    if (bArr6 != null && bArr6.length > 0) {
                        dVar3.parseFrom(bArr6);
                    }
                    cVar.f1115r = dVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
