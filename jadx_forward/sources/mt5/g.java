package mt5;

/* loaded from: classes8.dex */
public class g extends lt5.j {
    @Override // lt5.j
    public java.lang.String b(android.content.Context context, android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            iBinder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0096, code lost:
    
        if (r5 != null) goto L15;
     */
    @Override // lt5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lt5.f d(android.content.Context r12) {
        /*
            r11 = this;
            android.content.ContentResolver r0 = r12.getContentResolver()
            java.lang.String r1 = "pps_oaid_c"
            java.lang.String r1 = android.provider.Settings.Global.getString(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "00000000-0000-0000-0000-000000000000"
            r4 = 0
            if (r2 != 0) goto Lab
            int r0 = r1.length()
            r2 = 0
            r5 = 24
            if (r0 >= r5) goto L1e
            goto L99
        L1e:
            java.lang.String r0 = r1.substring(r4, r5)
            byte[] r0 = nt5.b.a(r0)
            java.lang.String r1 = r1.substring(r5)
            byte[] r1 = nt5.b.a(r1)
            android.content.ContentResolver r5 = r12.getContentResolver()
            java.lang.String r6 = "content://com.huawei.hwid.pps.apiprovider/oaid_scp/get"
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L99
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L99
            if (r5 == 0) goto L96
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L8c
            if (r6 != 0) goto L49
            goto L96
        L49:
            java.lang.String r6 = "op_wk"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8c
            if (r6 >= 0) goto L55
        L51:
            r5.close()     // Catch: java.lang.Throwable -> L99
            goto L99
        L55:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L8c
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L60
            goto L51
        L60:
            byte[] r6 = nt5.b.a(r6)     // Catch: java.lang.Throwable -> L8c
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = "AES"
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L8c
            javax.crypto.spec.GCMParameterSpec r6 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.Throwable -> L8c
            r8 = 128(0x80, float:1.8E-43)
            r6.<init>(r8, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L8c
            r8 = 2
            r0.init(r8, r7, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L8c
            byte[] r0 = r0.doFinal(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "UTF-8"
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.close()     // Catch: java.lang.Throwable -> L99
            r2 = r6
            goto L99
        L8c:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L99
        L95:
            throw r0     // Catch: java.lang.Throwable -> L99
        L96:
            if (r5 == 0) goto L99
            goto L51
        L99:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc3
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto Lc3
            lt5.f r12 = new lt5.f
            r12.<init>(r2, r4)
            return r12
        Lab:
            java.lang.String r1 = "pps_oaid"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lc3
            boolean r1 = r3.equals(r0)
            if (r1 != 0) goto Lc3
            lt5.f r12 = new lt5.f
            r12.<init>(r0, r4)
            return r12
        Lc3:
            lt5.f r12 = super.d(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mt5.g.d(android.content.Context):lt5.f");
    }

    @Override // lt5.j
    public android.content.Intent e() {
        android.content.Intent intent = new android.content.Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        return intent;
    }
}
