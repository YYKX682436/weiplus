package tn5;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f502383a;

    /* renamed from: b, reason: collision with root package name */
    public sn5.b f502384b;

    /* renamed from: c, reason: collision with root package name */
    public sn5.b f502385c;

    /* renamed from: d, reason: collision with root package name */
    public mn5.b f502386d;

    public a(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f502383a = layout;
        sn5.b bVar = sn5.b.f491690p;
        this.f502384b = bVar;
        this.f502385c = bVar;
    }

    public final boolean a() {
        return this.f502384b == sn5.b.f491689o;
    }

    public final boolean b() {
        return this.f502384b == sn5.b.f491697w;
    }

    public final void c(sn5.b state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        sn5.b bVar = this.f502384b;
        if (bVar == state) {
            if (this.f502385c != bVar) {
                this.f502385c = bVar;
                return;
            }
            return;
        }
        this.f502384b = state;
        this.f502385c = state;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f502383a;
        c22851x22587864.getClass();
        on5.g gVar = c22851x22587864.headerPlugin;
        tn5.a aVar = c22851x22587864.f295271h;
        if (gVar != null) {
            gVar.g(c22851x22587864, aVar.f502384b, state);
        }
        on5.g gVar2 = c22851x22587864.footerPlugin;
        if (gVar2 != null) {
            gVar2.g(c22851x22587864, aVar.f502384b, state);
        }
        if (state == sn5.b.f491687m) {
            c22851x22587864.m82913x4b20af2f().f411746f = false;
        }
    }

    public final void d(sn5.b state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        sn5.b bVar = this.f502384b;
        if (bVar.f491703f && bVar.f491701d != state.f491701d) {
            c(sn5.b.f491690p);
        }
        if (this.f502385c != state) {
            this.f502385c = state;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r6.f411763w == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r6.f411763w == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0110, code lost:
    
        if (r6.f411763w == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(sn5.b r6) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn5.a.e(sn5.b):void");
    }
}
