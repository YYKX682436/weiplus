package pt2;

/* loaded from: classes2.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f439776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f439777b;

    public c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f439776a = context;
        this.f439777b = abstractC14490x69736cb5;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[5];
        android.content.Context context = this.f439776a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        boolean z17 = false;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216920s);
        r45.nw1 m59258xd0557130 = this.f439777b.getFeedObject().m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f409673e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f409673e;
            j17 = 2;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
