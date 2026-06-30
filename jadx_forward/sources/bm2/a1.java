package bm2;

/* loaded from: classes3.dex */
public final class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f103285d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f103286e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f103287f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f103288g;

    /* renamed from: h, reason: collision with root package name */
    public int f103289h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f103290i;

    public a1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f103285d = context;
        this.f103286e = "FinderLive.AnchorStickerTextSelectorAdapter";
        this.f103287f = jz5.h.b(bm2.z0.f104004d);
        this.f103288g = jz5.h.b(bm2.x0.f103957d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return x().size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L23;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r8, int r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.a1.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f103285d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dei, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.w0(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f103288g).mo141623x754a37bb();
    }
}
