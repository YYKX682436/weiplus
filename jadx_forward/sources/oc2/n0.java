package oc2;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f425767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str, java.lang.String str2, java.lang.Throwable th6, java.lang.String str3) {
        super(0);
        this.f425765d = str;
        this.f425766e = str2;
        this.f425767f = th6;
        this.f425768g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return this.f425765d + '-' + this.f425766e + '-' + this.f425767f.getMessage() + "-\n" + this.f425768g;
    }
}
