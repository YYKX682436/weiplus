package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class TaskParams {
    private final android.os.Bundle extras;
    private final java.lang.String tag;
    private final java.util.List<android.net.Uri> zzz;

    public TaskParams(java.lang.String str) {
        this(str, null, null);
    }

    public android.os.Bundle getExtras() {
        return this.extras;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public TaskParams(java.lang.String str, android.os.Bundle bundle) {
        this(str, bundle, null);
    }

    public TaskParams(java.lang.String str, android.os.Bundle bundle, java.util.List<android.net.Uri> list) {
        this.tag = str;
        this.extras = bundle;
        this.zzz = list;
    }
}
