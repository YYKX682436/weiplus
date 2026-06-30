package c43;

/* loaded from: classes14.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f38395a;

    /* renamed from: b, reason: collision with root package name */
    public int f38396b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f38397c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f38398d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38399e;

    public b1(int i17, int i18, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, java.lang.String str, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        jumpInfo = (i19 & 4) != 0 ? null : jumpInfo;
        str = (i19 & 8) != 0 ? null : str;
        z17 = (i19 & 16) != 0 ? false : z17;
        this.f38395a = i17;
        this.f38396b = i18;
        this.f38397c = jumpInfo;
        this.f38398d = str;
        this.f38399e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c43.b1)) {
            return false;
        }
        c43.b1 b1Var = (c43.b1) obj;
        return this.f38395a == b1Var.f38395a && this.f38396b == b1Var.f38396b && kotlin.jvm.internal.o.b(this.f38397c, b1Var.f38397c) && kotlin.jvm.internal.o.b(this.f38398d, b1Var.f38398d) && this.f38399e == b1Var.f38399e;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f38395a) * 31) + java.lang.Integer.hashCode(this.f38396b)) * 31;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.f38397c;
        int hashCode2 = (hashCode + (jumpInfo == null ? 0 : jumpInfo.hashCode())) * 31;
        java.lang.String str = this.f38398d;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f38399e);
    }

    public java.lang.String toString() {
        return "LinkBlock(start=" + this.f38395a + ", end=" + this.f38396b + ", jumpInfo=" + this.f38397c + ", userName=" + this.f38398d + ", canBeAt=" + this.f38399e + ')';
    }
}
