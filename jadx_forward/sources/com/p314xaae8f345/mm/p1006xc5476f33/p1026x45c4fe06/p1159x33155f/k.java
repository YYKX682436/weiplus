package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f167506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167507e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.n nVar, r45.fe0 fe0Var, android.content.Context context) {
        this.f167506d = fe0Var;
        this.f167507e = context;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.util.LinkedList linkedList = this.f167506d.f455784e;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        android.content.Context context = this.f167507e;
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17) && f17.equalsIgnoreCase("en");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_DeveloperService", "curLang:%s", f17);
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.o06 o06Var = (r45.o06) it.next();
            java.lang.String str = z17 ? o06Var.f463337h : o06Var.f463335f;
            if (o06Var.f463333d == 2) {
                g4Var.f(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571619ki) : str);
            } else {
                g4Var.f(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str);
            }
            r45.t06 t06Var = o06Var.f463336g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_DeveloperService", "service_name：%s, itemAppId:%s, miniProgramType:%d", str, t06Var != null ? t06Var.f467583d : "", java.lang.Integer.valueOf(t06Var != null ? t06Var.f467585f : 0));
            i17++;
        }
    }
}
