package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class g implements m31.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f163865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f163866b;

    public g(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, java.util.Map map) {
        this.f163865a = c11158xe7d16ed5;
        this.f163866b = map;
    }

    @Override // m31.o0
    public void a(java.lang.String templateId, boolean z17, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        java.util.Iterator it = this.f163865a.f153318h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (android.text.TextUtils.equals(((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj).f153336f, templateId)) {
                    break;
                }
            }
        }
        if (((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            java.util.Map map = this.f163866b;
            java.lang.Integer num = (java.lang.Integer) map.get(valueOf2);
            map.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }
}
