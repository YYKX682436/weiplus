package kz5;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz5.j f395509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kz5.j jVar) {
        super(1);
        this.f395509d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        kz5.j jVar = this.f395509d;
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object key = it.getKey();
        sb6.append(key == jVar ? "(this Map)" : java.lang.String.valueOf(key));
        sb6.append('=');
        java.lang.Object value = it.getValue();
        sb6.append(value != jVar ? java.lang.String.valueOf(value) : "(this Map)");
        return sb6.toString();
    }
}
