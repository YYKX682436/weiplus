package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class c6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66645d;

    public c6(yz5.l lVar) {
        this.f66645d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        this.f66645d.invoke(java.lang.Boolean.valueOf((iPCString == null || (str = iPCString.f68406d) == null) ? false : java.lang.Boolean.parseBoolean(str)));
    }
}
