package bw5;

/* loaded from: classes4.dex */
public class da extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ca f107934d = bw5.ca.EmoticonBoardPageType_QQEmoji;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107935e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107936f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f107937g = 0;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ea f107938h = new bw5.ea();

    /* renamed from: i, reason: collision with root package name */
    public bw5.aa f107939i = new bw5.aa();

    static {
        new bw5.da();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.da mo11468x92b714fd(byte[] bArr) {
        return (bw5.da) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.da)) {
            return false;
        }
        bw5.da daVar = (bw5.da) fVar;
        return n51.f.a(this.f107934d, daVar.f107934d) && n51.f.a(this.f107935e, daVar.f107935e) && n51.f.a(this.f107936f, daVar.f107936f) && n51.f.a(java.lang.Integer.valueOf(this.f107937g), java.lang.Integer.valueOf(daVar.f107937g)) && n51.f.a(this.f107938h, daVar.f107938h) && n51.f.a(this.f107939i, daVar.f107939i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.da();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.ca caVar;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ca caVar2 = this.f107934d;
            if (caVar2 != null) {
                fVar.e(1, caVar2.f107538d);
            }
            java.lang.String str = this.f107935e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107936f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f107937g);
            bw5.ea eaVar = this.f107938h;
            if (eaVar != null) {
                fVar.i(5, eaVar.mo75928xcd1e8d8());
                this.f107938h.mo75956x3d5d1f78(fVar);
            }
            bw5.aa aaVar = this.f107939i;
            if (aaVar != null) {
                fVar.i(6, aaVar.mo75928xcd1e8d8());
                this.f107939i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ca caVar3 = this.f107934d;
            int e17 = caVar3 != null ? 0 + b36.f.e(1, caVar3.f107538d) : 0;
            java.lang.String str3 = this.f107935e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f107936f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f107937g);
            bw5.ea eaVar2 = this.f107938h;
            if (eaVar2 != null) {
                e18 += b36.f.i(5, eaVar2.mo75928xcd1e8d8());
            }
            bw5.aa aaVar2 = this.f107939i;
            return aaVar2 != null ? e18 + b36.f.i(6, aaVar2.mo75928xcd1e8d8()) : e18;
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
        switch (intValue) {
            case 1:
                switch (aVar2.g(intValue)) {
                    case 0:
                        caVar = bw5.ca.EmoticonBoardPageType_QQEmoji;
                        break;
                    case 1:
                        caVar = bw5.ca.EmoticonBoardPageType_Emoticon;
                        break;
                    case 2:
                        caVar = bw5.ca.EmoticonBoardPageType_Recommend;
                        break;
                    case 3:
                        caVar = bw5.ca.EmoticonBoardPageType_CameraEntry;
                        break;
                    case 4:
                        caVar = bw5.ca.EmoticonBoardPageType_SystemEmoji;
                        break;
                    case 5:
                        caVar = bw5.ca.EmoticonBoardPageType_EmoticonIPSet;
                        break;
                    case 6:
                        caVar = bw5.ca.EmoticonBoardPageType_EmoticonIPTip;
                        break;
                    case 7:
                        caVar = bw5.ca.EmoticonBoardPageTypeRecommendAndAi;
                        break;
                    default:
                        caVar = null;
                        break;
                }
                this.f107934d = caVar;
                return 0;
            case 2:
                this.f107935e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f107936f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f107937g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ea eaVar3 = new bw5.ea();
                    if (bArr != null && bArr.length > 0) {
                        eaVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107938h = eaVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.aa aaVar3 = new bw5.aa();
                    if (bArr2 != null && bArr2.length > 0) {
                        aaVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f107939i = aaVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
