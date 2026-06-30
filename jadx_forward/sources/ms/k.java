package ms;

/* loaded from: classes4.dex */
public final class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f412459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ms.n f412460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412462g;

    public k(com.p314xaae8f345.mm.p944x882e457a.f fVar, ms.n nVar, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f412459d = fVar;
        this.f412460e = nVar;
        this.f412461f = str;
        this.f412462g = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f412459d.f152149b;
        java.lang.String reportSessionId = this.f412461f;
        ms.n nVar = this.f412460e;
        if (i18 == -3402) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = nVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ms.i iVar = (ms.i) pf5.z.f435481a.a(activity).a(ms.i.class);
            iVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportSessionId, "reportSessionId");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = iVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            iVar.f412457d = ((ms.j) pf5.z.f435481a.a(activity2).a(ms.j.class)).T6();
            new r45.gh3().b().l().K(new ms.h(iVar, reportSessionId));
        }
        ms.n.O6(nVar, reportSessionId, (java.lang.String) this.f412462g.f391656d, nVar.f412470e);
    }
}
