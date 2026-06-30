package te2;

/* loaded from: classes7.dex */
public final class oc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499817a;

    public oc(yz5.l lVar) {
        this.f499817a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        yz5.l lVar = this.f499817a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(num != null && num.intValue() == 0));
        }
    }
}
