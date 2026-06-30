package im3;

/* loaded from: classes10.dex */
public final class j extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374231d;

    /* renamed from: e, reason: collision with root package name */
    public int f374232e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.mc5 f374233f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f374234g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f374235h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f374236i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f374237m;

    public j(java.lang.String id6, int i17, r45.mc5 previewItem, java.lang.String listId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewItem, "previewItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listId, "listId");
        this.f374231d = id6;
        this.f374232e = i17;
        this.f374233f = previewItem;
        this.f374234g = listId;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = previewItem.f461899g;
        if (gVar != null) {
            byte[] g17 = gVar.g();
            int i18 = previewItem.f461897e;
            if (i18 == 1) {
                android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> CREATOR = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b.f36410x681a0c0c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CREATOR, "CREATOR");
                this.f374237m = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) pm0.v.Y(g17, CREATOR);
            } else if (i18 == 2) {
                android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> CREATOR2 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b.f36413x681a0c0c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CREATOR2, "CREATOR");
                this.f374237m = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) pm0.v.Y(g17, CREATOR2);
            }
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        im3.j other = (im3.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374231d, other.f374231d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374233f, other.f374233f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374234g, other.f374234g) && this.f374236i == other.f374236i;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        im3.j other = (im3.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = this.f374232e;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i17, i17);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f374233f.f461897e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f374234g + '-' + this.f374231d;
    }
}
