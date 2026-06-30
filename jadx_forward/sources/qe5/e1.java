package qe5;

/* loaded from: classes12.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443623d;

    public e1(qe5.n1 n1Var) {
        this.f443623d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initFileDownloadBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qe5.n1 n1Var = this.f443623d;
        j75.f Q6 = n1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.i(false));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = n1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        qe5.z zVar = (qe5.z) pf5.z.f435481a.a(activity).a(qe5.z.class);
        qe5.d1 d1Var = new qe5.d1(n1Var);
        zVar.getClass();
        kd5.e V6 = zVar.V6();
        java.lang.String str = V6 != null ? V6.f388425w : null;
        if (str != null ? r26.n0.B(str, ".apk", false) : false) {
            z17 = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(zVar.m80379x76847179(), 1, 2, false);
            z2Var.m(zVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), zVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571325bt));
            z2Var.o(0);
            com.p314xaae8f345.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(zVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            qe5.w wVar = new qe5.w(z2Var);
            qe5.x xVar = new qe5.x(d1Var, z2Var);
            z2Var.D = wVar;
            z2Var.E = xVar;
            z2Var.q(zVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.dt9));
            android.widget.TextView textView = new android.widget.TextView(zVar.m80379x76847179());
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.dt8);
            textView.setTextColor(zVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
        } else {
            z17 = false;
        }
        if (!z17) {
            j75.f Q62 = n1Var.Q6();
            if (Q62 != null) {
                Q62.B3(new kd5.y());
            }
            j75.f Q63 = n1Var.Q6();
            if (Q63 != null) {
                kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291258m);
                nVar.f388437c = false;
                nVar.f388438d = com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291220h;
                Q63.B3(nVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$initFileDownloadBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
