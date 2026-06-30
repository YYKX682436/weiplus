package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.StringBuilder f50056a;

    /* renamed from: b, reason: collision with root package name */
    private int f50057b;

    public k(java.lang.StringBuilder sb6, int i17) {
        this.f50056a = sb6;
        this.f50057b = i17;
    }

    private void a(java.lang.String str) {
        for (int i17 = 0; i17 < this.f50057b; i17++) {
            this.f50056a.append('\t');
        }
        if (str != null) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(str);
            sb6.append(": ");
        }
    }

    private k(java.lang.StringBuilder sb6) {
        this.f50057b = 0;
        this.f50056a = sb6;
    }

    private com.tencent.mapsdk.internal.k a(boolean z17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(z17 ? 'T' : 'F');
        sb6.append('\n');
        return this;
    }

    private com.tencent.mapsdk.internal.k a(boolean z17, boolean z18) {
        this.f50056a.append(z17 ? 'T' : 'F');
        if (z18) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(byte b17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append((int) b17);
        sb6.append('\n');
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(byte b17, boolean z17) {
        this.f50056a.append((int) b17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(char c17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(c17);
        sb6.append('\n');
        return this;
    }

    private com.tencent.mapsdk.internal.k a(char c17, boolean z17) {
        this.f50056a.append(c17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(short s17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append((int) s17);
        sb6.append('\n');
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(short s17, boolean z17) {
        this.f50056a.append((int) s17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(int i17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(i17);
        sb6.append('\n');
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(int i17, boolean z17) {
        this.f50056a.append(i17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(long j17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(j17);
        sb6.append('\n');
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(long j17, boolean z17) {
        this.f50056a.append(j17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(float f17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(f17);
        sb6.append('\n');
        return this;
    }

    private com.tencent.mapsdk.internal.k a(float f17, boolean z17) {
        this.f50056a.append(f17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(double d17, java.lang.String str) {
        a(str);
        java.lang.StringBuilder sb6 = this.f50056a;
        sb6.append(d17);
        sb6.append('\n');
        return this;
    }

    private com.tencent.mapsdk.internal.k a(double d17, boolean z17) {
        this.f50056a.append(d17);
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(java.lang.String str, java.lang.String str2) {
        a(str2);
        if (str == null) {
            this.f50056a.append("null\n");
        } else {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(str);
            sb6.append('\n');
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(java.lang.String str, boolean z17) {
        if (str == null) {
            this.f50056a.append("null");
        } else {
            this.f50056a.append(str);
        }
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(byte[] bArr, java.lang.String str) {
        a(str);
        if (bArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(bArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(bArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (byte b17 : bArr) {
            kVar.a(b17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(byte[] bArr, boolean z17) {
        if (bArr == null || bArr.length == 0) {
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append(com.tencent.mapsdk.internal.i.a(bArr));
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(char[] cArr, java.lang.String str) {
        a(str);
        if (cArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (cArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(cArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(cArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (char c17 : cArr) {
            kVar.a(c17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(char[] cArr, boolean z17) {
        if (cArr == null || cArr.length == 0) {
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append(new java.lang.String(cArr));
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(short[] sArr, java.lang.String str) {
        a(str);
        if (sArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(sArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(sArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (short s17 : sArr) {
            kVar.a(s17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(short[] sArr, boolean z17) {
        if (sArr != null && sArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < sArr.length; i17++) {
                short s17 = sArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a(s17, false);
            }
            this.f50056a.append("]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(int[] iArr, java.lang.String str) {
        a(str);
        if (iArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(iArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(iArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (int i17 : iArr) {
            kVar.a(i17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(int[] iArr, boolean z17) {
        if (iArr != null && iArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < iArr.length; i17++) {
                int i18 = iArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a(i18, false);
            }
            this.f50056a.append("]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(long[] jArr, java.lang.String str) {
        a(str);
        if (jArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(jArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(jArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (long j17 : jArr) {
            kVar.a(j17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(long[] jArr, boolean z17) {
        if (jArr != null && jArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < jArr.length; i17++) {
                long j17 = jArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a(j17, false);
            }
            this.f50056a.append("]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(float[] fArr, java.lang.String str) {
        a(str);
        if (fArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(fArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(fArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (float f17 : fArr) {
            kVar.a(f17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(float[] fArr, boolean z17) {
        if (fArr != null && fArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < fArr.length; i17++) {
                float f17 = fArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a(f17, false);
            }
            this.f50056a.append("]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private com.tencent.mapsdk.internal.k a(double[] dArr, java.lang.String str) {
        a(str);
        if (dArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(dArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(dArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (double d17 : dArr) {
            kVar.a(d17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private com.tencent.mapsdk.internal.k a(double[] dArr, boolean z17) {
        if (dArr != null && dArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < dArr.length; i17++) {
                double d17 = dArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a(d17, false);
            }
            this.f50056a.append("[");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    public final <K, V> com.tencent.mapsdk.internal.k a(java.util.Map<K, V> map, java.lang.String str) {
        a(str);
        if (map == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(map.size());
            sb6.append(", {}\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(map.size());
        sb7.append(", {\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        com.tencent.mapsdk.internal.k kVar2 = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 2);
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            kVar.a('(', (java.lang.String) null);
            kVar2.a((com.tencent.mapsdk.internal.k) entry.getKey(), (java.lang.String) null);
            kVar2.a((com.tencent.mapsdk.internal.k) entry.getValue(), (java.lang.String) null);
            kVar.a(')', (java.lang.String) null);
        }
        a('}', (java.lang.String) null);
        return this;
    }

    private <K, V> com.tencent.mapsdk.internal.k a(java.util.Map<K, V> map, boolean z17) {
        if (map != null && !map.isEmpty()) {
            this.f50056a.append("{");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 2);
            boolean z18 = true;
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                if (!z18) {
                    this.f50056a.append(",");
                }
                kVar.a((com.tencent.mapsdk.internal.k) entry.getKey(), true);
                kVar.a((com.tencent.mapsdk.internal.k) entry.getValue(), false);
                z18 = false;
            }
            this.f50056a.append("}");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("{}");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    private <T> com.tencent.mapsdk.internal.k a(T[] tArr, java.lang.String str) {
        a(str);
        if (tArr == null) {
            this.f50056a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append(tArr.length);
            sb6.append(", []\n");
            return this;
        }
        java.lang.StringBuilder sb7 = this.f50056a;
        sb7.append(tArr.length);
        sb7.append(", [\n");
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
        for (T t17 : tArr) {
            kVar.a((com.tencent.mapsdk.internal.k) t17, (java.lang.String) null);
        }
        a(']', (java.lang.String) null);
        return this;
    }

    private <T> com.tencent.mapsdk.internal.k a(T[] tArr, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            this.f50056a.append("[");
            com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(this.f50056a, this.f50057b + 1);
            for (int i17 = 0; i17 < tArr.length; i17++) {
                T t17 = tArr[i17];
                if (i17 != 0) {
                    this.f50056a.append("|");
                }
                kVar.a((com.tencent.mapsdk.internal.k) t17, false);
            }
            this.f50056a.append("]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        this.f50056a.append("[]");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> com.tencent.mapsdk.internal.k a(java.util.Collection<T> collection, java.lang.String str) {
        if (collection == null) {
            a(str);
            this.f50056a.append("null\t");
            return this;
        }
        return a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> com.tencent.mapsdk.internal.k a(java.util.Collection<T> collection, boolean z17) {
        if (collection == null) {
            this.f50056a.append("[]");
            if (z17) {
                this.f50056a.append("|");
            }
            return this;
        }
        return a(collection.toArray(), z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> com.tencent.mapsdk.internal.k a(T t17, java.lang.String str) {
        if (t17 == 0) {
            this.f50056a.append("null\n");
        } else if (t17 instanceof java.lang.Byte) {
            a(((java.lang.Byte) t17).byteValue(), str);
        } else if (t17 instanceof java.lang.Boolean) {
            a(((java.lang.Boolean) t17).booleanValue(), str);
        } else if (t17 instanceof java.lang.Short) {
            a(((java.lang.Short) t17).shortValue(), str);
        } else if (t17 instanceof java.lang.Integer) {
            a(((java.lang.Integer) t17).intValue(), str);
        } else if (t17 instanceof java.lang.Long) {
            a(((java.lang.Long) t17).longValue(), str);
        } else if (t17 instanceof java.lang.Float) {
            a(((java.lang.Float) t17).floatValue(), str);
        } else if (t17 instanceof java.lang.Double) {
            a(((java.lang.Double) t17).doubleValue(), str);
        } else if (t17 instanceof java.lang.String) {
            a((java.lang.String) t17, str);
        } else if (t17 instanceof java.util.Map) {
            a((java.util.Map) t17, str);
        } else if (t17 instanceof java.util.List) {
            a((java.util.Collection) t17, str);
        } else if (t17 instanceof com.tencent.mapsdk.internal.p) {
            a((com.tencent.mapsdk.internal.p) t17, str);
        } else if (t17 instanceof byte[]) {
            a((byte[]) t17, str);
        } else if (t17 instanceof boolean[]) {
            a((com.tencent.mapsdk.internal.k) t17, str);
        } else if (t17 instanceof short[]) {
            a((short[]) t17, str);
        } else if (t17 instanceof int[]) {
            a((int[]) t17, str);
        } else if (t17 instanceof long[]) {
            a((long[]) t17, str);
        } else if (t17 instanceof float[]) {
            a((float[]) t17, str);
        } else if (t17 instanceof double[]) {
            a((double[]) t17, str);
        } else if (t17.getClass().isArray()) {
            a((java.lang.Object[]) t17, str);
        } else {
            throw new com.tencent.mapsdk.internal.l("write object error: unsupport type.");
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> com.tencent.mapsdk.internal.k a(T t17, boolean z17) {
        if (t17 == 0) {
            this.f50056a.append("null\n");
        } else if (t17 instanceof java.lang.Byte) {
            a(((java.lang.Byte) t17).byteValue(), z17);
        } else if (t17 instanceof java.lang.Boolean) {
            a(((java.lang.Boolean) t17).booleanValue(), z17);
        } else if (t17 instanceof java.lang.Short) {
            a(((java.lang.Short) t17).shortValue(), z17);
        } else if (t17 instanceof java.lang.Integer) {
            a(((java.lang.Integer) t17).intValue(), z17);
        } else if (t17 instanceof java.lang.Long) {
            a(((java.lang.Long) t17).longValue(), z17);
        } else if (t17 instanceof java.lang.Float) {
            a(((java.lang.Float) t17).floatValue(), z17);
        } else if (t17 instanceof java.lang.Double) {
            a(((java.lang.Double) t17).doubleValue(), z17);
        } else if (t17 instanceof java.lang.String) {
            a((java.lang.String) t17, z17);
        } else if (t17 instanceof java.util.Map) {
            a((java.util.Map) t17, z17);
        } else if (t17 instanceof java.util.List) {
            a((java.util.Collection) t17, z17);
        } else if (t17 instanceof com.tencent.mapsdk.internal.p) {
            a((com.tencent.mapsdk.internal.p) t17, z17);
        } else if (t17 instanceof byte[]) {
            a((byte[]) t17, z17);
        } else if (t17 instanceof boolean[]) {
            a((com.tencent.mapsdk.internal.k) t17, z17);
        } else if (t17 instanceof short[]) {
            a((short[]) t17, z17);
        } else if (t17 instanceof int[]) {
            a((int[]) t17, z17);
        } else if (t17 instanceof long[]) {
            a((long[]) t17, z17);
        } else if (t17 instanceof float[]) {
            a((float[]) t17, z17);
        } else if (t17 instanceof double[]) {
            a((double[]) t17, z17);
        } else if (t17.getClass().isArray()) {
            a((java.lang.Object[]) t17, z17);
        } else {
            throw new com.tencent.mapsdk.internal.l("write object error: unsupport type.");
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(com.tencent.mapsdk.internal.p pVar, java.lang.String str) {
        a('{', str);
        if (pVar == null) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append('\t');
            sb6.append("null");
        } else {
            pVar.display(this.f50056a, this.f50057b + 1);
        }
        a('}', (java.lang.String) null);
        return this;
    }

    public final com.tencent.mapsdk.internal.k a(com.tencent.mapsdk.internal.p pVar, boolean z17) {
        this.f50056a.append("{");
        if (pVar == null) {
            java.lang.StringBuilder sb6 = this.f50056a;
            sb6.append('\t');
            sb6.append("null");
        } else {
            pVar.displaySimple(this.f50056a, this.f50057b + 1);
        }
        this.f50056a.append("}");
        if (z17) {
            this.f50056a.append("|");
        }
        return this;
    }
}
