package mi4;

/* loaded from: classes.dex */
public final class e implements db5.s7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408313a;

    public e(android.content.Context context) {
        this.f408313a = context;
    }

    @Override // db5.s7
    public final void a(android.view.View view) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2) : null;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        }
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)) == null) {
            return;
        }
        textView.setTextSize(0, i65.a.f(this.f408313a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
    }
}
