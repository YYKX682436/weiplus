package com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a f134086a = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f134087b = jz5.h.b(mh.h.f407799d);

    public static java.util.List d(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a aVar, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1024;
        }
        aVar.getClass();
        return new mh.d(i17, str);
    }

    public static java.util.Map e(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a aVar, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1024;
        }
        aVar.getClass();
        return new mh.f(i17, str);
    }

    public final boolean a(java.lang.reflect.Field field, f06.d dVar) {
        if (dVar != null) {
            if (kz5.n0.O(kz5.c0.i(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Integer.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Long.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Float.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Double.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.String.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Boolean.TYPE)), dVar) || kz5.c0.i(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.List.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.Map.class)).contains(dVar)) {
                return true;
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList.class))) {
                java.lang.Object newInstance = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedList");
                return a(field, ((com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList) newInstance).mo40819x462fbced());
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap.class))) {
                java.lang.Object newInstance2 = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap");
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap typedMap = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap) newInstance2;
                return a(field, typedMap.mo40817xcf655a39()) && a(field, typedMap.mo40818xd25c744b());
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair.class))) {
                java.lang.Object newInstance3 = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance3, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedPair");
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair typedPair = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair) newInstance3;
                return a(field, typedPair.mo40845x7edfe0a()) && a(field, typedPair.mo40846x1943edce());
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(android.os.Parcelable.class)) || g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.io.Serializable.class))) {
                if (!dVar.mo128644x3801976c()) {
                    return true;
                }
                throw new java.lang.IllegalStateException(("anno typed should be concrete: " + field + ", " + dVar).toString());
            }
        }
        throw new java.lang.IllegalStateException(("unsupported type: " + field + ", " + dVar).toString());
    }

    public final void b(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcelable, "parcelable");
        for (java.lang.reflect.Field field : f(parcelable.getClass())) {
            java.lang.annotation.Annotation annotation = field.getAnnotation(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0 interfaceC4630x8a5f16f0 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0) annotation;
            try {
                java.lang.Object g17 = f134086a.g(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a()), field);
                field.set(parcelable, g17);
                if (mh.b.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FlattParcelOrm", "#clear: " + field.getName() + ", value=" + g17);
                }
            } catch (java.lang.Throwable th6) {
                java.lang.String str = "clearErr: " + th6.getMessage() + ", field=" + field.getName() + ", anno=" + interfaceC4630x8a5f16f0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FlattParcelOrm", str);
                ap.a.a(1, "errAccStats", th6, null, "clearErr: " + th6.getMessage(), field.getName(), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a()).toString());
                mh.b.f407790a = true;
                throw new java.io.IOException(str, th6);
            }
        }
    }

    public final void c(java.lang.String str, java.lang.reflect.Field field, int i17) {
        if (i17 <= 1024) {
            return;
        }
        java.lang.String str2 = str + "BigSize";
        java.lang.String str3 = str2 + ": field=" + field.getName() + ", size=" + i17 + '}';
        ap.a.a(1, "errAccStats", null, null, str2, field.getName(), java.lang.String.valueOf(i17));
        throw new java.lang.IllegalStateException(str3);
    }

    public final java.util.List f(java.lang.Class cls) {
        java.util.Map map = (java.util.Map) ((jz5.n) f134087b).mo141623x754a37bb();
        java.lang.Object obj = map.get(cls);
        if (obj == null) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.reflect.Field field : declaredFields) {
                if (field.getAnnotation(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.class) != null) {
                    arrayList.add(field);
                }
            }
            obj = kz5.n0.F0(arrayList, new mh.g());
            map.put(cls, obj);
        }
        return (java.util.List) obj;
    }

    public final java.lang.Object g(f06.d dVar, java.lang.reflect.Field field) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Integer.TYPE))) {
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Long.TYPE))) {
            return 0L;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Float.TYPE))) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Double.TYPE))) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.String.class))) {
            return "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Boolean.TYPE))) {
            return java.lang.Boolean.FALSE;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.List.class))) {
            java.lang.String name = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            return d(this, name, 0, 2, null);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.Map.class))) {
            java.lang.String name2 = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
            return e(this, name2, 0, 2, null);
        }
        if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList.class))) {
            java.lang.String name3 = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
            return d(this, name3, 0, 2, null);
        }
        if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap.class))) {
            java.lang.String name4 = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name4, "getName(...)");
            return e(this, name4, 0, 2, null);
        }
        if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair.class))) {
            java.lang.Object newInstance = xz5.a.b(dVar).newInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedPair");
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair typedPair = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair) newInstance;
            return new jz5.l(g(typedPair.mo40845x7edfe0a(), field), g(typedPair.mo40846x1943edce(), field));
        }
        if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(android.os.Parcelable.class))) {
            throw new java.lang.IllegalStateException("can not used in filed: " + field + ", " + dVar);
        }
        if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.io.Serializable.class))) {
            throw new java.lang.IllegalStateException("can not used in filed: " + field + ", " + dVar);
        }
        throw new java.lang.IllegalStateException("unsupported type: " + field + ", " + dVar);
    }

    public final java.lang.Object h(f06.d dVar, android.os.Parcel parcel, java.lang.reflect.Field field, java.lang.ClassLoader classLoader) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Integer.TYPE))) {
            return java.lang.Integer.valueOf(parcel.readInt());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Long.TYPE))) {
            return java.lang.Long.valueOf(parcel.readLong());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Float.TYPE))) {
            return java.lang.Float.valueOf(parcel.readFloat());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Double.TYPE))) {
            return java.lang.Double.valueOf(parcel.readDouble());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.String.class))) {
            return parcel.readString();
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Boolean.TYPE))) {
            return java.lang.Boolean.valueOf(parcel.readInt() == 1);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.List.class))) {
            java.lang.String name = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            java.util.List d17 = d(this, name, 0, 2, null);
            parcel.readList(d17, classLoader);
            return d17;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.Map.class))) {
            java.lang.String name2 = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
            java.util.Map e17 = e(this, name2, 0, 2, null);
            parcel.readMap(e17, classLoader);
            return e17;
        }
        boolean c17 = g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList.class));
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a aVar = f134086a;
        if (c17) {
            java.lang.String name3 = field.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
            java.util.List d18 = d(this, name3, 0, 2, null);
            int readInt = parcel.readInt();
            aVar.c("readList", field, readInt);
            if (readInt > 0) {
                java.lang.Object newInstance = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedList");
                f06.d mo40819x462fbced = ((com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList) newInstance).mo40819x462fbced();
                for (int i17 = 0; i17 < readInt; i17++) {
                    ((mh.d) d18).add(h(mo40819x462fbced, parcel, field, classLoader));
                }
            }
            return d18;
        }
        if (!g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap.class))) {
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair.class))) {
                java.lang.Object newInstance2 = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedPair");
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair typedPair = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair) newInstance2;
                return new jz5.l(h(typedPair.mo40845x7edfe0a(), parcel, field, classLoader), h(typedPair.mo40846x1943edce(), parcel, field, classLoader));
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(android.os.Parcelable.class))) {
                return parcel.readParcelable(classLoader);
            }
            if (g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.io.Serializable.class))) {
                return parcel.readSerializable();
            }
            throw new java.lang.IllegalStateException("unsupported type: " + field.getName() + ',' + dVar);
        }
        java.lang.String name4 = field.getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name4, "getName(...)");
        java.util.Map e18 = e(this, name4, 0, 2, null);
        int readInt2 = parcel.readInt();
        aVar.c("readMap", field, readInt2);
        if (readInt2 > 0) {
            java.lang.Object newInstance3 = xz5.a.b(dVar).newInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance3, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap");
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap typedMap = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap) newInstance3;
            f06.d mo40817xcf655a39 = typedMap.mo40817xcf655a39();
            f06.d mo40818xd25c744b = typedMap.mo40818xd25c744b();
            for (int i18 = 0; i18 < readInt2; i18++) {
                ((java.util.HashMap) e18).put(h(mo40817xcf655a39, parcel, field, classLoader), h(mo40818xd25c744b, parcel, field, classLoader));
            }
        }
        return e18;
    }

    public final void i(f06.d dVar, java.lang.Object obj, android.os.Parcel parcel, int i17, java.lang.reflect.Field field) {
        if (obj instanceof java.lang.Integer) {
            parcel.writeInt(((java.lang.Number) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            parcel.writeLong(((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            parcel.writeFloat(((java.lang.Number) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            java.lang.Number number = (java.lang.Number) obj;
            if (!java.lang.Double.isNaN(number.doubleValue())) {
                parcel.writeDouble(number.doubleValue());
                return;
            }
            throw new java.lang.IllegalStateException(("Nan double: " + field.getName() + ',' + dVar + ',' + obj).toString());
        }
        if (obj instanceof java.lang.String) {
            parcel.writeString((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            parcel.writeInt(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        boolean z17 = obj instanceof java.util.List;
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a aVar = f134086a;
        if (z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.List.class))) {
                parcel.writeList((java.util.List) obj);
                return;
            }
            if (!g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList.class))) {
                throw new java.lang.IllegalStateException("unsupported list: " + field.getName() + ',' + dVar + ',' + obj);
            }
            int size = ((java.util.List) obj).size();
            aVar.c("writeList", field, size);
            parcel.writeInt(size);
            if (size > 0) {
                java.lang.Object newInstance = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedList");
                f06.d mo40819x462fbced = ((com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedList) newInstance).mo40819x462fbced();
                java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                while (it.hasNext()) {
                    aVar.i(mo40819x462fbced, it.next(), parcel, i17, field);
                }
                return;
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.util.Map.class))) {
                parcel.writeMap((java.util.Map) obj);
                return;
            }
            if (!g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap.class))) {
                throw new java.lang.IllegalStateException("unsupported map: " + field.getName() + ',' + dVar + ',' + obj);
            }
            java.util.Map map = (java.util.Map) obj;
            int size2 = map.size();
            aVar.c("writeMap", field, size2);
            parcel.writeInt(size2);
            if (size2 > 0) {
                java.lang.Object newInstance2 = xz5.a.b(dVar).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap");
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap typedMap = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedMap) newInstance2;
                f06.d mo40817xcf655a39 = typedMap.mo40817xcf655a39();
                f06.d mo40818xd25c744b = typedMap.mo40818xd25c744b();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    aVar.i(mo40817xcf655a39, entry.getKey(), parcel, i17, field);
                    aVar.i(mo40818xd25c744b, entry.getValue(), parcel, i17, field);
                }
                return;
            }
            return;
        }
        if (!(obj instanceof jz5.l)) {
            if (obj instanceof android.os.Parcelable) {
                parcel.writeParcelable((android.os.Parcelable) obj, i17);
                return;
            }
            if (obj instanceof java.io.Serializable) {
                parcel.writeSerializable((java.io.Serializable) obj);
                return;
            }
            throw new java.lang.IllegalStateException("unsupported type: " + field.getName() + ',' + dVar + ',' + obj);
        }
        if (!g06.f.c(dVar, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair.class))) {
            throw new java.lang.IllegalStateException("unsupported pair: " + field.getName() + ',' + dVar + ',' + obj);
        }
        java.lang.Object newInstance3 = xz5.a.b(dVar).newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance3, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedPair");
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair typedPair = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.TypedPair) newInstance3;
        f06.d mo40845x7edfe0a = typedPair.mo40845x7edfe0a();
        f06.d mo40846x1943edce = typedPair.mo40846x1943edce();
        jz5.l lVar = (jz5.l) obj;
        i(mo40845x7edfe0a, lVar.f384366d, parcel, i17, field);
        i(mo40846x1943edce, lVar.f384367e, parcel, i17, field);
    }

    public final void j(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e parcelable, android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcelable, "parcelable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.util.List<java.lang.reflect.Field> f17 = f(parcelable.getClass());
        f17.size();
        parcelable.mo40766xfb854877();
        for (java.lang.reflect.Field field : f17) {
            java.lang.annotation.Annotation annotation = field.getAnnotation(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0 interfaceC4630x8a5f16f0 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0) annotation;
            try {
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a aVar = f134086a;
                f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a());
                java.lang.ClassLoader classLoader = parcelable.getClass().getClassLoader();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(classLoader);
                java.lang.Object h17 = aVar.h(a17, parcel, field, classLoader);
                field.set(parcelable, h17);
                if (mh.b.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FlattParcelOrm", "#readFromParcel: " + field.getName() + ", value=" + h17);
                }
            } catch (java.lang.Throwable th6) {
                java.lang.String str = "readErr: " + th6.getMessage() + ", field=" + field.getName() + ", anno=" + interfaceC4630x8a5f16f0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FlattParcelOrm", str);
                ap.a.a(1, "errAccStats", th6, null, "readErr: " + th6.getMessage(), field.getName(), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a()).toString());
                mh.b.f407790a = true;
                throw new java.io.IOException(str, th6);
            }
        }
    }

    public final void k(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e parcelable, android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcelable, "parcelable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.util.List<java.lang.reflect.Field> f17 = f(parcelable.getClass());
        f17.size();
        parcelable.mo40766xfb854877();
        for (java.lang.reflect.Field field : f17) {
            java.lang.annotation.Annotation annotation = field.getAnnotation(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0 interfaceC4630x8a5f16f0 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0) annotation;
            java.lang.Object obj = field.get(parcelable);
            try {
                if (mh.b.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FlattParcelOrm", "#writeToParcel: " + field.getName() + ", value=" + obj);
                }
                f134086a.i(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a()), obj, parcel, i17, field);
            } catch (java.lang.Throwable th6) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeErr: ");
                sb6.append(th6.getMessage());
                sb6.append(", field=");
                sb6.append(field.getName());
                sb6.append(", anno=");
                sb6.append(interfaceC4630x8a5f16f0);
                sb6.append(", type=");
                sb6.append(obj != null ? obj.getClass().getName() : null);
                sb6.append(", value=");
                sb6.append(obj != null ? obj.toString() : null);
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FlattParcelOrm", sb7);
                java.lang.String[] strArr = new java.lang.String[5];
                strArr[0] = "writeErr: " + th6.getMessage();
                strArr[1] = field.getName();
                strArr[2] = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(interfaceC4630x8a5f16f0.m40843x368f3a()).toString();
                strArr[3] = obj != null ? obj.getClass().getName() : null;
                strArr[4] = obj != null ? obj.toString() : null;
                ap.a.a(1, "errAccStats", th6, null, strArr);
                mh.b.f407790a = true;
                throw new java.io.IOException(sb7, th6);
            }
        }
    }
}
