package com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b;

/* renamed from: com.tencent.wechat.zidl2.ZidlUtil */
/* loaded from: classes15.dex */
public class C27697xe85700b9 {
    private static final java.lang.String TAG = "ZidlUtil";

    /* renamed from: com.tencent.wechat.zidl2.ZidlUtil$InterfaceBuilder */
    /* loaded from: classes11.dex */
    public interface InterfaceBuilder<T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> {
        /* renamed from: call */
        T mo22022x2e7a5e(java.lang.String str, java.lang.String str2, long j17);
    }

    /* renamed from: com.tencent.wechat.zidl2.ZidlUtil$ValueToEnum */
    /* loaded from: classes14.dex */
    public interface ValueToEnum<T> {
        /* renamed from: call */
        T m119651x2e7a5e(java.lang.Integer num);
    }

    /* renamed from: booleanArrayToList */
    public static java.util.ArrayList<java.lang.Boolean> m119560x4ac5882a(boolean[] zArr) {
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>(zArr.length);
        for (boolean z17 : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z17));
        }
        return arrayList;
    }

    /* renamed from: booleanJavaToJniOptional */
    public static boolean[] m119561x43265a60(java.util.Optional<java.lang.Boolean> optional) {
        return (boolean[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27703xa49da48d()).orElse(null);
    }

    /* renamed from: booleanJniToJavaOptional */
    public static java.util.Optional<java.lang.Boolean> m119562x1affe57a(boolean[] zArr) {
        return zArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Boolean.valueOf(zArr[0]));
    }

    /* renamed from: booleanListToArray */
    public static boolean[] m119563xea5474d8(java.util.ArrayList<java.lang.Boolean> arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            zArr[i17] = arrayList.get(i17).booleanValue();
        }
        return zArr;
    }

    /* renamed from: byteBufferJavaToJniOptional */
    public static java.nio.ByteBuffer m119564xef363320(java.util.Optional<java.nio.ByteBuffer> optional) {
        return optional.orElse(null);
    }

    /* renamed from: byteBufferJniToJavaOptional */
    public static java.util.Optional<java.nio.ByteBuffer> m119565xc70fbe3a(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer == null ? java.util.Optional.empty() : java.util.Optional.of(byteBuffer);
    }

    /* renamed from: bytesArrayToList */
    public static java.util.ArrayList<byte[]> m119566x4984fc07(byte[][] bArr) {
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>(bArr.length);
        arrayList.addAll(java.util.Arrays.asList(bArr));
        return arrayList;
    }

    /* renamed from: bytesJavaToJniOptional */
    public static byte[] m119567xe04b47d(java.util.Optional<byte[]> optional) {
        return optional.orElse(null);
    }

    /* renamed from: bytesJniToJavaOptional */
    public static java.util.Optional<byte[]> m119568xe5de3f97(byte[] bArr) {
        return java.util.Optional.ofNullable(bArr);
    }

    /* renamed from: bytesListToArray */
    public static byte[][] m119569xe913e8b5(java.util.ArrayList<byte[]> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17);
        }
        return bArr;
    }

    /* renamed from: createInstanceFromName */
    public static java.lang.Object m119570xe5df2226(java.lang.String str) {
        try {
            java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(str).getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.d(hw5.a.ERROR, TAG, "createInstanceFromName failed: " + e17.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: directBufferJavaToJniOptional */
    public static long m119571x45204b1f(java.util.Optional<com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703> optional) {
        return ((java.lang.Long) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27700xa49da48a()).orElse(0L)).longValue();
    }

    /* renamed from: directBufferJniToJavaOptional */
    public static java.util.Optional<com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703> m119572x1cf9d639(long j17) {
        return j17 == 0 ? java.util.Optional.empty() : java.util.Optional.of(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703.m119538xb5cb08ea(j17));
    }

    /* renamed from: doubleArrayToList */
    public static java.util.ArrayList<java.lang.Double> m119573x112044e1(double[] dArr) {
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>(dArr.length);
        for (double d17 : dArr) {
            arrayList.add(java.lang.Double.valueOf(d17));
        }
        return arrayList;
    }

    /* renamed from: doubleJavaToJniOptional */
    public static double[] m119574x421871d7(java.util.Optional<java.lang.Double> optional) {
        return (double[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27704xa49da48e()).orElse(null);
    }

    /* renamed from: doubleJniToJavaOptional */
    public static java.util.Optional<java.lang.Double> m119575x19f1fcf1(double[] dArr) {
        return dArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Double.valueOf(dArr[0]));
    }

    /* renamed from: doubleListToArray */
    public static double[] m119576xb0af318f(java.util.ArrayList<java.lang.Double> arrayList) {
        double[] dArr = new double[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            dArr[i17] = arrayList.get(i17).doubleValue();
        }
        return dArr;
    }

    /* renamed from: enumBasicValueArrayToEnumList */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> java.util.ArrayList<T> m119577x1b4fe5af(int[] iArr, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(valueToEnum.m119651x2e7a5e(java.lang.Integer.valueOf(i17)));
        }
        return arrayList;
    }

    /* renamed from: enumJavaToJniOptional */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> int[] m119578x644fdea7(java.util.Optional<T> optional) {
        return (int[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27698xa49da488()).orElse(null);
    }

    /* renamed from: enumJniToJavaOptional */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> java.util.Optional<T> m119579x3c2969c1(int[] iArr, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(valueToEnum.m119651x2e7a5e(java.lang.Integer.valueOf(iArr[0])));
    }

    /* renamed from: enumListToBasicValueArray */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> int[] m119580xa97936bc(java.util.ArrayList<T> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).mo20656x276ffe3f();
        }
        return iArr;
    }

    /* renamed from: enumListToValueArray */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> java.util.ArrayList<java.lang.Integer> m119582x51c53b22(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(it.next().mo20656x276ffe3f()));
        }
        return arrayList2;
    }

    /* renamed from: enumValueListToEnumArray */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.p6> java.util.ArrayList<T> m119584xeb624f0f(java.util.ArrayList<java.lang.Integer> arrayList, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(valueToEnum.m119651x2e7a5e(it.next()));
        }
        return arrayList2;
    }

    /* renamed from: floatArrayToList */
    public static java.util.ArrayList<java.lang.Float> m119585x23f8a976(float[] fArr) {
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>(fArr.length);
        for (float f17 : fArr) {
            arrayList.add(java.lang.Float.valueOf(f17));
        }
        return arrayList;
    }

    /* renamed from: floatJavaToJniOptional */
    public static float[] m119586x8c1652ac(java.util.Optional<java.lang.Float> optional) {
        return (float[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27702xa49da48c()).orElse(null);
    }

    /* renamed from: floatJniToJavaOptional */
    public static java.util.Optional<java.lang.Float> m119587x63efddc6(float[] fArr) {
        return fArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Float.valueOf(fArr[0]));
    }

    /* renamed from: floatListToArray */
    public static float[] m119588xc3879624(java.util.ArrayList<java.lang.Float> arrayList) {
        float[] fArr = new float[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            fArr[i17] = arrayList.get(i17).floatValue();
        }
        return fArr;
    }

    /* renamed from: intArrayToList */
    public static java.util.ArrayList<java.lang.Integer> m119589x2cbe0a03(int[] iArr) {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return arrayList;
    }

    /* renamed from: intJavaToJniOptional */
    public static int[] m119590xa6225579(java.util.Optional<java.lang.Integer> optional) {
        return (int[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27708xa49da492()).orElse(null);
    }

    /* renamed from: intJniToJavaOptional */
    public static java.util.Optional<java.lang.Integer> m119591x7dfbe093(int[] iArr) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Integer.valueOf(iArr[0]));
    }

    /* renamed from: intListToArray */
    public static int[] m119592xcc4cf6b1(java.util.ArrayList<java.lang.Integer> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).intValue();
        }
        return iArr;
    }

    /* renamed from: javaObjToJni */
    public static java.lang.String[] m119593x6a52f0b5(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 c27693x374ea533) {
        return new java.lang.String[]{c27693x374ea533.f60636x11bb50fe, c27693x374ea533.f60638xc2e4ffd6};
    }

    /* renamed from: javaObjToJni2 */
    public static com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m119594xe00b261d(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 c27693x374ea533) {
        return new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86(c27693x374ea533.f60636x11bb50fe, c27693x374ea533.f60638xc2e4ffd6, c27693x374ea533.f60635xfca6d453);
    }

    /* renamed from: javaObjToJni2Optional */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m119595x986a689d(java.util.Optional<T> optional) {
        return (com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27710xa49da494()).orElse(null);
    }

    /* renamed from: javaObjToJniOptional */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> java.lang.String[] m119596xf3ea1b35(java.util.Optional<T> optional) {
        return (java.lang.String[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27707xa49da491()).orElse(null);
    }

    /* renamed from: jniAddRef */
    public static native void m119597x2e207037(long j17);

    /* renamed from: jniRelease */
    public static native void m119598x1b65b0a2(long j17);

    /* renamed from: jniToJavaObj */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> T m119599x3c8e655(java.lang.String[] strArr, java.util.function.BiFunction<java.lang.String, java.lang.String, T> biFunction) {
        return biFunction.apply(strArr[0], strArr[1]);
    }

    /* renamed from: jniToJavaObj2 */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> T m119600x7553e47d(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 c27695xd9fb0a86, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.InterfaceBuilder<T> interfaceBuilder) {
        return interfaceBuilder.mo22022x2e7a5e(c27695xd9fb0a86.m119556xfb82e301(), c27695xd9fb0a86.m119554x73c2ae34(), c27695xd9fb0a86.m119555x6f964b77());
    }

    /* renamed from: jniToJavaObj2Optional */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> java.util.Optional<T> m119601xc9bec6fd(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 c27695xd9fb0a86, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.InterfaceBuilder<T> interfaceBuilder) {
        return c27695xd9fb0a86 == null ? java.util.Optional.empty() : java.util.Optional.of(m119600x7553e47d(c27695xd9fb0a86, interfaceBuilder));
    }

    /* renamed from: jniToJavaObjOptional */
    public static <T extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533> java.util.Optional<T> m119602x716070d5(java.lang.String[] strArr, java.util.function.BiFunction<java.lang.String, java.lang.String, T> biFunction) {
        return strArr == null ? java.util.Optional.empty() : java.util.Optional.of(biFunction.apply(strArr[0], strArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$booleanJavaToJniOptional$4 */
    public static /* synthetic */ boolean[] m119603x5f4b29ed(java.lang.Boolean bool) {
        return new boolean[]{bool.booleanValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$directBufferJavaToJniOptional$6 */
    public static /* synthetic */ java.lang.Long m119604x937f7714(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27691xda696703 c27691xda696703) {
        return java.lang.Long.valueOf(c27691xda696703.m119545xcc312f3b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$doubleJavaToJniOptional$2 */
    public static /* synthetic */ double[] m119605xa45aa608(java.lang.Double d17) {
        return new double[]{d17.doubleValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enumJavaToJniOptional$7 */
    public static /* synthetic */ int[] m119606x39631b9d(com.p176xb6135e39.p283xc50a8b8b.p6 p6Var) {
        return new int[]{p6Var.mo20656x276ffe3f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$floatJavaToJniOptional$3 */
    public static /* synthetic */ float[] m119607x6844da78(java.lang.Float f17) {
        return new float[]{f17.floatValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$intJavaToJniOptional$0 */
    public static /* synthetic */ int[] m119608xfeefc942(java.lang.Integer num) {
        return new int[]{num.intValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$javaObjToJniOptional$10 */
    public static /* synthetic */ java.lang.String[] m119610x41c4f011(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 c27693x374ea533) {
        return new java.lang.String[]{c27693x374ea533.f60636x11bb50fe, c27693x374ea533.f60638xc2e4ffd6};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$longJavaToJniOptional$1 */
    public static /* synthetic */ long[] m119611x14a4a3c(java.lang.Long l17) {
        return new long[]{l17.longValue()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mmpbEnumJavaToJniOptional$8 */
    public static /* synthetic */ int[] m119612x651122c(com.p314xaae8f345.mm.p2495xc50a8b8b.h hVar) {
        return new int[]{hVar.mo11476x276ffe3f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$stringJavaToJniOptionalBytes$5 */
    public static /* synthetic */ byte[] m119614xac3e4d22(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: listToArray */
    public static <T> T[] m119615xcc1fe220(java.util.ArrayList<T> arrayList) {
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(arrayList.get(0).getClass(), arrayList.size()));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            tArr[i17] = arrayList.get(i17);
        }
        return tArr;
    }

    /* renamed from: longArrayToList */
    public static java.util.ArrayList<java.lang.Long> m119616xfc7c3156(long[] jArr) {
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>(jArr.length);
        for (long j17 : jArr) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        return arrayList;
    }

    /* renamed from: longJavaToJniOptional */
    public static long[] m119617x690c728c(java.util.Optional<java.lang.Long> optional) {
        return (long[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27701xa49da48b()).orElse(null);
    }

    /* renamed from: longJniToJavaOptional */
    public static java.util.Optional<java.lang.Long> m119618x40e5fda6(long[] jArr) {
        return jArr == null ? java.util.Optional.empty() : java.util.Optional.of(java.lang.Long.valueOf(jArr[0]));
    }

    /* renamed from: longListToArray */
    public static long[] m119619x9c0b1e04(java.util.ArrayList<java.lang.Long> arrayList) {
        long[] jArr = new long[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            jArr[i17] = arrayList.get(i17).longValue();
        }
        return jArr;
    }

    /* renamed from: messageJavaToJniOptional */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> byte[] m119620xede32061(java.util.Optional<T> optional) {
        return (byte[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27699xa49da489()).orElse(null);
    }

    /* renamed from: messageJniToJavaOptional */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.util.Optional<T> m119621xc5bcab7b(T t17, byte[] bArr) {
        try {
            return bArr == null ? java.util.Optional.empty() : java.util.Optional.of((com.p176xb6135e39.p283xc50a8b8b.n5) t17.mo20596xab31548().mo20541x60f45402(bArr).mo20556x59bc66e());
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            return java.util.Optional.empty();
        }
    }

    /* renamed from: mmpbEnumBasicValueArrayToEnumList */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> java.util.ArrayList<T> m119622xeaaae33d(int[] iArr, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList = new java.util.ArrayList<>(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(valueToEnum.m119651x2e7a5e(java.lang.Integer.valueOf(i17)));
        }
        return arrayList;
    }

    /* renamed from: mmpbEnumJavaToJniOptional */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> int[] m119623x5b504a35(java.util.Optional<T> optional) {
        return (int[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27709xa49da493()).orElse(null);
    }

    /* renamed from: mmpbEnumJniToJavaOptional */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> java.util.Optional<T> m119624x3329d54f(int[] iArr, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        return iArr == null ? java.util.Optional.empty() : java.util.Optional.of(valueToEnum.m119651x2e7a5e(java.lang.Integer.valueOf(iArr[0])));
    }

    /* renamed from: mmpbEnumListToBasicValueArray */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> int[] m119625xc1d2b4a(java.util.ArrayList<T> arrayList) {
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = arrayList.get(i17).mo11476x276ffe3f();
        }
        return iArr;
    }

    /* renamed from: mmpbEnumListToValueArray */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> java.util.ArrayList<java.lang.Integer> m119626xee6225d4(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(it.next().mo11476x276ffe3f()));
        }
        return arrayList2;
    }

    /* renamed from: mmpbEnumValueListToEnumArray */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.h> java.util.ArrayList<T> m119627xc54690c1(java.util.ArrayList<java.lang.Integer> arrayList, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.ValueToEnum<T> valueToEnum) {
        java.util.ArrayList<T> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(valueToEnum.m119651x2e7a5e(it.next()));
        }
        return arrayList2;
    }

    /* renamed from: mmpbListSerializeToBasic */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> byte[][] m119628x36c742e3(java.util.ArrayList<T> arrayList) {
        try {
            byte[][] bArr = new byte[arrayList.size()];
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                bArr[i17] = arrayList.get(i17).mo14344x5f01b1f6();
            }
            return bArr;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: mmpbListUnSerializeFromBasic */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> java.util.ArrayList<T> m119629xd40dd8d(T t17, byte[][] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(bArr.length);
        try {
            for (byte[] bArr2 : bArr) {
                b0Var.add(m119634x75f0b955(t17, bArr2));
            }
            return b0Var;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: mmpbMessageJavaToJniOptional */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> byte[] m119630xc7c76213(java.util.Optional<T> optional) {
        return (byte[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27705xa49da48f()).orElse(null);
    }

    /* renamed from: mmpbMessageJniToJavaOptional */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> java.util.Optional<T> m119631x9fa0ed2d(T t17, byte[] bArr) {
        try {
            return bArr == null ? java.util.Optional.empty() : java.util.Optional.of(m119634x75f0b955(t17, bArr));
        } catch (java.lang.Exception unused) {
            return java.util.Optional.empty();
        }
    }

    /* renamed from: mmpbSerialize */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> byte[] m119633xd1dc376e(T t17) {
        try {
            return t17.mo14344x5f01b1f6();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: mmpbUnSerialize */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> T m119634x75f0b955(T t17, byte[] bArr) {
        try {
            T t18 = (T) t17.mo11467x6bff0255();
            t18.mo11468x92b714fd(bArr);
            return t18;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: pbListSerializeToBasic */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> byte[][] m119636x52ff2d43(java.util.ArrayList<T> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17).mo20648x5f01b1f6();
        }
        return bArr;
    }

    /* renamed from: pbListUnSerializeFromBasic */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.util.ArrayList<T> m119637x1cbc97ed(T t17, byte[][] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(bArr.length);
        try {
            for (byte[] bArr2 : bArr) {
                com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548 = t17.mo20596xab31548();
                com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
                mo20596xab31548.mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y.g(bArr2, 0, bArr2.length));
                b0Var.add(mo20596xab31548.mo20556x59bc66e());
            }
            return b0Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            return null;
        }
    }

    /* renamed from: pbSerialize */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.util.ArrayList<byte[]> m119638xfd6f090e(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<byte[]> arrayList2 = new java.util.ArrayList<>(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().mo20648x5f01b1f6());
        }
        return arrayList2;
    }

    /* renamed from: pbUnSerialize */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> java.util.ArrayList<T> m119641x815a2f5(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548 = t17.mo20596xab31548();
            try {
                com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
                mo20596xab31548.mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y.g(next, 0, next.length));
                b0Var.add(mo20596xab31548.mo20556x59bc66e());
            } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            }
        }
        return b0Var;
    }

    /* renamed from: stringArrayToList */
    public static java.util.ArrayList<java.lang.String> m119642x3ed538a1(java.lang.String[] strArr) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(strArr.length);
        arrayList.addAll(java.util.Arrays.asList(strArr));
        return arrayList;
    }

    /* renamed from: stringJavaToJniOptional */
    public static java.lang.String m119644x8fb79597(java.util.Optional<java.lang.String> optional) {
        return optional.orElse(null);
    }

    /* renamed from: stringJavaToJniOptionalBytes */
    public static byte[] m119645xf2442114(java.util.Optional<java.lang.String> optional) {
        return (byte[]) optional.map(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27706xa49da490()).orElse(null);
    }

    /* renamed from: stringJniToJavaOptional */
    public static java.util.Optional<java.lang.String> m119646x679120b1(java.lang.String str) {
        return java.util.Optional.ofNullable(str);
    }

    /* renamed from: stringListToArray */
    public static java.lang.String[] m119648xde64254f(java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            strArr[i17] = arrayList.get(i17);
        }
        return strArr;
    }

    /* renamed from: stringListToArrayBytes */
    public static byte[][] m119649x2e14a45c(java.util.ArrayList<java.lang.String> arrayList) {
        byte[][] bArr = new byte[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            bArr[i17] = arrayList.get(i17).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        return bArr;
    }

    /* renamed from: uppercaseFirstLetter */
    public static java.lang.String m119650xb9357cc4(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.setCharAt(0, java.lang.Character.toUpperCase(sb6.charAt(0)));
        return sb6.toString();
    }

    /* renamed from: mmpbSerialize */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> java.util.ArrayList<byte[]> m119632xd1dc376e(java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<byte[]> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m119633xd1dc376e(it.next()));
        }
        return arrayList2;
    }

    /* renamed from: stringJniToJavaOptional */
    public static java.util.Optional<java.lang.String> m119647x679120b1(byte[] bArr) {
        return bArr == null ? java.util.Optional.empty() : java.util.Optional.of(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: mmpbUnSerialize */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> java.util.ArrayList<T> m119635x75f0b955(T t17, java.util.ArrayList<byte[]> arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            b0Var.add(m119634x75f0b955(t17, it.next()));
        }
        return b0Var;
    }

    /* renamed from: stringArrayToList */
    public static java.util.ArrayList<java.lang.String> m119643x3ed538a1(byte[][] bArr) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
        }
        return arrayList;
    }

    /* renamed from: enumListToValueArray */
    public static <T> java.util.ArrayList<java.lang.Integer> m119581x51c53b22(java.lang.Class<?> cls, java.util.ArrayList<T> arrayList) {
        java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            arrayList2.add((java.lang.Integer) cls.getMethod("getNumber", new java.lang.Class[0]).invoke(arrayList.get(i17), new java.lang.Object[0]));
        }
        return arrayList2;
    }

    /* renamed from: enumValueListToEnumArray */
    public static <T> java.util.ArrayList<T> m119583xeb624f0f(java.lang.Class<?> cls, java.util.ArrayList<java.lang.Integer> arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            b0Var.add(cls.getMethod("forNumber", java.lang.Integer.TYPE).invoke(null, arrayList.get(i17)));
        }
        return b0Var;
    }

    /* renamed from: pbSerialize */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> byte[] m119639xfd6f090e(T t17) {
        return t17.mo20648x5f01b1f6();
    }

    /* renamed from: pbUnSerialize */
    public static <T extends com.p176xb6135e39.p283xc50a8b8b.n5> T m119640x815a2f5(T t17, byte[] bArr) {
        com.p176xb6135e39.p283xc50a8b8b.h5 mo20596xab31548 = t17.mo20596xab31548();
        try {
            com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            mo20596xab31548.mo20529x60f45402(com.p176xb6135e39.p283xc50a8b8b.y.g(bArr, 0, bArr.length));
            return (T) mo20596xab31548.mo20556x59bc66e();
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            return null;
        }
    }
}
