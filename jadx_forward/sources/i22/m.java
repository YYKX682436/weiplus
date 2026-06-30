package i22;

/* loaded from: classes15.dex */
public abstract class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final i22.o0 f369535d;

    /* renamed from: e, reason: collision with root package name */
    public i22.n0 f369536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View itemView, i22.o0 o0Var) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f369535d = o0Var;
        itemView.setOnClickListener(new i22.l(this));
    }

    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        this.f369536e = item;
    }
}
