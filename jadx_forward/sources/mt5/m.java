package mt5;

/* loaded from: classes8.dex */
public class m extends lt5.j {
    @Override // lt5.j
    public java.lang.String b(android.content.Context context, android.os.IBinder iBinder) {
        android.content.pm.Signature[] signatureArr;
        java.lang.String packageName = context.getPackageName();
        java.lang.String str = null;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (java.lang.Throwable unused) {
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            byte[] byteArray = signatureArr[0].toByteArray();
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
                if (messageDigest != null) {
                    byte[] digest = messageDigest.digest(byteArray);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (byte b17 : digest) {
                        sb6.append(java.lang.Integer.toHexString((b17 & 255) | 256).substring(1, 3));
                    }
                    str = sb6.toString();
                }
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            obtain.writeString(packageName);
            obtain.writeString(str);
            obtain.writeString("OUID");
            iBinder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // lt5.j
    public android.content.Intent e() {
        android.content.Intent intent = new android.content.Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new android.content.ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        return intent;
    }
}
