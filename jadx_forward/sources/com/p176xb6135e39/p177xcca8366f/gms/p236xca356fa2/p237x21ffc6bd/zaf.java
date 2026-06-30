package com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd;

/* loaded from: classes13.dex */
public final class zaf extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zaa {
    public zaf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i17) {
        android.os.Parcel zaa = zaa();
        zaa.writeInt(i17);
        zac(7, zaa);
    }

    public final void zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b, int i17, boolean z17) {
        android.os.Parcel zaa = zaa();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.zad(zaa, interfaceC1914xc5c6680b);
        zaa.writeInt(i17);
        zaa.writeInt(z17 ? 1 : 0);
        zac(9, zaa);
    }

    public final void zag(com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zai zaiVar, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zae zaeVar) {
        android.os.Parcel zaa = zaa();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.zac(zaa, zaiVar);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.zad(zaa, zaeVar);
        zac(12, zaa);
    }
}
