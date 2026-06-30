package qd1;

/* loaded from: classes7.dex */
public class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 f443194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.j f443195e;

    public m(qd1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var) {
        this.f443195e = jVar;
        this.f443194d = k0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        qd1.j jVar = this.f443195e;
        this.f443194d.f173281b.remove(jVar.f443180n);
        jVar.f443173d.a(jVar.f443181o, jVar.f443187u.p("ok", hashMap));
    }
}
