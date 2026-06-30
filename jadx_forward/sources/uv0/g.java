package uv0;

/* loaded from: classes5.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv0.h f512864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vv0.k f512865f;

    public g(uv0.u uVar, uv0.h hVar, vv0.k kVar) {
        this.f512863d = uVar;
        this.f512864e = hVar;
        this.f512865f = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        uv0.u uVar = this.f512863d;
        uVar.J();
        uv0.h hVar = this.f512864e;
        ex0.a0 s76 = hVar.f512867b.s7();
        if (s76 != null && (vVar = s76.f338630g) != null && (list = vVar.f338710e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = rVar.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a3 != null) {
                    java.lang.String str = this.f512865f.f521918a;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                    if (D != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.k1(c4181x2248e1a3, str, D);
                    }
                }
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = rVar.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = c4190xd8dd37132 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd37132 : null;
                if (c4181x2248e1a32 != null) {
                    float m170584x8dafa565 = uVar.m170584x8dafa565();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a32.D();
                    if (D2 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.G0(c4181x2248e1a32, m170584x8dafa565, D2);
                    }
                }
            }
        }
        rv0.n1 n1Var = hVar.f512867b;
        n1Var.p7().c7();
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = hVar.f512866a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        q76.r7(string, null);
        uVar.D = false;
        uVar.e(true, true);
    }
}
