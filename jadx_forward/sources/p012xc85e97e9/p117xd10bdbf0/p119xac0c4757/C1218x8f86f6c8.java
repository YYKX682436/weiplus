package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0013\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "primaryActivityStack", "Landroidx/window/embedding/ActivityStack;", "secondaryActivityStack", "splitRatio", "", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;F)V", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "getSecondaryActivityStack", "getSplitRatio", "()F", "contains", "", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitInfo */
/* loaded from: classes11.dex */
public final class C1218x8f86f6c8 {
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 primaryActivityStack;
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 secondaryActivityStack;
    private final float splitRatio;

    public C1218x8f86f6c8(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 primaryActivityStack, p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 secondaryActivityStack, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(primaryActivityStack, "primaryActivityStack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f17;
    }

    /* renamed from: contains */
    public final boolean m8474xde2d761f(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return this.primaryActivityStack.m8400xde2d761f(activity) || this.secondaryActivityStack.m8400xde2d761f(activity);
    }

    /* renamed from: equals */
    public boolean m8475xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1218x8f86f6c8)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1218x8f86f6c8 c1218x8f86f6c8 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1218x8f86f6c8) other;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.primaryActivityStack, c1218x8f86f6c8.primaryActivityStack) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.secondaryActivityStack, c1218x8f86f6c8.secondaryActivityStack)) {
            return (this.splitRatio > c1218x8f86f6c8.splitRatio ? 1 : (this.splitRatio == c1218x8f86f6c8.splitRatio ? 0 : -1)) == 0;
        }
        return false;
    }

    public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    /* renamed from: hashCode */
    public int m8479x8cdac1b() {
        return (((this.primaryActivityStack.m8403x8cdac1b() * 31) + this.secondaryActivityStack.m8403x8cdac1b()) * 31) + java.lang.Float.hashCode(this.splitRatio);
    }

    /* renamed from: toString */
    public java.lang.String m8480x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SplitInfo:{");
        sb6.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb6.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb6.append("splitRatio=" + getSplitRatio() + '}');
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }
}
