package bj0;

/* loaded from: classes11.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.flutter.ui.FlutterPageStyle(parcel.readInt(), parcel.readInt(), io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.flutter.ui.FlutterPageStyle[i17];
    }
}
