package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBufferSafeParcelable */
/* loaded from: classes13.dex */
public class C1886x4ea4779a<T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1879xe1b6ce6c<T> {
    private static final java.lang.String[] zaa = {com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306};
    private final android.os.Parcelable.Creator zab;

    public C1886x4ea4779a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16, android.os.Parcelable.Creator<T> creator) {
        super(c1888xafe09e16);
        this.zab = creator;
    }

    /* renamed from: addValue */
    public static <T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470> void m18014xb5cf6550(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder builder, T t17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        t17.writeToParcel(obtain, 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, obtain.marshall());
        builder.mo18038x50c59334(contentValues);
        obtain.recycle();
    }

    /* renamed from: buildDataHolder */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder m18015x8c41b304() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.m18021xdc3ef9b(zaa);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1879xe1b6ce6c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    public T get(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.f5913x1540ba43);
        byte[] m18025x8383f77b = c1888xafe09e16.m18025x8383f77b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, i17, c1888xafe09e16.m18032x4abe998c(i17));
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(m18025x8383f77b, 0, m18025x8383f77b.length);
        obtain.setDataPosition(0);
        T t17 = (T) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t17;
    }
}
