package vq;

/* loaded from: classes4.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final vq.w f520763d = new vq.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f21.e eVar = (f21.e) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(eVar.f340405e);
        sb6.append(": \n");
        sb6.append(eVar.f340408h);
        sb6.append(" - ");
        sb6.append(eVar.f340409i);
        sb6.append("\n ");
        java.util.LinkedList keyWords = eVar.f340404d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyWords, "keyWords");
        sb6.append(kz5.n0.g0(keyWords, "\n", null, null, 0, null, vq.v.f520761d, 30, null));
        sb6.append("\n---");
        return sb6.toString();
    }
}
