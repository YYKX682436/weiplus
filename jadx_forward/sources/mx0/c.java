package mx0;

/* loaded from: classes5.dex */
public final class c extends mx0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view, mx0.z controller) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        view.setOnClickListener(new mx0.b(controller));
        view.m82037xa10c26f6(false);
        b(com.p314xaae8f345.mm.R.C30861xcebc809e.ckw);
    }

    public final void b(int i17) {
        android.view.View view = this.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view).setImageResource(i17);
    }
}
