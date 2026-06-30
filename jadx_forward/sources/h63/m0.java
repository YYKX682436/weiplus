package h63;

/* loaded from: classes7.dex */
public final class m0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.o1 f360796d;

    public m0(h63.o1 o1Var) {
        this.f360796d = o1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = ((com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57) obj).f148644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveTopicPayload");
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170 c16061xae29a170 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16061xae29a170) parcelable;
        h63.o1 o1Var = this.f360796d;
        if (o1Var != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c16061xae29a170.f223602e);
            mc1.C29138x2e00fe c29138x2e00fe = (mc1.C29138x2e00fe) o1Var;
            mc1.d dVar = c29138x2e00fe.f407116a;
            dVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap(1);
            boolean booleanValue = valueOf.booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = c29138x2e00fe.f407117b;
            int i17 = c29138x2e00fe.f407118c;
            if (booleanValue) {
                c0Var.a(i17, dVar.p("ok", hashMap));
            } else {
                hashMap.put("errMsg", c16061xae29a170.f223603f);
                c0Var.a(i17, dVar.p("fail", hashMap));
            }
        }
    }
}
