package z22;

/* loaded from: classes10.dex */
public abstract class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f551257d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f551258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z22.l lVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f551257d = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.da9);
        this.f551258e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.da_);
        itemView.setOnClickListener(new z22.g(this, lVar, itemView));
    }

    public abstract void i(int i17, r45.p64 p64Var);
}
