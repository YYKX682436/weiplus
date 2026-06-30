package p012xc85e97e9.p075x2eaf9f.app;

/* renamed from: androidx.core.app.RemoteActionCompatParcelizer */
/* loaded from: classes13.dex */
public class C1087x60f0b0a5 {
    /* renamed from: read */
    public static p012xc85e97e9.p075x2eaf9f.app.C1086x85476cde m7211x355996(w4.c cVar) {
        p012xc85e97e9.p075x2eaf9f.app.C1086x85476cde c1086x85476cde = new p012xc85e97e9.p075x2eaf9f.app.C1086x85476cde();
        w4.e eVar = c1086x85476cde.f92562a;
        if (cVar.e(1)) {
            eVar = cVar.h();
        }
        c1086x85476cde.f92562a = (p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b) eVar;
        java.lang.CharSequence charSequence = c1086x85476cde.f92563b;
        if (cVar.e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((w4.d) cVar).f524368e);
        }
        c1086x85476cde.f92563b = charSequence;
        java.lang.CharSequence charSequence2 = c1086x85476cde.f92564c;
        if (cVar.e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((w4.d) cVar).f524368e);
        }
        c1086x85476cde.f92564c = charSequence2;
        c1086x85476cde.f92565d = (android.app.PendingIntent) cVar.g(c1086x85476cde.f92565d, 4);
        boolean z17 = c1086x85476cde.f92566e;
        if (cVar.e(5)) {
            z17 = ((w4.d) cVar).f524368e.readInt() != 0;
        }
        c1086x85476cde.f92566e = z17;
        boolean z18 = c1086x85476cde.f92567f;
        if (cVar.e(6)) {
            z18 = ((w4.d) cVar).f524368e.readInt() != 0;
        }
        c1086x85476cde.f92567f = z18;
        return c1086x85476cde;
    }

    /* renamed from: write */
    public static void m7212x6c257df(p012xc85e97e9.p075x2eaf9f.app.C1086x85476cde c1086x85476cde, w4.c cVar) {
        cVar.getClass();
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b = c1086x85476cde.f92562a;
        cVar.i(1);
        cVar.l(c1090x3d9c397b);
        java.lang.CharSequence charSequence = c1086x85476cde.f92563b;
        cVar.i(2);
        android.os.Parcel parcel = ((w4.d) cVar).f524368e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = c1086x85476cde.f92564c;
        cVar.i(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        cVar.k(c1086x85476cde.f92565d, 4);
        boolean z17 = c1086x85476cde.f92566e;
        cVar.i(5);
        parcel.writeInt(z17 ? 1 : 0);
        boolean z18 = c1086x85476cde.f92567f;
        cVar.i(6);
        parcel.writeInt(z18 ? 1 : 0);
    }
}
