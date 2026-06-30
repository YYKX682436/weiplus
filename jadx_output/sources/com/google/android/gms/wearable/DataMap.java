package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class DataMap {
    public static final java.lang.String TAG = "DataMap";
    private final java.util.HashMap<java.lang.String, java.lang.Object> zzq = new java.util.HashMap<>();

    public static java.util.ArrayList<com.google.android.gms.wearable.DataMap> arrayListFromBundleArrayList(java.util.ArrayList<android.os.Bundle> arrayList) {
        java.util.ArrayList<com.google.android.gms.wearable.DataMap> arrayList2 = new java.util.ArrayList<>();
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            android.os.Bundle bundle = arrayList.get(i17);
            i17++;
            arrayList2.add(fromBundle(bundle));
        }
        return arrayList2;
    }

    public static com.google.android.gms.wearable.DataMap fromBundle(android.os.Bundle bundle) {
        bundle.setClassLoader(com.google.android.gms.wearable.Asset.class.getClassLoader());
        com.google.android.gms.wearable.DataMap dataMap = new com.google.android.gms.wearable.DataMap();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.lang.String) {
                dataMap.putString(str, (java.lang.String) obj);
            } else if (obj instanceof java.lang.Integer) {
                dataMap.putInt(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                dataMap.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                dataMap.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                dataMap.putFloat(str, ((java.lang.Float) obj).floatValue());
            } else if (obj instanceof java.lang.Boolean) {
                dataMap.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.Byte) {
                dataMap.putByte(str, ((java.lang.Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                dataMap.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof java.lang.String[]) {
                dataMap.putStringArray(str, (java.lang.String[]) obj);
            } else if (obj instanceof long[]) {
                dataMap.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                dataMap.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof com.google.android.gms.wearable.Asset) {
                dataMap.putAsset(str, (com.google.android.gms.wearable.Asset) obj);
            } else if (obj instanceof android.os.Bundle) {
                dataMap.putDataMap(str, fromBundle((android.os.Bundle) obj));
            } else if (obj instanceof java.util.ArrayList) {
                java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) obj;
                int zza = zza(arrayList);
                if (zza != 0 && zza != 1) {
                    if (zza == 2) {
                        dataMap.putIntegerArrayList(str, arrayList);
                    } else if (zza != 3) {
                        if (zza == 5) {
                            dataMap.putDataMapArrayList(str, arrayListFromBundleArrayList(arrayList));
                        }
                    }
                }
                dataMap.putStringArrayList(str, arrayList);
            }
        }
        return dataMap;
    }

    public static com.google.android.gms.wearable.DataMap fromByteArray(byte[] bArr) {
        try {
            return com.google.android.gms.internal.wearable.zze.zza(new com.google.android.gms.internal.wearable.zzf(com.google.android.gms.internal.wearable.zzg.zza(bArr), new java.util.ArrayList()));
        } catch (com.google.android.gms.internal.wearable.zzs e17) {
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
                if (obj instanceof com.google.android.gms.wearable.DataMap) {
                    return 4;
                }
                if (obj instanceof android.os.Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    public void clear() {
        this.zzq.clear();
    }

    public boolean containsKey(java.lang.String str) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.wearable.DataMap
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.wearable.DataMap r7 = (com.google.android.gms.wearable.DataMap) r7
            int r0 = r6.size()
            int r2 = r7.size()
            if (r0 == r2) goto L13
            return r1
        L13:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r2 = r7.get(r2)
            boolean r5 = r4 instanceof com.google.android.gms.wearable.Asset
            if (r5 == 0) goto L6d
            boolean r5 = r2 instanceof com.google.android.gms.wearable.Asset
            if (r5 != 0) goto L39
            return r1
        L39:
            com.google.android.gms.wearable.Asset r4 = (com.google.android.gms.wearable.Asset) r4
            com.google.android.gms.wearable.Asset r2 = (com.google.android.gms.wearable.Asset) r2
            if (r4 == 0) goto L66
            if (r2 != 0) goto L42
            goto L66
        L42:
            java.lang.String r3 = r4.getDigest()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L59
            java.lang.String r3 = r4.getDigest()
            java.lang.String r2 = r2.getDigest()
            boolean r3 = r3.equals(r2)
            goto L6a
        L59:
            byte[] r3 = r4.getData()
            byte[] r2 = r2.getData()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.DataMap.equals(java.lang.Object):boolean");
    }

    public <T> T get(java.lang.String str) {
        return (T) this.zzq.get(str);
    }

    public com.google.android.gms.wearable.Asset getAsset(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (com.google.android.gms.wearable.Asset) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, com.tencent.tav.asset.Asset.TAG, e17);
            return null;
        }
    }

    public boolean getBoolean(java.lang.String str) {
        return getBoolean(str, false);
    }

    public byte getByte(java.lang.String str) {
        return getByte(str, (byte) 0);
    }

    public byte[] getByteArray(java.lang.String str) {
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

    public com.google.android.gms.wearable.DataMap getDataMap(java.lang.String str) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (com.google.android.gms.wearable.DataMap) obj;
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, TAG, e17);
            return null;
        }
    }

    public java.util.ArrayList<com.google.android.gms.wearable.DataMap> getDataMapArrayList(java.lang.String str) {
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

    public double getDouble(java.lang.String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(java.lang.String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(java.lang.String str) {
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

    public int getInt(java.lang.String str) {
        return getInt(str, 0);
    }

    public java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String str) {
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

    public long getLong(java.lang.String str) {
        return getLong(str, 0L);
    }

    public long[] getLongArray(java.lang.String str) {
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

    public java.lang.String getString(java.lang.String str) {
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

    public java.lang.String[] getStringArray(java.lang.String str) {
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

    public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String str) {
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

    public int hashCode() {
        return this.zzq.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.zzq.isEmpty();
    }

    public java.util.Set<java.lang.String> keySet() {
        return this.zzq.keySet();
    }

    public void putAll(com.google.android.gms.wearable.DataMap dataMap) {
        for (java.lang.String str : dataMap.keySet()) {
            this.zzq.put(str, dataMap.get(str));
        }
    }

    public void putAsset(java.lang.String str, com.google.android.gms.wearable.Asset asset) {
        this.zzq.put(str, asset);
    }

    public void putBoolean(java.lang.String str, boolean z17) {
        this.zzq.put(str, java.lang.Boolean.valueOf(z17));
    }

    public void putByte(java.lang.String str, byte b17) {
        this.zzq.put(str, java.lang.Byte.valueOf(b17));
    }

    public void putByteArray(java.lang.String str, byte[] bArr) {
        this.zzq.put(str, bArr);
    }

    public void putDataMap(java.lang.String str, com.google.android.gms.wearable.DataMap dataMap) {
        this.zzq.put(str, dataMap);
    }

    public void putDataMapArrayList(java.lang.String str, java.util.ArrayList<com.google.android.gms.wearable.DataMap> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putDouble(java.lang.String str, double d17) {
        this.zzq.put(str, java.lang.Double.valueOf(d17));
    }

    public void putFloat(java.lang.String str, float f17) {
        this.zzq.put(str, java.lang.Float.valueOf(f17));
    }

    public void putFloatArray(java.lang.String str, float[] fArr) {
        this.zzq.put(str, fArr);
    }

    public void putInt(java.lang.String str, int i17) {
        this.zzq.put(str, java.lang.Integer.valueOf(i17));
    }

    public void putIntegerArrayList(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putLong(java.lang.String str, long j17) {
        this.zzq.put(str, java.lang.Long.valueOf(j17));
    }

    public void putLongArray(java.lang.String str, long[] jArr) {
        this.zzq.put(str, jArr);
    }

    public void putString(java.lang.String str, java.lang.String str2) {
        this.zzq.put(str, str2);
    }

    public void putStringArray(java.lang.String str, java.lang.String[] strArr) {
        this.zzq.put(str, strArr);
    }

    public void putStringArrayList(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public java.lang.Object remove(java.lang.String str) {
        return this.zzq.remove(str);
    }

    public int size() {
        return this.zzq.size();
    }

    public android.os.Bundle toBundle() {
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
                if (obj instanceof com.google.android.gms.wearable.Asset) {
                    parcelable = (com.google.android.gms.wearable.Asset) obj;
                } else if (obj instanceof com.google.android.gms.wearable.DataMap) {
                    parcelable = ((com.google.android.gms.wearable.DataMap) obj).toBundle();
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
                                    arrayList2.add(((com.google.android.gms.wearable.DataMap) obj2).toBundle());
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

    public byte[] toByteArray() {
        return com.google.android.gms.internal.wearable.zzt.zzb(com.google.android.gms.internal.wearable.zze.zza(this).zzfw);
    }

    public java.lang.String toString() {
        return this.zzq.toString();
    }

    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.ClassCastException classCastException) {
        zza(str, obj, str2, "<null>", classCastException);
    }

    public boolean getBoolean(java.lang.String str, boolean z17) {
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

    public byte getByte(java.lang.String str, byte b17) {
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

    public double getDouble(java.lang.String str, double d17) {
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

    public float getFloat(java.lang.String str, float f17) {
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

    public int getInt(java.lang.String str, int i17) {
        java.lang.Object obj = this.zzq.get(str);
        if (obj == null) {
            return i17;
        }
        try {
            return ((java.lang.Integer) obj).intValue();
        } catch (java.lang.ClassCastException e17) {
            zza(str, obj, com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER, e17);
            return i17;
        }
    }

    public long getLong(java.lang.String str, long j17) {
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

    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.String string = getString(str);
        return string == null ? str2 : string;
    }

    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.Object obj2, java.lang.ClassCastException classCastException) {
        obj.getClass();
        java.util.Objects.toString(obj2);
    }
}
