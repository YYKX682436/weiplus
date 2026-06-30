package lk3;

/* loaded from: classes8.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = parcel.readString();
        c16601x7ed0e40c.f66793x2262335f = parcel.readInt();
        c16601x7ed0e40c.f66789xac3be4e = parcel.readLong();
        c16601x7ed0e40c.f66794xa783a79b = parcel.readLong();
        r45.lr4 lr4Var = new r45.lr4();
        lr4Var.set(0, parcel.readString());
        lr4Var.set(1, parcel.readString());
        lr4Var.set(2, parcel.readString());
        lr4Var.set(3, java.lang.Integer.valueOf(parcel.readInt()));
        lr4Var.set(4, parcel.readString());
        lr4Var.set(5, parcel.readString());
        lr4Var.set(6, java.lang.Integer.valueOf(parcel.readInt()));
        lr4Var.set(7, java.lang.Boolean.valueOf(parcel.readInt() != 0));
        c16601x7ed0e40c.f66792x98981ec = lr4Var;
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            c16601x7ed0e40c.f66790x225a93cf = bArr;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskInfo", "read ext info error: %s", e17.getMessage());
        }
        return c16601x7ed0e40c;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c[i17];
    }
}
