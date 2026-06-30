package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public abstract class b extends android.os.Binder implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f90502d = 0;

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
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).f90508e.get());
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j) this).j();
                throw null;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).bj(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38.f72x681a0c0c.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j) this).e(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075.f66x681a0c0c.createFromParcel(parcel) : null);
                throw null;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0045xdf9d0f54.f68x681a0c0c);
                throw new java.lang.AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j) this).g(parcel.readInt() != 0 ? (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                throw null;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.j) this).d(parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                throw null;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0048xec879c4b.f71x681a0c0c.createFromParcel(parcel);
                }
                throw new java.lang.AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).f90508e.get());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).f90508e.get());
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).f90508e.get());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.g) this).f90508e.get());
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
