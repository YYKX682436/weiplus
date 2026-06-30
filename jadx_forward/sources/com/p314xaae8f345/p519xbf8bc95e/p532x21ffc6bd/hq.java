package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hq {

    /* renamed from: a, reason: collision with root package name */
    private static final int f131366a = 4096;

    /* loaded from: classes6.dex */
    public interface a<T> {
        void a();
    }

    /* loaded from: classes6.dex */
    public static abstract class b<T> implements com.tencent.mapsdk.internal.hq.i<java.lang.Boolean, T> {
        private java.lang.Boolean c() {
            return java.lang.Boolean.valueOf(a());
        }

        public abstract boolean a();

        @Override // com.tencent.mapsdk.internal.hq.i
        public final /* synthetic */ java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(a());
        }
    }

    /* loaded from: classes6.dex */
    public interface c<I, O> {
        O a();

        boolean b(I i17);
    }

    /* loaded from: classes6.dex */
    public static abstract class e<I, O> extends com.tencent.mapsdk.internal.hq.g<I, O> {

        /* renamed from: a, reason: collision with root package name */
        O f131370a;

        public e() {
        }

        @Override // com.tencent.mapsdk.internal.hq.c
        public final O a() {
            return this.f131370a;
        }

        public abstract O a(O o17, I i17);

        @Override // com.tencent.mapsdk.internal.hq.g, com.tencent.mapsdk.internal.hq.c
        public final boolean b(I i17) {
            super.b(i17);
            this.f131370a = a(this.f131370a, i17);
            return true;
        }

        public e(O o17) {
            this.f131370a = o17;
        }
    }

    /* loaded from: classes6.dex */
    public interface f<T> {
        void a();
    }

    /* loaded from: classes6.dex */
    public static abstract class g<I, O> implements com.tencent.mapsdk.internal.hq.c<I, O> {

        /* renamed from: c, reason: collision with root package name */
        int f131371c;

        @Override // com.tencent.mapsdk.internal.hq.c
        public boolean b(I i17) {
            this.f131371c++;
            return true;
        }

        private int b() {
            return this.f131371c - 1;
        }
    }

    /* loaded from: classes6.dex */
    public interface i<R, C> {
        R b();
    }

    private static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static byte[] b(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        a((java.io.Closeable) byteArrayOutputStream2);
                        return byteArray;
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream = byteArrayOutputStream2;
                a((java.io.Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private static <I> void c(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            dVar.b(it.next());
        }
    }

    private static <I> java.util.List<I> d(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            dVar.b(it.next());
        }
        return dVar.f131369b;
    }

    private static <I> I e(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        for (I i17 : iterable) {
            if (dVar.b(i17)) {
                return i17;
            }
        }
        return null;
    }

    private static <I> java.util.List<I> f(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            dVar.b(it.next());
        }
        return dVar.f131369b;
    }

    private static byte[] a(java.io.InputStream inputStream, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[i17];
            do {
                int read = inputStream.read(bArr, 0, i17);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } while (byteArrayOutputStream.size() < i17);
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a((java.io.Closeable) byteArrayOutputStream);
            return byteArray;
        } catch (java.lang.Throwable unused2) {
            a((java.io.Closeable) byteArrayOutputStream);
            return null;
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class d<I> extends com.tencent.mapsdk.internal.hq.g<I, java.util.List<I>> {

        /* renamed from: b, reason: collision with root package name */
        final java.util.List<I> f131369b = new java.util.ArrayList();

        @Override // com.tencent.mapsdk.internal.hq.c
        public final /* bridge */ /* synthetic */ java.lang.Object a() {
            return this.f131369b;
        }

        public abstract boolean a(I i17);

        @Override // com.tencent.mapsdk.internal.hq.g, com.tencent.mapsdk.internal.hq.c
        public final boolean b(I i17) {
            super.b(i17);
            if (!a(i17)) {
                return false;
            }
            this.f131369b.add(i17);
            return true;
        }

        private java.util.List<I> b() {
            return this.f131369b;
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class h<I, O> extends com.tencent.mapsdk.internal.hq.g<I, java.util.List<O>> {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<O> f131372a = new java.util.ArrayList();

        @Override // com.tencent.mapsdk.internal.hq.c
        public final /* bridge */ /* synthetic */ java.lang.Object a() {
            return this.f131372a;
        }

        public abstract O a(I i17);

        @Override // com.tencent.mapsdk.internal.hq.g, com.tencent.mapsdk.internal.hq.c
        public final boolean b(I i17) {
            super.b(i17);
            O a17 = a(i17);
            if (a17 == null) {
                return true;
            }
            this.f131372a.add(a17);
            return true;
        }

        private java.util.List<O> b() {
            return this.f131372a;
        }
    }

    private static <I> int b(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            if (dVar.b(it.next())) {
                return dVar.f131371c - 1;
            }
        }
        return -1;
    }

    private static byte[] a(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a((java.io.Closeable) byteArrayOutputStream);
                    return byteArray;
                }
            }
        } catch (java.lang.Throwable unused2) {
            a((java.io.Closeable) byteArrayOutputStream);
            return null;
        }
    }

    private static <I> int b(java.lang.Iterable<I> iterable, final I i17) {
        com.tencent.mapsdk.internal.hq.d<I> dVar = new com.tencent.mapsdk.internal.hq.d<I>() { // from class: com.tencent.mapsdk.internal.hq.4
            @Override // com.tencent.mapsdk.internal.hq.d
            public final boolean a(I i18) {
                return i17 == i18;
            }
        };
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            if (dVar.b(it.next())) {
                return dVar.f131371c - 1;
            }
        }
        return -1;
    }

    private static byte[] a(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream;
        if (obj == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a((java.io.Closeable) objectOutputStream);
                    a((java.io.Closeable) byteArrayOutputStream);
                    return byteArray;
                } catch (java.lang.Throwable unused) {
                    a((java.io.Closeable) objectOutputStream);
                    a((java.io.Closeable) byteArrayOutputStream);
                    return null;
                }
            } catch (java.lang.Throwable unused2) {
                objectOutputStream = null;
            }
        } catch (java.lang.Throwable unused3) {
            byteArrayOutputStream = null;
            objectOutputStream = null;
        }
    }

    private static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream != null && outputStream != null) {
            try {
                byte[] bArr = new byte[4096];
                long j17 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        return j17;
                    }
                    outputStream.write(bArr, 0, read);
                    j17 += read;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return -1L;
    }

    private static long a(byte[] bArr, java.io.OutputStream outputStream) {
        if (bArr != null && outputStream != null) {
            try {
                outputStream.write(bArr, 0, bArr.length);
                return bArr.length;
            } catch (java.io.IOException unused) {
            }
        }
        return -1L;
    }

    private static <I> java.util.List<I> a(I[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iArr.getClass().isArray()) {
            for (int i17 = 0; i17 < java.lang.reflect.Array.getLength(iArr); i17++) {
                arrayList.add(java.lang.reflect.Array.get(iArr, i17));
            }
        }
        return arrayList;
    }

    private static <T> T[] a(T[] tArr, int i17, T t17) {
        if (i17 <= 0) {
            T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), tArr.length + 1));
            java.lang.reflect.Array.set(tArr2, 0, t17);
            java.lang.System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
            return tArr2;
        }
        if (i17 >= tArr.length) {
            T[] tArr3 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), tArr.length + 1));
            java.lang.System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
            java.lang.reflect.Array.set(tArr3, java.lang.Math.min(i17, tArr.length), t17);
            return tArr3;
        }
        T[] tArr4 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), tArr.length + 1));
        java.lang.System.arraycopy(tArr, 0, tArr4, 0, i17);
        java.lang.reflect.Array.set(tArr4, i17, t17);
        java.lang.System.arraycopy(tArr, i17, tArr4, i17 + 1, tArr.length - i17);
        return tArr4;
    }

    private static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        if (obj == null || obj2 == null) {
            return obj != null ? obj : obj2;
        }
        if (!obj.getClass().isArray() || !obj2.getClass().isArray()) {
            return obj.getClass().isArray() ? obj : obj2;
        }
        if (obj.getClass() != obj2.getClass() || obj.equals(obj2)) {
            return obj;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int length2 = java.lang.reflect.Array.getLength(obj2);
        if (length > 0) {
            obj3 = java.lang.reflect.Array.get(obj, 0);
        } else {
            obj3 = length2 > 0 ? java.lang.reflect.Array.get(obj2, 0) : null;
        }
        if (obj3 == null) {
            return obj;
        }
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance(obj3.getClass(), length + length2);
        java.lang.System.arraycopy(obj, 0, newInstance, 0, length);
        java.lang.System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    public static <T extends java.lang.Comparable<T>> java.util.List<T>[] a(java.util.List<T> list, java.util.List<T> list2) {
        int i17;
        T t17;
        int i18;
        T t18;
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        if (list2 == null) {
            list2 = new java.util.ArrayList<>();
        }
        java.util.Collections.sort(list, new java.util.Comparator<T>() { // from class: com.tencent.mapsdk.internal.hq.1
            /* JADX WARN: Incorrect types in method signature: (TT;TT;)I */
            private static int a(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((java.lang.Comparable) obj).compareTo((java.lang.Comparable) obj2);
            }
        });
        java.util.Collections.sort(list2, new java.util.Comparator<T>() { // from class: com.tencent.mapsdk.internal.hq.2
            /* JADX WARN: Incorrect types in method signature: (TT;TT;)I */
            private static int a(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((java.lang.Comparable) obj).compareTo((java.lang.Comparable) obj2);
            }
        });
        int size = list.size();
        int size2 = list2.size();
        int i19 = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList[] arrayListArr = {new java.util.ArrayList(), new java.util.ArrayList(), new java.util.ArrayList(), arrayList};
        java.util.ArrayList arrayList2 = arrayListArr[0];
        java.util.ArrayList arrayList3 = arrayListArr[1];
        java.util.ArrayList arrayList4 = arrayListArr[2];
        int i27 = 0;
        while (true) {
            if (i19 >= size && i27 >= size2) {
                return arrayListArr;
            }
            if (i19 == size) {
                i17 = i27 + 1;
                t17 = list2.get(i27);
                arrayList4.add(t17);
            } else {
                if (i27 == size2) {
                    i18 = i19 + 1;
                    t18 = list.get(i19);
                    arrayList2.add(t18);
                } else if (list.get(i19).compareTo(list2.get(i27)) < 0) {
                    i18 = i19 + 1;
                    t18 = list.get(i19);
                    arrayList2.add(t18);
                } else if (list.get(i19).compareTo(list2.get(i27)) == 0) {
                    i17 = i27 + 1;
                    t17 = list2.get(i27);
                    arrayList3.add(t17);
                    i19++;
                } else {
                    i17 = i27 + 1;
                    t17 = list2.get(i27);
                    arrayList4.add(t17);
                }
                int i28 = i27;
                t17 = t18;
                i19 = i18;
                i17 = i28;
            }
            arrayList.add(t17);
            i27 = i17;
        }
    }

    private static java.lang.Integer[] a(int[] iArr) {
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(iArr[i17]);
        }
        return numArr;
    }

    private static int[] a(java.lang.Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i17 = 0; i17 < numArr.length; i17++) {
            iArr[i17] = numArr[i17].intValue();
        }
        return iArr;
    }

    private static <I> boolean a(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.d<I> dVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            if (dVar.b(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static <I> boolean a(java.lang.Iterable<I> iterable, final I i17) {
        com.tencent.mapsdk.internal.hq.d<I> dVar = new com.tencent.mapsdk.internal.hq.d<I>() { // from class: com.tencent.mapsdk.internal.hq.3
            @Override // com.tencent.mapsdk.internal.hq.d
            public final boolean a(I i18) {
                return java.util.Objects.equals(i17, i18);
            }
        };
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            if (dVar.b(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <I, O> java.util.List<O> a(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.h<I, O> hVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            hVar.b(it.next());
        }
        return hVar.f131372a;
    }

    public static <I, O> O a(java.lang.Iterable<I> iterable, com.tencent.mapsdk.internal.hq.e<I, O> eVar) {
        java.util.Iterator<I> it = iterable.iterator();
        while (it.hasNext()) {
            eVar.b(it.next());
        }
        return eVar.f131370a;
    }
}
