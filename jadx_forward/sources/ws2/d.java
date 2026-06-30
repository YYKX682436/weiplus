package ws2;

/* loaded from: classes3.dex */
public final class d implements zs2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws2.h f530555b;

    public d(ws2.k1 k1Var, ws2.h hVar) {
        this.f530554a = k1Var;
        this.f530555b = hVar;
    }

    public void a(r45.r71 r71Var) {
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        r45.i72 i72Var;
        jz5.f0 f0Var = null;
        r0 = null;
        r45.o52 o52Var = null;
        if (r71Var != null) {
            ws2.k1 k1Var = this.f530554a;
            ws2.b0 b0Var = (ws2.b0) k1Var.e(ws2.b0.class);
            if (b0Var != null) {
                we2.c cVar = new we2.c();
                cVar.f526751a = cVar.f526751a;
                cVar.f526752b = cVar.f526752b;
                cVar.f526753c = new we2.b(r71Var, 0, 2, null);
                mm2.e1 e1Var = (mm2.e1) k1Var.e(mm2.e1.class);
                cVar.f526754d = e1Var != null ? e1Var.f410528y : null;
                b0Var.P6(cVar);
            }
            java.lang.String str = this.f530555b.f530577b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMsg,cur liveId:");
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            sb6.append(jVar != null ? java.lang.Long.valueOf(jVar.O6()) : null);
            sb6.append(",uv:");
            mm2.e1 e1Var2 = (mm2.e1) k1Var.e(mm2.e1.class);
            sb6.append((e1Var2 == null || (nw1Var2 = e1Var2.f410521r) == null || (i72Var = (r45.i72) nw1Var2.m75936x14adae67(44)) == null) ? null : java.lang.Long.valueOf(i72Var.m75942xfb822ef2(1)));
            sb6.append(",liveCharge:");
            cm2.a aVar = cm2.a.f124861a;
            mm2.e1 e1Var3 = (mm2.e1) k1Var.e(mm2.e1.class);
            if (e1Var3 != null && (nw1Var = e1Var3.f410521r) != null) {
                o52Var = (r45.o52) nw1Var.m75936x14adae67(28);
            }
            sb6.append(aVar.l(o52Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            no0.h.f420253a.a();
        }
    }
}
