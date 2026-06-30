package c50;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38620a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f38621b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.jb f38622c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38623d;

    public v0(int i17, android.view.View view, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.lang.String finderContextId) {
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        this.f38620a = i17;
        this.f38621b = view;
        this.f38622c = jbVar;
        this.f38623d = finderContextId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50.v0)) {
            return false;
        }
        c50.v0 v0Var = (c50.v0) obj;
        return this.f38620a == v0Var.f38620a && kotlin.jvm.internal.o.b(this.f38621b, v0Var.f38621b) && kotlin.jvm.internal.o.b(this.f38622c, v0Var.f38622c) && kotlin.jvm.internal.o.b(this.f38623d, v0Var.f38623d);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f38620a) * 31;
        android.view.View view = this.f38621b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f38622c;
        return ((hashCode2 + (jbVar != null ? jbVar.hashCode() : 0)) * 31) + this.f38623d.hashCode();
    }

    public java.lang.String toString() {
        return "Ret(errCode=" + this.f38620a + ", view=" + this.f38621b + ", ctrlInfo=" + this.f38622c + ", finderContextId=" + this.f38623d + ')';
    }

    public /* synthetic */ v0(int i17, android.view.View view, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, view, (i18 & 4) != 0 ? null : jbVar, (i18 & 8) != 0 ? "" : str);
    }
}
