package yw3;

/* loaded from: classes.dex */
public final class v implements j45.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548438a;

    public v(java.lang.String str) {
        this.f548438a = str;
    }

    @Override // j45.j
    public final boolean a(android.content.Context context, android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        android.content.ComponentName component;
        java.lang.String className;
        return (intent == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null || !r26.n0.B(className, this.f548438a, false)) ? false : true;
    }
}
