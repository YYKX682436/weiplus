package androidx.activity.result;

/* loaded from: classes13.dex */
public class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new androidx.activity.result.IntentSenderRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new androidx.activity.result.IntentSenderRequest[i17];
    }
}
