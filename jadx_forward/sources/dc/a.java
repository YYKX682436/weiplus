package dc;

/* loaded from: classes16.dex */
public class a extends dc.j {

    /* renamed from: h, reason: collision with root package name */
    public final dc.q f310132h;

    /* renamed from: i, reason: collision with root package name */
    public final int f310133i;

    /* renamed from: m, reason: collision with root package name */
    public final long f310134m;

    public a(long j17, dc.o oVar, dc.q qVar, int i17, long j18) {
        super(j17, oVar);
        this.f310132h = qVar;
        this.f310133i = i17;
        this.f310134m = j18;
    }

    @Override // dc.j
    public dc.e i() {
        java.lang.String str;
        dc.q qVar = dc.q.OBJECT;
        dc.q qVar2 = this.f310132h;
        if (qVar2 == qVar) {
            return super.i();
        }
        dc.m mVar = this.f310166f.f310158i;
        switch (qVar2.ordinal()) {
            case 1:
                str = "boolean[]";
                break;
            case 2:
                str = "char[]";
                break;
            case 3:
                str = "float[]";
                break;
            case 4:
                str = "double[]";
                break;
            case 5:
                str = "byte[]";
                break;
            case 6:
                str = "short[]";
                break;
            case 7:
                str = "int[]";
                break;
            case 8:
                str = "long[]";
                break;
            default:
                throw new java.lang.IllegalArgumentException("OBJECT type is not a primitive type");
        }
        return mVar.c(str);
    }

    @Override // dc.j
    public final int j() {
        return this.f310133i * this.f310166f.f310158i.f310191e[this.f310132h.f310205d];
    }

    public final byte[] m(int i17, int i18) {
        ((ec.b) h()).f332461d = this.f310134m;
        dc.q qVar = this.f310132h;
        int i19 = qVar.f310206e * i18;
        byte[] bArr = new byte[i19];
        ec.a h17 = h();
        int i27 = i18 * qVar.f310206e;
        ec.b bVar = (ec.b) h17;
        bVar.f332461d += i17 * r0;
        int a17 = bVar.a();
        java.nio.ByteBuffer[] byteBufferArr = bVar.f332459b;
        byteBufferArr[a17].position(bVar.b());
        if (i19 <= byteBufferArr[a17].remaining()) {
            byteBufferArr[a17].get(bArr, 0, i19);
        } else {
            int position = 1073741824 - byteBufferArr[a17].position();
            byteBufferArr[a17].get(bArr, 0, position);
            int min = java.lang.Math.min(i27 - position, i19 - position);
            int i28 = ((min + 1073741824) - 1) / 1073741824;
            for (int i29 = 0; i29 < i28; i29++) {
                int min2 = java.lang.Math.min(min, 1073741824);
                int i37 = a17 + 1 + i29;
                byteBufferArr[i37].position(0);
                byteBufferArr[i37].get(bArr, position, min2);
                position += min2;
                min -= min2;
            }
        }
        bVar.f332461d += java.lang.Math.min(i19, i27);
        return bArr;
    }

    public java.lang.Object[] n() {
        int i17 = this.f310133i;
        java.lang.Object[] objArr = new java.lang.Object[i17];
        ((ec.b) h()).f332461d = this.f310134m;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = l(this.f310132h);
        }
        return objArr;
    }

    /* renamed from: toString */
    public final java.lang.String m123890x9616526c() {
        java.lang.String str = i().f310139h;
        if (str.endsWith("[]")) {
            str = str.substring(0, str.length() - 2);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f310133i);
        long j17 = this.f310166f.f310158i.f310192f;
        long j18 = this.f310164d;
        return java.lang.String.format("%s[%d]@%d (0x%x)", str, valueOf, java.lang.Long.valueOf(j17 & j18), java.lang.Long.valueOf(this.f310166f.f310158i.f310192f & j18));
    }
}
