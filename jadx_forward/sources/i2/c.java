package i2;

/* loaded from: classes14.dex */
public final class c implements a2.l {

    /* renamed from: a, reason: collision with root package name */
    public final i2.e f369380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f369381b;

    /* renamed from: c, reason: collision with root package name */
    public final long f369382c;

    /* renamed from: d, reason: collision with root package name */
    public final b2.t f369383d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f369384e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f369385f;

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc A[LOOP:1: B:71:0x00fa->B:72:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(i2.e r18, int r19, boolean r20, long r21, p3321xbce91901.jvm.p3324x21ffc6bd.i r23) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.<init>(i2.e, int, boolean, long, kotlin.jvm.internal.i):void");
    }

    public final b2.t a(int i17, int i18, android.text.TextUtils.TruncateAt truncateAt, int i19) {
        a2.s sVar;
        i2.e eVar = this.f369380a;
        java.lang.CharSequence charSequence = eVar.f369390d;
        float h17 = p2.c.h(this.f369382c);
        i2.f fVar = eVar.f369389c;
        int i27 = eVar.f369393g;
        b2.g gVar = eVar.f369391e;
        a2.o1 o1Var = eVar.f369387a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o1Var, "<this>");
        a2.u uVar = o1Var.f82325c;
        return new b2.t(charSequence, h17, fVar, i17, truncateAt, i27, 1.0f, 0.0f, (uVar == null || (sVar = uVar.f82346b) == null) ? true : sVar.f82341a, true, i19, 0, 0, i18, null, null, gVar, 55424, null);
    }

    public float b() {
        b2.t tVar = this.f369383d;
        boolean z17 = tVar.f98848a;
        android.text.Layout layout = tVar.f98849b;
        return (z17 ? layout.getLineBottom(tVar.f98850c - 1) : layout.getHeight()) + tVar.f98851d + tVar.f98852e;
    }

    public float c(int i17, boolean z17) {
        b2.t tVar = this.f369383d;
        return z17 ? b2.t.d(tVar, i17, false, 2, null) : ((b2.c) tVar.f98854g.mo141623x754a37bb()).a(i17, false, false);
    }
}
