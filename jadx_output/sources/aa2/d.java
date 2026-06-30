package aa2;

/* loaded from: classes2.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f2498d;

    public d(aa2.j jVar) {
        this.f2498d = jVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.e21 e21Var;
        r45.e21 e21Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        if (g4Var.z()) {
            aa2.j jVar = this.f2498d;
            boolean p17 = jVar.p();
            r45.e21 e21Var3 = jVar.f2505d;
            java.lang.String str = null;
            java.lang.String username = (e21Var3 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var3.getCustom(1)) == null) ? null : finderContact2.getUsername();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = jVar.f434158a;
            boolean z17 = false;
            if (kotlin.jvm.internal.o.b(username, xy2.c.e(appCompatActivity))) {
                com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.class);
                r45.r03 r03Var = jVar.f2504c;
                if (!finderActivityParticipateUIC.W6((r03Var == null || (e21Var2 = (r45.e21) r03Var.getCustom(16)) == null) ? 0 : e21Var2.getInteger(12), (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? 0L : e21Var.getLong(13))) {
                    z17 = true;
                }
            }
            if (z17) {
                g4Var.l(20004, jVar.f434158a.getResources().getString(com.tencent.mm.R.string.cic), com.tencent.mm.R.raw.finder_outlined_turnoff, p17);
                return;
            }
            r45.e21 e21Var4 = jVar.f2505d;
            if (e21Var4 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var4.getCustom(1)) != null) {
                str = finderContact.getUsername();
            }
            if (kotlin.jvm.internal.o.b(str, xy2.c.e(jVar.f434158a))) {
                return;
            }
            g4Var.l(20005, jVar.f434158a.getResources().getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.R.raw.icons_outlined_report_problem, p17);
        }
    }
}
