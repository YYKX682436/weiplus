package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer */
/* loaded from: classes13.dex */
public final class C1941x88600a22 {
    private C1941x88600a22() {
    }

    /* renamed from: deserializeFromBytes */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> T m18376x3abfb622(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(creator);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: deserializeFromIntentExtra */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> T m18377xf8c3bf4b(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m18376x3abfb622(byteArrayExtra, creator);
    }

    /* renamed from: deserializeFromString */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> T m18378x39f2213a(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return (T) m18376x3abfb622(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18526xf43347ce(str), creator);
    }

    @java.lang.Deprecated
    /* renamed from: deserializeIterableFromBundle */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.util.ArrayList<T> m18379xc0f4dcbd(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            b0Var.add(m18376x3abfb622((byte[]) arrayList.get(i17), creator));
        }
        return b0Var;
    }

    /* renamed from: deserializeIterableFromBundleSafe */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.util.ArrayList<T> m18380x4db569ea(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return m18381x695420d0(bundle.getByteArray(str), creator);
    }

    /* renamed from: deserializeIterableFromBytes */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.util.ArrayList<T> m18381x695420d0(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            java.util.ArrayList<T> arrayList = new java.util.ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @java.lang.Deprecated
    /* renamed from: deserializeIterableFromIntentExtra */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.util.ArrayList<T> m18382x315cef79(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            b0Var.add(m18376x3abfb622((byte[]) arrayList.get(i17), creator));
        }
        return b0Var;
    }

    /* renamed from: deserializeIterableFromIntentExtraSafe */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.util.ArrayList<T> m18383x521dbea6(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return m18381x695420d0(intent.getByteArrayExtra(str), creator);
    }

    @java.lang.Deprecated
    /* renamed from: serializeIterableToBundle */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18384xb097a46f(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m18388xdec74bb0(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    /* renamed from: serializeIterableToBundleSafe */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18385x9a69089c(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        bundle.putByteArray(str, zza(iterable));
    }

    @java.lang.Deprecated
    /* renamed from: serializeIterableToIntentExtra */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18386x7b1d2707(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m18388xdec74bb0(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    /* renamed from: serializeIterableToIntentExtraSafe */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18387xcabb7f34(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, zza(iterable));
    }

    /* renamed from: serializeToBytes */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> byte[] m18388xdec74bb0(T t17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        t17.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: serializeToIntentExtra */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18389x93bc7259(T t17, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, m18388xdec74bb0(t17));
    }

    /* renamed from: serializeToString */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> java.lang.String m18390x16dd3d6c(T t17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1988xf8f2482.m18529x27f51ea6(m18388xdec74bb0(t17));
    }

    private static byte[] zza(java.lang.Iterable iterable) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeTypedList(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.AbstractC2113x394b66.zzj(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
