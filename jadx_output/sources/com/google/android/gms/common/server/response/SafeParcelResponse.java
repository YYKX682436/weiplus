package com.google.android.gms.common.server.response;

/* loaded from: classes13.dex */
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = new com.google.android.gms.common.server.response.zaq();
    private final int zaa;
    private final android.os.Parcel zab;
    private final int zac;
    private final com.google.android.gms.common.server.response.zan zad;
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    public SafeParcelResponse(int i17, android.os.Parcel parcel, com.google.android.gms.common.server.response.zan zanVar) {
        this.zaa = i17;
        this.zab = (android.os.Parcel) com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(T t17) {
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(t17.getClass().getCanonicalName());
        com.google.android.gms.common.server.response.zan zanVar = new com.google.android.gms.common.server.response.zan(t17.getClass());
        zaF(zanVar, t17);
        zanVar.zac();
        zanVar.zad();
        return new com.google.android.gms.common.server.response.SafeParcelResponse(t17, zanVar, str);
    }

    private static void zaF(com.google.android.gms.common.server.response.zan zanVar, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) {
        java.lang.Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        java.util.Iterator<java.lang.String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            java.lang.Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (com.google.android.gms.common.server.response.FastJsonResponse) cls2.newInstance());
                } catch (java.lang.IllegalAccessException e17) {
                    throw new java.lang.IllegalStateException("Could not access object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(field.zag)).getCanonicalName())), e17);
                } catch (java.lang.InstantiationException e18) {
                    throw new java.lang.IllegalStateException("Could not instantiate an object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(field.zag)).getCanonicalName())), e18);
                }
            }
        }
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        if (field.zaf == -1) {
            throw new java.lang.IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        android.os.Parcel parcel = this.zab;
        if (parcel == null) {
            throw new java.lang.IllegalStateException("Internal Parcel object is null.");
        }
        int i17 = this.zaf;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        }
    }

    private final void zaH(java.lang.StringBuilder sb6, java.util.Map map, android.os.Parcel parcel) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sparseArray.put(((com.google.android.gms.common.server.response.FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb6.append('{');
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        boolean z17 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            java.util.Map.Entry entry2 = (java.util.Map.Entry) sparseArray.get(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader));
            if (entry2 != null) {
                if (z17) {
                    sb6.append(",");
                }
                java.lang.String str = (java.lang.String) entry2.getKey();
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field) entry2.getValue();
                sb6.append("\"");
                sb6.append(str);
                sb6.append("\":");
                if (field.zaj()) {
                    int i17 = field.zac;
                    switch (i17) {
                        case 0:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, java.lang.Integer.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader))));
                            break;
                        case 1:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, readHeader)));
                            break;
                        case 2:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, java.lang.Long.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader))));
                            break;
                        case 3:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, java.lang.Float.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader))));
                            break;
                        case 4:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, java.lang.Double.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, readHeader))));
                            break;
                        case 5:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, readHeader)));
                            break;
                        case 6:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, java.lang.Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader))));
                            break;
                        case 7:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader)));
                            break;
                        case 10:
                            android.os.Bundle createBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
                            java.util.HashMap hashMap = new java.util.HashMap();
                            for (java.lang.String str2 : createBundle.keySet()) {
                                hashMap.put(str2, (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(createBundle.getString(str2)));
                            }
                            zaJ(sb6, field, com.google.android.gms.common.server.response.FastJsonResponse.zaD(field, hashMap));
                            break;
                        case 11:
                            throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new java.lang.IllegalArgumentException("Unknown field out type = " + i17);
                    }
                } else if (field.zad) {
                    sb6.append("[");
                    switch (field.zac) {
                        case 0:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, readHeader));
                            break;
                        case 1:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(parcel, readHeader));
                            break;
                        case 2:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(parcel, readHeader));
                            break;
                        case 3:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(parcel, readHeader));
                            break;
                        case 4:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(parcel, readHeader));
                            break;
                        case 5:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(parcel, readHeader));
                            break;
                        case 6:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(parcel, readHeader));
                            break;
                        case 7:
                            com.google.android.gms.common.util.ArrayUtils.writeStringArray(sb6, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new java.lang.UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            android.os.Parcel[] createParcelArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(parcel, readHeader);
                            int length = createParcelArray.length;
                            for (int i18 = 0; i18 < length; i18++) {
                                if (i18 > 0) {
                                    sb6.append(",");
                                }
                                createParcelArray[i18].setDataPosition(0);
                                zaH(sb6, field.zah(), createParcelArray[i18]);
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out.");
                    }
                    sb6.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader));
                            break;
                        case 1:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, readHeader));
                            break;
                        case 2:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader));
                            break;
                        case 3:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader));
                            break;
                        case 4:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, readHeader));
                            break;
                        case 5:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, readHeader));
                            break;
                        case 6:
                            sb6.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader));
                            break;
                        case 7:
                            java.lang.String createString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                            sb6.append("\"");
                            sb6.append(com.google.android.gms.common.util.JsonUtils.escapeString(createString));
                            sb6.append("\"");
                            break;
                        case 8:
                            byte[] createByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                            sb6.append("\"");
                            sb6.append(com.google.android.gms.common.util.Base64Utils.encode(createByteArray));
                            sb6.append("\"");
                            break;
                        case 9:
                            byte[] createByteArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                            sb6.append("\"");
                            sb6.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(createByteArray2));
                            sb6.append("\"");
                            break;
                        case 10:
                            android.os.Bundle createBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
                            java.util.Set<java.lang.String> keySet = createBundle2.keySet();
                            sb6.append("{");
                            boolean z18 = true;
                            for (java.lang.String str3 : keySet) {
                                if (!z18) {
                                    sb6.append(",");
                                }
                                sb6.append("\"");
                                sb6.append(str3);
                                sb6.append("\":\"");
                                sb6.append(com.google.android.gms.common.util.JsonUtils.escapeString(createBundle2.getString(str3)));
                                sb6.append("\"");
                                z18 = false;
                            }
                            sb6.append("}");
                            break;
                        case 11:
                            android.os.Parcel createParcel = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(parcel, readHeader);
                            createParcel.setDataPosition(0);
                            zaH(sb6, field.zah(), createParcel);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out");
                    }
                }
                z17 = true;
            }
        }
        if (parcel.dataPosition() != validateObjectHeader) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + validateObjectHeader, parcel);
        }
        sb6.append('}');
    }

    private static final void zaI(java.lang.StringBuilder sb6, int i17, java.lang.Object obj) {
        switch (i17) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb6.append(obj);
                return;
            case 7:
                sb6.append("\"");
                sb6.append(com.google.android.gms.common.util.JsonUtils.escapeString(com.google.android.gms.common.internal.Preconditions.checkNotNull(obj).toString()));
                sb6.append("\"");
                return;
            case 8:
                sb6.append("\"");
                sb6.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) obj));
                sb6.append("\"");
                return;
            case 9:
                sb6.append("\"");
                sb6.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) obj));
                sb6.append("\"");
                return;
            case 10:
                com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb6, (java.util.HashMap) com.google.android.gms.common.internal.Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new java.lang.IllegalArgumentException("Unknown type = " + i17);
        }
    }

    private static final void zaJ(java.lang.StringBuilder sb6, com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        if (!field.zab) {
            zaI(sb6, field.zaa, obj);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        sb6.append("[");
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 != 0) {
                sb6.append(",");
            }
            zaI(sb6, field.zaa, arrayList.get(i17));
        }
        sb6.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        zaG(field);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(((com.google.android.gms.common.server.response.SafeParcelResponse) arrayList.get(i17)).zaE());
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, T t17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((com.google.android.gms.common.server.response.SafeParcelResponse) t17).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
        com.google.android.gms.common.server.response.zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.Object getValueObject(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        zaG(field);
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str2 : ((java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = arrayList.get(i17);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        android.os.Parcel zaE = zaE();
        zaE.setDataPosition(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        zaH(sb6, (java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zab((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae))), zaE);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        int i19 = this.zac;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, i19 != 0 ? i19 != 1 ? this.zad : this.zad : null, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final android.os.Parcel zaE() {
        int i17 = this.zaf;
        if (i17 == 0) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = beginObjectHeader;
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, beginObjectHeader);
            this.zaf = 2;
        } else if (i17 == 1) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[size];
        for (int i17 = 0; i17 < size; i17++) {
            bigDecimalArr[i17] = (java.math.BigDecimal) arrayList.get(i17);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigInteger bigInteger) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[size];
        for (int i17 = 0; i17 < size; i17++) {
            bigIntegerArr[i17] = (java.math.BigInteger) arrayList.get(i17);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i17 = 0; i17 < size; i17++) {
            zArr[i17] = ((java.lang.Boolean) arrayList.get(i17)).booleanValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, double d17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i17 = 0; i17 < size; i17++) {
            dArr[i17] = ((java.lang.Double) arrayList.get(i17)).doubleValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, float f17) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i17 = 0; i17 < size; i17++) {
            fArr[i17] = ((java.lang.Float) arrayList.get(i17)).floatValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i17 = 0; i17 < size; i17++) {
            jArr[i17] = ((java.lang.Long) arrayList.get(i17)).longValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable, com.google.android.gms.common.server.response.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(zanVar);
        this.zae = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        this.zab = android.os.Parcel.obtain();
        this.zac = 0;
        this.zad = (com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(zanVar);
        this.zae = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zaf = 0;
    }
}
