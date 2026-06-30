package android.support.v4.media.session;

/* loaded from: classes15.dex */
public class d implements android.support.v4.media.session.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f8970d;

    public d(android.os.IBinder iBinder) {
        this.f8970d = iBinder;
    }

    @Override // android.support.v4.media.session.f
    public void M4(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (mediaSessionCompat$ResultReceiverWrapper != null) {
                obtain.writeInt(1);
                mediaSessionCompat$ResultReceiverWrapper.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f8970d.transact(1, obtain, obtain2, 0)) {
                int i17 = android.support.v4.media.session.e.f8971d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public boolean Mc(android.view.KeyEvent keyEvent) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f8970d.transact(2, obtain, obtain2, 0)) {
                int i17 = android.support.v4.media.session.e.f8971d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f8970d;
    }

    @Override // android.support.v4.media.session.f
    public void d6(android.support.v4.media.session.c cVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
            if (!this.f8970d.transact(3, obtain, obtain2, 0)) {
                int i17 = android.support.v4.media.session.e.f8971d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void pause() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f8970d.transact(18, obtain, obtain2, 0)) {
                int i17 = android.support.v4.media.session.e.f8971d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.f
    public void play() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f8970d.transact(13, obtain, obtain2, 0)) {
                int i17 = android.support.v4.media.session.e.f8971d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
