package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class c extends com.google.protobuf.f implements com.google.protobuf.k8 {
    protected int memoizedSize = -1;

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.y yVar;
        com.google.protobuf.y yVar2;
        boolean z17 = obj instanceof byte[];
        if (z17 && (obj2 instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (z17) {
            byte[] bArr = (byte[]) obj;
            com.google.protobuf.y yVar3 = com.google.protobuf.y.f45712e;
            yVar = com.google.protobuf.y.g(bArr, 0, bArr.length);
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj2;
            com.google.protobuf.y yVar4 = com.google.protobuf.y.f45712e;
            yVar2 = com.google.protobuf.y.g(bArr2, 0, bArr2.length);
        } else {
            yVar2 = (com.google.protobuf.y) obj2;
        }
        return yVar.equals(yVar2);
    }

    public static java.util.Map c(java.util.List list) {
        if (list.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        com.google.protobuf.k8 k8Var = (com.google.protobuf.k8) it.next();
        com.google.protobuf.r3 descriptorForType = k8Var.getDescriptorForType();
        com.google.protobuf.b4 l17 = descriptorForType.l("key");
        com.google.protobuf.b4 l18 = descriptorForType.l("value");
        java.lang.Object field = k8Var.getField(l18);
        if (field instanceof com.google.protobuf.y3) {
            field = java.lang.Integer.valueOf(((com.google.protobuf.y3) field).f45727e.f45220f);
        }
        hashMap.put(k8Var.getField(l17), field);
        while (it.hasNext()) {
            com.google.protobuf.k8 k8Var2 = (com.google.protobuf.k8) it.next();
            java.lang.Object field2 = k8Var2.getField(l18);
            if (field2 instanceof com.google.protobuf.y3) {
                field2 = java.lang.Integer.valueOf(((com.google.protobuf.y3) field2).f45727e.f45220f);
            }
            hashMap.put(k8Var2.getField(l17), field2);
        }
        return hashMap;
    }

    public static boolean compareFields(java.util.Map<com.google.protobuf.b4, java.lang.Object> map, java.util.Map<com.google.protobuf.b4, java.lang.Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (com.google.protobuf.b4 b4Var : map.keySet()) {
            if (!map2.containsKey(b4Var)) {
                return false;
            }
            java.lang.Object obj = map.get(b4Var);
            java.lang.Object obj2 = map2.get(b4Var);
            if (b4Var.f44914m == com.google.protobuf.a4.f44856h) {
                if (b4Var.d1()) {
                    java.util.List list = (java.util.List) obj;
                    java.util.List list2 = (java.util.List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!b(list.get(i17), list2.get(i17))) {
                            return false;
                        }
                    }
                } else if (!b(obj, obj2)) {
                    return false;
                }
            } else if (b4Var.p()) {
                if (!com.google.protobuf.e8.e(c((java.util.List) obj), c((java.util.List) obj2))) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @java.lang.Deprecated
    public static int hashBoolean(boolean z17) {
        return z17 ? 1231 : 1237;
    }

    @java.lang.Deprecated
    public static int hashEnum(com.google.protobuf.p6 p6Var) {
        return p6Var.getNumber();
    }

    @java.lang.Deprecated
    public static int hashEnumList(java.util.List<? extends com.google.protobuf.p6> list) {
        java.util.Iterator<? extends com.google.protobuf.p6> it = list.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            i17 = (i17 * 31) + hashEnum(it.next());
        }
        return i17;
    }

    public static int hashFields(int i17, java.util.Map<com.google.protobuf.b4, java.lang.Object> map) {
        int i18;
        int a17;
        for (java.util.Map.Entry<com.google.protobuf.b4, java.lang.Object> entry : map.entrySet()) {
            com.google.protobuf.b4 key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int i19 = (i17 * 37) + key.f44909e.f45563f;
            if (key.p()) {
                i18 = i19 * 53;
                a17 = com.google.protobuf.e8.a(c((java.util.List) value));
            } else if (key.f44914m != com.google.protobuf.a4.f44857i) {
                i18 = i19 * 53;
                a17 = value.hashCode();
            } else if (key.d1()) {
                int i27 = i19 * 53;
                java.util.Iterator it = ((java.util.List) value).iterator();
                int i28 = 1;
                while (it.hasNext()) {
                    i28 = (i28 * 31) + ((com.google.protobuf.p6) it.next()).getNumber();
                }
                i17 = i27 + i28;
            } else {
                i18 = i19 * 53;
                a17 = ((com.google.protobuf.p6) value).getNumber();
            }
            i17 = i18 + a17;
        }
        return i17;
    }

    @java.lang.Deprecated
    public static int hashLong(long j17) {
        return (int) (j17 ^ (j17 >>> 32));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.k8)) {
            return false;
        }
        com.google.protobuf.k8 k8Var = (com.google.protobuf.k8) obj;
        if (getDescriptorForType() != k8Var.getDescriptorForType()) {
            return false;
        }
        return compareFields(getAllFields(), k8Var.getAllFields()) && getUnknownFields().equals(k8Var.getUnknownFields());
    }

    public java.util.List<java.lang.String> findInitializationErrors() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.protobuf.w8.b(this, "", arrayList);
        return arrayList;
    }

    public java.lang.String getInitializationErrorString() {
        return com.google.protobuf.w8.a(findInitializationErrors());
    }

    @Override // com.google.protobuf.f
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashFields = (hashFields(com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.b bVar) {
        throw new java.lang.UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.f
    public com.google.protobuf.pa newUninitializedMessageException() {
        return com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) this);
    }

    @Override // com.google.protobuf.f
    public void setMemoizedSerializedSize(int i17) {
        this.memoizedSize = i17;
    }

    public final java.lang.String toString() {
        java.util.logging.Logger logger = com.google.protobuf.ia.f45201a;
        com.google.protobuf.ga gaVar = com.google.protobuf.ga.f45143b;
        gaVar.getClass();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gaVar.a(this, new com.google.protobuf.ha(sb6, false, null));
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
