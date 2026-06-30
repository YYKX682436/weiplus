package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes15.dex */
public final class u0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f78438d;

    public u0(com.tencent.mm.ipcinvoker.r rVar) {
        this.f78438d = rVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable data = (android.os.Parcelable) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.ipcinvoker.r rVar = this.f78438d;
        if (rVar != null) {
            rVar.a(data);
        }
    }
}
