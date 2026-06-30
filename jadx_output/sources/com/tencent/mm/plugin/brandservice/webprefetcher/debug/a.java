package com.tencent.mm.plugin.brandservice.webprefetcher.debug;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class a<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.webprefetcher.debug.a f94603a = new com.tencent.mm.plugin.brandservice.webprefetcher.debug.a();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String a17 = com.tencent.xweb.d.g().a(iPCString != null ? iPCString.f68406d : null);
        if (a17 == null) {
            a17 = "";
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(a17);
    }
}
