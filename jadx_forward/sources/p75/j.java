package p75;

/* loaded from: classes4.dex */
public final class j extends p75.d {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f434199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String name, java.lang.String dataType, java.lang.String tableName, java.lang.String referTo, java.lang.String function) {
        super(name, dataType, tableName, referTo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referTo, "referTo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        this.f434199e = function;
    }

    @Override // p75.d
    public java.lang.String z() {
        return this.f434199e + '(' + super.z() + ')';
    }
}
