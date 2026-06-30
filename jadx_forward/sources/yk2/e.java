package yk2;

/* loaded from: classes3.dex */
public final class e extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f544317f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f544318g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f544319h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f544320i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f544321m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f544321m = "";
    }

    @Override // yk2.g
    public int c() {
        android.view.ViewGroup viewGroup = this.f544324d;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tl9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f544318g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tl8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f544319h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tl_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f544320i = (android.widget.TextView) findViewById3;
        if (!this.f544317f) {
            this.f544317f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String b17 = b();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(b17, "", b52.b.b(), "person_page_message", f());
        }
        java.lang.Object context = viewGroup.getContext();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveMentionsPersonalItem", "registerRedDot: lifecycleOwner is null");
            return 0;
        }
        ll2.e eVar = ll2.e.f400666a;
        eVar.k(yVar, "LiveMentionLeft", new yk2.c(this));
        eVar.k(yVar, "LiveMentionRight", new yk2.d(this));
        return 0;
    }

    @Override // yk2.g
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_message", f());
        ll2.a aVar = ll2.a.f400658f;
        e("LiveMentionLeft", aVar);
        e("LiveMentionRight", aVar);
        ll2.e eVar = ll2.e.f400666a;
        ll2.e.d(eVar, "LiveMentionLeft", false, false, 6, null);
        ll2.e.d(eVar, "LiveMentionRight", false, false, 6, null);
        android.content.Intent intent = new android.content.Intent();
        android.view.ViewGroup viewGroup = this.f544324d;
        android.content.Intent intent2 = !(viewGroup.getContext() instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(viewGroup.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f.class);
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/personal/LiveMentionsPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/personal/LiveMentionsPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void e(java.lang.String str, ll2.a aVar) {
        ll2.e eVar = ll2.e.f400666a;
        ll2.b[] bVarArr = ll2.b.f400661d;
        this.f544321m = eVar.n(java.lang.String.valueOf(14), str, aVar.f400660d, this.f544321m);
    }

    public final java.lang.String f() {
        int i17;
        ll2.e eVar = ll2.e.f400666a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) eVar.g("LiveMentionLeft").mo3195x754a37bb();
        r45.f03 f03Var = aVar != null ? aVar.f186861b : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) eVar.g("LiveMentionRight").mo3195x754a37bb();
        r45.f03 f03Var2 = aVar2 != null ? aVar2.f186861b : null;
        if (f03Var == null || f03Var.f455420d != 2 || (i17 = f03Var.f455421e) <= 0) {
            i17 = f03Var2 != null ? 1 : 0;
        }
        cl0.g gVar = new cl0.g();
        gVar.o("red_count", i17);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }
}
