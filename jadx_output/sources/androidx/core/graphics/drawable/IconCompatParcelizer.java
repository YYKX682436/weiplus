package androidx.core.graphics.drawable;

/* loaded from: classes13.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(w4.c cVar) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        iconCompat.f11037a = cVar.f(iconCompat.f11037a, 1);
        byte[] bArr = iconCompat.f11039c;
        if (cVar.e(2)) {
            android.os.Parcel parcel = ((w4.d) cVar).f442835e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f11039c = bArr;
        iconCompat.f11040d = cVar.g(iconCompat.f11040d, 3);
        iconCompat.f11041e = cVar.f(iconCompat.f11041e, 4);
        iconCompat.f11042f = cVar.f(iconCompat.f11042f, 5);
        iconCompat.f11043g = (android.content.res.ColorStateList) cVar.g(iconCompat.f11043g, 6);
        java.lang.String str = iconCompat.f11045i;
        if (cVar.e(7)) {
            str = ((w4.d) cVar).f442835e.readString();
        }
        iconCompat.f11045i = str;
        java.lang.String str2 = iconCompat.f11046j;
        if (cVar.e(8)) {
            str2 = ((w4.d) cVar).f442835e.readString();
        }
        iconCompat.f11046j = str2;
        iconCompat.f11044h = android.graphics.PorterDuff.Mode.valueOf(iconCompat.f11045i);
        switch (iconCompat.f11037a) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.f11040d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                iconCompat.f11038b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.f11040d;
                if (parcelable2 != null) {
                    iconCompat.f11038b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f11039c;
                    iconCompat.f11038b = bArr3;
                    iconCompat.f11037a = 3;
                    iconCompat.f11041e = 0;
                    iconCompat.f11042f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                java.lang.String str3 = new java.lang.String(iconCompat.f11039c, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.f11038b = str3;
                if (iconCompat.f11037a == 2 && iconCompat.f11046j == null) {
                    iconCompat.f11046j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f11038b = iconCompat.f11039c;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, w4.c cVar) {
        cVar.getClass();
        iconCompat.f11045i = iconCompat.f11044h.name();
        switch (iconCompat.f11037a) {
            case -1:
                iconCompat.f11040d = (android.os.Parcelable) iconCompat.f11038b;
                break;
            case 1:
            case 5:
                iconCompat.f11040d = (android.os.Parcelable) iconCompat.f11038b;
                break;
            case 2:
                iconCompat.f11039c = ((java.lang.String) iconCompat.f11038b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f11039c = (byte[]) iconCompat.f11038b;
                break;
            case 4:
            case 6:
                iconCompat.f11039c = iconCompat.f11038b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i17 = iconCompat.f11037a;
        if (-1 != i17) {
            cVar.j(i17, 1);
        }
        byte[] bArr = iconCompat.f11039c;
        if (bArr != null) {
            cVar.i(2);
            int length = bArr.length;
            android.os.Parcel parcel = ((w4.d) cVar).f442835e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.f11040d;
        if (parcelable != null) {
            cVar.k(parcelable, 3);
        }
        int i18 = iconCompat.f11041e;
        if (i18 != 0) {
            cVar.j(i18, 4);
        }
        int i19 = iconCompat.f11042f;
        if (i19 != 0) {
            cVar.j(i19, 5);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.f11043g;
        if (colorStateList != null) {
            cVar.k(colorStateList, 6);
        }
        java.lang.String str = iconCompat.f11045i;
        if (str != null) {
            cVar.i(7);
            ((w4.d) cVar).f442835e.writeString(str);
        }
        java.lang.String str2 = iconCompat.f11046j;
        if (str2 != null) {
            cVar.i(8);
            ((w4.d) cVar).f442835e.writeString(str2);
        }
    }
}
