package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.IStatusCallback */
/* loaded from: classes13.dex */
public interface InterfaceC1777x89ae5b00 extends android.os.IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.IStatusCallback$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zab implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1777x89ae5b00 {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* renamed from: asInterface */
        public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1777x89ae5b00 m17901xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1777x89ae5b00 ? (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1777x89ae5b00) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1847x38edbe(iBinder);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zab
        public final boolean zaa(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 1) {
                return false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.zaa(parcel, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5898x681a0c0c);
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.zab(parcel);
            mo17900x57429edc(c1763x9432bc12);
            return true;
        }
    }

    /* renamed from: onResult */
    void mo17900x57429edc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);
}
