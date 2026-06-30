package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f68672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ipcinvoker.r rVar) {
        super(2);
        this.f68672d = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.ipcinvoker.r rVar = this.f68672d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback(longValue, str));
        }
        return jz5.f0.f302826a;
    }
}
