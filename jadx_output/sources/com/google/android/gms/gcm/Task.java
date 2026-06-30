package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class Task implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final android.os.Bundle extras;
    private final java.lang.String gcmTaskService;
    private final boolean isPersisted;
    private final int requiredNetworkState;
    private final boolean requiresCharging;
    private final java.lang.String tag;
    private final boolean updateCurrent;
    private final java.util.Set<android.net.Uri> zzau;
    private final boolean zzav;
    private final com.google.android.gms.gcm.zzl zzaw;

    /* loaded from: classes13.dex */
    public static abstract class Builder {
        protected android.os.Bundle extras;
        protected java.lang.String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected java.lang.String tag;
        protected boolean updateCurrent;
        protected java.util.Set<android.net.Uri> zzau = java.util.Collections.emptySet();
        protected com.google.android.gms.gcm.zzl zzaw = com.google.android.gms.gcm.zzl.zzao;

        public abstract com.google.android.gms.gcm.Task build();

        public void checkConditions() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.gcmTaskService != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            com.google.android.gms.gcm.GcmNetworkManager.zzd(this.tag);
            com.google.android.gms.gcm.zzl zzlVar = this.zzaw;
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
            if (this.isPersisted) {
                com.google.android.gms.gcm.Task.zzg(this.extras);
            }
            if (!this.zzau.isEmpty() && this.requiredNetworkState == 2) {
                throw new java.lang.IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
            }
            java.util.Iterator<android.net.Uri> it = this.zzau.iterator();
            while (it.hasNext()) {
                com.google.android.gms.gcm.Task.zzd(it.next());
            }
        }

        public abstract com.google.android.gms.gcm.Task.Builder setExtras(android.os.Bundle bundle);

        public abstract com.google.android.gms.gcm.Task.Builder setPersisted(boolean z17);

        public abstract com.google.android.gms.gcm.Task.Builder setRequiredNetwork(int i17);

        public abstract com.google.android.gms.gcm.Task.Builder setRequiresCharging(boolean z17);

        public abstract com.google.android.gms.gcm.Task.Builder setService(java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> cls);

        public abstract com.google.android.gms.gcm.Task.Builder setTag(java.lang.String str);

        public abstract com.google.android.gms.gcm.Task.Builder setUpdateCurrent(boolean z17);
    }

    @java.lang.Deprecated
    public Task(android.os.Parcel parcel) {
        this.gcmTaskService = parcel.readString();
        this.tag = parcel.readString();
        this.updateCurrent = parcel.readInt() == 1;
        this.isPersisted = parcel.readInt() == 1;
        this.requiredNetworkState = 2;
        this.zzau = java.util.Collections.emptySet();
        this.requiresCharging = false;
        this.zzav = false;
        this.zzaw = com.google.android.gms.gcm.zzl.zzao;
        this.extras = null;
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

    public android.os.Bundle getExtras() {
        return this.extras;
    }

    public int getRequiredNetwork() {
        return this.requiredNetworkState;
    }

    public boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public java.lang.String getServiceName() {
        return this.gcmTaskService;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public boolean isPersisted() {
        return this.isPersisted;
    }

    public boolean isUpdateCurrent() {
        return this.updateCurrent;
    }

    public void toBundle(android.os.Bundle bundle) {
        bundle.putString("tag", this.tag);
        bundle.putBoolean("update_current", this.updateCurrent);
        bundle.putBoolean("persisted", this.isPersisted);
        bundle.putString("service", this.gcmTaskService);
        bundle.putInt("requiredNetwork", this.requiredNetworkState);
        if (!this.zzau.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator<android.net.Uri> it = this.zzau.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.requiresCharging);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.zzaw.zzf(new android.os.Bundle()));
        bundle.putBundle("extras", this.extras);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.gcmTaskService);
        parcel.writeString(this.tag);
        parcel.writeInt(this.updateCurrent ? 1 : 0);
        parcel.writeInt(this.isPersisted ? 1 : 0);
    }

    public Task(com.google.android.gms.gcm.Task.Builder builder) {
        this.gcmTaskService = builder.gcmTaskService;
        this.tag = builder.tag;
        this.updateCurrent = builder.updateCurrent;
        this.isPersisted = builder.isPersisted;
        this.requiredNetworkState = builder.requiredNetworkState;
        this.zzau = builder.zzau;
        this.requiresCharging = builder.requiresCharging;
        this.zzav = false;
        this.extras = builder.extras;
        com.google.android.gms.gcm.zzl zzlVar = builder.zzaw;
        this.zzaw = zzlVar == null ? com.google.android.gms.gcm.zzl.zzao : zzlVar;
    }
}
