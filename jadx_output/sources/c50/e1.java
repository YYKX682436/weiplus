package c50;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38597a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38598b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38600d;

    public e1(int i17, long j17, float f17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        f17 = (i19 & 4) != 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn) : f17;
        i18 = (i19 & 8) != 0 ? -1 : i18;
        this.f38597a = i17;
        this.f38598b = j17;
        this.f38599c = f17;
        this.f38600d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50.e1)) {
            return false;
        }
        c50.e1 e1Var = (c50.e1) obj;
        return this.f38597a == e1Var.f38597a && this.f38598b == e1Var.f38598b && java.lang.Float.compare(this.f38599c, e1Var.f38599c) == 0 && this.f38600d == e1Var.f38600d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f38597a) * 31) + java.lang.Long.hashCode(this.f38598b)) * 31) + java.lang.Float.hashCode(this.f38599c)) * 31) + java.lang.Integer.hashCode(this.f38600d);
    }

    public java.lang.String toString() {
        return "LiveFluentAnimConfig(bgColor=" + this.f38597a + ", duration=" + this.f38598b + ", clipCanvasRadius=" + this.f38599c + ", frameBgColor=" + this.f38600d + ')';
    }
}
