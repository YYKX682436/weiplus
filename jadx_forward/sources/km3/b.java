package km3;

/* loaded from: classes10.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f390771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(km3.d dVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f390771d = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.j7m);
        itemView.setOnClickListener(new km3.a(dVar, this));
    }
}
