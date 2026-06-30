package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class aj implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ly1.a f184423b;

    public aj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, ly1.a aVar) {
        this.f184422a = ojVar;
        this.f184423b = aVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.util.Map b17 = this.f184423b.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184422a;
        ojVar.f185733y = b17;
        java.util.Map map2 = ojVar.f185733y;
        if (map2 != null) {
            java.lang.Object obj = map2.get("finder_tab_context_id");
            if (obj == null) {
                obj = "";
            }
            map2.put("from_tab_contextid", obj);
        }
    }
}
