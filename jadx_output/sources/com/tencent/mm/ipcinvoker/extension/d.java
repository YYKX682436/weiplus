package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof android.os.Parcelable;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        return parcel.readParcelable(com.tencent.mm.ipcinvoker.extension.d.class.getClassLoader());
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        parcel.writeParcelable((android.os.Parcelable) obj, 0);
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return com.tencent.mm.ipcinvoker.extension.d.class.getName();
    }
}
