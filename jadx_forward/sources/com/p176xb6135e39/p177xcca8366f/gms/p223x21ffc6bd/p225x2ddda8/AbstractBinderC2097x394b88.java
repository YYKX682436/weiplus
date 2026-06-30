package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzbj */
/* loaded from: classes13.dex */
public abstract class AbstractBinderC2097x394b88 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.InterfaceC2096x394b87 {
    public AbstractBinderC2097x394b88() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze
    /* renamed from: dispatchTransaction */
    public final boolean mo17328x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzd((com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p195x65fca6e.C1677xb8e24af.f5650x681a0c0c));
        } else {
            if (i17 != 2) {
                return false;
            }
            zzf(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
