package d92;

/* loaded from: classes.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.p1 f309025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(d92.p1 p1Var) {
        super(1);
        this.f309025d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        java.lang.CharSequence d17 = aVar.d(it, com.p314xaae8f345.mm.R.id.e7k);
        java.lang.CharSequence d18 = aVar.d(it, com.p314xaae8f345.mm.R.id.e5k);
        java.lang.CharSequence d19 = aVar.d(it, com.p314xaae8f345.mm.R.id.f565941e61);
        java.lang.String string = this.f309025d.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ezx, d17, d18, aVar.d(it, com.p314xaae8f345.mm.R.id.e7b), d19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
