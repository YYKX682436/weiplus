package q23;

/* loaded from: classes4.dex */
public final class j implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f441349a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f441350b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f441351c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f441352d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f441353e;

    public j(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egu, parent, true);
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f441349a = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ut_);
        this.f441350b = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.utg);
        this.f441351c = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82037xa10c26f6(false);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.uth);
        this.f441352d = textView;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new q23.i(this));
        }
        qk.t7 t7Var = (qk.t7) i95.n0.c(qk.t7.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewGroup2, "null cannot be cast to non-null type android.view.View");
        ((hs.z) t7Var).wi(viewGroup2);
    }

    @Override // q23.f
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f441351c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        c22699x3dcdb352.setAlpha(1.0f);
        if (i17 == 2) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80938x8c2e5e15);
        } else {
            if (i17 == 0 || i17 == 1) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78851xab463e5f);
            } else if (i17 == 3) {
                c22699x3dcdb352.setAlpha(0.3f);
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80938x8c2e5e15);
            }
        }
        android.view.ViewGroup viewGroup = this.f441350b;
        if (viewGroup != null) {
            viewGroup.setClickable(true);
        }
        boolean z17 = (i17 == 2 || i17 == 0) || i17 == 1;
        android.content.Context context = this.f441349a;
        if (z17) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (viewGroup != null) {
                viewGroup.setBackground(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.d58));
            }
            if (viewGroup != null) {
                viewGroup.setEnabled(true);
            }
        } else if (i17 == 3) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (viewGroup != null) {
                viewGroup.setBackground(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.d58));
            }
            if (viewGroup != null) {
                viewGroup.setEnabled(false);
            }
            if (viewGroup != null) {
                viewGroup.setClickable(false);
            }
        }
        boolean z18 = (i17 == 2 || i17 == 0) || i17 == 1;
        android.widget.TextView textView = this.f441352d;
        if (z18) {
            if (textView != null) {
                textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
        } else {
            if (i17 != 3 || textView == null) {
                return;
            }
            textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.abx));
        }
    }

    public void b(android.view.View.OnClickListener l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        this.f441353e = l17;
    }

    @Override // q23.f
    /* renamed from: reset */
    public void mo159458x6761d4f() {
        android.view.ViewGroup viewGroup = this.f441350b;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
