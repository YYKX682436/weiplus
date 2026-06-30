package h73;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f361021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, long j17) {
        super(1);
        this.f361020d = str;
        this.f361021e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.os.Bundle it = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String key = this.f361020d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        it.putLong(key, this.f361021e);
        return jz5.f0.f384359a;
    }
}
