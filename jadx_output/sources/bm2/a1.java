package bm2;

/* loaded from: classes3.dex */
public final class a1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f21752d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f21753e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f21754f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f21755g;

    /* renamed from: h, reason: collision with root package name */
    public int f21756h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f21757i;

    public a1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f21752d = context;
        this.f21753e = "FinderLive.AnchorStickerTextSelectorAdapter";
        this.f21754f = jz5.h.b(bm2.z0.f22471d);
        this.f21755g = jz5.h.b(bm2.x0.f22424d);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return x().size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L23;
     */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r8, int r9) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.a1.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f21752d).inflate(com.tencent.mm.R.layout.dei, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.w0(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f21755g).getValue();
    }
}
