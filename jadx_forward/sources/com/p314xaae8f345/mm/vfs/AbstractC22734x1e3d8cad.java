package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.AbstractFileSystem */
/* loaded from: classes12.dex */
public abstract class AbstractC22734x1e3d8cad implements com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.x5 f294212d = null;

    public com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad a(java.lang.String str, com.p314xaae8f345.mm.vfs.v5 v5Var) {
        this.f294212d = v5Var == null ? null : new com.p314xaae8f345.mm.vfs.d3(str, v5Var);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
