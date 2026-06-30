package lz2;

/* loaded from: classes9.dex */
public class m implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lz2.n f403875a;

    public m(lz2.n nVar) {
        this.f403875a = nVar;
    }

    @Override // lz2.a
    /* renamed from: onAuthCancel */
    public void mo11325x21a77981() {
        this.f403875a.h();
    }

    @Override // lz2.a
    /* renamed from: onAuthFail */
    public void mo11326xfa7237e5(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403875a.f403879d;
        activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v));
    }

    @Override // lz2.a
    /* renamed from: onAuthSuccess */
    public void mo11327x833155dc(int i17, int i18) {
        lz2.n nVar = this.f403875a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = nVar.f403879d;
        activityC15521xdb435b6d.f218518h = "cgiFail";
        activityC15521xdb435b6d.m83137x918cb44a();
        nVar.f403877b.b(new lz2.l(nVar), java.lang.String.valueOf(i17), nVar.c() == 1 ? 2 : 1);
    }
}
