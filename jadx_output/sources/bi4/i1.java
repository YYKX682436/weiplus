package bi4;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f21056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21057b;

    public i1(float f17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        f17 = (i18 & 1) != 0 ? 1.0f : f17;
        i17 = (i18 & 2) != 0 ? com.tencent.mm.R.color.FG_3 : i17;
        this.f21056a = f17;
        this.f21057b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi4.i1)) {
            return false;
        }
        bi4.i1 i1Var = (bi4.i1) obj;
        return java.lang.Float.compare(this.f21056a, i1Var.f21056a) == 0 && this.f21057b == i1Var.f21057b;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f21056a) * 31) + java.lang.Integer.hashCode(this.f21057b);
    }

    public java.lang.String toString() {
        return "StatusCardDialogStrokeConfig(widthDp=" + this.f21056a + ", colorRes=" + this.f21057b + ')';
    }
}
