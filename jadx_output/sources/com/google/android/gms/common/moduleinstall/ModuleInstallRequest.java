package com.google.android.gms.common.moduleinstall;

/* loaded from: classes13.dex */
public final class ModuleInstallRequest {
    private final java.util.List zaa;
    private final com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
    private final java.util.concurrent.Executor zac;

    /* loaded from: classes13.dex */
    public static class Builder {
        private final java.util.List zaa = new java.util.ArrayList();
        private com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
        private java.util.concurrent.Executor zac;

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder addApi(com.google.android.gms.common.api.OptionalModuleApi optionalModuleApi) {
            this.zaa.add(optionalModuleApi);
            return this;
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest build() {
            return new com.google.android.gms.common.moduleinstall.ModuleInstallRequest(this.zaa, this.zab, this.zac, true, null);
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener, java.util.concurrent.Executor executor) {
            this.zab = installStatusListener;
            this.zac = executor;
            return this;
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, null);
        }
    }

    public /* synthetic */ ModuleInstallRequest(java.util.List list, com.google.android.gms.common.moduleinstall.InstallStatusListener installStatusListener, java.util.concurrent.Executor executor, boolean z17, com.google.android.gms.common.moduleinstall.zac zacVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "APIs must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(installStatusListener, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list;
        this.zab = installStatusListener;
        this.zac = executor;
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder newBuilder() {
        return new com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder();
    }

    public java.util.List<com.google.android.gms.common.api.OptionalModuleApi> getApis() {
        return this.zaa;
    }

    public com.google.android.gms.common.moduleinstall.InstallStatusListener getListener() {
        return this.zab;
    }

    public java.util.concurrent.Executor getListenerExecutor() {
        return this.zac;
    }
}
