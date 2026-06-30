package qd1;

/* loaded from: classes7.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b f443189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 f443190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.j f443191f;

    public k(qd1.j jVar, fl1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var) {
        this.f443191f = jVar;
        this.f443189d = bVar;
        this.f443190e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.TRUE);
        hashMap.put("cancel", java.lang.Boolean.FALSE);
        qd1.j jVar = this.f443191f;
        if (jVar.f443178i) {
            hashMap.put("content", this.f443189d.h());
        }
        this.f443190e.f173281b.remove(jVar.f443180n);
        jVar.f443173d.a(jVar.f443181o, jVar.f443187u.p("ok", hashMap));
    }
}
