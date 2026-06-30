package android.support.v4.media;

/* loaded from: classes15.dex */
public class n implements android.os.Parcelable.Creator {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r14 = r0.createFromParcel(r14)
            r0 = 0
            if (r14 == 0) goto L67
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r2 = android.support.v4.media.o.g(r14)
            java.lang.CharSequence r3 = android.support.v4.media.o.i(r14)
            java.lang.CharSequence r4 = android.support.v4.media.o.h(r14)
            java.lang.CharSequence r5 = android.support.v4.media.o.c(r14)
            android.graphics.Bitmap r6 = android.support.v4.media.o.e(r14)
            android.net.Uri r7 = android.support.v4.media.o.f(r14)
            android.os.Bundle r1 = android.support.v4.media.o.d(r14)
            if (r1 == 0) goto L31
            android.support.v4.media.session.f0.a(r1)
            r1.isEmpty()     // Catch: android.os.BadParcelableException -> L30
            goto L31
        L30:
            r1 = r0
        L31:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L3c
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L3d
        L3c:
            r9 = r0
        L3d:
            if (r9 == 0) goto L56
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L50
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L50
            r8 = r0
            goto L57
        L50:
            r1.remove(r8)
            r1.remove(r10)
        L56:
            r8 = r1
        L57:
            if (r9 == 0) goto L5a
            goto L5f
        L5a:
            android.net.Uri r0 = android.support.v4.media.p.a(r14)
            r9 = r0
        L5f:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f8914o = r14
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.n.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new android.support.v4.media.MediaDescriptionCompat[i17];
    }
}
