package androidx.core.app;

/* loaded from: classes13.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(w4.c cVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        w4.e eVar = remoteActionCompat.f11029a;
        if (cVar.e(1)) {
            eVar = cVar.h();
        }
        remoteActionCompat.f11029a = (androidx.core.graphics.drawable.IconCompat) eVar;
        java.lang.CharSequence charSequence = remoteActionCompat.f11030b;
        if (cVar.e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((w4.d) cVar).f442835e);
        }
        remoteActionCompat.f11030b = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.f11031c;
        if (cVar.e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((w4.d) cVar).f442835e);
        }
        remoteActionCompat.f11031c = charSequence2;
        remoteActionCompat.f11032d = (android.app.PendingIntent) cVar.g(remoteActionCompat.f11032d, 4);
        boolean z17 = remoteActionCompat.f11033e;
        if (cVar.e(5)) {
            z17 = ((w4.d) cVar).f442835e.readInt() != 0;
        }
        remoteActionCompat.f11033e = z17;
        boolean z18 = remoteActionCompat.f11034f;
        if (cVar.e(6)) {
            z18 = ((w4.d) cVar).f442835e.readInt() != 0;
        }
        remoteActionCompat.f11034f = z18;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, w4.c cVar) {
        cVar.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.f11029a;
        cVar.i(1);
        cVar.l(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.f11030b;
        cVar.i(2);
        android.os.Parcel parcel = ((w4.d) cVar).f442835e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.f11031c;
        cVar.i(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        cVar.k(remoteActionCompat.f11032d, 4);
        boolean z17 = remoteActionCompat.f11033e;
        cVar.i(5);
        parcel.writeInt(z17 ? 1 : 0);
        boolean z18 = remoteActionCompat.f11034f;
        cVar.i(6);
        parcel.writeInt(z18 ? 1 : 0);
    }
}
