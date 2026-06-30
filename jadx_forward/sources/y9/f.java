package y9;

/* loaded from: classes14.dex */
public class f extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.i f541778e;

    public f(y9.i iVar) {
        this.f541778e = iVar;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        boolean z17 = this.f541778e.f541781g;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f424175a;
        if (!z17) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            lVar.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // n3.c
    /* renamed from: performAccessibilityAction */
    public boolean mo7240xcdbe3403(android.view.View view, int i17, android.os.Bundle bundle) {
        if (i17 == 1048576) {
            y9.i iVar = this.f541778e;
            if (iVar.f541781g) {
                iVar.cancel();
                return true;
            }
        }
        return super.mo7240xcdbe3403(view, i17, bundle);
    }
}
