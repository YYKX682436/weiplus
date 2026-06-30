package df2;

/* loaded from: classes3.dex */
public final class sl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yg2.b f312881e;

    public sl(android.view.ViewGroup viewGroup, yg2.b bVar) {
        this.f312880d = viewGroup;
        this.f312881e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f312880d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(context);
        java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        slVar.c(string);
        slVar.f201340k = -855638017;
        slVar.f201339j = -12566464;
        slVar.f201333d = viewGroup;
        slVar.f201332c = 3000L;
        slVar.f201331b.setMaxWidth(pm0.v.S(300));
        slVar.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200378e;
        slVar.f201342m = i65.a.c(viewGroup.getContext(), (viewGroup.getWidth() / 2) - 4);
        slVar.b();
        slVar.d(this.f312881e);
    }
}
