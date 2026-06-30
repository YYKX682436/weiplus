package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.Task */
/* loaded from: classes13.dex */
public class C2046x27a9a5 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: EXTRAS_LIMIT_BYTES */
    public static final int f6064x20a7e2cb = 10240;

    /* renamed from: NETWORK_STATE_ANY */
    public static final int f6065x1fdf800d = 2;

    /* renamed from: NETWORK_STATE_CONNECTED */
    public static final int f6066x1d7c106a = 0;

    /* renamed from: NETWORK_STATE_UNMETERED */
    public static final int f6067xdefd1a90 = 1;

    /* renamed from: UNINITIALIZED */
    protected static final long f6068x5382c67b = -1;

    /* renamed from: extras */
    private final android.os.Bundle f6069xb32aee63;

    /* renamed from: gcmTaskService */
    private final java.lang.String f6070xadc18d9f;

    /* renamed from: isPersisted */
    private final boolean f6071x78c5e369;

    /* renamed from: requiredNetworkState */
    private final int f6072xc482b042;

    /* renamed from: requiresCharging */
    private final boolean f6073x662d643f;
    private final java.lang.String tag;

    /* renamed from: updateCurrent */
    private final boolean f6074xea015870;

    /* renamed from: zzau */
    private final java.util.Set<android.net.Uri> f6075x394b74;

    /* renamed from: zzav */
    private final boolean f6076x394b75;

    /* renamed from: zzaw */
    private final com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl f6077x394b76;

    /* renamed from: com.google.android.gms.gcm.Task$Builder */
    /* loaded from: classes13.dex */
    public static abstract class Builder {

        /* renamed from: extras */
        protected android.os.Bundle f6078xb32aee63;

        /* renamed from: gcmTaskService */
        protected java.lang.String f6079xadc18d9f;

        /* renamed from: isPersisted */
        protected boolean f6080x78c5e369;

        /* renamed from: requiredNetworkState */
        protected int f6081xc482b042;

        /* renamed from: requiresCharging */
        protected boolean f6082x662d643f;
        protected java.lang.String tag;

        /* renamed from: updateCurrent */
        protected boolean f6083xea015870;

        /* renamed from: zzau */
        protected java.util.Set<android.net.Uri> f6084x394b74 = java.util.Collections.emptySet();

        /* renamed from: zzaw */
        protected com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl f6085x394b76 = com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl.f6088x394b6e;

        /* renamed from: build */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5 mo18723x59bc66e();

        /* renamed from: checkConditions */
        public void mo18724x10454de0() {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(this.f6079xadc18d9f != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0.zzd(this.tag);
            com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl zzlVar = this.f6085x394b76;
            if (zzlVar != null) {
                int zzh = zzlVar.zzh();
                if (zzh != 1 && zzh != 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(45);
                    sb6.append("Must provide a valid RetryPolicy: ");
                    sb6.append(zzh);
                    throw new java.lang.IllegalArgumentException(sb6.toString());
                }
                int zzi = zzlVar.zzi();
                int zzj = zzlVar.zzj();
                if (zzh == 0 && zzi < 0) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(52);
                    sb7.append("InitialBackoffSeconds can't be negative: ");
                    sb7.append(zzi);
                    throw new java.lang.IllegalArgumentException(sb7.toString());
                }
                if (zzh == 1 && zzi < 10) {
                    throw new java.lang.IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                }
                if (zzj < zzi) {
                    int zzj2 = zzlVar.zzj();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(77);
                    sb8.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                    sb8.append(zzj2);
                    throw new java.lang.IllegalArgumentException(sb8.toString());
                }
            }
            if (this.f6080x78c5e369) {
                com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.zzg(this.f6078xb32aee63);
            }
            if (!this.f6084x394b74.isEmpty() && this.f6081xc482b042 == 2) {
                throw new java.lang.IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
            }
            java.util.Iterator<android.net.Uri> it = this.f6084x394b74.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.zzd(it.next());
            }
        }

        /* renamed from: setExtras */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18726xb774565(android.os.Bundle bundle);

        /* renamed from: setPersisted */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18727x8e49d331(boolean z17);

        /* renamed from: setRequiredNetwork */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18728xc605b0cd(int i17);

        /* renamed from: setRequiresCharging */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18729xb20260c1(boolean z17);

        /* renamed from: setService */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18730x27824ff3(java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf> cls);

        /* renamed from: setTag */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18731xca0297d8(java.lang.String str);

        /* renamed from: setUpdateCurrent */
        public abstract com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18732x3a377b2e(boolean z17);
    }

    @java.lang.Deprecated
    public C2046x27a9a5(android.os.Parcel parcel) {
        this.f6070xadc18d9f = parcel.readString();
        this.tag = parcel.readString();
        this.f6074xea015870 = parcel.readInt() == 1;
        this.f6071x78c5e369 = parcel.readInt() == 1;
        this.f6072xc482b042 = 2;
        this.f6075x394b74 = java.util.Collections.emptySet();
        this.f6073x662d643f = false;
        this.f6076x394b75 = false;
        this.f6077x394b76 = com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl.f6088x394b6e;
        this.f6069xb32aee63 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("Null URI");
        }
        java.lang.String scheme = uri.getScheme();
        java.lang.String host = uri.getHost();
        if (android.text.TextUtils.isEmpty(host) || "null".equals(host)) {
            throw new java.lang.IllegalArgumentException("URI hostname is required");
        }
        try {
            int port = uri.getPort();
            if (!"tcp".equals(scheme)) {
                if (!"ping".equals(scheme)) {
                    java.lang.String valueOf = java.lang.String.valueOf(scheme);
                    throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new java.lang.String("Unsupported required URI scheme: "));
                }
                if (port != -1) {
                    throw new java.lang.IllegalArgumentException("Ping does not support port numbers");
                }
                return;
            }
            if (port <= 0 || port > 65535) {
                int port2 = uri.getPort();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(38);
                sb6.append("Invalid required URI port: ");
                sb6.append(port2);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        } catch (java.lang.NumberFormatException e17) {
            java.lang.String valueOf2 = java.lang.String.valueOf(e17.getMessage());
            throw new java.lang.IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new java.lang.String("Invalid port number: "));
        }
    }

    public static void zzg(android.os.Bundle bundle) {
        if (bundle != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(55);
                sb6.append("Extras exceeding maximum size(10240 bytes): ");
                sb6.append(dataSize);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
            java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                java.lang.Object obj = bundle.get(it.next());
                if (!((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.String) || (obj instanceof java.lang.Boolean))) {
                    if (!(obj instanceof android.os.Bundle)) {
                        throw new java.lang.IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                    zzg((android.os.Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: getExtras */
    public android.os.Bundle m18740x18421159() {
        return this.f6069xb32aee63;
    }

    /* renamed from: getRequiredNetwork */
    public int m18741x8f2f1759() {
        return this.f6072xc482b042;
    }

    /* renamed from: getRequiresCharging */
    public boolean m18742xe05cbb5() {
        return this.f6073x662d643f;
    }

    /* renamed from: getServiceName */
    public java.lang.String m18743x66e299aa() {
        return this.f6070xadc18d9f;
    }

    /* renamed from: getTag */
    public java.lang.String m18744xb5887064() {
        return this.tag;
    }

    /* renamed from: isPersisted */
    public boolean m18745x78c5e369() {
        return this.f6071x78c5e369;
    }

    /* renamed from: isUpdateCurrent */
    public boolean m18746x6b40af66() {
        return this.f6074xea015870;
    }

    /* renamed from: toBundle */
    public void mo18721x792022dd(android.os.Bundle bundle) {
        bundle.putString("tag", this.tag);
        bundle.putBoolean("update_current", this.f6074xea015870);
        bundle.putBoolean("persisted", this.f6071x78c5e369);
        bundle.putString("service", this.f6070xadc18d9f);
        bundle.putInt("requiredNetwork", this.f6072xc482b042);
        if (!this.f6075x394b74.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator<android.net.Uri> it = this.f6075x394b74.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.f6073x662d643f);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.f6077x394b76.zzf(new android.os.Bundle()));
        bundle.putBundle("extras", this.f6069xb32aee63);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f6070xadc18d9f);
        parcel.writeString(this.tag);
        parcel.writeInt(this.f6074xea015870 ? 1 : 0);
        parcel.writeInt(this.f6071x78c5e369 ? 1 : 0);
    }

    public C2046x27a9a5(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder builder) {
        this.f6070xadc18d9f = builder.f6079xadc18d9f;
        this.tag = builder.tag;
        this.f6074xea015870 = builder.f6083xea015870;
        this.f6071x78c5e369 = builder.f6080x78c5e369;
        this.f6072xc482b042 = builder.f6081xc482b042;
        this.f6075x394b74 = builder.f6084x394b74;
        this.f6073x662d643f = builder.f6082x662d643f;
        this.f6076x394b75 = false;
        this.f6069xb32aee63 = builder.f6078xb32aee63;
        com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl zzlVar = builder.f6085x394b76;
        this.f6077x394b76 = zzlVar == null ? com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl.f6088x394b6e : zzlVar;
    }
}
