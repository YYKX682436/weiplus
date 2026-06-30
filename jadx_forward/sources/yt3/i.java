package yt3;

/* loaded from: classes5.dex */
public final class i extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f547019f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f547020g;

    /* renamed from: h, reason: collision with root package name */
    public hk0.u0 f547021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup parent, android.widget.ImageView view, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547019f = view;
        this.f547020g = jz5.h.b(new yt3.f(parent));
        view.setOnClickListener(this);
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
    }

    public final yv3.a A() {
        return (yv3.a) ((jz5.n) this.f547020g).mo141623x754a37bb();
    }

    public final void B() {
        if (!(A().f547741e != null)) {
            A().f547741e = new yt3.g(this);
            yv3.a A = A();
            yt3.h hVar = new yt3.h(this);
            A.getClass();
            qk.v9 d17 = qk.w9.d();
            d17.f445884a = hVar;
            A.f492925c.mo75328x6c4ebec7(d17);
            dw3.f0 f0Var = dw3.f0.f325739a;
            yv3.a panel = A();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dw3.f0.f325741c, "add panel  " + panel);
            dw3.f0.f325740b.add(panel);
        }
        A().b(true);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (!(A().f492924b.getVisibility() == 0)) {
            return false;
        }
        A().b(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        B();
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_EMOJI_COUNT_INT", 0, 2, null);
        iVar.b(4);
        iVar.d(6);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        A().f492925c.a();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547019f.setVisibility(i17);
    }

    public final void z() {
        yv3.a A = A();
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 abstractC4989x9e6071f3 = A.f492925c;
        abstractC4989x9e6071f3.mo75357x9d98e686("");
        abstractC4989x9e6071f3.mo75349x4a374107(true);
        abstractC4989x9e6071f3.mo75336x2f0ae025(true);
        abstractC4989x9e6071f3.mo75343xf6f3b4d2(A.f547740d);
    }
}
