package bm2;

/* loaded from: classes3.dex */
public final class v0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f22361d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f22362e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f22363f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f22364g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f22365h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f22366i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f22367m;

    /* renamed from: n, reason: collision with root package name */
    public wt2.a f22368n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnClickListener f22369o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.q f22370p;

    public v0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f22361d = "FinderLiveAnchorPromoteInfoAdapter";
        this.f22363f = jz5.h.b(bm2.s0.f22286d);
        jz5.h.b(bm2.t0.f22305d);
        this.f22364g = jz5.h.b(bm2.r0.f22264d);
        this.f22365h = jz5.h.b(bm2.q0.f22238d);
        this.f22366i = jz5.h.b(bm2.p0.f22216d);
        this.f22367m = jz5.h.b(bm2.u0.f22338d);
    }

    public final int B() {
        return ((java.lang.Number) ((jz5.n) this.f22363f).getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f22362e;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0349  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r37, int r38) {
        /*
            Method dump skipped, instructions count: 3188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.v0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.amt, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.b0(this, inflate);
    }

    public final int x() {
        return ((java.lang.Number) ((jz5.n) this.f22366i).getValue()).intValue();
    }

    public final int y() {
        return ((java.lang.Number) ((jz5.n) this.f22365h).getValue()).intValue();
    }

    public final int z() {
        return ((java.lang.Number) ((jz5.n) this.f22364g).getValue()).intValue();
    }
}
