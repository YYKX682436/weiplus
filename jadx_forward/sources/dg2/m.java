package dg2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f313839a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f313840b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f313841c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f313842d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f313843e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f313844f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f313845g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f313846h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f313847i;

    public m(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f313839a = context;
        this.f313840b = new java.util.LinkedList();
        this.f313841c = "";
        this.f313842d = "";
        this.f313847i = jz5.h.b(new dg2.g(this));
    }

    public final dg2.e a() {
        return (dg2.e) ((jz5.n) this.f313847i).mo141623x754a37bb();
    }

    public final void b(java.util.LinkedList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.LinkedList linkedList = this.f313840b;
        linkedList.clear();
        linkedList.addAll(list);
        dg2.e a17 = a();
        a17.getClass();
        a17.f313821d = new java.util.LinkedList(linkedList);
        a17.f313822e.clear();
        a17.m8146xced61ae5();
    }

    public final void c() {
        if (this.f313846h != null) {
            dg2.e a17 = a();
            java.util.LinkedList optionList = this.f313840b;
            a17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionList, "optionList");
            a17.f313821d = new java.util.LinkedList(optionList);
            a17.f313822e.clear();
            a17.m8146xced61ae5();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f313846h;
            if (k0Var != null) {
                k0Var.v();
                return;
            }
            return;
        }
        android.content.Context context = this.f313839a;
        this.f313846h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dgz, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(context, 12), com.p314xaae8f345.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f567126qd2);
        c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context));
        c22849x81a93d25.mo7960x6cab2c8d(a());
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f567127qd3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setText(this.f313841c);
        android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.qcy);
        android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.qcx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        textView2.setText(this.f313842d);
        a().f313825h = new dg2.h(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        textView2.setOnClickListener(new dg2.i(c0Var, this));
        findViewById.setOnClickListener(new dg2.j(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f313846h;
        if (k0Var2 != null) {
            k0Var2.f293387d = new dg2.k(this, c0Var);
        }
        if (k0Var2 != null) {
            k0Var2.f293405n = new dg2.l(this, c22646x1e9ca55);
        }
        if (k0Var2 != null) {
            k0Var2.e(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f313846h;
        if (k0Var3 != null) {
            k0Var3.v();
        }
    }
}
