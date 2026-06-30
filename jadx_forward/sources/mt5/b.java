package mt5;

/* loaded from: classes8.dex */
public class b extends lt5.j {
    @Override // lt5.j
    public java.lang.String b(android.content.Context context, android.os.IBinder iBinder) {
        android.os.IInterface aVar;
        i6.c cVar = null;
        if (mt5.c.b() && r26.i0.p(android.os.Build.MANUFACTURER, "Coolpad", true)) {
            int i17 = t7.b.f497558d;
            if (iBinder == null) {
                aVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof t7.c)) ? new t7.a(iBinder) : (t7.c) queryLocalInterface;
            }
            if (aVar == null) {
                return null;
            }
            t7.a aVar2 = (t7.a) aVar;
            java.lang.String d17 = aVar2.d(context.getPackageName());
            java.lang.String d18 = aVar2.d("0");
            return !android.text.TextUtils.isEmpty(d17) ? d17 : !android.text.TextUtils.isEmpty(d18) ? d18 : aVar2.d("oaid");
        }
        int i18 = i6.b.f370427d;
        if (iBinder != null) {
            android.os.IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
            cVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof i6.c)) ? new i6.a(iBinder) : (i6.c) queryLocalInterface2;
        }
        i6.a aVar3 = (i6.a) cVar;
        aVar3.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.creator.IdsSupplier");
            aVar3.f370426d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // lt5.j
    public android.content.Intent e() {
        if (mt5.c.b() && r26.i0.p(android.os.Build.MANUFACTURER, "Coolpad", true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
            return intent;
        }
        android.content.Intent intent2 = new android.content.Intent("android.service.action.msa");
        intent2.setPackage("com.android.creator");
        intent2.setComponent(new android.content.ComponentName("com.android.creator", "com.android.creator.CreatorService"));
        return intent2;
    }
}
