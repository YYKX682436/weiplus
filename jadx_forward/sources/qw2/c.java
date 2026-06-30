package qw2;

/* loaded from: classes10.dex */
public abstract class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.f f448649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qw2.f fVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f448649d = fVar;
        itemView.setOnClickListener(new qw2.b(this, fVar));
    }

    public void i(int i17, r45.p64 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f3639x46306858.setSelected(i17 == this.f448649d.f448655e);
    }
}
