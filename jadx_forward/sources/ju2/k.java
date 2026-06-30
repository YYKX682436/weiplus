package ju2;

/* loaded from: classes10.dex */
public final class k implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f383354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383355e;

    public k(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1) {
        this.f383354d = c22789xd23e9a9b;
        this.f383355e = c15003x1d0c0ec1;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m60869xb7b2905b;
        android.widget.TextView m60872x13c392c6;
        android.widget.TextView m60872x13c392c62;
        android.widget.TextView m60872x13c392c63;
        this.f383354d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383355e;
        m60869xb7b2905b = c15003x1d0c0ec1.m60869xb7b2905b();
        m60869xb7b2905b.setVisibility(0);
        m60872x13c392c6 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c6.setAlpha(1.0f);
        m60872x13c392c62 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c62.invalidate();
        m60872x13c392c63 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c63.requestLayout();
        c15003x1d0c0ec1.E = false;
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m60869xb7b2905b;
        android.widget.TextView m60872x13c392c6;
        android.widget.TextView m60872x13c392c62;
        android.widget.TextView m60872x13c392c63;
        this.f383354d.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383355e;
        m60869xb7b2905b = c15003x1d0c0ec1.m60869xb7b2905b();
        m60869xb7b2905b.setVisibility(0);
        m60872x13c392c6 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c6.invalidate();
        m60872x13c392c62 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c62.requestLayout();
        m60872x13c392c63 = c15003x1d0c0ec1.m60872x13c392c6();
        m60872x13c392c63.animate().alpha(1.0f).setDuration(100L).start();
        c15003x1d0c0ec1.E = false;
    }

    @Override // ym5.w1
    public void d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
