package android.support.v4.media.session;

/* loaded from: classes15.dex */
public abstract class b extends android.os.Binder implements android.support.v4.media.session.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8969d = 0;

    public b() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i17) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                android.support.v4.media.f.a(((android.support.v4.media.session.g) this).f8975e.get());
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((android.support.v4.media.session.j) this).j();
                throw null;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((android.support.v4.media.session.g) this).bj(parcel.readInt() != 0 ? android.support.v4.media.session.PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((android.support.v4.media.session.j) this).e(parcel.readInt() != 0 ? android.support.v4.media.MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                throw null;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(android.support.v4.media.session.MediaSessionCompat$QueueItem.CREATOR);
                throw new java.lang.AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((android.support.v4.media.session.j) this).g(parcel.readInt() != 0 ? (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                throw null;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((android.support.v4.media.session.j) this).d(parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                throw null;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    android.support.v4.media.session.ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                }
                throw new java.lang.AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                android.support.v4.media.f.a(((android.support.v4.media.session.g) this).f8975e.get());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                android.support.v4.media.f.a(((android.support.v4.media.session.g) this).f8975e.get());
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                android.support.v4.media.f.a(((android.support.v4.media.session.g) this).f8975e.get());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                android.support.v4.media.f.a(((android.support.v4.media.session.g) this).f8975e.get());
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
