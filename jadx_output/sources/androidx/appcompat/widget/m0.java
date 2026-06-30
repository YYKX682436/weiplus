package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class m0 extends androidx.appcompat.widget.f1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.r0 f9646p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner f9647q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner, android.view.View view, androidx.appcompat.widget.r0 r0Var) {
        super(view);
        this.f9647q = appCompatSpinner;
        this.f9646p = r0Var;
    }

    @Override // androidx.appcompat.widget.f1
    public o.k0 b() {
        return this.f9646p;
    }

    @Override // androidx.appcompat.widget.f1
    public boolean c() {
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.f9647q;
        if (appCompatSpinner.f9384i.isShowing()) {
            return true;
        }
        appCompatSpinner.f9384i.show();
        return true;
    }
}
