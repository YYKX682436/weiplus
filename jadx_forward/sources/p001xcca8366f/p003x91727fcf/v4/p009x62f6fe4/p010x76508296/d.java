package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public class d implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f90503d;

    public d(android.os.IBinder iBinder) {
        this.f90503d = iBinder;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f
    public void M4(java.lang.String str, android.os.Bundle bundle, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0046x2e822957 c0046x2e822957) {
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
            if (c0046x2e822957 != null) {
                obtain.writeInt(1);
                c0046x2e822957.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f90503d.transact(1, obtain, obtain2, 0)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.f90504d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f
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
            if (!this.f90503d.transact(2, obtain, obtain2, 0)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.f90504d;
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
        return this.f90503d;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f
    public void d6(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c cVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
            if (!this.f90503d.transact(3, obtain, obtain2, 0)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.f90504d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f
    /* renamed from: pause */
    public void mo2479x65825f6() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f90503d.transact(18, obtain, obtain2, 0)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.f90504d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f
    /* renamed from: play */
    public void mo2480x348b34() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f90503d.transact(13, obtain, obtain2, 0)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.e.f90504d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
