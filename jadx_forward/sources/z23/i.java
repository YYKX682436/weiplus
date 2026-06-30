package z23;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final z23.i f551280a = new z23.i();

    public final void a(java.lang.String source, java.lang.String dst) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dst, "dst");
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(source, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        android.media.ExifInterface exifInterface = new android.media.ExifInterface(i17);
        java.lang.String attribute = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15);
        java.lang.String attribute2 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126);
        java.lang.String attribute3 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549);
        java.lang.String attribute4 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da);
        java.lang.String attribute5 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3208x127d696c);
        java.lang.String attribute6 = exifInterface.getAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3209x59bf3f20);
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(dst, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i18);
        android.media.ExifInterface exifInterface2 = new android.media.ExifInterface(i18);
        if (attribute != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3218xa477fc15, attribute);
        }
        if (attribute2 != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3216xb7785126, attribute2);
        }
        if (attribute3 != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3219x716e5549, attribute3);
        }
        if (attribute4 != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3217xb32bb9da, attribute4);
        }
        if (attribute5 != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3208x127d696c, attribute5);
        }
        if (attribute6 != null) {
            exifInterface2.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3209x59bf3f20, attribute6);
        }
        try {
            exifInterface2.saveAttributes();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PhotoExifUtil", e17, "saveAttributes error!", new java.lang.Object[0]);
        }
    }
}
