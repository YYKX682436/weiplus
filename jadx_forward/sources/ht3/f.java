package ht3;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f366482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ht3.g gVar) {
        super(1);
        this.f366482d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.e5q);
        java.lang.CharSequence charSequence = tag instanceof java.lang.CharSequence ? (java.lang.CharSequence) tag : null;
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.String string = this.f366482d.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clq, charSequence);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
