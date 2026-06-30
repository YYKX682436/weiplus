package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public class DataBufferSafeParcelable<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private static final java.lang.String[] zaa = {com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA};
    private final android.os.Parcelable.Creator zab;

    public DataBufferSafeParcelable(com.google.android.gms.common.data.DataHolder dataHolder, android.os.Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void addValue(com.google.android.gms.common.data.DataHolder.Builder builder, T t17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        t17.writeToParcel(obtain, 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    public static com.google.android.gms.common.data.DataHolder.Builder buildDataHolder() {
        return com.google.android.gms.common.data.DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i17) {
        com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, i17, dataHolder.getWindowIndex(i17));
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t17 = (T) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t17;
    }
}
