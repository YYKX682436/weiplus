package pf4;

/* loaded from: classes4.dex */
public final class v extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf4.w f435432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435433b;

    public v(pf4.w wVar, java.util.List list) {
        this.f435432a = wVar;
        this.f435433b = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        pf4.w wVar = this.f435432a;
        boolean z17 = ((gf4.a) wVar.f435434d.get(i17)).f352868f;
        java.util.List list = this.f435433b;
        return z17 == ((gf4.a) list.get(i18)).f352868f && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((gf4.a) wVar.f435434d.get(i17)).f352864b, ((gf4.a) list.get(i18)).f352864b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        pf4.w wVar = this.f435432a;
        long j17 = ((gf4.a) wVar.f435434d.get(i17)).f352866d;
        java.util.List list = this.f435433b;
        return j17 == ((gf4.a) list.get(i18)).f352866d && ((gf4.a) wVar.f435434d.get(i17)).f352867e == ((gf4.a) list.get(i18)).f352867e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f435433b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f435432a.f435434d.size();
    }
}
