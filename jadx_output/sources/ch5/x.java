package ch5;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f41633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f41635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen, com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super(0);
        this.f41633d = c0Var;
        this.f41634e = circleToSearchHalfScreen;
        this.f41635f = vASActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.c0 c0Var = this.f41633d;
        if (c0Var.f310112d) {
            c0Var.f310112d = false;
            com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41634e.Q;
            if (circleToSearchDraggableLayout != null) {
                circleToSearchDraggableLayout.b(0.0f, 0.2f, new ch5.w(this.f41635f));
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
