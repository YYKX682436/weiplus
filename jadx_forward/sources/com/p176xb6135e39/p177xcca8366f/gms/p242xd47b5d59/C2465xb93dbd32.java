package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.DataMap */
/* loaded from: classes13.dex */
public class C2465xb93dbd32 {
    public static final java.lang.String TAG = "DataMap";
    private final java.util.HashMap<java.lang.String, java.lang.Object> zzq = new java.util.HashMap<>();

    /* renamed from: arrayListFromBundleArrayList */
    public static java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32> m19741x9da17314(java.util.ArrayList<android.os.Bundle> arrayList) {
        java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32> arrayList2 = new java.util.ArrayList<>();
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            android.os.Bundle bundle = arrayList.get(i17);
            i17++;
            arrayList2.add(m19742x63aa4ccc(bundle));
        }
        return arrayList2;
    }

    /* renamed from: fromBundle */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 m19742x63aa4ccc(android.os.Bundle bundle) {
        bundle.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0.class.getClassLoader());
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.String) {
                c2465xb93dbd32.m19787xe4673800(str, (java.lang.String) obj);
            } else if (obj instanceof java.lang.Integer) {
                c2465xb93dbd32.m19783xc5c55e60(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                c2465xb93dbd32.m19785xf2e7ce2b(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                c2465xb93dbd32.m19780xca8953c0(str, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                c2465xb93dbd32.m19781x69bc108d(str, ((java.lang.Float) obj).floatValue());
            } else if (obj instanceof java.lang.Boolean) {
                c2465xb93dbd32.m19775x1c849219(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                c2465xb93dbd32.m19776xf2e368b7(str, ((java.lang.Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                c2465xb93dbd32.m19777x170df3e2(str, (byte[]) obj);
            } else if (obj instanceof java.lang.String[]) {
                c2465xb93dbd32.m19788x57254a39(str, (java.lang.String[]) obj);
            } else if (obj instanceof long[]) {
                c2465xb93dbd32.m19786x98f2d6ee(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                c2465xb93dbd32.m19782x8db2c1cc(str, (float[]) obj);
            } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) {
                c2465xb93dbd32.m19774x6978d921(str, (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) obj);
            } else if (obj instanceof android.os.Bundle) {
                c2465xb93dbd32.m19778x6eae4b43(str, m19742x63aa4ccc((android.os.Bundle) obj));
            } else if (obj instanceof java.util.ArrayList) {
                java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) obj;
                int zza = zza(arrayList);
                if (zza != 0 && zza != 1) {
                    if (zza == 2) {
                        c2465xb93dbd32.m19784x8128e028(str, arrayList);
                    } else if (zza != 3) {
                        if (zza == 5) {
                            c2465xb93dbd32.m19779xcaee9294(str, m19741x9da17314(arrayList));
                        }
                    }
                }
                c2465xb93dbd32.m19789x52b7aa77(str, arrayList);
            }
        }
        return c2465xb93dbd32;
    }

    /* renamed from: fromByteArray */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 m19743x3478da7(byte[] bArr) {
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zze.zza(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzg.zza(bArr), new java.util.ArrayList()));
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs e17) {
            throw new java.lang.IllegalArgumentException("Unable to convert data", e17);
        }
    }

    private static int zza(java.util.ArrayList<?> arrayList) {
        int i17 = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        while (i17 < size) {
            java.lang.Object obj = arrayList.get(i17);
            i17++;
            if (obj != null) {
                if (obj instanceof java.lang.Integer) {
                    return 2;
                }
                if (obj instanceof java.lang.String) {
                    return 3;
                }
                if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) {
                    return 4;
                }
                if (obj instanceof android.os.Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    /* renamed from: clear */
    public void m19744x5a5b64d() {
        this.zzq.clear();
    }

    /* renamed from: containsKey */
    public boolean m19745xc6607c0(java.lang.String str) {
        return this.zzq.containsKey(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        if (r4 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        return true;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m19746xb2c87fbf(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.wearable.DataMap r7 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) r7
            int r0 = r6.m19791x35e001()
            int r2 = r7.m19791x35e001()
            if (r0 == r2) goto L13
            return r1
        L13:
            java.util.Set r0 = r6.m19772xbc5e1583()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r2 = r7.get(r2)
            boolean r5 = r4 instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0
            if (r5 == 0) goto L6d
            boolean r5 = r2 instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0
            if (r5 != 0) goto L39
            return r1
        L39:
            com.google.android.gms.wearable.Asset r4 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) r4
            com.google.android.gms.wearable.Asset r2 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) r2
            if (r4 == 0) goto L66
            if (r2 != 0) goto L42
            goto L66
        L42:
            java.lang.String r3 = r4.m19633x15b3c0ba()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L59
            java.lang.String r3 = r4.m19633x15b3c0ba()
            java.lang.String r2 = r2.m19633x15b3c0ba()
            boolean r3 = r3.equals(r2)
            goto L6a
        L59:
            byte[] r3 = r4.m19632xfb7e5820()
            byte[] r2 = r2.m19632xfb7e5820()
            boolean r3 = java.util.Arrays.equals(r3, r2)
            goto L6a
        L66:
            if (r4 != r2) goto L69
            goto L6a
        L69:
            r3 = r1
        L6a:
            if (r3 != 0) goto L1b
            return r1
        L6d:
            boolean r5 = r4 instanceof java.lang.String[]
            if (r5 == 0) goto L81
            boolean r3 = r2 instanceof java.lang.String[]
            if (r3 != 0) goto L76
            return r1
        L76:
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String[] r2 = (java.lang.String[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L1b
            return r1
        L81:
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L95
            boolean r3 = r2 instanceof long[]
            if (r3 != 0) goto L8a
            return r1
        L8a:
            long[] r4 = (long[]) r4
            long[] r2 = (long[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L1b
            return r1
        L95:
            boolean r5 = r4 instanceof float[]
            if (r5 == 0) goto La9
            boolean r3 = r2 instanceof float[]
            if (r3 != 0) goto L9e
            return r1
        L9e:
            float[] r4 = (float[]) r4
            float[] r2 = (float[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L1b
            return r1
        La9:
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto Lbd
            boolean r3 = r2 instanceof byte[]
            if (r3 != 0) goto Lb2
            return r1
        Lb2:
            byte[] r4 = (byte[]) r4
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L1b
            return r1
        Lbd:
            if (r4 == 0) goto Lc9
            if (r2 != 0) goto Lc2
            goto Lc9
        Lc2:
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L1b
            return r1
        Lc9:
            if (r4 == r2) goto Lcc
            return r1
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32.m19746xb2c87fbf(java.lang.Object):boolean");
    }

    public <T> T get(java.lang.String str) {
        return (T) this.zzq.get(str);
    }

    /* renamed from: getAsset */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 m19747x742a913a(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0.TAG, e17);
            return null;
        }
    }

    /* renamed from: getBoolean */
    public boolean m19748x41a8a7f2(java.lang.String str) {
        return m19749x41a8a7f2(str, false);
    }

    /* renamed from: getByte */
    public byte m19750xfb7dc97e(java.lang.String str) {
        return m19751xfb7dc97e(str, (byte) 0);
    }

    /* renamed from: getByteArray */
    public byte[] m19752x8383f77b(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "byte[]", e17);
            return null;
        }
    }

    /* renamed from: getDataMap */
    public com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 m19753x93d2611c(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, TAG, e17);
            return null;
        }
    }

    /* renamed from: getDataMapArrayList */
    public java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32> m19754x46d300db(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (java.util.ArrayList) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "ArrayList<DataMap>", e17);
            return null;
        }
    }

    /* renamed from: getDouble */
    public double m19755x160e9ec7(java.lang.String str) {
        return m19756x160e9ec7(str, 0.0d);
    }

    /* renamed from: getFloat */
    public float m19757x746dc8a6(java.lang.String str) {
        return m19758x746dc8a6(str, 0.0f);
    }

    /* renamed from: getFloatArray */
    public float[] m19759xaffd3153(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "float[]", e17);
            return null;
        }
    }

    /* renamed from: getInt */
    public int m19760xb58848b9(java.lang.String str) {
        return m19761xb58848b9(str, 0);
    }

    /* renamed from: getIntegerArrayList */
    public java.util.ArrayList<java.lang.Integer> m19762xfd0d4e6f(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (java.util.ArrayList) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "ArrayList<Integer>", e17);
            return null;
        }
    }

    /* renamed from: getLong */
    public long m19763xfb822ef2(java.lang.String str) {
        return m19764xfb822ef2(str, 0L);
    }

    /* renamed from: getLongArray */
    public long[] m19765x568da87(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "long[]", e17);
            return null;
        }
    }

    /* renamed from: getString */
    public java.lang.String m19766x2fec8307(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (java.lang.String) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "String", e17);
            return null;
        }
    }

    /* renamed from: getStringArray */
    public java.lang.String[] m19768x7e28cb92(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (java.lang.String[]) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "String[]", e17);
            return null;
        }
    }

    /* renamed from: getStringArrayList */
    public java.util.ArrayList<java.lang.String> m19769x5ef8d750(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (java.util.ArrayList) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "ArrayList<String>", e17);
            return null;
        }
    }

    /* renamed from: hashCode */
    public int m19770x8cdac1b() {
        return this.zzq.hashCode() * 29;
    }

    /* renamed from: isEmpty */
    public boolean m19771x7aab3243() {
        return this.zzq.isEmpty();
    }

    /* renamed from: keySet */
    public java.util.Set<java.lang.String> m19772xbc5e1583() {
        return this.zzq.keySet();
    }

    /* renamed from: putAll */
    public void m19773xc5c54012(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32) {
        for (java.lang.String str : c2465xb93dbd32.m19772xbc5e1583()) {
            this.zzq.put(str, c2465xb93dbd32.get(str));
        }
    }

    /* renamed from: putAsset */
    public void m19774x6978d921(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0 c2449x3c9fad0) {
        this.zzq.put(str, c2449x3c9fad0);
    }

    /* renamed from: putBoolean */
    public void m19775x1c849219(java.lang.String str, boolean z17) {
        this.zzq.put(str, java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: putByte */
    public void m19776xf2e368b7(java.lang.String str, byte b17) {
        this.zzq.put(str, java.lang.Byte.valueOf(b17));
    }

    /* renamed from: putByteArray */
    public void m19777x170df3e2(java.lang.String str, byte[] bArr) {
        this.zzq.put(str, bArr);
    }

    /* renamed from: putDataMap */
    public void m19778x6eae4b43(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32 c2465xb93dbd32) {
        this.zzq.put(str, c2465xb93dbd32);
    }

    /* renamed from: putDataMapArrayList */
    public void m19779xcaee9294(java.lang.String str, java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32> arrayList) {
        this.zzq.put(str, arrayList);
    }

    /* renamed from: putDouble */
    public void m19780xca8953c0(java.lang.String str, double d17) {
        this.zzq.put(str, java.lang.Double.valueOf(d17));
    }

    /* renamed from: putFloat */
    public void m19781x69bc108d(java.lang.String str, float f17) {
        this.zzq.put(str, java.lang.Float.valueOf(f17));
    }

    /* renamed from: putFloatArray */
    public void m19782x8db2c1cc(java.lang.String str, float[] fArr) {
        this.zzq.put(str, fArr);
    }

    /* renamed from: putInt */
    public void m19783xc5c55e60(java.lang.String str, int i17) {
        this.zzq.put(str, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: putIntegerArrayList */
    public void m19784x8128e028(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        this.zzq.put(str, arrayList);
    }

    /* renamed from: putLong */
    public void m19785xf2e7ce2b(java.lang.String str, long j17) {
        this.zzq.put(str, java.lang.Long.valueOf(j17));
    }

    /* renamed from: putLongArray */
    public void m19786x98f2d6ee(java.lang.String str, long[] jArr) {
        this.zzq.put(str, jArr);
    }

    /* renamed from: putString */
    public void m19787xe4673800(java.lang.String str, java.lang.String str2) {
        this.zzq.put(str, str2);
    }

    /* renamed from: putStringArray */
    public void m19788x57254a39(java.lang.String str, java.lang.String[] strArr) {
        this.zzq.put(str, strArr);
    }

    /* renamed from: putStringArrayList */
    public void m19789x52b7aa77(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        this.zzq.put(str, arrayList);
    }

    /* renamed from: remove */
    public java.lang.Object m19790xc84af884(java.lang.String str) {
        return this.zzq.remove(str);
    }

    /* renamed from: size */
    public int m19791x35e001() {
        return this.zzq.size();
    }

    /* renamed from: toBundle */
    public android.os.Bundle m19792x792022dd() {
        android.os.Parcelable parcelable;
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : this.zzq.keySet()) {
            java.lang.Object obj = this.zzq.get(str);
            if (obj instanceof java.lang.String) {
                bundle.putString(str, (java.lang.String) obj);
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Float) obj).floatValue());
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof java.lang.String[]) {
                bundle.putStringArray(str, (java.lang.String[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else {
                if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) {
                    parcelable = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2449x3c9fad0) obj;
                } else if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) {
                    parcelable = ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) obj).m19792x792022dd();
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) obj;
                    int zza = zza(arrayList);
                    if (zza != 0 && zza != 1) {
                        if (zza == 2) {
                            bundle.putIntegerArrayList(str, arrayList);
                        } else if (zza != 3) {
                            if (zza == 4) {
                                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                                int size = arrayList.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    java.lang.Object obj2 = arrayList.get(i17);
                                    i17++;
                                    arrayList2.add(((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2465xb93dbd32) obj2).m19792x792022dd());
                                }
                                bundle.putParcelableArrayList(str, arrayList2);
                            }
                        }
                    }
                    bundle.putStringArrayList(str, arrayList);
                }
                bundle.putParcelable(str, parcelable);
            }
        }
        return bundle;
    }

    /* renamed from: toByteArray */
    public byte[] m19793x5f01b1f6() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt.zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zze.zza(this).f7273x394c11);
    }

    /* renamed from: toString */
    public java.lang.String m19794x9616526c() {
        return this.zzq.toString();
    }

    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.ClassCastException classCastException) {
        zza(str, obj, str2, "<null>", classCastException);
    }

    /* renamed from: getBoolean */
    public boolean m19749x41a8a7f2(java.lang.String str, boolean z17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return z17;
        }
        try {
            return ((java.lang.Boolean) obj).booleanValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "Boolean", java.lang.Boolean.valueOf(z17), e17);
            return z17;
        }
    }

    /* renamed from: getByte */
    public byte m19751xfb7dc97e(java.lang.String str, byte b17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return b17;
        }
        try {
            return ((java.lang.Byte) obj).byteValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "Byte", java.lang.Byte.valueOf(b17), e17);
            return b17;
        }
    }

    /* renamed from: getDouble */
    public double m19756x160e9ec7(java.lang.String str, double d17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return d17;
        }
        try {
            return ((java.lang.Double) obj).doubleValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "Double", java.lang.Double.valueOf(d17), e17);
            return d17;
        }
    }

    /* renamed from: getFloat */
    public float m19758x746dc8a6(java.lang.String str, float f17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return f17;
        }
        try {
            return ((java.lang.Float) obj).floatValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "Float", java.lang.Float.valueOf(f17), e17);
            return f17;
        }
    }

    /* renamed from: getInt */
    public int m19761xb58848b9(java.lang.String str, int i17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return i17;
        }
        try {
            return ((java.lang.Integer) obj).intValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56126xc3426119, e17);
            return i17;
        }
    }

    /* renamed from: getLong */
    public long m19764xfb822ef2(java.lang.String str, long j17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return j17;
        }
        try {
            return ((java.lang.Long) obj).longValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, "long", e17);
            return j17;
        }
    }

    /* renamed from: getString */
    public java.lang.String m19767x2fec8307(java.lang.String str, java.lang.String str2) {
        java.lang.String m19766x2fec8307 = m19766x2fec8307(str);
        return m19766x2fec8307 == null ? str2 : m19766x2fec8307;
    }

    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.Object obj2, java.lang.ClassCastException classCastException) {
        obj.getClass();
        java.util.Objects.toString(obj2);
    }
}
