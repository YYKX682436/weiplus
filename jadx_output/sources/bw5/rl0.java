package bw5;

/* loaded from: classes11.dex */
public class rl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32568d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.b4 f32569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32570f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32571g;

    /* renamed from: h, reason: collision with root package name */
    public long f32572h;

    /* renamed from: i, reason: collision with root package name */
    public int f32573i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ni0 f32574m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ng0 f32575n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32577p;

    /* renamed from: q, reason: collision with root package name */
    public long f32578q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32579r;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f32576o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f32580s = new boolean[14];

    static {
        new bw5.rl0();
    }

    public bw5.rl0 b(bw5.ni0 ni0Var) {
        this.f32574m = ni0Var;
        this.f32580s[8] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rl0)) {
            return false;
        }
        bw5.rl0 rl0Var = (bw5.rl0) fVar;
        return n51.f.a(this.f32568d, rl0Var.f32568d) && n51.f.a(this.f32569e, rl0Var.f32569e) && n51.f.a(this.f32570f, rl0Var.f32570f) && n51.f.a(this.f32571g, rl0Var.f32571g) && n51.f.a(java.lang.Long.valueOf(this.f32572h), java.lang.Long.valueOf(rl0Var.f32572h)) && n51.f.a(java.lang.Integer.valueOf(this.f32573i), java.lang.Integer.valueOf(rl0Var.f32573i)) && n51.f.a(this.f32574m, rl0Var.f32574m) && n51.f.a(this.f32575n, rl0Var.f32575n) && n51.f.a(this.f32576o, rl0Var.f32576o) && n51.f.a(this.f32577p, rl0Var.f32577p) && n51.f.a(java.lang.Long.valueOf(this.f32578q), java.lang.Long.valueOf(rl0Var.f32578q)) && n51.f.a(java.lang.Boolean.valueOf(this.f32579r), java.lang.Boolean.valueOf(rl0Var.f32579r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32576o;
        boolean[] zArr = this.f32580s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32568d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.b4 b4Var = this.f32569e;
            if (b4Var != null && zArr[2]) {
                fVar.e(2, b4Var.f25509d);
            }
            java.lang.String str2 = this.f32570f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f32571g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f32572h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32573i);
            }
            bw5.ni0 ni0Var = this.f32574m;
            if (ni0Var != null && zArr[8]) {
                fVar.e(8, ni0Var.f30697d);
            }
            bw5.ng0 ng0Var = this.f32575n;
            if (ng0Var != null && zArr[9]) {
                fVar.e(9, ng0Var.f30677d);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(((bw5.p4) it.next()).f31461d));
            }
            fVar.g(10, 2, linkedList2);
            java.lang.String str4 = this.f32577p;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.h(12, this.f32578q);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.a(13, this.f32579r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f32568d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            bw5.b4 b4Var2 = this.f32569e;
            if (b4Var2 != null && zArr[2]) {
                j17 += b36.f.e(2, b4Var2.f25509d);
            }
            java.lang.String str6 = this.f32570f;
            if (str6 != null && zArr[3]) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f32571g;
            if (str7 != null && zArr[4]) {
                j17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f32572h);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f32573i);
            }
            bw5.ni0 ni0Var2 = this.f32574m;
            if (ni0Var2 != null && zArr[8]) {
                j17 += b36.f.e(8, ni0Var2.f30697d);
            }
            bw5.ng0 ng0Var2 = this.f32575n;
            if (ng0Var2 != null && zArr[9]) {
                j17 += b36.f.e(9, ng0Var2.f30677d);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(java.lang.Integer.valueOf(((bw5.p4) it6.next()).f31461d));
            }
            int g17 = j17 + b36.f.g(10, 2, linkedList3);
            java.lang.String str8 = this.f32577p;
            if (str8 != null && zArr[11]) {
                g17 += b36.f.j(11, str8);
            }
            if (zArr[12]) {
                g17 += b36.f.h(12, this.f32578q);
            }
            return zArr[13] ? g17 + b36.f.a(13, this.f32579r) : g17;
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
        bw5.b4 b4Var3 = null;
        bw5.p4 p4Var = null;
        bw5.ng0 ng0Var3 = null;
        bw5.ni0 ni0Var3 = null;
        switch (intValue) {
            case 1:
                this.f32568d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    b4Var3 = bw5.b4.NotUseCommentType;
                } else if (g18 == 1) {
                    b4Var3 = bw5.b4.Like;
                } else if (g18 == 2) {
                    b4Var3 = bw5.b4.Comment;
                }
                this.f32569e = b4Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f32570f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32571g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32572h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f32573i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    ni0Var3 = bw5.ni0.NotUseReadType;
                } else if (g19 == 1) {
                    ni0Var3 = bw5.ni0.Read;
                } else if (g19 == 2) {
                    ni0Var3 = bw5.ni0.Unread;
                }
                this.f32574m = ni0Var3;
                zArr[8] = true;
                return 0;
            case 9:
                int g27 = aVar2.g(intValue);
                if (g27 == 0) {
                    ng0Var3 = bw5.ng0.NotUseNotifyType;
                } else if (g27 == 1) {
                    ng0Var3 = bw5.ng0.Notify;
                } else if (g27 == 2) {
                    ng0Var3 = bw5.ng0.NotNotify;
                }
                this.f32575n = ng0Var3;
                zArr[9] = true;
                return 0;
            case 10:
                int g28 = aVar2.g(intValue);
                if (g28 == 0) {
                    p4Var = bw5.p4.NormalState;
                } else if (g28 == 1) {
                    p4Var = bw5.p4.ServerDelete;
                } else if (g28 == 2) {
                    p4Var = bw5.p4.LocalDelete;
                } else if (g28 == 3) {
                    p4Var = bw5.p4.Posting;
                } else if (g28 == 4) {
                    p4Var = bw5.p4.Fail;
                } else if (g28 == 5) {
                    p4Var = bw5.p4.Fail_Retry;
                }
                linkedList.add(p4Var);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32577p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32578q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32579r = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.rl0) super.parseFrom(bArr);
    }
}
