package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.wearable.internal.zzer */
/* loaded from: classes13.dex */
public final class C2600x394bed<T> {

    /* renamed from: zzeb */
    private final java.util.Map<T, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T>> f7701x394bdd = new java.util.HashMap();

    public final void zza(android.os.IBinder iBinder) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb c2599x394bec;
        synchronized (this.f7701x394bdd) {
            if (iBinder == null) {
                c2599x394bec = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                c2599x394bec = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb ? (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2599x394bec(iBinder);
            }
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2660x394c33 binderC2660x394c33 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2660x394c33();
            for (java.util.Map.Entry<T, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T>> entry : this.f7701x394bdd.entrySet()) {
                com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T> value = entry.getValue();
                try {
                    c2599x394bec.zza(binderC2660x394c33, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzd(value));
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(entry.getKey()).length() + 27 + java.lang.String.valueOf(value).length());
                    }
                } catch (android.os.RemoteException unused) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(entry.getKey()).length() + 32 + java.lang.String.valueOf(value).length());
                }
            }
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, T t17) {
        synchronized (this.f7701x394bdd) {
            com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T> remove = this.f7701x394bdd.remove(t17);
            if (remove == null) {
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 25);
                }
                resultHolder.mo17878x209a1f1f(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4002));
            } else {
                remove.m19955x5a5b64d();
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 24);
                }
                ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) c2667x394c3f.m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2602x394bef(this.f7701x394bdd, t17, resultHolder), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2631x394c11(remove));
            }
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> resultHolder, T t17, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2671x394c43<T> binderC2671x394c43) {
        synchronized (this.f7701x394bdd) {
            if (this.f7701x394bdd.get(t17) != null) {
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 20);
                }
                resultHolder.mo17878x209a1f1f(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(4001));
                return;
            }
            if (android.util.Log.isLoggable("WearableClient", 2)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 14);
            }
            this.f7701x394bdd.put(t17, binderC2671x394c43);
            try {
                ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) c2667x394c3f.m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2601x394bee(this.f7701x394bdd, t17, resultHolder), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzd(binderC2671x394c43));
            } catch (android.os.RemoteException e17) {
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 39);
                }
                this.f7701x394bdd.remove(t17);
                throw e17;
            }
        }
    }
}
