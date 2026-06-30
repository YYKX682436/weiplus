package hs4;

/* loaded from: classes9.dex */
public class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f366139d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f366140e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366141f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366142g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f366143h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f366144i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hs4.c f366145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hs4.c cVar, android.view.View view, int i17) {
        super(view);
        this.f366145m = cVar;
        view.setOnClickListener(this);
        this.f366139d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f366141f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f366144i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f366140e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.lhs);
        this.f366142g = c22699x3dcdb352;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        this.f366143h = imageView;
        if (i17 == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            imageView.setLayoutParams(layoutParams);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
            c22699x3dcdb352.m82040x7541828(cVar.f366148f.f366150b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f366145m.f366146d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, view, m8188xa86cd69f(), m8188xa86cd69f());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
