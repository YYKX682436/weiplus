package com.google.android.gms.common.server.response;

/* loaded from: classes13.dex */
public abstract class FastJsonResponse {

    /* loaded from: classes13.dex */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        java.lang.Object zac(java.lang.Object obj);

        java.lang.Object zad(java.lang.Object obj);
    }

    public static final java.lang.Object zaD(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        int i17 = field.zac;
        java.lang.Object zae = field.zae(obj);
        java.lang.String str = field.zae;
        switch (i17) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((java.lang.Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (java.math.BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((java.lang.Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new java.lang.IllegalStateException("Unsupported type for conversion: " + i17);
            case 4:
                if (zae != null) {
                    zan(field, str, ((java.lang.Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (java.math.BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((java.lang.Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (java.lang.String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(java.lang.StringBuilder sb6, com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        int i17 = field.zaa;
        if (i17 == 11) {
            java.lang.Class cls = field.zag;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cls);
            sb6.append(((com.google.android.gms.common.server.response.FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i17 != 7) {
                sb6.append(obj);
                return;
            }
            sb6.append("\"");
            sb6.append(com.google.android.gms.common.util.JsonUtils.escapeString((java.lang.String) obj));
            sb6.append("\"");
        }
    }

    private static final void zaG(java.lang.String str) {
        android.util.Log.isLoggable("FastJsonResponse", 6);
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        throw new java.lang.UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, T t17) {
        throw new java.lang.UnsupportedOperationException("Concrete type not supported");
    }

    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    public java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        java.lang.String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        try {
            return getClass().getMethod("get" + java.lang.Character.toUpperCase(str.charAt(0)) + str.substring(1), new java.lang.Class[0]).invoke(this, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public abstract java.lang.Object getValueObject(java.lang.String str);

    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new java.lang.UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new java.lang.UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(java.lang.String str);

    public void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z17) {
        throw new java.lang.UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        throw new java.lang.UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i17) {
        throw new java.lang.UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j17) {
        throw new java.lang.UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        throw new java.lang.UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        throw new java.lang.UnsupportedOperationException("String list not supported");
    }

    public java.lang.String toString() {
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = getFieldMappings();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        for (java.lang.String str : fieldMappings.keySet()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                java.lang.Object zaD = zaD(field, getFieldValue(field));
                if (sb6.length() == 0) {
                    sb6.append("{");
                } else {
                    sb6.append(",");
                }
                sb6.append("\"");
                sb6.append(str);
                sb6.append("\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb6.append("\"");
                            sb6.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) zaD));
                            sb6.append("\"");
                            break;
                        case 9:
                            sb6.append("\"");
                            sb6.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb6.append("\"");
                            break;
                        case 10:
                            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb6, (java.util.HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) zaD;
                                sb6.append("[");
                                int size = arrayList.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    if (i17 > 0) {
                                        sb6.append(",");
                                    }
                                    java.lang.Object obj = arrayList.get(i17);
                                    if (obj != null) {
                                        zaF(sb6, field, obj);
                                    }
                                }
                                sb6.append("]");
                                break;
                            } else {
                                zaF(sb6, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb6.append("null");
                }
            }
        }
        if (sb6.length() > 0) {
            sb6.append("}");
        } else {
            sb6.append("{}");
        }
        return sb6.toString();
    }

    public final void zaA(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.math.BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        throw new java.lang.UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.math.BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigInteger bigInteger) {
        throw new java.lang.UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(com.google.android.gms.common.server.response.FastJsonResponse.Field field, boolean z17) {
        if (field.zak != null) {
            zaE(field, java.lang.Boolean.valueOf(z17));
        } else {
            setBooleanInternal(field, field.zae, z17);
        }
    }

    public final void zaj(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(com.google.android.gms.common.server.response.FastJsonResponse.Field field, double d17) {
        if (field.zak != null) {
            zaE(field, java.lang.Double.valueOf(d17));
        } else {
            zan(field, field.zae, d17);
        }
    }

    public void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, double d17) {
        throw new java.lang.UnsupportedOperationException("Double not supported");
    }

    public final void zao(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(com.google.android.gms.common.server.response.FastJsonResponse.Field field, float f17) {
        if (field.zak != null) {
            zaE(field, java.lang.Float.valueOf(f17));
        } else {
            zar(field, field.zae, f17);
        }
    }

    public void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, float f17) {
        throw new java.lang.UnsupportedOperationException("Float not supported");
    }

    public final void zas(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Float list not supported");
    }

    public final void zau(com.google.android.gms.common.server.response.FastJsonResponse.Field field, int i17) {
        if (field.zak != null) {
            zaE(field, java.lang.Integer.valueOf(i17));
        } else {
            setIntegerInternal(field, field.zae, i17);
        }
    }

    public final void zav(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(com.google.android.gms.common.server.response.FastJsonResponse.Field field, long j17) {
        if (field.zak != null) {
            zaE(field, java.lang.Long.valueOf(j17));
        } else {
            setLongInternal(field, field.zae, j17);
        }
    }

    public final void zay(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.util.ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        throw new java.lang.UnsupportedOperationException("Long list not supported");
    }

    /* loaded from: classes13.dex */
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zaj CREATOR = new com.google.android.gms.common.server.response.zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final java.lang.String zae;
        protected final int zaf;
        protected final java.lang.Class zag;
        protected final java.lang.String zah;
        private final int zai;
        private com.google.android.gms.common.server.response.zan zaj;
        private final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zak;

        public Field(int i17, int i18, boolean z17, int i19, boolean z18, java.lang.String str, int i27, java.lang.String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i17;
            this.zaa = i18;
            this.zab = z17;
            this.zac = i19;
            this.zad = z18;
            this.zae = str;
            this.zaf = i27;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = com.google.android.gms.common.server.response.SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(8, false, 8, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(6, false, 6, false, str, i17, null, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(java.lang.String str, int i17, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, false, 11, false, str, i17, cls, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(java.lang.String str, int i17, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, true, 11, true, str, i17, cls, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(4, false, 4, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(3, false, 3, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(0, false, 0, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(2, false, 2, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, false, 7, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(10, false, 10, false, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(java.lang.String str, int i17) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, true, 7, true, str, i17, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(java.lang.String str, int i17, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> fieldConverter, boolean z17) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field(7, z17, 0, false, str, i17, null, fieldConverter);
        }

        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final java.lang.String toString() {
            com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, java.lang.Integer.valueOf(this.zai)).add("typeIn", java.lang.Integer.valueOf(this.zaa)).add("typeInArray", java.lang.Boolean.valueOf(this.zab)).add("typeOut", java.lang.Integer.valueOf(this.zac)).add("typeOutArray", java.lang.Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", java.lang.Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            java.lang.Class cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i17) {
            int i18 = this.zai;
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zac);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, zag(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i17, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public final com.google.android.gms.common.server.converter.zaa zaa() {
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse.Field zab() {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse zad() {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zag);
            java.lang.Class cls = this.zag;
            if (cls != com.google.android.gms.common.server.response.SafeParcelResponse.class) {
                return (com.google.android.gms.common.server.response.FastJsonResponse) cls.newInstance();
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new com.google.android.gms.common.server.response.SafeParcelResponse(this.zaj, this.zah);
        }

        public final java.lang.Object zae(java.lang.Object obj) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
            return com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak.zac(obj));
        }

        public final java.lang.Object zaf(java.lang.Object obj) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj);
        }

        public final java.lang.String zag() {
            java.lang.String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final java.util.Map zah() {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj);
            return (java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(com.google.android.gms.common.server.response.zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        public Field(int i17, boolean z17, int i18, boolean z18, java.lang.String str, int i19, java.lang.Class cls, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i17;
            this.zab = z17;
            this.zac = i18;
            this.zad = z18;
            this.zae = str;
            this.zaf = i19;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
