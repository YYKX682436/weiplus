package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes8.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f c19482x27941f6f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                r45.n23 n23Var = new r45.n23();
                n23Var.mo11468x92b714fd(bArr);
                c19482x27941f6f.f268514d = n23Var;
            } catch (java.lang.Exception unused) {
                c19482x27941f6f.f268514d = null;
            }
        }
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c19482x27941f6f.f268515e = readString;
        return c19482x27941f6f;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f[i17];
    }
}
