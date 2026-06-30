package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        java.util.Map map = com.tencent.mm.ipcinvoker.v0.f68408a;
        android.support.v4.media.f.a(qk0.c.d(readString, com.tencent.mm.ipcinvoker.extension.m.class));
        return null;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return com.tencent.mm.ipcinvoker.extension.n.class.getName();
    }
}
