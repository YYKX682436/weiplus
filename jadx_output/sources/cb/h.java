package cb;

/* loaded from: classes13.dex */
public final /* synthetic */ class h implements com.google.firebase.components.ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.components.ComponentFactory f40126a = new cb.h();

    @Override // com.google.firebase.components.ComponentFactory
    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return new cb.a((com.google.firebase.iid.FirebaseInstanceId) componentContainer.get(com.google.firebase.iid.FirebaseInstanceId.class));
    }
}
