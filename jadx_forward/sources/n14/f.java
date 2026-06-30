package n14;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n14.g f415679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n14.g gVar) {
        super(1);
        this.f415679d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object tag = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.ojr)).getTag(com.p314xaae8f345.mm.R.id.mnv);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        n14.g gVar = this.f415679d;
        if (intValue == 1) {
            java.lang.String string = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571378dd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (intValue != 2) {
            return ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.ojw)).getText().toString();
        }
        java.lang.String string2 = gVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.boc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }
}
