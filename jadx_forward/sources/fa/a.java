package fa;

/* loaded from: classes14.dex */
public class a extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb f342107e;

    public a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2704x2750c0cb c2704x2750c0cb) {
        this.f342107e = c2704x2750c0cb;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f342107e.isChecked());
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        lVar.m(true);
        lVar.f424175a.setChecked(this.f342107e.isChecked());
    }
}
