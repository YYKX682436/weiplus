package androidx.activity;

/* loaded from: classes10.dex */
public final class j extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f9041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar, boolean z17) {
        super(z17);
        this.f9041a = lVar;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        this.f9041a.invoke(this);
    }
}
