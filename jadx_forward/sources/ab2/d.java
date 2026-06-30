package ab2;

/* loaded from: classes2.dex */
public final class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab2.g f84291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f84292b;

    public d(ab2.g gVar, so2.j5 j5Var) {
        this.f84291a = gVar;
        this.f84292b = j5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        ab2.g gVar = this.f84291a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = gVar.f187707d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = gVar.f187707d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = gVar.f187707d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216920s);
        r45.nw1 m59258xd0557130 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f84292b).getFeedObject().m59258xd0557130();
        lVarArr[3] = new jz5.l("live_enter_status", m59258xd0557130 != null ? java.lang.Integer.valueOf(m59258xd0557130.m75939xb282bd08(2)) : null);
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
