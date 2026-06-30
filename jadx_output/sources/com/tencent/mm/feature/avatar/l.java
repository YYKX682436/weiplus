package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class l implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f65167d;

    public l(yz5.l lVar) {
        this.f65167d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null) {
            str = "";
        }
        this.f65167d.invoke(str);
    }
}
