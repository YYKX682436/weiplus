package cp2;

/* loaded from: classes8.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f302449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.u1 f302450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, cp2.u1 u1Var) {
        super(0);
        this.f302449d = c14994x9b99c079;
        this.f302450e = u1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cp2.s1 s1Var = new cp2.s1(this.f302449d, this.f302450e);
        xs5.a aVar = new xs5.a(0L, null, null, null, null, null, null, 127, null);
        xs5.c.f537950b = aVar;
        s1Var.mo146xb9724478(aVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCurrentTestRedDot currentRedDotData: ");
        xs5.a aVar2 = xs5.c.f537950b;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentRedDotData");
            throw null;
        }
        sb6.append(aVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRedDotGenerate", sb6.toString());
        return jz5.f0.f384359a;
    }
}
