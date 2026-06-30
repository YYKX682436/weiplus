package bw5;

/* loaded from: classes4.dex */
public class yv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35707d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35708e;

    /* renamed from: f, reason: collision with root package name */
    public int f35709f;

    /* renamed from: g, reason: collision with root package name */
    public int f35710g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35711h;

    /* renamed from: i, reason: collision with root package name */
    public int f35712i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35713m;

    /* renamed from: n, reason: collision with root package name */
    public int f35714n;

    /* renamed from: o, reason: collision with root package name */
    public int f35715o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f35716p = new boolean[10];

    static {
        new bw5.yv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yv parseFrom(byte[] bArr) {
        return (bw5.yv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yv)) {
            return false;
        }
        bw5.yv yvVar = (bw5.yv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35707d), java.lang.Integer.valueOf(yvVar.f35707d)) && n51.f.a(this.f35708e, yvVar.f35708e) && n51.f.a(java.lang.Integer.valueOf(this.f35709f), java.lang.Integer.valueOf(yvVar.f35709f)) && n51.f.a(java.lang.Integer.valueOf(this.f35710g), java.lang.Integer.valueOf(yvVar.f35710g)) && n51.f.a(this.f35711h, yvVar.f35711h) && n51.f.a(java.lang.Integer.valueOf(this.f35712i), java.lang.Integer.valueOf(yvVar.f35712i)) && n51.f.a(this.f35713m, yvVar.f35713m) && n51.f.a(java.lang.Integer.valueOf(this.f35714n), java.lang.Integer.valueOf(yvVar.f35714n)) && n51.f.a(java.lang.Integer.valueOf(this.f35715o), java.lang.Integer.valueOf(yvVar.f35715o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35716p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35707d);
            }
            java.lang.String str = this.f35708e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35709f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35710g);
            }
            java.lang.String str2 = this.f35711h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35712i);
            }
            java.lang.String str3 = this.f35713m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35714n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f35715o);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35707d) : 0;
            java.lang.String str4 = this.f35708e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35709f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f35710g);
            }
            java.lang.String str5 = this.f35711h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f35712i);
            }
            java.lang.String str6 = this.f35713m;
            if (str6 != null && zArr[7]) {
                e17 += b36.f.j(7, str6);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f35714n);
            }
            return zArr[9] ? e17 + b36.f.e(9, this.f35715o) : e17;
        }
        if (i17 == 2) {
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
                this.f35707d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35708e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35709f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35710g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35711h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35712i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35713m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35714n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35715o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f35707d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "img_url", this.f35708e, false);
            eVar.d(jSONObject, "img_height", java.lang.Integer.valueOf(this.f35709f), false);
            eVar.d(jSONObject, "img_width", java.lang.Integer.valueOf(this.f35710g), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, this.f35711h, false);
            eVar.d(jSONObject, "text_font_size", java.lang.Integer.valueOf(this.f35712i), false);
            eVar.d(jSONObject, "text_color", this.f35713m, false);
            eVar.d(jSONObject, "space", java.lang.Integer.valueOf(this.f35714n), false);
            eVar.d(jSONObject, "position", java.lang.Integer.valueOf(this.f35715o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
