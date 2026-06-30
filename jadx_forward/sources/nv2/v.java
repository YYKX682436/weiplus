package nv2;

@j95.b
/* loaded from: classes2.dex */
public final class v extends i95.w implements nv2.g0 {

    /* renamed from: e, reason: collision with root package name */
    public nv2.x f422127e;

    /* renamed from: f, reason: collision with root package name */
    public nv2.x f422128f;

    /* renamed from: g, reason: collision with root package name */
    public nv2.x f422129g;

    /* renamed from: h, reason: collision with root package name */
    public nv2.s f422130h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f422126d = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f422131i = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(int r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "finderUserName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r2.m134976x2690a4ac()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordClean type:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = "  finderUserName: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " isClean:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FeedCleaner"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L4c
            r0 = 2
            if (r3 == r0) goto L41
            r0 = 3
            if (r3 == r0) goto L36
            goto L51
        L36:
            nv2.x r3 = r2.f422129g
            if (r3 == 0) goto L3b
            goto L50
        L3b:
            java.lang.String r3 = "noSeeFriend"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r1
        L41:
            nv2.x r3 = r2.f422128f
            if (r3 == 0) goto L46
            goto L50
        L46:
            java.lang.String r3 = "noSeeAuthorRecorder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r1
        L4c:
            nv2.x r3 = r2.f422127e
            if (r3 == 0) goto L5f
        L50:
            r1 = r3
        L51:
            if (r1 == 0) goto L5e
            java.util.Set r3 = r1.f422156a
            if (r5 == 0) goto L5b
            r3.add(r4)
            goto L5e
        L5b:
            r3.remove(r4)
        L5e:
            return
        L5f:
            java.lang.String r3 = "followRecorder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.v.Ai(int, java.lang.String, boolean):void");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCleaner", "onAccountInit");
        java.lang.String T0 = g92.b.f351302e.T0();
        this.f422126d = T0;
        java.util.HashMap hashMap = this.f422131i;
        if (hashMap.containsKey(T0)) {
            java.lang.Object obj = hashMap.get(this.f422126d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            this.f422130h = (nv2.s) obj;
        }
        nv2.s sVar = this.f422130h;
        if (sVar != null) {
            this.f422127e = sVar.f422111b;
            this.f422128f = sVar.f422112c;
            this.f422129g = sVar.f422113d;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f422127e = new nv2.x();
            this.f422128f = new nv2.x();
            nv2.x xVar = new nv2.x();
            this.f422129g = xVar;
            java.lang.String str = this.f422126d;
            nv2.x xVar2 = this.f422127e;
            if (xVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("followRecorder");
                throw null;
            }
            nv2.x xVar3 = this.f422128f;
            if (xVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noSeeAuthorRecorder");
                throw null;
            }
            nv2.s sVar2 = new nv2.s(str, xVar2, xVar3, xVar);
            hashMap.put(this.f422126d, sVar2);
            this.f422130h = sVar2;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCleaner", "onAccountRelease");
    }

    public final boolean wi(int i17) {
        if (i17 != 1 && i17 != 35) {
            if (i17 == 3) {
                nv2.x xVar = this.f422127e;
                if (xVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("followRecorder");
                    throw null;
                }
                boolean z17 = !xVar.f422156a.isEmpty();
                if (this.f422128f != null) {
                    return z17 | (!r3.f422156a.isEmpty());
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noSeeAuthorRecorder");
                throw null;
            }
            if (i17 != 4) {
                return false;
            }
        }
        if (this.f422128f != null) {
            return !r5.f422156a.isEmpty();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noSeeAuthorRecorder");
        throw null;
    }
}
