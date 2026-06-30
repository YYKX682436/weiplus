package ef0;

/* loaded from: classes2.dex */
public final class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.f2 f333879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.aa f333880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qk.ba f333881c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g80 f333882d;

    public w1(ef0.f2 f2Var, qk.aa aaVar, qk.ba baVar, bw5.g80 g80Var) {
        this.f333879a = f2Var;
        this.f333880b = aaVar;
        this.f333881c = baVar;
        this.f333882d = g80Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        bw5.i80 i80Var;
        qk.t9 t9Var;
        byte[] bArr;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        str = "";
        if (fVar == null || (t9Var = (qk.t9) fVar.f152151d) == null || (bArr = t9Var.f445871d) == null) {
            i80Var = null;
        } else {
            i80Var = new bw5.i80();
            i80Var.mo11468x92b714fd(bArr);
            str = i80Var.f110033g[4] ? i80Var.f110032f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBgmListenId(...)");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommonService", "likeMusic callback, errType:" + fVar.f152148a + ", errCode:" + fVar.f152149b + " listenId:" + str);
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        bw5.g80 g80Var = this.f333882d;
        qk.ba baVar = this.f333881c;
        if (i17 == 0 && fVar.f152149b == 0) {
            this.f333879a.getClass();
            qk.aa aaVar = this.f333880b;
            if (aaVar.f445547c) {
                d75.b.g(new ef0.e2(aaVar));
            }
            if (baVar == null) {
                return null;
            }
            baVar.a(str, g80Var, true, i80Var);
        } else {
            if (baVar == null) {
                return null;
            }
            baVar.a(str, g80Var, false, i80Var);
        }
        return f0Var;
    }
}
