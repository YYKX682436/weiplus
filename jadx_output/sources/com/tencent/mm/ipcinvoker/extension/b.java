package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.ipcinvoker.extension.a {
    @Override // com.tencent.mm.ipcinvoker.extension.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof nk0.a;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.Object b(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        android.os.Bundle readBundle = parcel.readBundle();
        java.util.Map map = com.tencent.mm.ipcinvoker.v0.f68408a;
        nk0.a aVar = (nk0.a) qk0.c.d(readString, nk0.a.class);
        if (aVar == null) {
            return null;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost iPCHost = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost) aVar;
        if (readBundle != null) {
            iPCHost.f94181d = readBundle.getStringArray("hosts");
        }
        return aVar;
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        nk0.a aVar = (nk0.a) obj;
        parcel.writeString(aVar.getClass().getName());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("hosts", ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.IPCHost) aVar).f94181d);
        parcel.writeBundle(bundle);
    }

    @Override // com.tencent.mm.ipcinvoker.extension.a
    public java.lang.String getName() {
        return com.tencent.mm.ipcinvoker.extension.b.class.getName();
    }
}
