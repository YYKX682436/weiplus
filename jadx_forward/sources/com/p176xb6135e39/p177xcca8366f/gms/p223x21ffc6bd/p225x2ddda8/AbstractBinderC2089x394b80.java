package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzbb */
/* loaded from: classes13.dex */
public abstract class AbstractBinderC2089x394b80 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.InterfaceC2088x394b7f {
    public AbstractBinderC2089x394b80() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze
    /* renamed from: dispatchTransaction */
    public final boolean mo17328x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzd((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5898x681a0c0c), (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477.f5522x681a0c0c));
        } else if (i17 == 2) {
            zze((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5898x681a0c0c));
        } else {
            if (i17 != 3) {
                return false;
            }
            zzd((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5898x681a0c0c), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
