package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.SingletonSchemeResolver */
/* loaded from: classes12.dex */
public abstract class AbstractC22766xe7748d96 implements com.p314xaae8f345.mm.vfs.InterfaceC22765xc7c0aceb, com.p314xaae8f345.mm.vfs.s5 {
    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return this;
    }

    public com.p314xaae8f345.mm.vfs.z7 c(com.p314xaae8f345.mm.vfs.m5 m5Var, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        if (a(m5Var, z7Var) == null) {
            return null;
        }
        return z7Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m82346x9616526c() {
        return getClass().getSimpleName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }
}
