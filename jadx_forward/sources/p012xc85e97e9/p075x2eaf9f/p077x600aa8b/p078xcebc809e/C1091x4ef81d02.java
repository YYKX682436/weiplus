package p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e;

/* renamed from: androidx.core.graphics.drawable.IconCompatParcelizer */
/* loaded from: classes13.dex */
public class C1091x4ef81d02 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: read */
    public static p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b m7226x355996(w4.c cVar) {
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b = new p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b();
        c1090x3d9c397b.f92570a = cVar.f(c1090x3d9c397b.f92570a, 1);
        byte[] bArr = c1090x3d9c397b.f92572c;
        if (cVar.e(2)) {
            android.os.Parcel parcel = ((w4.d) cVar).f524368e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        c1090x3d9c397b.f92572c = bArr;
        c1090x3d9c397b.f92573d = cVar.g(c1090x3d9c397b.f92573d, 3);
        c1090x3d9c397b.f92574e = cVar.f(c1090x3d9c397b.f92574e, 4);
        c1090x3d9c397b.f92575f = cVar.f(c1090x3d9c397b.f92575f, 5);
        c1090x3d9c397b.f92576g = (android.content.res.ColorStateList) cVar.g(c1090x3d9c397b.f92576g, 6);
        java.lang.String str = c1090x3d9c397b.f92578i;
        if (cVar.e(7)) {
            str = ((w4.d) cVar).f524368e.readString();
        }
        c1090x3d9c397b.f92578i = str;
        java.lang.String str2 = c1090x3d9c397b.f92579j;
        if (cVar.e(8)) {
            str2 = ((w4.d) cVar).f524368e.readString();
        }
        c1090x3d9c397b.f92579j = str2;
        c1090x3d9c397b.f92577h = android.graphics.PorterDuff.Mode.valueOf(c1090x3d9c397b.f92578i);
        switch (c1090x3d9c397b.f92570a) {
            case -1:
                android.os.Parcelable parcelable = c1090x3d9c397b.f92573d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                c1090x3d9c397b.f92571b = parcelable;
                return c1090x3d9c397b;
            case 0:
            default:
                return c1090x3d9c397b;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = c1090x3d9c397b.f92573d;
                if (parcelable2 != null) {
                    c1090x3d9c397b.f92571b = parcelable2;
                } else {
                    byte[] bArr3 = c1090x3d9c397b.f92572c;
                    c1090x3d9c397b.f92571b = bArr3;
                    c1090x3d9c397b.f92570a = 3;
                    c1090x3d9c397b.f92574e = 0;
                    c1090x3d9c397b.f92575f = bArr3.length;
                }
                return c1090x3d9c397b;
            case 2:
            case 4:
            case 6:
                java.lang.String str3 = new java.lang.String(c1090x3d9c397b.f92572c, java.nio.charset.Charset.forName("UTF-16"));
                c1090x3d9c397b.f92571b = str3;
                if (c1090x3d9c397b.f92570a == 2 && c1090x3d9c397b.f92579j == null) {
                    c1090x3d9c397b.f92579j = str3.split(":", -1)[0];
                }
                return c1090x3d9c397b;
            case 3:
                c1090x3d9c397b.f92571b = c1090x3d9c397b.f92572c;
                return c1090x3d9c397b;
        }
    }

    /* renamed from: write */
    public static void m7227x6c257df(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b, w4.c cVar) {
        cVar.getClass();
        c1090x3d9c397b.f92578i = c1090x3d9c397b.f92577h.name();
        switch (c1090x3d9c397b.f92570a) {
            case -1:
                c1090x3d9c397b.f92573d = (android.os.Parcelable) c1090x3d9c397b.f92571b;
                break;
            case 1:
            case 5:
                c1090x3d9c397b.f92573d = (android.os.Parcelable) c1090x3d9c397b.f92571b;
                break;
            case 2:
                c1090x3d9c397b.f92572c = ((java.lang.String) c1090x3d9c397b.f92571b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                c1090x3d9c397b.f92572c = (byte[]) c1090x3d9c397b.f92571b;
                break;
            case 4:
            case 6:
                c1090x3d9c397b.f92572c = c1090x3d9c397b.f92571b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i17 = c1090x3d9c397b.f92570a;
        if (-1 != i17) {
            cVar.j(i17, 1);
        }
        byte[] bArr = c1090x3d9c397b.f92572c;
        if (bArr != null) {
            cVar.i(2);
            int length = bArr.length;
            android.os.Parcel parcel = ((w4.d) cVar).f524368e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = c1090x3d9c397b.f92573d;
        if (parcelable != null) {
            cVar.k(parcelable, 3);
        }
        int i18 = c1090x3d9c397b.f92574e;
        if (i18 != 0) {
            cVar.j(i18, 4);
        }
        int i19 = c1090x3d9c397b.f92575f;
        if (i19 != 0) {
            cVar.j(i19, 5);
        }
        android.content.res.ColorStateList colorStateList = c1090x3d9c397b.f92576g;
        if (colorStateList != null) {
            cVar.k(colorStateList, 6);
        }
        java.lang.String str = c1090x3d9c397b.f92578i;
        if (str != null) {
            cVar.i(7);
            ((w4.d) cVar).f524368e.writeString(str);
        }
        java.lang.String str2 = c1090x3d9c397b.f92579j;
        if (str2 != null) {
            cVar.i(8);
            ((w4.d) cVar).f524368e.writeString(str2);
        }
    }
}
