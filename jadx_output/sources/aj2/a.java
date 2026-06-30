package aj2;

/* loaded from: classes8.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final km2.q f5292d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5293e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5295g;

    public a(km2.q qVar, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        qVar = (i17 & 1) != 0 ? null : qVar;
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? true : z18;
        z19 = (i17 & 8) != 0 ? false : z19;
        this.f5292d = qVar;
        this.f5293e = z17;
        this.f5294f = z18;
        this.f5295g = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2.a)) {
            return false;
        }
        aj2.a aVar = (aj2.a) obj;
        return kotlin.jvm.internal.o.b(this.f5292d, aVar.f5292d) && this.f5293e == aVar.f5293e && this.f5294f == aVar.f5294f && this.f5295g == aVar.f5295g;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        km2.q qVar = this.f5292d;
        return ((((((qVar == null ? 0 : qVar.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f5293e)) * 31) + java.lang.Boolean.hashCode(this.f5294f)) * 31) + java.lang.Boolean.hashCode(this.f5295g);
    }

    public java.lang.String toString() {
        return "MicChangeData(micUser=" + this.f5292d + ", isSelected=" + this.f5293e + ", isHeaderEnableClick=" + this.f5294f + ", isNeedHideRecoverIcon=" + this.f5295g + ')';
    }
}
