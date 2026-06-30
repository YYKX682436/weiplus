package on2;

/* loaded from: classes3.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f428607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f428608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(on2.j1 j1Var, on2.a2 a2Var, android.content.Context context) {
        super(3);
        this.f428607d = a2Var;
        this.f428608e = context;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        rl5.r m152021xdab03575;
        rl5.r m152021xdab035752;
        r45.dz1 item = (r45.dz1) obj;
        android.view.View itemView = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        on2.a2 a2Var = this.f428607d;
        int[] iArr = a2Var.f428372v;
        int i17 = iArr[0];
        int[] iArr2 = a2Var.f428372v;
        if (i17 == 0 || iArr[1] == 0) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r4Var.M2("FinderLiveLotteryPanelWidget", "onItemLongClickCallback before change x:" + iArr2[0] + ", original y:" + iArr2[1]);
            itemView.getLocationOnScreen(iArr2);
            r4Var.M2("FinderLiveLotteryPanelWidget", "onItemLongClickCallback after change x:" + iArr2[0] + ", original y:" + iArr2[1]);
        }
        m152021xdab03575 = a2Var.m152021xdab03575();
        m152021xdab03575.a();
        m152021xdab035752 = a2Var.m152021xdab03575();
        android.content.Context context = this.f428608e;
        m152021xdab035752.h(itemView, new on2.v1(context), new on2.x1(a2Var, item, context, intValue), iArr2[0], iArr2[1]);
        return jz5.f0.f384359a;
    }
}
