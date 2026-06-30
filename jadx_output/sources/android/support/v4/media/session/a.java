package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class a implements android.support.v4.media.session.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f8968d;

    public a(android.os.IBinder iBinder) {
        this.f8968d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f8968d;
    }

    @Override // android.support.v4.media.session.c
    public void bj(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f8968d.transact(3, obtain, null, 1)) {
                int i17 = android.support.v4.media.session.b.f8969d;
            }
        } finally {
            obtain.recycle();
        }
    }
}
