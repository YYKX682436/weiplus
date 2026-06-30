package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
/* loaded from: classes14.dex */
final class C0046x2e822957 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0046x2e822957> f69x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.d0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f90475d;

    public C0046x2e822957(android.os.Parcel parcel) {
        this.f90475d = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f90475d.writeToParcel(parcel, i17);
    }
}
