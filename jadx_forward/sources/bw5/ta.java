package bw5;

/* loaded from: classes4.dex */
public class ta extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ua f114856d = bw5.ua.EmoticonTabItemType_Unknown;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114857e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114858f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114859g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114860h = "";

    static {
        new bw5.ta();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ta mo11468x92b714fd(byte[] bArr) {
        return (bw5.ta) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ta)) {
            return false;
        }
        bw5.ta taVar = (bw5.ta) fVar;
        return n51.f.a(this.f114856d, taVar.f114856d) && n51.f.a(this.f114857e, taVar.f114857e) && n51.f.a(this.f114858f, taVar.f114858f) && n51.f.a(this.f114859g, taVar.f114859g) && n51.f.a(this.f114860h, taVar.f114860h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ta();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ua uaVar = this.f114856d;
            if (uaVar != null) {
                fVar.e(1, uaVar.f115357d);
            }
            java.lang.String str = this.f114857e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f114858f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f114859g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f114860h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ua uaVar2 = this.f114856d;
            int e17 = uaVar2 != null ? 0 + b36.f.e(1, uaVar2.f115357d) : 0;
            java.lang.String str5 = this.f114857e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f114858f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f114859g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f114860h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            this.f114856d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.ua.EmoticonTabItemType_Search : bw5.ua.EmoticonTabItemType_Store : bw5.ua.EmoticonTabItemType_Emoticon : bw5.ua.EmoticonTabItemType_QQEmoji : bw5.ua.EmoticonTabItemType_Unknown;
            return 0;
        }
        if (intValue == 2) {
            this.f114857e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f114858f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f114859g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f114860h = aVar2.k(intValue);
        return 0;
    }
}
