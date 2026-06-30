package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class k1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f293427d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f293428e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f293429f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f293430g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f293431h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.RadioButton f293432i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f293433m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f293434n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f293435o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f293436p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f293437q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f293438r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f293439s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.Button f293440t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f293441u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f293442v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f293443w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 f293444x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 l1Var, android.view.View view) {
        super(view);
        this.f293444x = l1Var;
        this.f293430g = null;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.nei);
        this.f293441u = findViewById;
        if (findViewById != null) {
            return;
        }
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f293427d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f293429f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f293434n = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f293435o = view.findViewById(com.p314xaae8f345.mm.R.id.k_2);
        this.f293436p = view.findViewById(com.p314xaae8f345.mm.R.id.lqe);
        this.f293437q = view.findViewById(com.p314xaae8f345.mm.R.id.s8z);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.v2q);
        this.f293439s = findViewById2;
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.v2c);
        this.f293440t = button;
        this.f293442v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.sks);
        boolean z17 = l1Var.f293451h.B1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = l1Var.f293451h;
        if (z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566821h62);
            this.f293431h = imageView;
            this.f293443w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nrk);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 l1Var2 = k0Var.f293421x1;
            if (l1Var2 != null && l1Var2.mo1894x7e414b06() > 0) {
                imageView.setLongClickable(true);
                imageView.setOnLongClickListener(this);
                imageView.setOnClickListener(this);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(this);
                }
                if (button != null) {
                    button.setOnClickListener(this);
                }
            }
            this.f293430g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566820h61);
            this.f293438r = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566822u34);
        }
        if (k0Var.f293426z1) {
            this.f293432i = (android.widget.RadioButton) view.findViewById(com.p314xaae8f345.mm.R.id.lhs);
        }
        if (k0Var.f293426z1 || k0Var.A1) {
            this.f293428e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            this.f293433m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f293444x.f293448e;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, view, m8188xa86cd69f(), m8188xa86cd69f());
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f293444x.f293449f;
        if (onItemLongClickListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        onItemLongClickListener.onItemLongClick(null, view, m8188xa86cd69f(), m8188xa86cd69f());
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
