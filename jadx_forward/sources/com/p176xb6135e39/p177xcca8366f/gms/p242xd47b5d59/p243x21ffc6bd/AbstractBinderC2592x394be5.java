package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzej */
/* loaded from: classes13.dex */
public abstract class AbstractBinderC2592x394be5 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzb implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2591x394be4 {
    public AbstractBinderC2592x394be5() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzb
    /* renamed from: dispatchTransaction */
    public final boolean mo19426x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 2) {
            return false;
        }
        zza(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
