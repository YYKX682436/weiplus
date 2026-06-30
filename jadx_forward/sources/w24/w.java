package w24;

/* loaded from: classes15.dex */
public final class w extends w24.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f524176e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f524177f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f524178g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f524179h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f524180i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f524181j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String key, boolean z17) {
        super(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f524176e = z17;
        this.f524180i = "";
        this.f524181j = true;
    }

    public final void b(boolean z17) {
        this.f524176e = z17;
        c();
    }

    public final void c() {
        android.widget.TextView textView = this.f524177f;
        if (textView != null) {
            textView.setText(this.f524180i);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f524178g;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(this.f524176e);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f524178g;
        if (viewOnClickListenerC22631x1cc07cc82 != null) {
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new w24.v(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = this.f524178g;
        if (viewOnClickListenerC22631x1cc07cc83 == null) {
            return;
        }
        viewOnClickListenerC22631x1cc07cc83.setEnabled(this.f524181j);
    }
}
