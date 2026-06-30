package w35;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w35.q f524274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f524275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w f524276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524277d;

    public m(w35.q qVar, android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar, java.lang.String str) {
        this.f524274a = qVar;
        this.f524275b = context;
        this.f524276c = wVar;
        this.f524277d = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Intent b17;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        if (z17) {
            w35.q qVar = this.f524274a;
            android.content.Context context = this.f524275b;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info = this.f524276c;
            java.lang.String packageName = this.f524277d;
            qVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = info.f272547d;
            if (xVar == null || (b17 = xVar.f272569o) == null) {
                b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.b(context, qVar.f524258c, qVar.f524259d, qVar.f524256a.f270843c);
            }
            android.content.Intent intent2 = b17;
            if (qVar.f524294f) {
                intent2.setPackage(packageName);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f524293e, "try open file: " + qVar.f524259d + ", " + qVar.f524258c + ", by: " + packageName);
                if (!qVar.c(context, intent2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(qVar.f524293e, "open file failed, action: " + intent2.getAction() + ", filePath: " + qVar.f524259d);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar2 = info.f272547d;
                    if (xVar2 != null && (intent = xVar2.f272570p) != null) {
                        intent.setPackage(packageName);
                        qVar.c(context, intent);
                    }
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a.a(packageName, qVar.f524258c);
                w35.a aVar = qVar.f524257b;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
                }
            } else {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293313g = 2;
                e4Var.f293311e = false;
                ((ku5.t0) ku5.t0.f394148d).g(new w35.p(qVar, intent2, packageName, context, e4Var.c(), info));
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = this.f524274a.f524256a.f270852l;
            if (p3Var == null || (k0Var = p3Var.f270939c) == null) {
                return;
            }
            ((kb0.f) k0Var).a(true, this.f524276c);
        }
    }
}
