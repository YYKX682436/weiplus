package com.qq.taf.jce.dynamic;

/* loaded from: classes13.dex */
public class JceField {

    /* renamed from: zs, reason: collision with root package name */
    private static com.qq.taf.jce.dynamic.ZeroField[] f45821zs = new com.qq.taf.jce.dynamic.ZeroField[256];
    private int tag;

    static {
        int i17 = 0;
        while (true) {
            com.qq.taf.jce.dynamic.ZeroField[] zeroFieldArr = f45821zs;
            if (i17 >= zeroFieldArr.length) {
                return;
            }
            zeroFieldArr[i17] = new com.qq.taf.jce.dynamic.ZeroField(i17);
            i17++;
        }
    }

    public JceField(int i17) {
        this.tag = i17;
    }

    public static com.qq.taf.jce.dynamic.JceField create(byte b17, int i17) {
        return new com.qq.taf.jce.dynamic.ByteField(b17, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField createList(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, int i17) {
        return new com.qq.taf.jce.dynamic.ListField(jceFieldArr, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField createMap(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, com.qq.taf.jce.dynamic.JceField[] jceFieldArr2, int i17) {
        return new com.qq.taf.jce.dynamic.MapField(jceFieldArr, jceFieldArr2, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField createStruct(com.qq.taf.jce.dynamic.JceField[] jceFieldArr, int i17) {
        return new com.qq.taf.jce.dynamic.StructField(jceFieldArr, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField createZero(int i17) {
        if (i17 >= 0 && i17 < 255) {
            return f45821zs[i17];
        }
        throw new com.qq.taf.jce.JceDecodeException("invalid tag: " + i17);
    }

    public int getTag() {
        return this.tag;
    }

    public static com.qq.taf.jce.dynamic.JceField create(short s17, int i17) {
        return new com.qq.taf.jce.dynamic.ShortField(s17, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField create(int i17, int i18) {
        return new com.qq.taf.jce.dynamic.IntField(i17, i18);
    }

    public static com.qq.taf.jce.dynamic.JceField create(long j17, int i17) {
        return new com.qq.taf.jce.dynamic.LongField(j17, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField create(float f17, int i17) {
        return new com.qq.taf.jce.dynamic.FloatField(f17, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField create(double d17, int i17) {
        return new com.qq.taf.jce.dynamic.DoubleField(d17, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField create(java.lang.String str, int i17) {
        return new com.qq.taf.jce.dynamic.StringField(str, i17);
    }

    public static com.qq.taf.jce.dynamic.JceField create(byte[] bArr, int i17) {
        return new com.qq.taf.jce.dynamic.ByteArrayField(bArr, i17);
    }
}
