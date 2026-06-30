package qq;

/* loaded from: classes8.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447389a;

    public a(android.content.Context context) {
        this.f447389a = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f470023h = "mock_" + java.lang.System.currentTimeMillis();
            vs2Var.f470036x = "tipsUuid_Card.Entrance.Right_11_" + java.lang.System.nanoTime();
            vs2Var.f470024i = 1800;
            java.util.LinkedList linkedList = vs2Var.f470022g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f455424h = 1;
            f03Var.f455425i = "Card.Entrance.Right";
            f03Var.f455420d = 999;
            r45.ya0 ya0Var = new r45.ya0();
            f03Var.B = ya0Var;
            f03Var.f455427n = 1;
            try {
                boolean has = new org.json.JSONObject(str).has("nodes");
                qq.b bVar = qq.b.f447390a;
                if (has) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    ya0Var.f472451d = qq.b.b(bVar, str);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    ya0Var.f472451d = qq.b.a(bVar, str);
                }
            } catch (java.lang.Exception e17) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this.f447389a);
                e4Var.f293309c = e17.getMessage();
                e4Var.c();
            }
            linkedList.add(f03Var);
            vs2Var.f470020e = 700006;
            vs2Var.f470038z = 11;
            zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "RedDotMock", null, false, null, 28, null);
        }
    }
}
