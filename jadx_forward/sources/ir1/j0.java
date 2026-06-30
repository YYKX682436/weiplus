package ir1;

/* loaded from: classes11.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12970xfb8fefe5 f375539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12970xfb8fefe5 c12970xfb8fefe5) {
        super(0);
        this.f375539d = c12970xfb8fefe5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12970xfb8fefe5 c12970xfb8fefe5 = this.f375539d;
        ir1.e0 e0Var = new ir1.e0(c12970xfb8fefe5, c12970xfb8fefe5.f175484w, 1);
        int i17 = e0Var.f375492f;
        e0Var.f375498o = new ir1.t(i17);
        wn.u uVar = c12970xfb8fefe5.f146271u;
        if (uVar != null) {
            e0Var.f375499p = new ir1.r(i17, uVar.f528913d, null, 4, null);
            return e0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("readyChattingUIC");
        throw null;
    }
}
