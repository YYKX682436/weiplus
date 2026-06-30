package cj4;

/* loaded from: classes11.dex */
public final class c0 implements bk4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f41915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41916b;

    public c0(android.view.View view, cj4.i1 i1Var) {
        this.f41915a = view;
        this.f41916b = i1Var;
    }

    @Override // bk4.l1
    public void onChange(int i17) {
        cj4.i1 i1Var = this.f41916b;
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = i1Var.f41945g;
        if (longTextView != null) {
            longTextView.f173446r = null;
        }
        i1Var.S(i17);
    }
}
