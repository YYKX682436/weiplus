package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.ICancelToken */
/* loaded from: classes13.dex */
public interface InterfaceC1915x36c76796 extends android.os.IInterface {

    /* renamed from: com.google.android.gms.common.internal.ICancelToken$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzb implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        /* renamed from: asInterface */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 m18181xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796 ? (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1915x36c76796) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzx(iBinder);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzb
        public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 2) {
                return false;
            }
            mo18180xae7a2e7a();
            return true;
        }
    }

    /* renamed from: cancel */
    void mo18180xae7a2e7a();
}
