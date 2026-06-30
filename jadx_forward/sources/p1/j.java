package p1;

/* loaded from: classes14.dex */
public final class j extends p1.k {

    /* renamed from: b, reason: collision with root package name */
    public final p1.y f432365b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.i f432366c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f432367d;

    /* renamed from: e, reason: collision with root package name */
    public s1.z f432368e;

    /* renamed from: f, reason: collision with root package name */
    public p1.l f432369f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f432370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f432371h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f432372i;

    public j(p1.y pointerInputFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerInputFilter, "pointerInputFilter");
        this.f432365b = pointerInputFilter;
        this.f432366c = new o0.i(new p1.r[16], 0);
        this.f432367d = new java.util.LinkedHashMap();
        this.f432371h = true;
        this.f432372i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        if ((r11 == 5 ? r6 : false) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    @Override // p1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.Map r35, s1.z r36, p1.g r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j.a(java.util.Map, s1.z, p1.g, boolean):boolean");
    }

    @Override // p1.k
    public void b(p1.g internalPointerEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPointerEvent, "internalPointerEvent");
        super.b(internalPointerEvent);
        p1.l lVar = this.f432369f;
        if (lVar == null) {
            return;
        }
        this.f432370g = this.f432371h;
        java.util.List list = lVar.f432375a;
        int size = list.size();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= size) {
                break;
            }
            p1.s sVar = (p1.s) list.get(i17);
            boolean z18 = sVar.f432415d;
            long j17 = sVar.f432412a;
            if (z18 || (internalPointerEvent.a(j17) && this.f432371h)) {
                z17 = false;
            }
            if (z17) {
                this.f432366c.k(new p1.r(j17));
            }
            i17++;
        }
        this.f432371h = false;
        this.f432372i = lVar.f432377c == 5;
    }

    public void d() {
        o0.i iVar = this.f432373a;
        int i17 = iVar.f423385f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i18 = 0;
            do {
                ((p1.j) objArr[i18]).d();
                i18++;
            } while (i18 < i17);
        }
        this.f432365b.b();
    }

    public boolean e(p1.g internalPointerEvent) {
        o0.i iVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPointerEvent, "internalPointerEvent");
        java.util.Map map = this.f432367d;
        boolean z17 = false;
        int i18 = 0;
        z17 = false;
        if (!map.isEmpty()) {
            p1.y yVar = this.f432365b;
            if (yVar.f432459e) {
                p1.l lVar = this.f432369f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
                s1.z zVar = this.f432368e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
                yVar.c(lVar, p1.n.Final, ((u1.c1) zVar).f483585f);
                if (yVar.f432459e && (i17 = (iVar = this.f432373a).f423385f) > 0) {
                    java.lang.Object[] objArr = iVar.f423383d;
                    do {
                        ((p1.j) objArr[i18]).e(internalPointerEvent);
                        i18++;
                    } while (i18 < i17);
                }
                z17 = true;
            }
        }
        b(internalPointerEvent);
        ((java.util.LinkedHashMap) map).clear();
        this.f432368e = null;
        return z17;
    }

    public boolean f(java.util.Map changes, s1.z parentCoordinates, p1.g internalPointerEvent, boolean z17) {
        o0.i iVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentCoordinates, "parentCoordinates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPointerEvent, "internalPointerEvent");
        java.util.Map map = this.f432367d;
        int i18 = 0;
        if (map.isEmpty()) {
            return false;
        }
        p1.y yVar = this.f432365b;
        if (!yVar.f432459e) {
            return false;
        }
        p1.l lVar = this.f432369f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        s1.z zVar = this.f432368e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
        long j17 = ((u1.c1) zVar).f483585f;
        yVar.c(lVar, p1.n.Initial, j17);
        if (yVar.f432459e && (i17 = (iVar = this.f432373a).f423385f) > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            do {
                p1.j jVar = (p1.j) objArr[i18];
                s1.z zVar2 = this.f432368e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar2);
                jVar.f(map, zVar2, internalPointerEvent, z17);
                i18++;
            } while (i18 < i17);
        }
        if (yVar.f432459e) {
            yVar.c(lVar, p1.n.Main, j17);
        }
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m157652x9616526c() {
        return "Node(pointerInputFilter=" + this.f432365b + ", children=" + this.f432373a + ", pointerIds=" + this.f432366c + ')';
    }
}
