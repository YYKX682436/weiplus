package ir1;

/* loaded from: classes3.dex */
public final class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f375482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f375483e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f375484f;

    public d(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f375482d = context;
        this.f375483e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f375483e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f375483e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (r45.d04) obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.app.Activity activity = this.f375482d;
        if (view == null) {
            view = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.dzg, null);
            view.setTag(new ir1.a());
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListAdapter.ContactViewHolder");
        ir1.a aVar = (ir1.a) tag;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        aVar.f375461a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        aVar.f375462b = (android.widget.TextView) findViewById2;
        java.lang.Object obj = this.f375483e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.d04 d04Var = (r45.d04) obj;
        if (d04Var.f453512d.f454425f == 1) {
            n11.a b17 = n11.a.b();
            java.lang.String str = d04Var.f453512d.f454423d;
            android.widget.ImageView imageView = aVar.f375461a;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            o11.f fVar = new o11.f();
            fVar.f423629t = true;
            b17.h(str, imageView, fVar.a());
        } else {
            n11.a b18 = n11.a.b();
            java.lang.String str2 = d04Var.f453512d.f454423d;
            android.widget.ImageView imageView2 = aVar.f375461a;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            o11.f fVar2 = new o11.f();
            fVar2.f423629t = false;
            b18.h(str2, imageView2, fVar2.a());
        }
        android.widget.TextView textView = aVar.f375462b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = d04Var.f453512d.f454424e;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, str3));
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f565840ds5);
        findViewById3.setOnLongClickListener(new ir1.b(this, findViewById3, i17));
        findViewById3.setOnClickListener(new ir1.c(this, findViewById3, i17));
        return view;
    }
}
