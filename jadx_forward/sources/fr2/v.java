package fr2;

/* loaded from: classes2.dex */
public final class v implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr2.x f347291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.zz2 f347292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347293c;

    public v(fr2.x xVar, r45.zz2 zz2Var, java.lang.String str) {
        this.f347291a = xVar;
        this.f347292b = zz2Var;
        this.f347293c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        r45.zz2 zz2Var = this.f347292b;
        java.lang.String str2 = this.f347293c;
        if (z17) {
            zy2.db dbVar = (zy2.db) i95.n0.c(zy2.db.class);
            fr2.x xVar = this.f347291a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = xVar.m158354x19263085();
            android.app.Activity context = xVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            ((b92.s2) dbVar).Bi(m158354x19263085, zz2Var, nyVar != null ? nyVar.V6() : null, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "addQuickShare: bOk=" + z17 + ", username=" + str2 + ", themeId=" + zz2Var.f474016g);
    }
}
