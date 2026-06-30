package com.p314xaae8f345.mm.p2496xc50a8ce6;

/* renamed from: com.tencent.mm.protocal.GeneralControlWrapper */
/* loaded from: classes8.dex */
public class C19774x1007d35e implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final int f273710d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f273708e = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(10);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f273709f = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(1);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e> f38882x681a0c0c = new o45.bg();

    public C19774x1007d35e(r45.y73 y73Var) {
        if (y73Var == null) {
            this.f273710d = 0;
        } else {
            this.f273710d = y73Var.f472371d;
        }
        m75973x9616526c();
    }

    public boolean a() {
        return (this.f273710d & 64) > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m75973x9616526c() {
        return "[bitset=0x" + java.lang.Integer.toHexString(this.f273710d) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f273710d);
    }

    public C19774x1007d35e(int i17) {
        this.f273710d = i17;
        m75973x9616526c();
    }

    public C19774x1007d35e(android.os.Parcel parcel, o45.bg bgVar) {
        this.f273710d = parcel.readInt();
    }
}
