package ob2;

/* loaded from: classes5.dex */
public class a extends lb2.j {

    /* renamed from: t, reason: collision with root package name */
    public final yz5.p f425575t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r2, java.lang.String r3, yz5.a r4, yz5.p r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto L6
            r4 = r0
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            r5 = r0
        Lb:
            java.lang.String r6 = "title"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            kb2.b r6 = kb2.b.f387758a
            boolean r6 = r6.a()
            if (r6 == 0) goto L25
            if (r4 == 0) goto L25
            java.lang.Object r2 = r4.mo152xb9724478()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L25:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2, r3)
            r1.f425575t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob2.a.<init>(int, java.lang.String, yz5.a, yz5.p, int, kotlin.jvm.internal.i):void");
    }

    @Override // lb2.j
    public boolean j() {
        return true;
    }

    @Override // lb2.j
    public void n(int i17) {
        super.n(i17);
        yz5.p pVar = this.f425575t;
        if (pVar != null) {
            java.lang.Object r17 = r();
            java.lang.ref.WeakReference weakReference = this.f399284f;
            pVar.mo149xb9724478(r17, weakReference != null ? (android.app.Activity) weakReference.get() : null);
        }
    }
}
