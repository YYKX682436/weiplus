package com.google.android.gms.tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzab implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    public zzab(java.util.Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zza);
        return com.google.android.gms.tasks.Tasks.forResult(arrayList);
    }
}
