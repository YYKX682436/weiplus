package ag2;

/* loaded from: classes3.dex */
public final class d extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final we2.p f86225h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f86226i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f86227m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f86228n;

    /* renamed from: o, reason: collision with root package name */
    public final android.text.style.ForegroundColorSpan f86229o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f86230p;

    public d(we2.p config, yz5.a onItemClick, yz5.l onItemBind) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemBind, "onItemBind");
        this.f86225h = config;
        this.f86226i = onItemClick;
        this.f86227m = onItemBind;
        this.f86228n = new java.util.LinkedList();
        this.f86229o = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        this.f86230p = jz5.h.b(ag2.c.f86224d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f86228n.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    @Override // in5.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(in5.r0 r18, int r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag2.d.x(in5.r0, int):void");
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List payloads) {
        ag2.a holder = (ag2.a) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e_9, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ag2.a(inflate);
    }
}
