package qd1;

/* loaded from: classes7.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 f443192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.j f443193e;

    public l(qd1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var) {
        this.f443193e = jVar;
        this.f443192d = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        dialogInterface.dismiss();
        qd1.j jVar = this.f443193e;
        this.f443192d.f173281b.remove(jVar.f443180n);
        jVar.f443173d.a(jVar.f443181o, jVar.f443187u.p("ok", hashMap));
    }
}
