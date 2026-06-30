package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class aj implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f102889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ly1.a f102890b;

    public aj(com.tencent.mm.plugin.finder.convert.oj ojVar, ly1.a aVar) {
        this.f102889a = ojVar;
        this.f102890b = aVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.util.Map b17 = this.f102890b.b(str);
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f102889a;
        ojVar.f104200y = b17;
        java.util.Map map2 = ojVar.f104200y;
        if (map2 != null) {
            java.lang.Object obj = map2.get("finder_tab_context_id");
            if (obj == null) {
                obj = "";
            }
            map2.put("from_tab_contextid", obj);
        }
    }
}
