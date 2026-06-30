package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.JceDisplayer */
/* loaded from: classes13.dex */
public final class C2857xb4f8ac23 {

    /* renamed from: _level */
    private int f9749xa83dfe85;

    /* renamed from: sb, reason: collision with root package name */
    private java.lang.StringBuilder f127350sb;

    public C2857xb4f8ac23(java.lang.StringBuilder sb6, int i17) {
        this.f127350sb = sb6;
        this.f9749xa83dfe85 = i17;
    }

    /* renamed from: main */
    public static void m21243x3305b9(java.lang.String[] strArr) {
        java.lang.System.out.println("1.2");
    }

    private void ps(java.lang.String str) {
        for (int i17 = 0; i17 < this.f9749xa83dfe85; i17++) {
            this.f127350sb.append('\t');
        }
        if (str != null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append(str);
            sb6.append(": ");
        }
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21256x63a518c2(boolean z17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(z17 ? 'T' : 'F');
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21277x93891d14(boolean z17, boolean z18) {
        this.f127350sb.append(z17 ? 'T' : 'F');
        if (z18) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21244x63a518c2(byte b17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append((int) b17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21265x93891d14(byte b17, boolean z17) {
        this.f127350sb.append((int) b17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    public C2857xb4f8ac23(java.lang.StringBuilder sb6) {
        this.f9749xa83dfe85 = 0;
        this.f127350sb = sb6;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21245x63a518c2(char c17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(c17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21266x93891d14(char c17, boolean z17) {
        this.f127350sb.append(c17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21255x63a518c2(short s17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append((int) s17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21276x93891d14(short s17, boolean z17) {
        this.f127350sb.append((int) s17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21248x63a518c2(int i17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(i17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21269x93891d14(int i17, boolean z17) {
        this.f127350sb.append(i17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21249x63a518c2(long j17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(j17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21270x93891d14(long j17, boolean z17) {
        this.f127350sb.append(j17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21247x63a518c2(float f17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(f17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21268x93891d14(float f17, boolean z17) {
        this.f127350sb.append(f17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21246x63a518c2(double d17, java.lang.String str) {
        ps(str);
        java.lang.StringBuilder sb6 = this.f127350sb;
        sb6.append(d17);
        sb6.append('\n');
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21267x93891d14(double d17, boolean z17) {
        this.f127350sb.append(d17);
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21252x63a518c2(java.lang.String str, java.lang.String str2) {
        ps(str2);
        if (str == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
        } else {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(str);
            sb7.append('\n');
        }
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21273x93891d14(java.lang.String str, boolean z17) {
        if (str == null) {
            this.f127350sb.append("null");
        } else {
            this.f127350sb.append(str);
        }
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21257x63a518c2(byte[] bArr, java.lang.String str) {
        ps(str);
        if (bArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (bArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(bArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(bArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (byte b17 : bArr) {
            c2857xb4f8ac23.m21244x63a518c2(b17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21278x93891d14(byte[] bArr, boolean z17) {
        if (bArr == null || bArr.length == 0) {
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append(com.qq.taf.jce.C2855x93dd899d.m21238x223991d(bArr));
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21279x93891d14(char[] cArr, boolean z17) {
        if (cArr == null || cArr.length == 0) {
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append(new java.lang.String(cArr));
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21285x93891d14(short[] sArr, boolean z17) {
        if (sArr != null && sArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < sArr.length; i17++) {
                short s17 = sArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21276x93891d14(s17, false);
            }
            this.f127350sb.append("]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21258x63a518c2(char[] cArr, java.lang.String str) {
        ps(str);
        if (cArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (cArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(cArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(cArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (char c17 : cArr) {
            c2857xb4f8ac23.m21245x63a518c2(c17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21282x93891d14(int[] iArr, boolean z17) {
        if (iArr != null && iArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < iArr.length; i17++) {
                int i18 = iArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21269x93891d14(i18, false);
            }
            this.f127350sb.append("]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21264x63a518c2(short[] sArr, java.lang.String str) {
        ps(str);
        if (sArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (sArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(sArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(sArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (short s17 : sArr) {
            c2857xb4f8ac23.m21255x63a518c2(s17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21261x63a518c2(int[] iArr, java.lang.String str) {
        ps(str);
        if (iArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (iArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(iArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(iArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (int i17 : iArr) {
            c2857xb4f8ac23.m21248x63a518c2(i17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21283x93891d14(long[] jArr, boolean z17) {
        if (jArr != null && jArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < jArr.length; i17++) {
                long j17 = jArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21270x93891d14(j17, false);
            }
            this.f127350sb.append("]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21262x63a518c2(long[] jArr, java.lang.String str) {
        ps(str);
        if (jArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (jArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(jArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(jArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (long j17 : jArr) {
            c2857xb4f8ac23.m21249x63a518c2(j17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21281x93891d14(float[] fArr, boolean z17) {
        if (fArr != null && fArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < fArr.length; i17++) {
                float f17 = fArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21268x93891d14(f17, false);
            }
            this.f127350sb.append("]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21260x63a518c2(float[] fArr, java.lang.String str) {
        ps(str);
        if (fArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (fArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(fArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(fArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (float f17 : fArr) {
            c2857xb4f8ac23.m21247x63a518c2(f17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21280x93891d14(double[] dArr, boolean z17) {
        if (dArr != null && dArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < dArr.length; i17++) {
                double d17 = dArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21267x93891d14(d17, false);
            }
            this.f127350sb.append("[");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21259x63a518c2(double[] dArr, java.lang.String str) {
        ps(str);
        if (dArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (dArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(dArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(dArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (double d17 : dArr) {
            c2857xb4f8ac23.m21246x63a518c2(d17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public <K, V> com.qq.taf.jce.C2857xb4f8ac23 m21275x93891d14(java.util.Map<K, V> map, boolean z17) {
        if (map != null && !map.isEmpty()) {
            this.f127350sb.append("{");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 2);
            boolean z18 = true;
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                if (!z18) {
                    this.f127350sb.append(",");
                }
                c2857xb4f8ac23.m21272x93891d14((com.qq.taf.jce.C2857xb4f8ac23) entry.getKey(), true);
                c2857xb4f8ac23.m21272x93891d14((com.qq.taf.jce.C2857xb4f8ac23) entry.getValue(), false);
                z18 = false;
            }
            this.f127350sb.append("}");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("{}");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public <K, V> com.qq.taf.jce.C2857xb4f8ac23 m21254x63a518c2(java.util.Map<K, V> map, java.lang.String str) {
        ps(str);
        if (map == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (map.isEmpty()) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(map.size());
            sb7.append(", {}");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(map.size());
        sb8.append(", {");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac232 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 2);
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            c2857xb4f8ac23.m21245x63a518c2('(', (java.lang.String) null);
            c2857xb4f8ac232.m21251x63a518c2((com.qq.taf.jce.C2857xb4f8ac23) entry.getKey(), (java.lang.String) null);
            c2857xb4f8ac232.m21251x63a518c2((com.qq.taf.jce.C2857xb4f8ac23) entry.getValue(), (java.lang.String) null);
            c2857xb4f8ac23.m21245x63a518c2(')', (java.lang.String) null);
        }
        m21245x63a518c2('}', (java.lang.String) null);
        return this;
    }

    /* renamed from: displaySimple */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21284x93891d14(T[] tArr, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            this.f127350sb.append("[");
            com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
            for (int i17 = 0; i17 < tArr.length; i17++) {
                T t17 = tArr[i17];
                if (i17 != 0) {
                    this.f127350sb.append("|");
                }
                c2857xb4f8ac23.m21272x93891d14((com.qq.taf.jce.C2857xb4f8ac23) t17, false);
            }
            this.f127350sb.append("]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        this.f127350sb.append("[]");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21263x63a518c2(T[] tArr, java.lang.String str) {
        ps(str);
        if (tArr == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
            return this;
        }
        if (tArr.length == 0) {
            java.lang.StringBuilder sb7 = this.f127350sb;
            sb7.append(tArr.length);
            sb7.append(", []");
            sb7.append('\n');
            return this;
        }
        java.lang.StringBuilder sb8 = this.f127350sb;
        sb8.append(tArr.length);
        sb8.append(", [");
        sb8.append('\n');
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(this.f127350sb, this.f9749xa83dfe85 + 1);
        for (T t17 : tArr) {
            c2857xb4f8ac23.m21251x63a518c2((com.qq.taf.jce.C2857xb4f8ac23) t17, (java.lang.String) null);
        }
        m21245x63a518c2(']', (java.lang.String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: displaySimple */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21274x93891d14(java.util.Collection<T> collection, boolean z17) {
        if (collection == null) {
            this.f127350sb.append("[]");
            if (z17) {
                this.f127350sb.append("|");
            }
            return this;
        }
        return m21284x93891d14(collection.toArray(), z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: displaySimple */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21272x93891d14(T t17, boolean z17) {
        if (t17 == 0) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
        } else if (t17 instanceof java.lang.Byte) {
            m21265x93891d14(((java.lang.Byte) t17).byteValue(), z17);
        } else if (t17 instanceof java.lang.Boolean) {
            m21277x93891d14(((java.lang.Boolean) t17).booleanValue(), z17);
        } else if (t17 instanceof java.lang.Short) {
            m21276x93891d14(((java.lang.Short) t17).shortValue(), z17);
        } else if (t17 instanceof java.lang.Integer) {
            m21269x93891d14(((java.lang.Integer) t17).intValue(), z17);
        } else if (t17 instanceof java.lang.Long) {
            m21270x93891d14(((java.lang.Long) t17).longValue(), z17);
        } else if (t17 instanceof java.lang.Float) {
            m21268x93891d14(((java.lang.Float) t17).floatValue(), z17);
        } else if (t17 instanceof java.lang.Double) {
            m21267x93891d14(((java.lang.Double) t17).doubleValue(), z17);
        } else if (t17 instanceof java.lang.String) {
            m21273x93891d14((java.lang.String) t17, z17);
        } else if (t17 instanceof java.util.Map) {
            m21275x93891d14((java.util.Map) t17, z17);
        } else if (t17 instanceof java.util.List) {
            m21274x93891d14((java.util.Collection) t17, z17);
        } else if (t17 instanceof com.qq.taf.jce.AbstractC2861x7aec4921) {
            m21271x93891d14((com.qq.taf.jce.AbstractC2861x7aec4921) t17, z17);
        } else if (t17 instanceof byte[]) {
            m21278x93891d14((byte[]) t17, z17);
        } else if (t17 instanceof boolean[]) {
            m21272x93891d14((com.qq.taf.jce.C2857xb4f8ac23) t17, z17);
        } else if (t17 instanceof short[]) {
            m21285x93891d14((short[]) t17, z17);
        } else if (t17 instanceof int[]) {
            m21282x93891d14((int[]) t17, z17);
        } else if (t17 instanceof long[]) {
            m21283x93891d14((long[]) t17, z17);
        } else if (t17 instanceof float[]) {
            m21281x93891d14((float[]) t17, z17);
        } else if (t17 instanceof double[]) {
            m21280x93891d14((double[]) t17, z17);
        } else if (t17.getClass().isArray()) {
            m21284x93891d14((java.lang.Object[]) t17, z17);
        } else {
            throw new com.qq.taf.jce.C2858x349ca30d("write object error: unsupport type.");
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: display */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21253x63a518c2(java.util.Collection<T> collection, java.lang.String str) {
        if (collection == null) {
            ps(str);
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\t');
            return this;
        }
        return m21263x63a518c2(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: display */
    public <T> com.qq.taf.jce.C2857xb4f8ac23 m21251x63a518c2(T t17, java.lang.String str) {
        if (t17 == 0) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append("null");
            sb6.append('\n');
        } else if (t17 instanceof java.lang.Byte) {
            m21244x63a518c2(((java.lang.Byte) t17).byteValue(), str);
        } else if (t17 instanceof java.lang.Boolean) {
            m21256x63a518c2(((java.lang.Boolean) t17).booleanValue(), str);
        } else if (t17 instanceof java.lang.Short) {
            m21255x63a518c2(((java.lang.Short) t17).shortValue(), str);
        } else if (t17 instanceof java.lang.Integer) {
            m21248x63a518c2(((java.lang.Integer) t17).intValue(), str);
        } else if (t17 instanceof java.lang.Long) {
            m21249x63a518c2(((java.lang.Long) t17).longValue(), str);
        } else if (t17 instanceof java.lang.Float) {
            m21247x63a518c2(((java.lang.Float) t17).floatValue(), str);
        } else if (t17 instanceof java.lang.Double) {
            m21246x63a518c2(((java.lang.Double) t17).doubleValue(), str);
        } else if (t17 instanceof java.lang.String) {
            m21252x63a518c2((java.lang.String) t17, str);
        } else if (t17 instanceof java.util.Map) {
            m21254x63a518c2((java.util.Map) t17, str);
        } else if (t17 instanceof java.util.List) {
            m21253x63a518c2((java.util.Collection) t17, str);
        } else if (t17 instanceof com.qq.taf.jce.AbstractC2861x7aec4921) {
            m21250x63a518c2((com.qq.taf.jce.AbstractC2861x7aec4921) t17, str);
        } else if (t17 instanceof byte[]) {
            m21257x63a518c2((byte[]) t17, str);
        } else if (t17 instanceof boolean[]) {
            m21251x63a518c2((com.qq.taf.jce.C2857xb4f8ac23) t17, str);
        } else if (t17 instanceof short[]) {
            m21264x63a518c2((short[]) t17, str);
        } else if (t17 instanceof int[]) {
            m21261x63a518c2((int[]) t17, str);
        } else if (t17 instanceof long[]) {
            m21262x63a518c2((long[]) t17, str);
        } else if (t17 instanceof float[]) {
            m21260x63a518c2((float[]) t17, str);
        } else if (t17 instanceof double[]) {
            m21259x63a518c2((double[]) t17, str);
        } else if (t17.getClass().isArray()) {
            m21263x63a518c2((java.lang.Object[]) t17, str);
        } else {
            throw new com.qq.taf.jce.C2858x349ca30d("write object error: unsupport type.");
        }
        return this;
    }

    /* renamed from: displaySimple */
    public com.qq.taf.jce.C2857xb4f8ac23 m21271x93891d14(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, boolean z17) {
        this.f127350sb.append("{");
        if (abstractC2861x7aec4921 == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append('\t');
            sb6.append("null");
        } else {
            abstractC2861x7aec4921.mo21367x93891d14(this.f127350sb, this.f9749xa83dfe85 + 1);
        }
        this.f127350sb.append("}");
        if (z17) {
            this.f127350sb.append("|");
        }
        return this;
    }

    /* renamed from: display */
    public com.qq.taf.jce.C2857xb4f8ac23 m21250x63a518c2(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, java.lang.String str) {
        m21245x63a518c2('{', str);
        if (abstractC2861x7aec4921 == null) {
            java.lang.StringBuilder sb6 = this.f127350sb;
            sb6.append('\t');
            sb6.append("null");
        } else {
            abstractC2861x7aec4921.mo21232x63a518c2(this.f127350sb, this.f9749xa83dfe85 + 1);
        }
        m21245x63a518c2('}', (java.lang.String) null);
        return this;
    }
}
