package no2;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f420279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.Exception exc) {
        super(0);
        this.f420279d = exc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String message = this.f420279d.getMessage();
        return message == null ? "" : message;
    }
}
