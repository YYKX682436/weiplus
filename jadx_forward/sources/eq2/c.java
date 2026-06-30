package eq2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f337419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq2.a f337420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f337422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f337423h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f337424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, jq2.a aVar, java.lang.String str, int i18, int i19, int i27) {
        super(0);
        this.f337419d = i17;
        this.f337420e = aVar;
        this.f337421f = str;
        this.f337422g = i18;
        this.f337423h = i19;
        this.f337424i = i27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f337419d;
        jq2.a aVar = this.f337420e;
        int i18 = aVar.f382632e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g f17 = ((gq2.j) aVar.f382634g).f356097g.f();
        java.lang.String str = this.f337421f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(aVar.f382633f);
        int i19 = this.f337422g;
        r45.dd2 dd2Var = new r45.dd2();
        int i27 = this.f337423h;
        dd2Var.set(0, java.lang.Integer.valueOf(i27));
        int i28 = this.f337424i;
        if (i27 != i28 && i28 != 0) {
            java.util.LinkedList m75941xfb821914 = dd2Var.m75941xfb821914(6);
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(i28));
            m75941xfb821914.add(dd2Var2);
        }
        aq2.a aVar2 = new aq2.a(i17, i18, f17, str, linkedList, i19, 0L, null, dd2Var, 0, 0.0f, false, null, null, null, false, null, 130624, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveStreamTabPreloadManager", "#loadDataWithCgi req=" + aVar2);
        return new aq2.c(aVar2, null, null, 2, null);
    }
}
