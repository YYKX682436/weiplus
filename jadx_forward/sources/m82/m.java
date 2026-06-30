package m82;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m82.o f406247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(m82.o oVar) {
        super(1);
        this.f406247d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.getTag(com.p314xaae8f345.mm.R.id.nwr), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78355x20db789a))) {
            return "";
        }
        boolean equals = "1".equals(it.getTag(com.p314xaae8f345.mm.R.id.nwn));
        m82.o oVar = this.f406247d;
        java.lang.String string = equals ? oVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_t) : oVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }
}
