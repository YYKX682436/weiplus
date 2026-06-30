package ju3;

/* loaded from: classes10.dex */
public final class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b f383477d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b abstractC17023x788598b) {
        this.f383477d = abstractC17023x788598b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b abstractC17023x788598b = this.f383477d;
        abstractC17023x788598b.m68022x9562f79f(true);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = abstractC17023x788598b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        j35.u.g((android.app.Activity) context);
    }
}
