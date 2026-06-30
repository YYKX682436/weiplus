package dw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f325623a;

    /* renamed from: b, reason: collision with root package name */
    public final dw0.e f325624b;

    /* renamed from: c, reason: collision with root package name */
    public final dw0.l f325625c;

    public d(java.util.List infoList, dw0.e selectedIndexPack, dw0.l updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        this.f325623a = infoList;
        this.f325624b = selectedIndexPack;
        this.f325625c = updateState;
    }

    public static /* synthetic */ dw0.d b(dw0.d dVar, java.util.List list, dw0.e eVar, dw0.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = dVar.f325623a;
        }
        if ((i17 & 2) != 0) {
            eVar = dVar.f325624b;
        }
        if ((i17 & 4) != 0) {
            lVar = dVar.f325625c;
        }
        return dVar.a(list, eVar, lVar);
    }

    public final dw0.d a(java.util.List infoList, dw0.e selectedIndexPack, dw0.l updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        return new dw0.d(infoList, selectedIndexPack, updateState);
    }

    /* renamed from: equals */
    public boolean m126319xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.d)) {
            return false;
        }
        dw0.d dVar = (dw0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325623a, dVar.f325623a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325624b, dVar.f325624b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325625c, dVar.f325625c);
    }

    /* renamed from: hashCode */
    public int m126320x8cdac1b() {
        return (((this.f325623a.hashCode() * 31) + this.f325624b.m126323x8cdac1b()) * 31) + this.f325625c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126321x9616526c() {
        return "TimbreMaterialInfoUiState(infoList=" + this.f325623a + ", selectedIndexPack=" + this.f325624b + ", updateState=" + this.f325625c + ')';
    }

    public /* synthetic */ d(java.util.List list, dw0.e eVar, dw0.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list, (i17 & 2) != 0 ? new dw0.e(-1, -1) : eVar, (i17 & 4) != 0 ? dw0.g.f325628a : lVar);
    }
}
