package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/ActivityStack;", "", "activities", "", "Landroid/app/Activity;", "isEmpty", "", "(Ljava/util/List;Z)V", "getActivities$window_release", "()Ljava/util/List;", "contains", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.ActivityStack */
/* loaded from: classes11.dex */
public final class C1201xf133a099 {
    private final java.util.List<android.app.Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public C1201xf133a099(java.util.List<? extends android.app.Activity> activities, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activities, "activities");
        this.activities = activities;
        this.isEmpty = z17;
    }

    /* renamed from: contains */
    public final boolean m8400xde2d761f(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return this.activities.contains(activity);
    }

    /* renamed from: equals */
    public boolean m8401xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099)) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099 c1201xf133a099 = (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1201xf133a099) other;
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.activities, c1201xf133a099.activities) || this.isEmpty == c1201xf133a099.isEmpty) ? false : true;
    }

    /* renamed from: getActivities$window_release */
    public final java.util.List<android.app.Activity> m8402x81cc1599() {
        return this.activities;
    }

    /* renamed from: hashCode */
    public int m8403x8cdac1b() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* renamed from: toString */
    public java.lang.String m8405x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ActivityStack{");
        sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("activities=", m8402x81cc1599()));
        sb6.append("isEmpty=" + this.isEmpty + '}');
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }

    public /* synthetic */ C1201xf133a099(java.util.List list, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, (i17 & 2) != 0 ? false : z17);
    }
}
