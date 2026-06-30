package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.RichGameTabWidget$OpenUrlData */
/* loaded from: classes8.dex */
public class C16025x176f4796 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16025x176f4796> f36975x681a0c0c = new p53.q();

    /* renamed from: d, reason: collision with root package name */
    public m53.p3 f223307d;

    public C16025x176f4796(m53.p3 p3Var) {
        new m53.p3();
        this.f223307d = p3Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            m53.p3 p3Var = this.f223307d;
            if (p3Var != null) {
                byte[] mo14344x5f01b1f6 = p3Var.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 == null || mo14344x5f01b1f6.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(mo14344x5f01b1f6.length);
                    parcel.writeByteArray(mo14344x5f01b1f6);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public C16025x176f4796(android.os.Parcel parcel) {
        this.f223307d = new m53.p3();
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f223307d = new m53.p3();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                this.f223307d.mo11468x92b714fd(bArr);
            }
        } catch (java.lang.Exception e17) {
            this.f223307d = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RichGameTabWidget", e17, "parse jsApiResponse exception", new java.lang.Object[0]);
        }
    }
}
