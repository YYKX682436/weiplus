package q75;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Field f442142a;

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0039. Please report as an issue. */
    public static java.lang.String a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9, java.lang.String str) {
        if (f442142a == null) {
            try {
                java.lang.reflect.Field declaredField = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.class.getDeclaredField("mMimeType");
                declaredField.setAccessible(true);
                f442142a = declaredField;
            } catch (java.lang.NoSuchFieldException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExifMimeTypeInterface", "getFiledErr: " + e17.getMessage());
            }
        }
        java.lang.reflect.Field field = f442142a;
        if (field == null) {
            return null;
        }
        try {
            switch (((java.lang.Integer) field.get(c1098xe10e35e9)).intValue()) {
                case 1:
                    return "image/x-sony-arw";
                case 2:
                    return "image/x-canon-cr2";
                case 3:
                    return "image/x-adobe-dng";
                case 4:
                    return "image/jpeg";
                case 5:
                    return "image/x-nikon-nef";
                case 6:
                    return "image/x-nikon-nrw";
                case 7:
                    return "image/x-olympus-orf";
                case 8:
                    return "image/x-pentax-pef";
                case 9:
                    return "image/x-fuji-raf";
                case 10:
                    return "image/x-panasonic-rw2";
                case 11:
                    return "image/x-samsung-srw";
                case 12:
                    return "image/heif";
                default:
                    return b(str);
            }
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MimeTypeUtil", "getFiledValueErr: " + e18.getMessage());
            return null;
        }
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            try {
                com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
                try {
                    byte[] bArr = new byte[6];
                    if (u6Var.read(bArr) != -1 && new java.lang.String(bArr).startsWith("GIF8")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MimeTypeUtil", "is gif file");
                        u6Var.close();
                        return "image/gif";
                    }
                    u6Var.close();
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MimeTypeUtil", "getOtherMimeType: parseGifFile fail, err = " + e17.getMessage());
            }
        }
        return null;
    }
}
