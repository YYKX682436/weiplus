package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.zzac */
/* loaded from: classes13.dex */
public abstract class AbstractBinderC1949x394b62 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzb implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1916x8139adea {
    public AbstractBinderC1949x394b62() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzb
    public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            int readInt = parcel.readInt();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zzb(parcel);
            mo18182x4f259b28(readInt, readStrongBinder, bundle);
        } else if (i17 == 2) {
            int readInt2 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zzb(parcel);
            zzb(readInt2, bundle2);
        } else {
            if (i17 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk zzkVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zza(parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzk.f5962x681a0c0c);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzc.zzb(parcel);
            zzc(readInt3, readStrongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
