package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.CombinedFileSystem */
/* loaded from: classes12.dex */
public class C22741x121c47d0 extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22741x121c47d0> f39789x681a0c0c = new com.p314xaae8f345.mm.vfs.x();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb[] f294231e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.y[] f294232f;

    public C22741x121c47d0(android.os.Parcel parcel, com.p314xaae8f345.mm.vfs.x xVar) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22741x121c47d0.class, 1);
        int readInt = parcel.readInt();
        this.f294231e = new com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
            if (interfaceC22750xe27c22eb == null) {
                throw new android.os.ParcelFormatException();
            }
            this.f294231e[i17] = interfaceC22750xe27c22eb;
        }
        int readInt2 = parcel.readInt();
        this.f294232f = new com.p314xaae8f345.mm.vfs.y[readInt2];
        for (int i18 = 0; i18 < readInt2; i18++) {
            java.lang.String readString = parcel.readString();
            this.f294232f[i18] = new com.p314xaae8f345.mm.vfs.y(readString == null ? null : java.util.regex.Pattern.compile(readString), parcel.readInt());
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb[] interfaceC22750xe27c22ebArr = this.f294231e;
        int length = interfaceC22750xe27c22ebArr.length;
        com.p314xaae8f345.mm.vfs.q2[] q2VarArr = new com.p314xaae8f345.mm.vfs.q2[length];
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) interfaceC22750xe27c22ebArr[i18].b(map);
            i17 |= q2Var.o();
            q2VarArr[i18] = q2Var;
        }
        return new com.p314xaae8f345.mm.vfs.z(this, q2VarArr, i17);
    }

    /* renamed from: toString */
    public java.lang.String m82293x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CombinedFS [");
        for (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb : this.f294231e) {
            sb6.append(interfaceC22750xe27c22eb.toString());
            sb6.append(", ");
        }
        sb6.setLength(sb6.length() - 2);
        sb6.append(']');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22741x121c47d0.class, 1);
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb[] interfaceC22750xe27c22ebArr = this.f294231e;
        parcel.writeInt(interfaceC22750xe27c22ebArr.length);
        for (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb : interfaceC22750xe27c22ebArr) {
            parcel.writeParcelable(interfaceC22750xe27c22eb, i17);
        }
        com.p314xaae8f345.mm.vfs.y[] yVarArr = this.f294232f;
        parcel.writeInt(yVarArr.length);
        for (com.p314xaae8f345.mm.vfs.y yVar : yVarArr) {
            java.util.regex.Pattern pattern = yVar.f294777a;
            parcel.writeString(pattern == null ? null : pattern.pattern());
            parcel.writeInt(yVar.f294778b);
        }
    }
}
