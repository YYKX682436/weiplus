package az0;

/* loaded from: classes5.dex */
public final class yb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16090a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.MJTemplateBuildResult f16091b;

    public yb(boolean z17, com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        mJTemplateBuildResult = (i17 & 2) != 0 ? null : mJTemplateBuildResult;
        this.f16090a = z17;
        this.f16091b = mJTemplateBuildResult;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0.yb)) {
            return false;
        }
        az0.yb ybVar = (az0.yb) obj;
        return this.f16090a == ybVar.f16090a && kotlin.jvm.internal.o.b(this.f16091b, ybVar.f16091b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f16090a) * 31;
        com.tencent.maas.model.MJTemplateBuildResult mJTemplateBuildResult = this.f16091b;
        return hashCode + (mJTemplateBuildResult == null ? 0 : mJTemplateBuildResult.hashCode());
    }

    public java.lang.String toString() {
        return "TemplateBuildResultWrapper(isCompleteSuccess=" + this.f16090a + ", mjBuildResult=" + this.f16091b + ')';
    }
}
