package cg3;

/* loaded from: classes3.dex */
public final class g extends lf3.o implements cg3.b, cg3.h {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f41156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f41156d = jz5.h.b(new cg3.f(this));
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.ejn;
    }

    public final em.p1 V6() {
        return (em.p1) ((jz5.n) this.f41156d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        V6().a().a();
    }
}
