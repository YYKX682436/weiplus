package ai0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5068a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f5069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5071d;

    public i(java.lang.String name, android.view.View.OnClickListener action, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 4) != 0 ? com.tencent.mm.R.color.f479308vo : i17;
        i18 = (i19 & 8) != 0 ? 33 : i18;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(action, "action");
        this.f5068a = name;
        this.f5069b = action;
        this.f5070c = i17;
        this.f5071d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0.i)) {
            return false;
        }
        ai0.i iVar = (ai0.i) obj;
        return kotlin.jvm.internal.o.b(this.f5068a, iVar.f5068a) && kotlin.jvm.internal.o.b(this.f5069b, iVar.f5069b) && this.f5070c == iVar.f5070c && this.f5071d == iVar.f5071d;
    }

    public int hashCode() {
        return (((((this.f5068a.hashCode() * 31) + this.f5069b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f5070c)) * 31) + java.lang.Integer.hashCode(this.f5071d);
    }

    public java.lang.String toString() {
        return "SpanInfo(name=" + this.f5068a + ", action=" + this.f5069b + ", textColorRes=" + this.f5070c + ", flags=" + this.f5071d + ')';
    }
}
