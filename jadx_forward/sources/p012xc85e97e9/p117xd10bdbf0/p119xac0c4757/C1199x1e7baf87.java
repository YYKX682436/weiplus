package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.ActivityFilter */
/* loaded from: classes11.dex */
public final class C1199x1e7baf87 {
    private final android.content.ComponentName componentName;
    private final java.lang.String intentAction;

    public C1199x1e7baf87(android.content.ComponentName componentName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        java.lang.String packageName = componentName.getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "componentName.packageName");
        java.lang.String className = componentName.getClassName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "componentName.className");
        boolean z17 = true;
        if (!(packageName.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!r26.n0.B(packageName, "*", false) || r26.n0.L(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (r26.n0.B(className, "*", false) && r26.n0.L(className, "*", 0, false, 6, null) != className.length() - 1) {
            z17 = false;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    /* renamed from: equals */
    public boolean m8388xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87 c1199x1e7baf87 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.componentName, c1199x1e7baf87.componentName) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.intentAction, c1199x1e7baf87.intentAction);
    }

    public final android.content.ComponentName getComponentName() {
        return this.componentName;
    }

    public final java.lang.String getIntentAction() {
        return this.intentAction;
    }

    /* renamed from: hashCode */
    public int m8391x8cdac1b() {
        int hashCode = this.componentName.hashCode() * 31;
        java.lang.String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: matchesActivity */
    public final boolean m8392xfe4dfd62(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1216x9c90dabf.f3825x4fbc8495.m8455xba7be167(activity, this.componentName)) {
            java.lang.String str = this.intentAction;
            if (str != null) {
                android.content.Intent intent = activity.getIntent();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: matchesIntent */
    public final boolean m8393xe607b9af(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1216x9c90dabf.f3825x4fbc8495.m8456xc740c255(intent.getComponent(), this.componentName)) {
            return false;
        }
        java.lang.String str = this.intentAction;
        return str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, intent.getAction());
    }

    /* renamed from: toString */
    public java.lang.String m8394x9616526c() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((java.lang.Object) this.intentAction) + ')';
    }
}
