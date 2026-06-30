package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.BulkCursorProxy */
/* loaded from: classes12.dex */
final class C26868x407a7c26 implements com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 {

    /* renamed from: mExtras */
    private android.os.Bundle f57724x2971530 = null;

    /* renamed from: mRemote */
    private android.os.IBinder f57725x17b71f13;

    public C26868x407a7c26(android.os.IBinder iBinder) {
        this.f57725x17b71f13 = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f57725x17b71f13;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: close */
    public void mo106144x5a5ddf8() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            this.f57725x17b71f13.transact(7, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: deactivate */
    public void mo106145x88fbd074() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            this.f57725x17b71f13.transact(2, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: getExtras */
    public android.os.Bundle mo106146x18421159() {
        if (this.f57724x2971530 == null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                this.f57725x17b71f13.transact(5, obtain, obtain2, 0);
                com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
                this.f57724x2971530 = obtain2.readBundle(com.p314xaae8f345.p3121x37984a.C26868x407a7c26.class.getClassLoader());
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return this.f57724x2971530;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: getWindow */
    public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106147x3622fee6(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            obtain.writeInt(i17);
            this.f57725x17b71f13.transact(1, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
            return obtain2.readInt() == 1 ? com.p314xaae8f345.p3121x37984a.C26876xa70fd706.m106190xacfa1a13(obtain2) : null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: onMove */
    public void mo106148xc39cb650(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            obtain.writeInt(i17);
            this.f57725x17b71f13.transact(4, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: requery */
    public int mo106149x414ef275(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6) {
        int readInt;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            obtain.writeStrongInterface(interfaceC26886xbc685ee6);
            boolean transact = this.f57725x17b71f13.transact(3, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
            if (transact) {
                readInt = obtain2.readInt();
                this.f57724x2971530 = obtain2.readBundle(com.p314xaae8f345.p3121x37984a.C26868x407a7c26.class.getClassLoader());
            } else {
                readInt = -1;
            }
            return readInt;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: respond */
    public android.os.Bundle mo106150x41690095(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
            obtain.writeBundle(bundle);
            this.f57725x17b71f13.transact(6, obtain, obtain2, 0);
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106274xdf605c8c(obtain2);
            return obtain2.readBundle(com.p314xaae8f345.p3121x37984a.C26868x407a7c26.class.getClassLoader());
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
