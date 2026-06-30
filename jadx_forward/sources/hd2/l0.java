package hd2;

/* loaded from: classes2.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362028e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3, android.content.Context context) {
        this.f362027d = c14135xb71edba3;
        this.f362028e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3 = this.f362027d;
        vb2.x xVar = c14135xb71edba3.f191587r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 finderSelfNicknameArrow = xVar.f516297j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderSelfNicknameArrow, "finderSelfNicknameArrow");
        vb2.x xVar2 = c14135xb71edba3.f191587r;
        if (xVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.TextView finderNickTv = xVar2.f516296i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderNickTv, "finderNickTv");
        int i17 = pm0.v.t(finderSelfNicknameArrow)[0] - pm0.v.t(finderNickTv)[0];
        if (c14135xb71edba3.f191587r == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        float measuredWidth = (i17 - r4.f516289b.getMeasuredWidth()) - this.f362028e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        if (c14135xb71edba3.f191587r == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (r4.f516296i.getMeasuredWidth() > measuredWidth) {
            vb2.x xVar3 = c14135xb71edba3.f191587r;
            if (xVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (xVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.TextView textView = xVar3.f516296i;
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = (int) measuredWidth;
            textView.setLayoutParams(layoutParams);
        }
    }
}
