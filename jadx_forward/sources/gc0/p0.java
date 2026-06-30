package gc0;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str) {
        super(0);
        this.f351769d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = gc0.y0.f351899b;
        java.lang.String str = this.f351769d;
        r45.nl5 nl5Var = (r45.nl5) hashMap.get(str);
        if (nl5Var == null) {
            nl5Var = gc0.f0.f351700a.a(str);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("view_id", "sys_msg_note_add");
        hashMap2.put("add_username", str);
        hashMap2.putAll(gc0.m1.e(nl5Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap2, 33926);
        return jz5.f0.f384359a;
    }
}
