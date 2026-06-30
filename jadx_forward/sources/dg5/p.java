package dg5;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dg5.u f313925f;

    public p(dg5.u uVar, java.lang.String str, android.content.Context context) {
        this.f313925f = uVar;
        this.f313923d = str;
        this.f313924e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        er3.f fVar = new er3.f(this.f313923d, true);
        com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
        dg5.u uVar = this.f313925f;
        e17.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.q0.f34310x366c91de, uVar);
        c01.d9.e().g(fVar);
        android.content.Context context = this.f313924e;
        uVar.f313936f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f313924e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dg5.o(this, fVar));
    }
}
