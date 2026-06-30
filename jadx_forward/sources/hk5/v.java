package hk5;

/* loaded from: classes9.dex */
public final class v extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new qc5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        qc5.a cardViewModel = (qc5.a) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardViewModel, "cardViewModel");
        mi5.v vVar = new mi5.v();
        qc5.a aVar2 = vVar.f408461b;
        vVar.f408461b = cardViewModel;
        vVar.c(aVar2, cardViewModel);
        return vVar.a(m158354x19263085());
    }
}
