package ns4;

/* loaded from: classes8.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f420957d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f420958e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f420959f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f420960g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f420961h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f420962i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ns4.d f420963m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ns4.d dVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f420963m = dVar;
        itemView.setOnClickListener(this);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568083ln3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f420959f = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        os4.h.m(textView, 24);
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568085ln5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f420960g = textView2;
        os4.h.m(textView2, 14);
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.m7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f420957d = findViewById3;
        if (dVar.f421026i.f421174f || com.p314xaae8f345.mm.ui.bk.C()) {
            findViewById3.setBackground(dVar.f421026i.f421169a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bb6, null));
        }
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.pkm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f420961h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.of_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f420958e = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d0b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f420962i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.d0m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        ((android.widget.TextView) findViewById7).setTextSize(1, 10.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f420963m.f421025h;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, v17, m8188xa86cd69f(), m8188xa86cd69f());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
