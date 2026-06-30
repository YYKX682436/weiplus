package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public class V8ObjectUtils {
    private static final java.lang.Object IGNORE = new java.lang.Object();
    private static final com.eclipsesource.mmv8.utils.TypeAdapter DEFAULT_TYPE_ADAPTER = new com.eclipsesource.mmv8.utils.V8ObjectUtils.DefaultTypeAdapter();

    /* loaded from: classes7.dex */
    public static class DefaultTypeAdapter implements com.eclipsesource.mmv8.utils.TypeAdapter {
        @Override // com.eclipsesource.mmv8.utils.TypeAdapter
        public java.lang.Object adapt(int i17, java.lang.Object obj) {
            return com.eclipsesource.mmv8.utils.TypeAdapter.DEFAULT;
        }
    }

    /* loaded from: classes7.dex */
    public static class ListWrapper {
        private java.util.List<? extends java.lang.Object> list;

        public ListWrapper(java.util.List<? extends java.lang.Object> list) {
            this.list = list;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper) && ((com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper) obj).list == this.list;
        }

        public int hashCode() {
            return java.lang.System.identityHashCode(this.list);
        }
    }

    private V8ObjectUtils() {
    }

    public static java.lang.Object getTypedArray(com.eclipsesource.mmv8.V8Array v8Array, int i17, java.lang.Object obj) {
        int length = v8Array.length();
        if (i17 == 1) {
            int[] iArr = (int[]) obj;
            if (iArr == null || iArr.length < length) {
                iArr = new int[length];
            }
            v8Array.getIntegers(0, length, iArr);
            return iArr;
        }
        if (i17 == 2) {
            double[] dArr = (double[]) obj;
            if (dArr == null || dArr.length < length) {
                dArr = new double[length];
            }
            v8Array.getDoubles(0, length, dArr);
            return dArr;
        }
        if (i17 == 3) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null || zArr.length < length) {
                zArr = new boolean[length];
            }
            v8Array.getBooleans(0, length, zArr);
            return zArr;
        }
        if (i17 == 4) {
            java.lang.String[] strArr = (java.lang.String[]) obj;
            if (strArr == null || strArr.length < length) {
                strArr = new java.lang.String[length];
            }
            v8Array.getStrings(0, length, strArr);
            return strArr;
        }
        if (i17 == 9) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null || bArr.length < length) {
                bArr = new byte[length];
            }
            v8Array.getBytes(0, length, bArr);
            return bArr;
        }
        throw new java.lang.RuntimeException("Unsupported bulk load type: " + i17);
    }

    public static java.lang.Object getV8Result(com.eclipsesource.mmv8.V8 v86, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            java.lang.Object v8Result = getV8Result(v86, obj, hashtable);
            if (v8Result instanceof com.eclipsesource.mmv8.V8Object) {
                return ((com.eclipsesource.mmv8.V8Object) v8Result).twin();
            }
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
            return v8Result;
        } finally {
            java.util.Iterator it6 = hashtable.values().iterator();
            while (it6.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it6.next()).release();
            }
        }
    }

    public static java.lang.Object getValue(java.lang.Object obj) {
        return getValue(obj, DEFAULT_TYPE_ADAPTER);
    }

    public static void pushValue(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.V8Array v8Array, java.lang.Object obj) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            pushValue(v86, v8Array, obj, hashtable);
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    private static void setValue(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.V8Object v8Object, java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (obj == null) {
            v8Object.addUndefined(str);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            v8Object.add(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            v8Object.add(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            v8Object.add(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            v8Object.add(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            v8Object.add(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            v8Object.add(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.V8Object) {
            v8Object.add(str, (com.eclipsesource.mmv8.V8Object) obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            v8Object.add(str, toV8TypedArray(v86, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map));
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) {
            v8Object.add(str, toV8ArrayBuffer(v86, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            v8Object.add(str, toV8Object(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            v8Object.add(str, toV8Array(v86, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    public static java.util.List<? super java.lang.Object> toList(com.eclipsesource.mmv8.V8Array v8Array) {
        return toList(v8Array, DEFAULT_TYPE_ADAPTER);
    }

    public static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.mmv8.V8Object v8Object) {
        return toMap(v8Object, DEFAULT_TYPE_ADAPTER);
    }

    private static java.lang.Object toTypedArray(com.eclipsesource.mmv8.V8Array v8Array) {
        int type = v8Array.getType();
        java.nio.ByteBuffer byteBuffer = ((com.eclipsesource.mmv8.V8TypedArray) v8Array).getByteBuffer();
        if (type == 1) {
            return new com.eclipsesource.mmv8.utils.typedarrays.Int32Array(byteBuffer);
        }
        if (type == 2) {
            return new com.eclipsesource.mmv8.utils.typedarrays.Float64Array(byteBuffer);
        }
        if (type == 9) {
            return new com.eclipsesource.mmv8.utils.typedarrays.Int8Array(byteBuffer);
        }
        switch (type) {
            case 11:
                return new com.eclipsesource.mmv8.utils.typedarrays.UInt8Array(byteBuffer);
            case 12:
                return new com.eclipsesource.mmv8.utils.typedarrays.UInt8ClampedArray(byteBuffer);
            case 13:
                return new com.eclipsesource.mmv8.utils.typedarrays.Int16Array(byteBuffer);
            case 14:
                return new com.eclipsesource.mmv8.utils.typedarrays.UInt16Array(byteBuffer);
            case 15:
                return new com.eclipsesource.mmv8.utils.typedarrays.UInt32Array(byteBuffer);
            case 16:
                return new com.eclipsesource.mmv8.utils.typedarrays.Float32Array(byteBuffer);
            default:
                throw new java.lang.IllegalStateException("Known Typed Array type: " + com.eclipsesource.mmv8.V8Value.getStringRepresentation(type));
        }
    }

    public static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.V8 v86, java.util.List<? extends java.lang.Object> list) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return toV8Array(v86, list, hashtable).twin();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    private static com.eclipsesource.mmv8.V8ArrayBuffer toV8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(arrayBuffer)) {
            return (com.eclipsesource.mmv8.V8ArrayBuffer) map.get(arrayBuffer);
        }
        com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer = new com.eclipsesource.mmv8.V8ArrayBuffer(v86, arrayBuffer.getByteBuffer());
        map.put(arrayBuffer, v8ArrayBuffer);
        return v8ArrayBuffer;
    }

    public static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.V8 v86, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return toV8Object(v86, map, hashtable).twin();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    private static com.eclipsesource.mmv8.V8TypedArray toV8TypedArray(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.utils.typedarrays.TypedArray typedArray, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(typedArray)) {
            return (com.eclipsesource.mmv8.V8TypedArray) map.get(typedArray);
        }
        com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer = new com.eclipsesource.mmv8.V8ArrayBuffer(v86, typedArray.getByteBuffer());
        try {
            com.eclipsesource.mmv8.V8TypedArray v8TypedArray = new com.eclipsesource.mmv8.V8TypedArray(v86, v8ArrayBuffer, typedArray.getType(), 0, typedArray.length());
            map.put(typedArray, v8TypedArray);
            return v8TypedArray;
        } finally {
            v8ArrayBuffer.release();
        }
    }

    public static java.lang.Object getValue(java.lang.Object obj, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            return obj instanceof com.eclipsesource.mmv8.V8Value ? getValue(obj, ((com.eclipsesource.mmv8.V8Value) obj).getV8Type(), v8Map, typeAdapter) : obj;
        } finally {
            v8Map.release();
        }
    }

    public static java.util.List<? super java.lang.Object> toList(com.eclipsesource.mmv8.V8Array v8Array, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            return toList(v8Array, v8Map, typeAdapter);
        } finally {
            v8Map.release();
        }
    }

    public static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            return toMap(v8Object, v8Map, typeAdapter);
        } finally {
            v8Map.release();
        }
    }

    private static com.eclipsesource.mmv8.V8ArrayBuffer toV8ArrayBuffer(com.eclipsesource.mmv8.V8Context v8Context, com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer arrayBuffer, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(arrayBuffer)) {
            return (com.eclipsesource.mmv8.V8ArrayBuffer) map.get(arrayBuffer);
        }
        com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer = v8Context.newV8ArrayBuffer(arrayBuffer.getByteBuffer());
        map.put(arrayBuffer, newV8ArrayBuffer);
        return newV8ArrayBuffer;
    }

    private static java.util.List<? super java.lang.Object> toList(com.eclipsesource.mmv8.V8Array v8Array, com.eclipsesource.mmv8.utils.V8Map<java.lang.Object> v8Map, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        java.lang.Object obj;
        if (v8Array == null) {
            return java.util.Collections.emptyList();
        }
        if (v8Map.containsKey(v8Array)) {
            return (java.util.List) v8Map.get(v8Array);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        v8Map.put2((com.eclipsesource.mmv8.V8Value) v8Array, (com.eclipsesource.mmv8.V8Array) arrayList);
        for (int i17 = 0; i17 < v8Array.length(); i17++) {
            try {
                obj = v8Array.get(i17);
                try {
                    java.lang.Object value = getValue(obj, v8Array.getType(i17), v8Map, typeAdapter);
                    if (value != IGNORE) {
                        arrayList.add(value);
                    }
                    if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                        ((com.eclipsesource.mmv8.Releasable) obj).release();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                        ((com.eclipsesource.mmv8.Releasable) obj).release();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = null;
            }
        }
        return arrayList;
    }

    private static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.utils.V8Map<java.lang.Object> v8Map, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        java.lang.Object obj;
        if (v8Object == null) {
            return java.util.Collections.emptyMap();
        }
        if (v8Map.containsKey(v8Object)) {
            return (java.util.Map) v8Map.get(v8Object);
        }
        com.eclipsesource.mmv8.utils.V8PropertyMap v8PropertyMap = new com.eclipsesource.mmv8.utils.V8PropertyMap();
        v8Map.put2((com.eclipsesource.mmv8.V8Value) v8Object, (com.eclipsesource.mmv8.V8Object) v8PropertyMap);
        for (java.lang.String str : v8Object.getKeys()) {
            try {
                obj = v8Object.get(str);
                try {
                    java.lang.Object value = getValue(obj, v8Object.getType(str), v8Map, typeAdapter);
                    if (value != IGNORE) {
                        v8PropertyMap.put((com.eclipsesource.mmv8.utils.V8PropertyMap) str, (java.lang.String) value);
                    }
                    if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                        ((com.eclipsesource.mmv8.Releasable) obj).release();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                        ((com.eclipsesource.mmv8.Releasable) obj).release();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = null;
            }
        }
        return v8PropertyMap;
    }

    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Array v8Array, int i17) {
        java.lang.Object obj;
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            obj = v8Array.get(i17);
            try {
                java.lang.Object value = getValue(obj, v8Array.getType(i17), v8Map, DEFAULT_TYPE_ADAPTER);
                if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                    ((com.eclipsesource.mmv8.Releasable) obj).release();
                }
                v8Map.release();
                return value;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                    ((com.eclipsesource.mmv8.Releasable) obj).release();
                }
                v8Map.release();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            obj = null;
        }
    }

    public static void pushValue(com.eclipsesource.mmv8.V8Context v8Context, com.eclipsesource.mmv8.V8Array v8Array, java.lang.Object obj) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            pushValue(v8Context, v8Array, obj, hashtable);
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    public static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.V8Context v8Context, java.util.List<? extends java.lang.Object> list) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return toV8Array(v8Context, list, hashtable).twin();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    public static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.V8Context v8Context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            return toV8Object(v8Context, map, hashtable).twin();
        } finally {
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
        }
    }

    private static com.eclipsesource.mmv8.V8TypedArray toV8TypedArray(com.eclipsesource.mmv8.V8Context v8Context, com.eclipsesource.mmv8.utils.typedarrays.TypedArray typedArray, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(typedArray)) {
            return (com.eclipsesource.mmv8.V8TypedArray) map.get(typedArray);
        }
        com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer = v8Context.newV8ArrayBuffer(typedArray.getByteBuffer());
        try {
            com.eclipsesource.mmv8.V8TypedArray newV8TypedArray = v8Context.newV8TypedArray(newV8ArrayBuffer, typedArray.getType(), 0, typedArray.length());
            map.put(typedArray, newV8TypedArray);
            return newV8TypedArray;
        } finally {
            newV8ArrayBuffer.release();
        }
    }

    public static java.lang.Object getV8Result(com.eclipsesource.mmv8.V8Context v8Context, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.util.Hashtable hashtable = new java.util.Hashtable();
        try {
            java.lang.Object v8Result = getV8Result(v8Context, obj, hashtable);
            if (v8Result instanceof com.eclipsesource.mmv8.V8Object) {
                return ((com.eclipsesource.mmv8.V8Object) v8Result).twin();
            }
            java.util.Iterator it = hashtable.values().iterator();
            while (it.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it.next()).release();
            }
            return v8Result;
        } finally {
            java.util.Iterator it6 = hashtable.values().iterator();
            while (it6.hasNext()) {
                ((com.eclipsesource.mmv8.V8Value) it6.next()).release();
            }
        }
    }

    private static void pushValue(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.V8Array v8Array, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (obj == null) {
            v8Array.pushUndefined();
            return;
        }
        if (obj instanceof java.lang.Integer) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            v8Array.push(new java.lang.Double(((java.lang.Long) obj).longValue()));
            return;
        }
        if (obj instanceof java.lang.Double) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.Float) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.String) {
            v8Array.push((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.V8Object) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8TypedArray(v86, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map));
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8ArrayBuffer(v86, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8Object(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8Array(v86, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    private static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.V8 v86, java.util.List<? extends java.lang.Object> list, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list))) {
            return (com.eclipsesource.mmv8.V8Array) map.get(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list));
        }
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(v86);
        map.put(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list), v8Array);
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                pushValue(v86, v8Array, list.get(i17), map);
            } catch (java.lang.IllegalStateException e17) {
                v8Array.release();
                throw e17;
            }
        }
        return v8Array;
    }

    private static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.V8 v86, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map2) {
        if (map2.containsKey(map)) {
            return (com.eclipsesource.mmv8.V8Object) map2.get(map);
        }
        com.eclipsesource.mmv8.V8Object v8Object = new com.eclipsesource.mmv8.V8Object(v86);
        map2.put(map, v8Object);
        try {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                setValue(v86, v8Object, entry.getKey(), entry.getValue(), map2);
            }
            return v8Object;
        } catch (java.lang.IllegalStateException e17) {
            v8Object.release();
            throw e17;
        }
    }

    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Array v8Array, int i17, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        java.lang.Object obj;
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            obj = v8Array.get(i17);
        } catch (java.lang.Throwable th6) {
            th = th6;
            obj = null;
        }
        try {
            java.lang.Object value = getValue(obj, v8Array.getType(i17), v8Map, typeAdapter);
            if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                ((com.eclipsesource.mmv8.Releasable) obj).release();
            }
            v8Map.release();
            return value;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                ((com.eclipsesource.mmv8.Releasable) obj).release();
            }
            v8Map.release();
            throw th;
        }
    }

    public static java.lang.Object getTypedArray(com.eclipsesource.mmv8.V8Array v8Array, int i17) {
        int length = v8Array.length();
        if (i17 == 1) {
            return v8Array.getIntegers(0, length);
        }
        if (i17 == 2) {
            return v8Array.getDoubles(0, length);
        }
        if (i17 == 3) {
            return v8Array.getBooleans(0, length);
        }
        if (i17 == 4) {
            return v8Array.getStrings(0, length);
        }
        throw new java.lang.RuntimeException("Unsupported bulk load type: " + i17);
    }

    private static java.lang.Object getV8Result(com.eclipsesource.mmv8.V8 v86, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof java.util.Map) {
            return toV8Object(v86, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof java.util.List) {
            return toV8Array(v86, (java.util.List<? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            return toV8TypedArray(v86, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map);
        }
        return obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer ? toV8ArrayBuffer(v86, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map) : obj;
    }

    private static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.V8Context v8Context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map2) {
        if (map2.containsKey(map)) {
            return (com.eclipsesource.mmv8.V8Object) map2.get(map);
        }
        com.eclipsesource.mmv8.V8Object newV8Object = v8Context.newV8Object();
        map2.put(map, newV8Object);
        try {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                setValue(v8Context, newV8Object, entry.getKey(), entry.getValue(), map2);
            }
            return newV8Object;
        } catch (java.lang.IllegalStateException e17) {
            newV8Object.release();
            throw e17;
        }
    }

    private static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.V8Context v8Context, java.util.List<? extends java.lang.Object> list, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list))) {
            return (com.eclipsesource.mmv8.V8Array) map.get(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list));
        }
        com.eclipsesource.mmv8.V8Array newV8Array = v8Context.newV8Array();
        map.put(new com.eclipsesource.mmv8.utils.V8ObjectUtils.ListWrapper(list), newV8Array);
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                pushValue(v8Context, newV8Array, list.get(i17), map);
            } catch (java.lang.IllegalStateException e17) {
                newV8Array.release();
                throw e17;
            }
        }
        return newV8Array;
    }

    private static void setValue(com.eclipsesource.mmv8.V8Context v8Context, com.eclipsesource.mmv8.V8Object v8Object, java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (obj == null) {
            v8Object.addUndefined(str);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            v8Object.add(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            v8Object.add(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            v8Object.add(str, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            v8Object.add(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            v8Object.add(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            v8Object.add(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.V8Object) {
            v8Object.add(str, (com.eclipsesource.mmv8.V8Object) obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            v8Object.add(str, toV8TypedArray(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map));
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) {
            v8Object.add(str, toV8ArrayBuffer(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            v8Object.add(str, toV8Object(v8Context, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            v8Object.add(str, toV8Array(v8Context, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Object v8Object, java.lang.String str) {
        return getValue(v8Object, str, DEFAULT_TYPE_ADAPTER);
    }

    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Object v8Object, java.lang.String str, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        java.lang.Object obj;
        com.eclipsesource.mmv8.utils.V8Map v8Map = new com.eclipsesource.mmv8.utils.V8Map();
        try {
            obj = v8Object.get(str);
        } catch (java.lang.Throwable th6) {
            th = th6;
            obj = null;
        }
        try {
            java.lang.Object value = getValue(obj, v8Object.getType(str), v8Map, typeAdapter);
            if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                ((com.eclipsesource.mmv8.Releasable) obj).release();
            }
            v8Map.release();
            return value;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (obj instanceof com.eclipsesource.mmv8.Releasable) {
                ((com.eclipsesource.mmv8.Releasable) obj).release();
            }
            v8Map.release();
            throw th;
        }
    }

    private static java.lang.Object getV8Result(com.eclipsesource.mmv8.V8Context v8Context, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof java.util.Map) {
            return toV8Object(v8Context, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof java.util.List) {
            return toV8Array(v8Context, (java.util.List<? extends java.lang.Object>) obj, map);
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            return toV8TypedArray(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map);
        }
        return obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer ? toV8ArrayBuffer(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map) : obj;
    }

    private static java.lang.Object getValue(java.lang.Object obj, int i17, com.eclipsesource.mmv8.utils.V8Map<java.lang.Object> v8Map, com.eclipsesource.mmv8.utils.TypeAdapter typeAdapter) {
        java.lang.Object adapt = typeAdapter.adapt(i17, obj);
        if (com.eclipsesource.mmv8.utils.TypeAdapter.DEFAULT != adapt) {
            return adapt;
        }
        if (i17 == 10) {
            return new com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer(((com.eclipsesource.mmv8.V8ArrayBuffer) obj).getBackingStore());
        }
        if (i17 != 99) {
            switch (i17) {
                case 0:
                    return null;
                case 1:
                case 2:
                case 3:
                case 4:
                    return obj;
                case 5:
                    return toList((com.eclipsesource.mmv8.V8Array) obj, v8Map, typeAdapter);
                case 6:
                    return toMap((com.eclipsesource.mmv8.V8Object) obj, v8Map, typeAdapter);
                case 7:
                    return IGNORE;
                case 8:
                    return toTypedArray((com.eclipsesource.mmv8.V8Array) obj);
                default:
                    throw new java.lang.IllegalStateException("Cannot convert type " + com.eclipsesource.mmv8.V8Value.getStringRepresentation(i17));
            }
        }
        return com.eclipsesource.mmv8.V8.getUndefined();
    }

    private static void pushValue(com.eclipsesource.mmv8.V8Context v8Context, com.eclipsesource.mmv8.V8Array v8Array, java.lang.Object obj, java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value> map) {
        if (obj == null) {
            v8Array.pushUndefined();
            return;
        }
        if (obj instanceof java.lang.Integer) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            v8Array.push(new java.lang.Double(((java.lang.Long) obj).longValue()));
            return;
        }
        if (obj instanceof java.lang.Double) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.Float) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof java.lang.String) {
            v8Array.push((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            v8Array.push(obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.V8Object) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) obj);
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.TypedArray) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8TypedArray(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.TypedArray) obj, map));
            return;
        }
        if (obj instanceof com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8ArrayBuffer(v8Context, (com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer) obj, map));
            return;
        }
        if (obj instanceof java.util.Map) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8Object(v8Context, (java.util.Map<java.lang.String, ? extends java.lang.Object>) obj, map));
        } else if (obj instanceof java.util.List) {
            v8Array.push((com.eclipsesource.mmv8.V8Value) toV8Array(v8Context, (java.util.List<? extends java.lang.Object>) obj, map));
        } else {
            throw new java.lang.IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }
}
