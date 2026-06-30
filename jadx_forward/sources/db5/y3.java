package db5;

/* loaded from: classes15.dex */
public class y3 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f310112d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f310113e;

    public y3(android.content.Context context, boolean z17, db5.w3 w3Var) {
        super(context, null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559764e8);
        this.f310113e = z17;
        setCacheColorHint(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f310113e || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f310113e || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f310113e || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f310113e && this.f310112d) || super.isInTouchMode();
    }
}
