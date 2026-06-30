package wu;

/* loaded from: classes9.dex */
public final class w0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        android.widget.TextView textView;
        wu.e2 e2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) containerView.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        if (imageView == null || (textView = (android.widget.TextView) containerView.findViewById(com.p314xaae8f345.mm.R.id.obc)) == null) {
            return;
        }
        s15.h hVar = item.f366530e;
        int m75939xb282bd08 = hVar.m75939xb282bd08(hVar.f384955d + 2);
        if (m75939xb282bd08 != 34) {
            switch (m75939xb282bd08) {
                case 39:
                    break;
                case 40:
                    e2Var = new wu.e2();
                    e2Var.f531098a = wu.t0.f531160d;
                    e2Var.f531099b = wu.u0.f531165d;
                    break;
                case 41:
                    e2Var = new wu.e2();
                    e2Var.f531098a = wu.r0.f531151d;
                    e2Var.f531099b = new wu.s0(this);
                    break;
                case 42:
                    e2Var = new wu.e2();
                    e2Var.f531098a = wu.p0.f531145d;
                    e2Var.f531099b = new wu.q0(this);
                    break;
                default:
                    e2Var = new wu.e2();
                    break;
            }
            e2Var.f531098a.mo147xb9724478(item, imageView, textView);
            containerView.setOnClickListener(new wu.v0(e2Var, item));
        }
        e2Var = new wu.e2();
        e2Var.f531098a = wu.m0.f531130d;
        e2Var.f531099b = new wu.o0(this);
        e2Var.f531098a.mo147xb9724478(item, imageView, textView);
        containerView.setOnClickListener(new wu.v0(e2Var, item));
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        com.p314xaae8f345.mm.ui.id.b(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570911em0, (android.view.ViewGroup) containerView, true);
    }
}
