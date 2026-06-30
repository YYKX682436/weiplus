package androidx.fragment.app;

/* loaded from: classes14.dex */
public class c1 extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f11269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.fragment.app.FragmentManager fragmentManager, boolean z17) {
        super(z17);
        this.f11269a = fragmentManager;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        this.f11269a.handleOnBackPressed();
    }
}
