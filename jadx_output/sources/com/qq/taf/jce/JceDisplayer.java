package com.qq.taf.jce;

/* loaded from: classes13.dex */
public final class JceDisplayer {
    private int _level;

    /* renamed from: sb, reason: collision with root package name */
    private java.lang.StringBuilder f45817sb;

    public JceDisplayer(java.lang.StringBuilder sb6, int i17) {
        this.f45817sb = sb6;
        this._level = i17;
    }

    public static void main(java.lang.String[] strArr) {
        java.lang.System.out.println("1.2");
    }

    private void ps(java.lang.String str) {
        for (int i17 = 0; i17 < this._level; i17++) {
            this.f45817sb.append('\t');
        }
        if (str != null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append(str);
            sb6.append(": ");
        }
    }

    public com.qq.taf.jce.JceDisplayer display(boolean z17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(z17 ? 'T' : 'F');
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(boolean z17, boolean z18) {
        this.f45817sb.append(z17 ? 'T' : 'F');
        if (z18) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(byte b17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append((int) b17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(byte b17, boolean z17) {
        this.f45817sb.append((int) b17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public JceDisplayer(java.lang.StringBuilder sb6) {
        this._level = 0;
        this.f45817sb = sb6;
    }

    public com.qq.taf.jce.JceDisplayer display(char c17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(c17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(char c17, boolean z17) {
        this.f45817sb.append(c17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(short s17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append((int) s17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(short s17, boolean z17) {
        this.f45817sb.append((int) s17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(int i17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(i17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(int i17, boolean z17) {
        this.f45817sb.append(i17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(long j17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(j17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(long j17, boolean z17) {
        this.f45817sb.append(j17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(float f17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(f17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(float f17, boolean z17) {
        this.f45817sb.append(f17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(double d17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f45817sb;
        sb6.append(d17);
        sb6.append('\n');
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(double d17, boolean z17) {
        this.f45817sb.append(d17);
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(java.lang.String str, java.lang.String str2) {
        ps(str2);
        if (str == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
        } else {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(str);
            sb7.append('\n');
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(java.lang.String str, boolean z17) {
        if (str == null) {
            this.f45817sb.append("null");
        } else {
            this.f45817sb.append(str);
        }
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(byte[] bArr, java.lang.String str) {
        ps(str);
        if (bArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (bArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(bArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(bArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (byte b17 : bArr) {
            jceDisplayer.display(b17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(byte[] bArr, boolean z17) {
        if (bArr == null || bArr.length == 0) {
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append(com.qq.taf.jce.HexUtil.bytes2HexStr(bArr));
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(char[] cArr, boolean z17) {
        if (cArr == null || cArr.length == 0) {
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append(new java.lang.String(cArr));
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(short[] sArr, boolean z17) {
        if (sArr != null && sArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < sArr.length; i17++) {
                short s17 = sArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple(s17, false);
            }
            this.f45817sb.append("]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(char[] cArr, java.lang.String str) {
        ps(str);
        if (cArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (cArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(cArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(cArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (char c17 : cArr) {
            jceDisplayer.display(c17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(int[] iArr, boolean z17) {
        if (iArr != null && iArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < iArr.length; i17++) {
                int i18 = iArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple(i18, false);
            }
            this.f45817sb.append("]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(short[] sArr, java.lang.String str) {
        ps(str);
        if (sArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (sArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(sArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(sArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (short s17 : sArr) {
            jceDisplayer.display(s17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(int[] iArr, java.lang.String str) {
        ps(str);
        if (iArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (iArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(iArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(iArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (int i17 : iArr) {
            jceDisplayer.display(i17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(long[] jArr, boolean z17) {
        if (jArr != null && jArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < jArr.length; i17++) {
                long j17 = jArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple(j17, false);
            }
            this.f45817sb.append("]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(long[] jArr, java.lang.String str) {
        ps(str);
        if (jArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (jArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(jArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(jArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (long j17 : jArr) {
            jceDisplayer.display(j17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(float[] fArr, boolean z17) {
        if (fArr != null && fArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < fArr.length; i17++) {
                float f17 = fArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple(f17, false);
            }
            this.f45817sb.append("]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(float[] fArr, java.lang.String str) {
        ps(str);
        if (fArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (fArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(fArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(fArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (float f17 : fArr) {
            jceDisplayer.display(f17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(double[] dArr, boolean z17) {
        if (dArr != null && dArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < dArr.length; i17++) {
                double d17 = dArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple(d17, false);
            }
            this.f45817sb.append("[");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(double[] dArr, java.lang.String str) {
        ps(str);
        if (dArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (dArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(dArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(dArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (double d17 : dArr) {
            jceDisplayer.display(d17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    public <K, V> com.qq.taf.jce.JceDisplayer displaySimple(java.util.Map<K, V> map, boolean z17) {
        if (map != null && !map.isEmpty()) {
            this.f45817sb.append("{");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 2);
            boolean z18 = true;
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                if (!z18) {
                    this.f45817sb.append(",");
                }
                jceDisplayer.displaySimple((com.qq.taf.jce.JceDisplayer) entry.getKey(), true);
                jceDisplayer.displaySimple((com.qq.taf.jce.JceDisplayer) entry.getValue(), false);
                z18 = false;
            }
            this.f45817sb.append("}");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("{}");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public <K, V> com.qq.taf.jce.JceDisplayer display(java.util.Map<K, V> map, java.lang.String str) {
        ps(str);
        if (map == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (map.isEmpty()) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(map.size());
            sb7.append(", {}");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(map.size());
        sb8.append(", {");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        com.qq.taf.jce.JceDisplayer jceDisplayer2 = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 2);
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            jceDisplayer.display('(', (java.lang.String) null);
            jceDisplayer2.display((com.qq.taf.jce.JceDisplayer) entry.getKey(), (java.lang.String) null);
            jceDisplayer2.display((com.qq.taf.jce.JceDisplayer) entry.getValue(), (java.lang.String) null);
            jceDisplayer.display(')', (java.lang.String) null);
        }
        display('}', (java.lang.String) null);
        return this;
    }

    public <T> com.qq.taf.jce.JceDisplayer displaySimple(T[] tArr, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            this.f45817sb.append("[");
            com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
            for (int i17 = 0; i17 < tArr.length; i17++) {
                T t17 = tArr[i17];
                if (i17 != 0) {
                    this.f45817sb.append("|");
                }
                jceDisplayer.displaySimple((com.qq.taf.jce.JceDisplayer) t17, false);
            }
            this.f45817sb.append("]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        this.f45817sb.append("[]");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public <T> com.qq.taf.jce.JceDisplayer display(T[] tArr, java.lang.String str) {
        ps(str);
        if (tArr == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (tArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f45817sb;
            sb7.append(tArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f45817sb;
        sb8.append(tArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(this.f45817sb, this._level + 1);
        for (T t17 : tArr) {
            jceDisplayer.display((com.qq.taf.jce.JceDisplayer) t17, (java.lang.String) null);
        }
        display(']', (java.lang.String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.qq.taf.jce.JceDisplayer displaySimple(java.util.Collection<T> collection, boolean z17) {
        if (collection == null) {
            this.f45817sb.append("[]");
            if (z17) {
                this.f45817sb.append("|");
            }
            return this;
        }
        return displaySimple(collection.toArray(), z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.qq.taf.jce.JceDisplayer displaySimple(T t17, boolean z17) {
        if (t17 == 0) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
        } else if (t17 instanceof java.lang.Byte) {
            displaySimple(((java.lang.Byte) t17).byteValue(), z17);
        } else if (t17 instanceof java.lang.Boolean) {
            displaySimple(((java.lang.Boolean) t17).booleanValue(), z17);
        } else if (t17 instanceof java.lang.Short) {
            displaySimple(((java.lang.Short) t17).shortValue(), z17);
        } else if (t17 instanceof java.lang.Integer) {
            displaySimple(((java.lang.Integer) t17).intValue(), z17);
        } else if (t17 instanceof java.lang.Long) {
            displaySimple(((java.lang.Long) t17).longValue(), z17);
        } else if (t17 instanceof java.lang.Float) {
            displaySimple(((java.lang.Float) t17).floatValue(), z17);
        } else if (t17 instanceof java.lang.Double) {
            displaySimple(((java.lang.Double) t17).doubleValue(), z17);
        } else if (t17 instanceof java.lang.String) {
            displaySimple((java.lang.String) t17, z17);
        } else if (t17 instanceof java.util.Map) {
            displaySimple((java.util.Map) t17, z17);
        } else if (t17 instanceof java.util.List) {
            displaySimple((java.util.Collection) t17, z17);
        } else if (t17 instanceof com.qq.taf.jce.JceStruct) {
            displaySimple((com.qq.taf.jce.JceStruct) t17, z17);
        } else if (t17 instanceof byte[]) {
            displaySimple((byte[]) t17, z17);
        } else if (t17 instanceof boolean[]) {
            displaySimple((com.qq.taf.jce.JceDisplayer) t17, z17);
        } else if (t17 instanceof short[]) {
            displaySimple((short[]) t17, z17);
        } else if (t17 instanceof int[]) {
            displaySimple((int[]) t17, z17);
        } else if (t17 instanceof long[]) {
            displaySimple((long[]) t17, z17);
        } else if (t17 instanceof float[]) {
            displaySimple((float[]) t17, z17);
        } else if (t17 instanceof double[]) {
            displaySimple((double[]) t17, z17);
        } else if (t17.getClass().isArray()) {
            displaySimple((java.lang.Object[]) t17, z17);
        } else {
            throw new com.qq.taf.jce.JceEncodeException("write object error: unsupport type.");
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.qq.taf.jce.JceDisplayer display(java.util.Collection<T> collection, java.lang.String str) {
        if (collection == null) {
            ps(str);
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\t');
            return this;
        }
        return display(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.qq.taf.jce.JceDisplayer display(T t17, java.lang.String str) {
        if (t17 == 0) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append("null");
            sb6.append('\n');
        } else if (t17 instanceof java.lang.Byte) {
            display(((java.lang.Byte) t17).byteValue(), str);
        } else if (t17 instanceof java.lang.Boolean) {
            display(((java.lang.Boolean) t17).booleanValue(), str);
        } else if (t17 instanceof java.lang.Short) {
            display(((java.lang.Short) t17).shortValue(), str);
        } else if (t17 instanceof java.lang.Integer) {
            display(((java.lang.Integer) t17).intValue(), str);
        } else if (t17 instanceof java.lang.Long) {
            display(((java.lang.Long) t17).longValue(), str);
        } else if (t17 instanceof java.lang.Float) {
            display(((java.lang.Float) t17).floatValue(), str);
        } else if (t17 instanceof java.lang.Double) {
            display(((java.lang.Double) t17).doubleValue(), str);
        } else if (t17 instanceof java.lang.String) {
            display((java.lang.String) t17, str);
        } else if (t17 instanceof java.util.Map) {
            display((java.util.Map) t17, str);
        } else if (t17 instanceof java.util.List) {
            display((java.util.Collection) t17, str);
        } else if (t17 instanceof com.qq.taf.jce.JceStruct) {
            display((com.qq.taf.jce.JceStruct) t17, str);
        } else if (t17 instanceof byte[]) {
            display((byte[]) t17, str);
        } else if (t17 instanceof boolean[]) {
            display((com.qq.taf.jce.JceDisplayer) t17, str);
        } else if (t17 instanceof short[]) {
            display((short[]) t17, str);
        } else if (t17 instanceof int[]) {
            display((int[]) t17, str);
        } else if (t17 instanceof long[]) {
            display((long[]) t17, str);
        } else if (t17 instanceof float[]) {
            display((float[]) t17, str);
        } else if (t17 instanceof double[]) {
            display((double[]) t17, str);
        } else if (t17.getClass().isArray()) {
            display((java.lang.Object[]) t17, str);
        } else {
            throw new com.qq.taf.jce.JceEncodeException("write object error: unsupport type.");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer displaySimple(com.qq.taf.jce.JceStruct jceStruct, boolean z17) {
        this.f45817sb.append("{");
        if (jceStruct == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append('\t');
            sb6.append("null");
        } else {
            jceStruct.displaySimple(this.f45817sb, this._level + 1);
        }
        this.f45817sb.append("}");
        if (z17) {
            this.f45817sb.append("|");
        }
        return this;
    }

    public com.qq.taf.jce.JceDisplayer display(com.qq.taf.jce.JceStruct jceStruct, java.lang.String str) {
        display('{', str);
        if (jceStruct == null) {
            java.lang.StringBuilder sb6 = this.f45817sb;
            sb6.append('\t');
            sb6.append("null");
        } else {
            jceStruct.display(this.f45817sb, this._level + 1);
        }
        display('}', (java.lang.String) null);
        return this;
    }
}
