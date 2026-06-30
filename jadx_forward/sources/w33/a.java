package w33;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f524232a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f524233b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f524234c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f524235d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f524236e;

    /* renamed from: f, reason: collision with root package name */
    public final w33.d f524237f;

    public a(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        this(i17, fVar, false, null, null, null, 60, null);
    }

    /* renamed from: equals */
    public boolean m173181xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.a)) {
            return false;
        }
        w33.a aVar = (w33.a) obj;
        return this.f524232a == aVar.f524232a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524233b, aVar.f524233b) && this.f524234c == aVar.f524234c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524235d, aVar.f524235d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524236e, aVar.f524236e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524237f, aVar.f524237f);
    }

    /* renamed from: hashCode */
    public int m173182x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f524232a) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f524233b;
        int hashCode2 = (((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f524234c)) * 31;
        java.lang.String str = this.f524235d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f524236e;
        int hashCode4 = (hashCode3 + (c15780xf49d6a1c == null ? 0 : c15780xf49d6a1c.hashCode())) * 31;
        w33.d dVar = this.f524237f;
        return hashCode4 + (dVar != null ? dVar.m173191x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173183x9616526c() {
        return "ChatRoomInfo(itemType=" + this.f524232a + ", data=" + this.f524233b + ", isMoreList=" + this.f524234c + ", roomGroupTitle=" + this.f524235d + ", createRoomJumpInfo=" + this.f524236e + ", footerDataWrapper=" + this.f524237f + ')';
    }

    public a(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, boolean z17, java.lang.String str) {
        this(i17, fVar, z17, str, null, null, 48, null);
    }

    public a(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, w33.d dVar) {
        this.f524232a = i17;
        this.f524233b = fVar;
        this.f524234c = z17;
        this.f524235d = str;
        this.f524236e = c15780xf49d6a1c;
        this.f524237f = dVar;
    }

    public /* synthetic */ a(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, w33.d dVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, fVar, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? null : str, (i18 & 16) != 0 ? null : c15780xf49d6a1c, (i18 & 32) != 0 ? null : dVar);
    }
}
