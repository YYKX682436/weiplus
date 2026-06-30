package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public abstract class e extends android.os.Binder implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f90504d = 0;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public static p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f)) ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.d(iBinder) : (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c cVar = null;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c cVar2 = null;
        switch (i17) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                M4(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0046x2e822957.f69x681a0c0c.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean Mc = Mc(parcel.readInt() != 0 ? (android.view.KeyEvent) android.view.KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(Mc ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    cVar2 = (queryLocalInterface == null || !(queryLocalInterface instanceof p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c)) ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.a(readStrongBinder) : (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c) queryLocalInterface;
                }
                d6(cVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    cVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c)) ? new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.a(readStrongBinder2) : (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c) queryLocalInterface2;
                }
                r7(cVar);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean A6 = A6();
                parcel2.writeNoException();
                parcel2.writeInt(A6 ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                java.lang.String mo2484x1000d6bb = mo2484x1000d6bb();
                parcel2.writeNoException();
                parcel2.writeString(mo2484x1000d6bb);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                java.lang.String mo2485xb5887064 = mo2485xb5887064();
                parcel2.writeNoException();
                parcel2.writeString(mo2485xb5887064);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                android.app.PendingIntent b27 = b2();
                parcel2.writeNoException();
                if (b27 != null) {
                    parcel2.writeInt(1);
                    b27.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long mo2482x746d94d1 = mo2482x746d94d1();
                parcel2.writeNoException();
                parcel2.writeLong(mo2482x746d94d1);
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0048xec879c4b M9 = M9();
                parcel2.writeNoException();
                if (M9 != null) {
                    parcel2.writeInt(1);
                    M9.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                jh(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                pf(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2480x348b34();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                V2(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Vb(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Zb(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                he(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2479x65825f6();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2491x360802();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2486x338af3();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2488xb413baf7();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Gg();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2489xc84f6cbb();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2490xc9fc1b13(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mf(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f.f67x681a0c0c.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                z1(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 mo2483x6107b8a5 = mo2483x6107b8a5();
                parcel2.writeNoException();
                if (mo2483x6107b8a5 != null) {
                    parcel2.writeInt(1);
                    parcel2.writeBundle(mo2483x6107b8a5.f90449d);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 t17 = t();
                parcel2.writeNoException();
                if (t17 != null) {
                    parcel2.writeInt(1);
                    t17.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                java.util.List Vh = Vh();
                parcel2.writeNoException();
                parcel2.writeTypedList(Vh);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                java.lang.CharSequence i76 = i7();
                parcel2.writeNoException();
                if (i76 != null) {
                    parcel2.writeInt(1);
                    android.text.TextUtils.writeToParcel(i76, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                android.os.Bundle mo2481x18421159 = mo2481x18421159();
                parcel2.writeNoException();
                if (mo2481x18421159 != null) {
                    parcel2.writeInt(1);
                    mo2481x18421159.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int fb6 = fb();
                parcel2.writeNoException();
                parcel2.writeInt(fb6);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mo2487xed060d07();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                O2(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Lf(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                P1(parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int H9 = H9();
                parcel2.writeNoException();
                parcel2.writeInt(H9);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean K1 = K1();
                parcel2.writeNoException();
                parcel2.writeInt(K1 ? 1 : 0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                bi(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                h5(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Cf(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a.f65x681a0c0c.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Xc(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a.f65x681a0c0c.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bf(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0041x23c4773a.f65x681a0c0c.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                v4(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean z47 = z4();
                parcel2.writeNoException();
                parcel2.writeInt(z47 ? 1 : 0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                C8(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int rd6 = rd();
                parcel2.writeNoException();
                parcel2.writeInt(rd6);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                re(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Zg(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                android.os.Bundle Jb = Jb();
                parcel2.writeNoException();
                if (Jb != null) {
                    parcel2.writeInt(1);
                    Jb.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                S3(parcel.readInt() != 0 ? p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f.f67x681a0c0c.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}
