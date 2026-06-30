package sw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f494959a;

    /* renamed from: b, reason: collision with root package name */
    public final sw0.g f494960b;

    /* renamed from: c, reason: collision with root package name */
    public final sw0.m f494961c;

    public e(java.util.List infoList, sw0.g selectedIndexPack, sw0.m updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        this.f494959a = infoList;
        this.f494960b = selectedIndexPack;
        this.f494961c = updateState;
    }

    public static /* synthetic */ sw0.e b(sw0.e eVar, java.util.List list, sw0.g gVar, sw0.m mVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = eVar.f494959a;
        }
        if ((i17 & 2) != 0) {
            gVar = eVar.f494960b;
        }
        if ((i17 & 4) != 0) {
            mVar = eVar.f494961c;
        }
        return eVar.a(list, gVar, mVar);
    }

    public final sw0.e a(java.util.List infoList, sw0.g selectedIndexPack, sw0.m updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        return new sw0.e(infoList, selectedIndexPack, updateState);
    }

    /* renamed from: equals */
    public boolean m165400xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.e)) {
            return false;
        }
        sw0.e eVar = (sw0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494959a, eVar.f494959a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494960b, eVar.f494960b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494961c, eVar.f494961c);
    }

    /* renamed from: hashCode */
    public int m165401x8cdac1b() {
        return (((this.f494959a.hashCode() * 31) + this.f494960b.m165407x8cdac1b()) * 31) + this.f494961c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165402x9616526c() {
        return "TextMaterialInfoUiState(infoList=" + this.f494959a + ", selectedIndexPack=" + this.f494960b + ", updateState=" + this.f494961c + ')';
    }

    public /* synthetic */ e(java.util.List list, sw0.g gVar, sw0.m mVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list, (i17 & 2) != 0 ? new sw0.g(-1, -1) : gVar, (i17 & 4) != 0 ? sw0.h.f494969a : mVar);
    }
}
