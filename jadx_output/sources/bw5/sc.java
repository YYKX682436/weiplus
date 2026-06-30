package bw5;

/* loaded from: classes2.dex */
public class sc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32883d;

    /* renamed from: e, reason: collision with root package name */
    public int f32884e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32885f;

    /* renamed from: g, reason: collision with root package name */
    public int f32886g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.m3 f32887h;

    /* renamed from: i, reason: collision with root package name */
    public long f32888i;

    /* renamed from: m, reason: collision with root package name */
    public int f32889m;

    /* renamed from: o, reason: collision with root package name */
    public int f32891o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ec f32892p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32893q;

    /* renamed from: r, reason: collision with root package name */
    public long f32894r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.yt f32895s;

    /* renamed from: u, reason: collision with root package name */
    public bw5.y20 f32897u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f32898v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.pr f32899w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f32890n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f32896t = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f32900x = new boolean[20];

    static {
        new bw5.sc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sc parseFrom(byte[] bArr) {
        return (bw5.sc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sc)) {
            return false;
        }
        bw5.sc scVar = (bw5.sc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32883d), java.lang.Integer.valueOf(scVar.f32883d)) && n51.f.a(java.lang.Integer.valueOf(this.f32884e), java.lang.Integer.valueOf(scVar.f32884e)) && n51.f.a(this.f32885f, scVar.f32885f) && n51.f.a(java.lang.Integer.valueOf(this.f32886g), java.lang.Integer.valueOf(scVar.f32886g)) && n51.f.a(this.f32887h, scVar.f32887h) && n51.f.a(java.lang.Long.valueOf(this.f32888i), java.lang.Long.valueOf(scVar.f32888i)) && n51.f.a(java.lang.Integer.valueOf(this.f32889m), java.lang.Integer.valueOf(scVar.f32889m)) && n51.f.a(this.f32890n, scVar.f32890n) && n51.f.a(java.lang.Integer.valueOf(this.f32891o), java.lang.Integer.valueOf(scVar.f32891o)) && n51.f.a(this.f32892p, scVar.f32892p) && n51.f.a(this.f32893q, scVar.f32893q) && n51.f.a(java.lang.Long.valueOf(this.f32894r), java.lang.Long.valueOf(scVar.f32894r)) && n51.f.a(this.f32895s, scVar.f32895s) && n51.f.a(this.f32896t, scVar.f32896t) && n51.f.a(this.f32897u, scVar.f32897u) && n51.f.a(this.f32898v, scVar.f32898v) && n51.f.a(this.f32899w, scVar.f32899w);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32896t;
        java.util.LinkedList linkedList2 = this.f32890n;
        boolean[] zArr = this.f32900x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32883d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32884e);
            }
            com.tencent.mm.protobuf.g gVar = this.f32885f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32886g);
            }
            bw5.m3 m3Var = this.f32887h;
            if (m3Var != null && zArr[5]) {
                fVar.i(5, m3Var.computeSize());
                this.f32887h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f32888i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32889m);
            }
            fVar.g(8, 8, linkedList2);
            if (zArr[10]) {
                fVar.e(10, this.f32891o);
            }
            bw5.ec ecVar = this.f32892p;
            if (ecVar != null && zArr[11]) {
                fVar.i(11, ecVar.computeSize());
                this.f32892p.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32893q;
            if (gVar2 != null && zArr[12]) {
                fVar.b(12, gVar2);
            }
            if (zArr[13]) {
                fVar.h(13, this.f32894r);
            }
            bw5.yt ytVar = this.f32895s;
            if (ytVar != null && zArr[14]) {
                fVar.i(14, ytVar.computeSize());
                this.f32895s.writeFields(fVar);
            }
            fVar.g(15, 2, linkedList);
            bw5.y20 y20Var = this.f32897u;
            if (y20Var != null && zArr[17]) {
                fVar.i(17, y20Var.computeSize());
                this.f32897u.writeFields(fVar);
            }
            java.lang.String str = this.f32898v;
            if (str != null && zArr[18]) {
                fVar.j(18, str);
            }
            bw5.pr prVar = this.f32899w;
            if (prVar != null && zArr[19]) {
                fVar.i(19, prVar.computeSize());
                this.f32899w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f32883d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f32884e);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f32885f;
            if (gVar3 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar3);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f32886g);
            }
            bw5.m3 m3Var2 = this.f32887h;
            if (m3Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, m3Var2.computeSize());
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f32888i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f32889m);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList2);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f32891o);
            }
            bw5.ec ecVar2 = this.f32892p;
            if (ecVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, ecVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f32893q;
            if (gVar4 != null && zArr[12]) {
                g17 += b36.f.b(12, gVar4);
            }
            if (zArr[13]) {
                g17 += b36.f.h(13, this.f32894r);
            }
            bw5.yt ytVar2 = this.f32895s;
            if (ytVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, ytVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(15, 2, linkedList);
            bw5.y20 y20Var2 = this.f32897u;
            if (y20Var2 != null && zArr[17]) {
                g18 += b36.f.i(17, y20Var2.computeSize());
            }
            java.lang.String str2 = this.f32898v;
            if (str2 != null && zArr[18]) {
                g18 += b36.f.j(18, str2);
            }
            bw5.pr prVar2 = this.f32899w;
            return (prVar2 == null || !zArr[19]) ? g18 : g18 + b36.f.i(19, prVar2.computeSize());
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        switch (intValue) {
            case 1:
                this.f32883d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32884e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32885f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32886g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.m3 m3Var3 = new bw5.m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var3.parseFrom(bArr);
                    }
                    this.f32887h = m3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f32888i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32889m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ds dsVar = new bw5.ds();
                    if (bArr2 != null && bArr2.length > 0) {
                        dsVar.parseFrom(bArr2);
                    }
                    linkedList2.add(dsVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
            case 16:
            default:
                return -1;
            case 10:
                this.f32891o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ec ecVar3 = new bw5.ec();
                    if (bArr3 != null && bArr3.length > 0) {
                        ecVar3.parseFrom(bArr3);
                    }
                    this.f32892p = ecVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f32893q = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32894r = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.yt ytVar3 = new bw5.yt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ytVar3.parseFrom(bArr4);
                    }
                    this.f32895s = ytVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[15] = true;
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.y20 y20Var3 = new bw5.y20();
                    if (bArr5 != null && bArr5.length > 0) {
                        y20Var3.parseFrom(bArr5);
                    }
                    this.f32897u = y20Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f32898v = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.pr prVar3 = new bw5.pr();
                    if (bArr6 != null && bArr6.length > 0) {
                        prVar3.parseFrom(bArr6);
                    }
                    this.f32899w = prVar3;
                }
                zArr[19] = true;
                return 0;
        }
    }
}
