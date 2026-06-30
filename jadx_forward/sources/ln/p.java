package ln;

/* loaded from: classes11.dex */
public class p implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ln.q f401167c;

    public p(ln.q qVar, java.lang.String str, java.lang.String str2) {
        this.f401167c = qVar;
        this.f401165a = str;
        this.f401166b = str2;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "getContactCallBack username:%s succ:%s", objArr);
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            java.lang.String str2 = this.f401165a;
            this.f401167c.b(a17.z0(str2), str2, this.f401166b);
        }
    }
}
