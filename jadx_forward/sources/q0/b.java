package q0;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f440751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.Collection collection) {
        super(1);
        this.f440751d = collection;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f440751d.contains(obj));
    }
}
