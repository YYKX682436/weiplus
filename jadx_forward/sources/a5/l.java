package a5;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f82942a = new java.util.HashMap();

    public a5.m a() {
        a5.m mVar = new a5.m(this.f82942a);
        a5.m.d(mVar);
        return mVar;
    }

    public a5.l b(java.lang.String str, java.lang.Object obj) {
        java.util.Map map = this.f82942a;
        if (obj == null) {
            ((java.util.HashMap) map).put(str, null);
        } else {
            java.lang.Class<?> cls = obj.getClass();
            if (cls == java.lang.Boolean.class || cls == java.lang.Byte.class || cls == java.lang.Integer.class || cls == java.lang.Long.class || cls == java.lang.Float.class || cls == java.lang.Double.class || cls == java.lang.String.class || cls == java.lang.Boolean[].class || cls == java.lang.Byte[].class || cls == java.lang.Integer[].class || cls == java.lang.Long[].class || cls == java.lang.Float[].class || cls == java.lang.Double[].class || cls == java.lang.String[].class) {
                ((java.util.HashMap) map).put(str, obj);
            } else {
                int i17 = 0;
                if (cls == boolean[].class) {
                    boolean[] zArr = (boolean[]) obj;
                    a5.m mVar = a5.m.f82943b;
                    java.lang.Boolean[] boolArr = new java.lang.Boolean[zArr.length];
                    while (i17 < zArr.length) {
                        boolArr[i17] = java.lang.Boolean.valueOf(zArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, boolArr);
                } else if (cls == byte[].class) {
                    byte[] bArr = (byte[]) obj;
                    a5.m mVar2 = a5.m.f82943b;
                    java.lang.Byte[] bArr2 = new java.lang.Byte[bArr.length];
                    while (i17 < bArr.length) {
                        bArr2[i17] = java.lang.Byte.valueOf(bArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, bArr2);
                } else if (cls == int[].class) {
                    int[] iArr = (int[]) obj;
                    a5.m mVar3 = a5.m.f82943b;
                    java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
                    while (i17 < iArr.length) {
                        numArr[i17] = java.lang.Integer.valueOf(iArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, numArr);
                } else if (cls == long[].class) {
                    long[] jArr = (long[]) obj;
                    a5.m mVar4 = a5.m.f82943b;
                    java.lang.Long[] lArr = new java.lang.Long[jArr.length];
                    while (i17 < jArr.length) {
                        lArr[i17] = java.lang.Long.valueOf(jArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, lArr);
                } else if (cls == float[].class) {
                    float[] fArr = (float[]) obj;
                    a5.m mVar5 = a5.m.f82943b;
                    java.lang.Float[] fArr2 = new java.lang.Float[fArr.length];
                    while (i17 < fArr.length) {
                        fArr2[i17] = java.lang.Float.valueOf(fArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, fArr2);
                } else {
                    if (cls != double[].class) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Key %s has invalid type %s", str, cls));
                    }
                    double[] dArr = (double[]) obj;
                    a5.m mVar6 = a5.m.f82943b;
                    java.lang.Double[] dArr2 = new java.lang.Double[dArr.length];
                    while (i17 < dArr.length) {
                        dArr2[i17] = java.lang.Double.valueOf(dArr[i17]);
                        i17++;
                    }
                    ((java.util.HashMap) map).put(str, dArr2);
                }
            }
        }
        return this;
    }

    public a5.l c(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            b((java.lang.String) entry.getKey(), entry.getValue());
        }
        return this;
    }
}
