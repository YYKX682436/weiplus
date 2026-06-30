package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.BinderUuidManager */
/* loaded from: classes13.dex */
class C25530xbcdf9f48 implements com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352 {

    /* renamed from: mRemote */
    private android.os.IBinder f46671x17b71f13;

    public C25530xbcdf9f48(android.os.IBinder iBinder) {
        this.f46671x17b71f13 = iBinder;
    }

    /* renamed from: checkException */
    private void m95535xc5fb3427(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 1) {
            throw com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46684x681a0c0c.createFromParcel(parcel);
        }
        if (readInt == 2) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480(parcel);
        }
        if (readInt == 0) {
            return;
        }
        throw new java.lang.RuntimeException("不认识的Code==" + readInt);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352
    /* renamed from: getAndroidJar */
    public android.os.ParcelFileDescriptor mo95536x19585922() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352.f46759xf04ebf6f);
            this.f46671x17b71f13.transact(4, obtain, obtain2, 0);
            m95535xc5fb3427(obtain2);
            return obtain2.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352
    /* renamed from: getPlugin */
    public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 mo95537x2a5e9229(java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352.f46759xf04ebf6f);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f46671x17b71f13.transact(1, obtain, obtain2, 0);
            m95535xc5fb3427(obtain2);
            return obtain2.readInt() != 0 ? com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462.f46640x681a0c0c.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352
    /* renamed from: getPluginLoader */
    public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 mo95538xba82ab9c(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352.f46759xf04ebf6f);
            obtain.writeString(str);
            this.f46671x17b71f13.transact(2, obtain, obtain2, 0);
            m95535xc5fb3427(obtain2);
            return obtain2.readInt() != 0 ? com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462.f46640x681a0c0c.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352
    /* renamed from: getRuntime */
    public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 mo95539x9a3f0ba2(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352.f46759xf04ebf6f);
            obtain.writeString(str);
            this.f46671x17b71f13.transact(3, obtain, obtain2, 0);
            m95535xc5fb3427(obtain2);
            return obtain2.readInt() != 0 ? com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462.f46640x681a0c0c.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
