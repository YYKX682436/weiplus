package df2;

/* loaded from: classes3.dex */
public final class cz implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311457e;

    public cz(df2.lz lzVar, int i17) {
        this.f311456d = lzVar;
        this.f311457e = i17;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.lz lzVar = this.f311456d;
        android.widget.TextView c76 = lzVar.c7();
        if (c76 != null) {
            c76.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) lzVar.m124230x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566980hp5);
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) lzVar.m124230x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566980hp5);
        if (textView2 == null) {
            return;
        }
        textView2.setText("+" + this.f311457e);
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.lz lzVar = this.f311456d;
        android.widget.TextView c76 = lzVar.c7();
        if (c76 != null) {
            c76.setVisibility(0);
        }
        android.widget.TextView textView = (android.widget.TextView) lzVar.m124230x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566980hp5);
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a76 = lzVar.a7();
        if (a76 != null) {
            a76.i(this);
        }
    }

    @Override // ym5.w1
    public void d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
