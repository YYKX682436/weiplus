package ze5;

/* loaded from: classes9.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f553425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.m f553426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f553428h;

    public e2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, z01.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, ot0.q qVar) {
        this.f553424d = f9Var;
        this.f553425e = dVar;
        this.f553426f = mVar;
        this.f553427g = f0Var;
        this.f553428h = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressPB(msgId:");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553424d;
        sb6.append(f9Var.m124847x74d37ac6());
        sb6.append(") click, status:");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f553425e;
        sb6.append(dVar.f68112x10a0fed7);
        sb6.append(", progressPB:");
        z01.m mVar = this.f553426f;
        sb6.append(mVar.f550639t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFileMvvm", sb6.toString());
        if (!mVar.f550639t) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ij6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f553427g;
        f0Var.f391649d = ij6;
        int i17 = f0Var.f391649d;
        ot0.q qVar = this.f553428h;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(f9Var.Q0(), f9Var.m124847x74d37ac6());
            i95.m c17 = i95.n0.c(pt.g0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pt.g0.Xb((pt.g0) c17, this.f553424d, null, 0, false, 8, null);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), n17, true);
            ze5.g2.b(f9Var, qVar.f430227p);
        } else if (i17 != 4) {
            if (dVar.f68112x10a0fed7 == 102) {
                ze5.g2.b(f9Var, qVar.f430227p);
            } else {
                ze5.g2.d(f9Var, qVar);
                if (ez.v0.f339310a.i(java.lang.Integer.valueOf(qVar.f430199i))) {
                    long I0 = f9Var.I0();
                    rt0.b bVar = (rt0.b) qVar.y(rt0.b.class);
                    if (bVar != null) {
                        long j17 = bVar.f480905b;
                        if (j17 != 0) {
                            I0 = j17;
                        }
                    }
                    ct3.d.f303836a.a(f9Var, qVar, 15, I0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
