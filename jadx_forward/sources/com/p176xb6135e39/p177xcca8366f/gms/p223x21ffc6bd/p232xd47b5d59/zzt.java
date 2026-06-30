package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public abstract class zzt {

    /* renamed from: zzhl */
    protected volatile int f7321x394c44 = -1;

    public static final <T extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt> T zza(T t17, byte[] bArr, int i17, int i18) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk.zza(bArr, 0, i18);
            t17.zza(zza);
            zza.zzc(0);
            return t17;
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzs e17) {
            throw e17;
        } catch (java.io.IOException e18) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).", e18);
        }
    }

    public static final byte[] zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zztVar) {
        int zzx = zztVar.zzx();
        byte[] bArr = new byte[zzx];
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl.zzb(bArr, 0, zzx);
            zztVar.zza(zzb);
            zzb.zzr();
            return bArr;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e17);
        }
    }

    /* renamed from: toString */
    public java.lang.String m19460x9616526c() {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzu.zzc(this);
    }

    public abstract com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzk zzkVar);

    public int zzg() {
        return 0;
    }

    @Override // 
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt mo19439x5a5dd5d() {
        return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt) super.clone();
    }

    public final int zzx() {
        int zzg = zzg();
        this.f7321x394c44 = zzg;
        return zzg;
    }

    public void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzlVar) {
    }
}
