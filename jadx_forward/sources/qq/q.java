package qq;

/* loaded from: classes9.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final qq.q f447414d = new qq.q();

    public q() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.app.Dialog dialog = new android.app.Dialog(context);
        dialog.setTitle("Oracle Test");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("点我测试 Oracle");
        textView.setTextSize(18.0f);
        textView.setPadding(48, 48, 48, 48);
        textView.setBackgroundColor(-2039584);
        textView.setOnClickListener(qq.p.f447413d);
        pq.r rVar = (pq.r) i95.n0.c(pq.r.class);
        bw5.p8 p8Var = new bw5.p8();
        p8Var.f113020d = true;
        boolean[] zArr = p8Var.f113025i;
        zArr[1] = true;
        p8Var.f113021e = true;
        zArr[2] = true;
        p8Var.f113022f = true;
        zArr[3] = true;
        p8Var.f113023g = 3000L;
        zArr[4] = true;
        p8Var.f113024h = 3000L;
        zArr[5] = true;
        t20.g gVar = (t20.g) rVar;
        gVar.getClass();
        t20.i iVar = new t20.i(gVar);
        iVar.f496212e = p8Var;
        iVar.f496209b = qq.m.f447410d;
        iVar.f496210c = qq.n.f447411d;
        iVar.f496211d = new qq.o(context);
        iVar.a(textView, "ecs_test_oracle");
        frameLayout.addView(textView);
        dialog.setContentView(frameLayout);
        dialog.show();
        return jz5.f0.f384359a;
    }
}
