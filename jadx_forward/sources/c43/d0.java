package c43;

/* loaded from: classes15.dex */
public class d0 extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119944p1;

    /* renamed from: x1, reason: collision with root package name */
    public final /* synthetic */ c43.x f119945x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c43.x xVar, android.content.Context context, android.view.View view) {
        super(context);
        this.f119945x1 = xVar;
        this.f119944p1 = view;
    }

    @Override // rl5.r
    public boolean n(int i17, int i18) {
        c43.x xVar = this.f119945x1;
        if (xVar.s() || xVar.n()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
        if (c15731x94356d67 != null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.g(1L, 27L, xVar.f120027i, xVar.f120026h, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X);
        }
        android.view.View view = this.f119944p1;
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.n(i17, i18);
    }

    @Override // rl5.r, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View view = this.f119944p1;
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
