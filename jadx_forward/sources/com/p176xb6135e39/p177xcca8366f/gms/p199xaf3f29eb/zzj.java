package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public abstract class zzj extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzz {
    private final int zza;

    public zzj(byte[] bArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(bArr.length == 25);
        this.zza = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] zze(java.lang.String str) {
        try {
            return str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    /* renamed from: equals */
    public final boolean m18645xb2c87fbf(java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzd;
        if (obj != null && (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1947x394b60)) {
            try {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1947x394b60 interfaceC1947x394b60 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1947x394b60) obj;
                if (interfaceC1947x394b60.zzc() == this.zza && (zzd = interfaceC1947x394b60.zzd()) != null) {
                    return java.util.Arrays.equals(zzf(), (byte[]) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(zzd));
                }
                return false;
            } catch (android.os.RemoteException unused) {
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m18646x8cdac1b() {
        return this.zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1947x394b60
    public final int zzc() {
        return this.zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1947x394b60
    public final com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzd() {
        return com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(zzf());
    }

    public abstract byte[] zzf();
}
