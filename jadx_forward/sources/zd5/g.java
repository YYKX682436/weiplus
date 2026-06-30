package zd5;

/* loaded from: classes9.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f553214d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f553215e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f553216f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f553217g;

    /* renamed from: h, reason: collision with root package name */
    public p13.r f553218h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f553219i;

    public g(android.app.Activity context, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f553214d = context;
        this.f553215e = a3Var;
        this.f553216f = new java.util.ArrayList();
        this.f553219i = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiAllResultAdapter", "getItemCount >> " + this.f553216f.size());
        return this.f553216f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((ae5.j) this.f553216f.get(i17)).f85944a.f553188d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x066f  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r29, int r30) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd5.g.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        zd5.a aVar = zd5.a.f553184e;
        boolean z17 = true;
        if (i17 != 2) {
            zd5.a aVar2 = zd5.a.f553184e;
            if (i17 != 3) {
                z17 = false;
            }
        }
        if (z17) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bci, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new zd5.r(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcj, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new zd5.s(inflate2);
    }
}
