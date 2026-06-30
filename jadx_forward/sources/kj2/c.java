package kj2;

/* loaded from: classes10.dex */
public final class c implements ek2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f389922b;

    public c(kj2.o oVar, int i17) {
        this.f389921a = oVar;
        this.f389922b = i17;
    }

    @Override // ek2.f
    public void a(r45.ng1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        kj2.o oVar = this.f389921a;
        java.util.ArrayList arrayList = oVar.f389962h;
        int i17 = this.f389922b;
        vi2.h hVar = (vi2.h) kz5.n0.a0(arrayList, i17);
        if (hVar != null) {
            hVar.f519083d = vi2.g.f519081f;
        }
        oVar.f389963i.m8147xed6e4d18(i17);
    }

    @Override // ek2.f
    public void b(int i17, int i18, java.lang.String str) {
        kj2.o oVar = this.f389921a;
        java.util.ArrayList arrayList = oVar.f389962h;
        int i19 = this.f389922b;
        vi2.h hVar = (vi2.h) kz5.n0.a0(arrayList, i19);
        if (hVar != null) {
            hVar.f519083d = vi2.g.f519079d;
        }
        oVar.f389963i.m8147xed6e4d18(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInviteVisitorMicWidget", "invite fail errorCode: " + i18 + " errType: " + i17 + " msg: " + str);
        if (str == null || str.length() == 0) {
            str = oVar.f389955a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dq_);
        }
        db5.t7.m(oVar.f389955a.getContext(), str);
    }
}
