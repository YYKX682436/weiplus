package r45;

/* loaded from: classes9.dex */
public class h67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f457416d;

    /* renamed from: e, reason: collision with root package name */
    public float f457417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457418f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457419g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457420h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457421i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457422m;

    /* renamed from: n, reason: collision with root package name */
    public long f457423n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457424o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h67)) {
            return false;
        }
        r45.h67 h67Var = (r45.h67) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f457416d), java.lang.Float.valueOf(h67Var.f457416d)) && n51.f.a(java.lang.Float.valueOf(this.f457417e), java.lang.Float.valueOf(h67Var.f457417e)) && n51.f.a(this.f457418f, h67Var.f457418f) && n51.f.a(this.f457419g, h67Var.f457419g) && n51.f.a(this.f457420h, h67Var.f457420h) && n51.f.a(this.f457421i, h67Var.f457421i) && n51.f.a(this.f457422m, h67Var.f457422m) && n51.f.a(java.lang.Long.valueOf(this.f457423n), java.lang.Long.valueOf(h67Var.f457423n)) && n51.f.a(this.f457424o, h67Var.f457424o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f457416d);
            fVar.d(2, this.f457417e);
            java.lang.String str = this.f457418f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f457419g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f457420h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f457421i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f457422m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f457423n);
            java.lang.String str6 = this.f457424o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f457416d) + 0 + b36.f.d(2, this.f457417e);
            java.lang.String str7 = this.f457418f;
            if (str7 != null) {
                d17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f457419g;
            if (str8 != null) {
                d17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f457420h;
            if (str9 != null) {
                d17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f457421i;
            if (str10 != null) {
                d17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f457422m;
            if (str11 != null) {
                d17 += b36.f.j(7, str11);
            }
            int h17 = d17 + b36.f.h(8, this.f457423n);
            java.lang.String str12 = this.f457424o;
            return str12 != null ? h17 + b36.f.j(9, str12) : h17;
        }
        if (i17 == 2) {
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
        r45.h67 h67Var = (r45.h67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h67Var.f457416d = aVar2.f(intValue);
                return 0;
            case 2:
                h67Var.f457417e = aVar2.f(intValue);
                return 0;
            case 3:
                h67Var.f457418f = aVar2.k(intValue);
                return 0;
            case 4:
                h67Var.f457419g = aVar2.k(intValue);
                return 0;
            case 5:
                h67Var.f457420h = aVar2.k(intValue);
                return 0;
            case 6:
                h67Var.f457421i = aVar2.k(intValue);
                return 0;
            case 7:
                h67Var.f457422m = aVar2.k(intValue);
                return 0;
            case 8:
                h67Var.f457423n = aVar2.i(intValue);
                return 0;
            case 9:
                h67Var.f457424o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
