package d92;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.r f309024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d92.r rVar) {
        super(1);
        this.f309024d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        e92.a aVar = e92.b.f331880d;
        int c17 = aVar.c(it, com.p314xaae8f345.mm.R.id.f565941e61);
        boolean a17 = aVar.a(it, com.p314xaae8f345.mm.R.id.e5w);
        java.lang.String string = this.f309024d.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpr, java.lang.Integer.valueOf(c17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return a17 ? string.concat("已赞") : string.concat("未赞");
    }
}
