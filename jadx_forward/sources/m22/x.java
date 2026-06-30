package m22;

/* loaded from: classes15.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a, android.view.View.OnDragListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f404604d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f404605e;

    /* renamed from: f, reason: collision with root package name */
    public m22.s f404606f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f404607g;

    /* renamed from: h, reason: collision with root package name */
    public int f404608h;

    /* renamed from: i, reason: collision with root package name */
    public int f404609i;

    /* renamed from: m, reason: collision with root package name */
    public m22.u f404610m;

    /* renamed from: n, reason: collision with root package name */
    public final int f404611n;

    /* renamed from: o, reason: collision with root package name */
    public long f404612o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f404613p;

    /* renamed from: q, reason: collision with root package name */
    public final m22.w f404614q;

    public x(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404604d = i17;
        this.f404607g = new android.graphics.Rect();
        this.f404610m = m22.u.f404598d;
        this.f404611n = ym5.x.a(context, 800.0f);
        this.f404613p = new android.graphics.Rect();
        this.f404614q = new m22.w(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029b, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029d, code lost:
    
        r0 = r0.m8183xf806b362();
        r2 = r1.f404597a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a3, code lost:
    
        if (r0 == r2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a5, code lost:
    
        r1.f404597a = r0;
        r1.a(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ac, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b0, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b4, code lost:
    
        r2 = r17.f404605e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b6, code lost:
    
        if (r2 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b8, code lost:
    
        r2 = r2.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2);
        r2 = r2.mo1894x7e414b06();
        r4 = r17.f404604d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c5, code lost:
    
        if (r2 < r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c9, code lost:
    
        if ((r2 % r4) != 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cb, code lost:
    
        r1 = r1.m8007x6a486239(r1.m8008x3d79f549() - r4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r7.set(r1.getLeft() - r0, r1.getTop() - r0, r1.getRight() + r0, r1.getBottom() + r0);
        r7.offset(0, r7.height());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0336, code lost:
    
        r0 = r17.f404606f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0338, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x033d, code lost:
    
        if (r0.f404597a == (-1)) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0347, code lost:
    
        if (r7.contains(r17.f404608h, r17.f404609i) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x034a, code lost:
    
        if (r2 <= 1) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034c, code lost:
    
        r1 = r17.f404606f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034e, code lost:
    
        if (r1 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0350, code lost:
    
        r2 = r2 - 1;
        r0 = r1.f404597a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0353, code lost:
    
        if (r2 == r0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0355, code lost:
    
        r1.f404597a = r2;
        r1.a(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035b, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x035e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0367, code lost:
    
        if (r7.contains(r17.f404608h, r17.f404609i) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0369, code lost:
    
        r0 = r17.f404606f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x036b, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x036d, code lost:
    
        r1 = r0.f404597a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x036f, code lost:
    
        if (r2 == r1) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0371, code lost:
    
        r0.f404597a = r2;
        r0.a(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0377, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x037a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x037b, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x037e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02fa, code lost:
    
        if (r1.m8008x3d79f549() <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fc, code lost:
    
        r1 = r1.m8007x6a486239(r1.m8008x3d79f549() - 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r7.set(r1.getLeft() - r0, r1.getTop() - r0, r1.getRight() + r0, r1.getBottom() + r0);
        r7.offset(r7.width(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0328, code lost:
    
        r1 = -r0;
        r7.set(r1, r1, r11.width() + r0, r11.height() + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x037f, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0382, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x028d, code lost:
    
        r4 = (android.view.View) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028f, code lost:
    
        if (r4 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0291, code lost:
    
        r0 = r17.f404605e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0293, code lost:
    
        if (r0 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0295, code lost:
    
        r0 = r0.w0(r4);
        r1 = r17.f404606f;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0285 A[LOOP:1: B:77:0x0227->B:93:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028d A[SYNTHETIC] */
    @Override // android.view.View.OnDragListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onDrag(android.view.View r18, android.view.DragEvent r19) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.x.onDrag(android.view.View, android.view.DragEvent):boolean");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
