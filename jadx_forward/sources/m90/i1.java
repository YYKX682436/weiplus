package m90;

/* loaded from: classes4.dex */
public class i1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f406408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f406409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f406411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f406412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m90.j1 j1Var, int i17, r35.m3 m3Var, android.os.Bundle bundle, java.util.Map map, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f406408e = bundle;
        this.f406409f = map;
        this.f406410g = str;
        this.f406411h = weakReference;
        this.f406412i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str = "";
        try {
            java.lang.String string = this.f406408e.getString("send_msg_username", "");
            java.lang.String str2 = (java.lang.String) this.f406409f.get(this.f406410g + ".chatname");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 != null) {
                str = str2;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
            c6803x6d9acd6d.q(string);
            c6803x6d9acd6d.f141330f = 2L;
            c6803x6d9acd6d.f141331g = 2L;
            c6803x6d9acd6d.f141334j = 1L;
            c6803x6d9acd6d.k();
            ((sg3.r) i95.n0.c(sg3.r.class)).mj(str);
            ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_jump_chat", this.f406409f, this.f406408e, this.f406411h, this.f406412i);
        } catch (java.lang.Throwable unused) {
        }
    }
}
