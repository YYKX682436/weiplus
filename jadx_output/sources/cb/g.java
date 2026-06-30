package cb;

/* loaded from: classes13.dex */
public final /* synthetic */ class g implements com.google.firebase.components.ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.components.ComponentFactory f40125a = new cb.g();

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.iid.FirebaseInstanceId((xa.b) componentContainer.get(xa.b.class));
    }
}
