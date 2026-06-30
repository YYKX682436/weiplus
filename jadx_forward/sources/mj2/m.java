package mj2;

/* loaded from: classes10.dex */
public class m extends mj2.j {

    /* renamed from: y, reason: collision with root package name */
    public final nj2.z f408572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, nj2.z parentPanel, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        super(context, liveData, root, pluginAbility, micUserInterface, dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentPanel, "parentPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f408572y = parentPanel;
    }

    @Override // mj2.j, mj2.e
    public mi2.h j() {
        return new mi2.h(this.f408546d, this.f408549g, new mj2.l(this));
    }

    @Override // mj2.e
    public void m() {
        this.f408572y.a();
    }
}
