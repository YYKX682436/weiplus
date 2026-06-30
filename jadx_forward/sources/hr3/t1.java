package hr3;

/* loaded from: classes5.dex */
public final class t1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.w1 f365527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365528b;

    public t1(hr3.w1 w1Var, java.lang.String str) {
        this.f365527a = w1Var;
        this.f365528b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("view_clk", str)) {
            hashMap.put("note_sid", (java.lang.String) ((jz5.n) this.f365527a.f365663e).mo141623x754a37bb());
            java.lang.String str2 = this.f365528b;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("add_username", str2);
        }
        return hashMap;
    }
}
