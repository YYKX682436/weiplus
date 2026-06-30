package zv0;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f557714a;

    /* renamed from: b, reason: collision with root package name */
    public final zv0.g0 f557715b;

    /* renamed from: c, reason: collision with root package name */
    public final zv0.n0 f557716c;

    public h0(java.util.List infoList, zv0.g0 selectedIndexPack, zv0.n0 updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        this.f557714a = infoList;
        this.f557715b = selectedIndexPack;
        this.f557716c = updateState;
    }

    public static /* synthetic */ zv0.h0 b(zv0.h0 h0Var, java.util.List list, zv0.g0 g0Var, zv0.n0 n0Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = h0Var.f557714a;
        }
        if ((i17 & 2) != 0) {
            g0Var = h0Var.f557715b;
        }
        if ((i17 & 4) != 0) {
            n0Var = h0Var.f557716c;
        }
        return h0Var.a(list, g0Var, n0Var);
    }

    public final zv0.h0 a(java.util.List infoList, zv0.g0 selectedIndexPack, zv0.n0 updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedIndexPack, "selectedIndexPack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        return new zv0.h0(infoList, selectedIndexPack, updateState);
    }

    /* renamed from: equals */
    public boolean m179708xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.h0)) {
            return false;
        }
        zv0.h0 h0Var = (zv0.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557714a, h0Var.f557714a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557715b, h0Var.f557715b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557716c, h0Var.f557716c);
    }

    /* renamed from: hashCode */
    public int m179709x8cdac1b() {
        return (((this.f557714a.hashCode() * 31) + this.f557715b.m179706x8cdac1b()) * 31) + this.f557716c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179710x9616526c() {
        return "TransitionUiState(infoList=" + this.f557714a + ", selectedIndexPack=" + this.f557715b + ", updateState=" + this.f557716c + ')';
    }

    public /* synthetic */ h0(java.util.List list, zv0.g0 g0Var, zv0.n0 n0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list, (i17 & 2) != 0 ? new zv0.g0(-1, -1) : g0Var, (i17 & 4) != 0 ? zv0.i0.f557722a : n0Var);
    }
}
