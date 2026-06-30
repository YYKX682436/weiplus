package bw5;

/* loaded from: classes11.dex */
public class rl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114101d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.b4 f114102e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114103f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114104g;

    /* renamed from: h, reason: collision with root package name */
    public long f114105h;

    /* renamed from: i, reason: collision with root package name */
    public int f114106i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ni0 f114107m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ng0 f114108n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f114110p;

    /* renamed from: q, reason: collision with root package name */
    public long f114111q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f114112r;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f114109o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f114113s = new boolean[14];

    static {
        new bw5.rl0();
    }

    public bw5.rl0 b(bw5.ni0 ni0Var) {
        this.f114107m = ni0Var;
        this.f114113s[8] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rl0)) {
            return false;
        }
        bw5.rl0 rl0Var = (bw5.rl0) fVar;
        return n51.f.a(this.f114101d, rl0Var.f114101d) && n51.f.a(this.f114102e, rl0Var.f114102e) && n51.f.a(this.f114103f, rl0Var.f114103f) && n51.f.a(this.f114104g, rl0Var.f114104g) && n51.f.a(java.lang.Long.valueOf(this.f114105h), java.lang.Long.valueOf(rl0Var.f114105h)) && n51.f.a(java.lang.Integer.valueOf(this.f114106i), java.lang.Integer.valueOf(rl0Var.f114106i)) && n51.f.a(this.f114107m, rl0Var.f114107m) && n51.f.a(this.f114108n, rl0Var.f114108n) && n51.f.a(this.f114109o, rl0Var.f114109o) && n51.f.a(this.f114110p, rl0Var.f114110p) && n51.f.a(java.lang.Long.valueOf(this.f114111q), java.lang.Long.valueOf(rl0Var.f114111q)) && n51.f.a(java.lang.Boolean.valueOf(this.f114112r), java.lang.Boolean.valueOf(rl0Var.f114112r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114109o;
        boolean[] zArr = this.f114113s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114101d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.b4 b4Var = this.f114102e;
            if (b4Var != null && zArr[2]) {
                fVar.e(2, b4Var.f107042d);
            }
            java.lang.String str2 = this.f114103f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f114104g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f114105h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114106i);
            }
            bw5.ni0 ni0Var = this.f114107m;
            if (ni0Var != null && zArr[8]) {
                fVar.e(8, ni0Var.f112230d);
            }
            bw5.ng0 ng0Var = this.f114108n;
            if (ng0Var != null && zArr[9]) {
                fVar.e(9, ng0Var.f112210d);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(((bw5.p4) it.next()).f112994d));
            }
            fVar.g(10, 2, linkedList2);
            java.lang.String str4 = this.f114110p;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.h(12, this.f114111q);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.a(13, this.f114112r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f114101d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            bw5.b4 b4Var2 = this.f114102e;
            if (b4Var2 != null && zArr[2]) {
                j17 += b36.f.e(2, b4Var2.f107042d);
            }
            java.lang.String str6 = this.f114103f;
            if (str6 != null && zArr[3]) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f114104g;
            if (str7 != null && zArr[4]) {
                j17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f114105h);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f114106i);
            }
            bw5.ni0 ni0Var2 = this.f114107m;
            if (ni0Var2 != null && zArr[8]) {
                j17 += b36.f.e(8, ni0Var2.f112230d);
            }
            bw5.ng0 ng0Var2 = this.f114108n;
            if (ng0Var2 != null && zArr[9]) {
                j17 += b36.f.e(9, ng0Var2.f112210d);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(java.lang.Integer.valueOf(((bw5.p4) it6.next()).f112994d));
            }
            int g17 = j17 + b36.f.g(10, 2, linkedList3);
            java.lang.String str8 = this.f114110p;
            if (str8 != null && zArr[11]) {
                g17 += b36.f.j(11, str8);
            }
            if (zArr[12]) {
                g17 += b36.f.h(12, this.f114111q);
            }
            return zArr[13] ? g17 + b36.f.a(13, this.f114112r) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f114101d = aVar2.k(intValue);
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
                this.f114102e = b4Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f114103f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114104g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114105h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f114106i = aVar2.g(intValue);
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
                this.f114107m = ni0Var3;
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
                this.f114108n = ng0Var3;
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
                this.f114110p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114111q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114112r = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.rl0) super.mo11468x92b714fd(bArr);
    }
}
