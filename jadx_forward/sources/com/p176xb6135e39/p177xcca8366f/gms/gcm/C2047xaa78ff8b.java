package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.TaskParams */
/* loaded from: classes13.dex */
public class C2047xaa78ff8b {

    /* renamed from: extras */
    private final android.os.Bundle f6086xb32aee63;
    private final java.lang.String tag;
    private final java.util.List<android.net.Uri> zzz;

    public C2047xaa78ff8b(java.lang.String str) {
        this(str, null, null);
    }

    /* renamed from: getExtras */
    public android.os.Bundle m18747x18421159() {
        return this.f6086xb32aee63;
    }

    /* renamed from: getTag */
    public java.lang.String m18748xb5887064() {
        return this.tag;
    }

    public C2047xaa78ff8b(java.lang.String str, android.os.Bundle bundle) {
        this(str, bundle, null);
    }

    public C2047xaa78ff8b(java.lang.String str, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
        this.tag = str;
        this.f6086xb32aee63 = bundle;
        this.zzz = list;
    }
}
