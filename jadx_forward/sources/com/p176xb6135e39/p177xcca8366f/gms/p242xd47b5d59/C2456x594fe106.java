package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.ChannelIOException */
/* loaded from: classes13.dex */
public class C2456x594fe106 extends java.io.IOException {
    private final int zzg;
    private final int zzh;

    public C2456x594fe106(java.lang.String str, int i17, int i18) {
        super(str);
        this.zzg = i17;
        this.zzh = i18;
    }

    /* renamed from: getAppSpecificErrorCode */
    public int m19696x97e0758() {
        return this.zzh;
    }

    /* renamed from: getCloseReason */
    public int m19697xe1964926() {
        return this.zzg;
    }
}
